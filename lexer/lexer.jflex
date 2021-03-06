import java_cup.runtime.*;

%%
%class CompilerLexer
%line
%column
%cupsym CompilerSymbol
%cup

%{
private Symbol symbol (int type) {
    return new Symbol (type, yyline, yycolumn);
}

private Symbol symbol (int type, Object value) {
    return new Symbol (type, yyline, yycolumn, value);
}

static protected void trace(String str){
    System.err.println("*** "+str);   
}

private StringBuffer string = new StringBuffer();
%}

Constants            = "true" | "false" | "null"
Identifier				= [a-zA-Z][a-zA-Z0-9_]*
LineTerminator			= \r|\n|\r\n
WhiteSpace				= {LineTerminator} | [ \t\f]
IntegerLiteral 		= 0 | [1-9][0-9]*
FloatLiteral 			= (({IntegerLiteral} "." [0-9]*) | ("." [0-9]+)) ([eE][-+]?{IntegerLiteral})?
Character 				= [^\r\n]
CharacterLiteral 		= "'" {Character} "'"
CommentOneLine       = "//" {Character}* {LineTerminator}
CommentMultipleLines = "/*" [^*] ~"*/" | "/*" "*"+ "/"
Comment 					= {CommentOneLine} | {CommentMultipleLines}

%state STRING_LITERAL
%%

<YYINITIAL> {

/* -------------------------------------------------
	Operators
---------------------------------------------------- */
	"()" 									{return symbol(CompilerSymbol.FUNCTION_CALL); }
	"->" 									{return symbol(CompilerSymbol.ARROW_MEMORYACCESS); }
	"."									{return symbol(CompilerSymbol.POINT_MEMORYACCESS); }
	"[]" 									{return symbol(CompilerSymbol.DOUBLE_BRACKET); }
	"{"									{return symbol(CompilerSymbol.LA); }
	"}"									{return symbol(CompilerSymbol.RA); }
	"("									{return symbol(CompilerSymbol.LPAR); }
	")"									{return symbol(CompilerSymbol.RPAR); }
	"["									{return symbol(CompilerSymbol.LBRACKET); }
	"]"									{return symbol(CompilerSymbol.RBRACKET); }
	"&"									{return symbol(CompilerSymbol.ANDBIT_OR_MEMORYACCESS); }
	"|"									{return symbol(CompilerSymbol.OR_BIT); }
	"~"									{return symbol(CompilerSymbol.NOT_UNARY); }
	"<<"									{return symbol(CompilerSymbol.LSHIFT); }
	">>"									{return symbol(CompilerSymbol.RSHIFT); }
	"||"									{return symbol(CompilerSymbol.OR); }
	"&&"									{return symbol(CompilerSymbol.AND); }
	"!"									{return symbol(CompilerSymbol.NOT); }
	"<"									{return symbol(CompilerSymbol.LT); }
	">"									{return symbol(CompilerSymbol.GT); }
	"<="									{return symbol(CompilerSymbol.LE); }
	">="									{return symbol(CompilerSymbol.GE); }
	"!="									{return symbol(CompilerSymbol.DIFF); }
	"="									{return symbol(CompilerSymbol.EQ); }
	"=="									{return symbol(CompilerSymbol.EQEQ); }
	":="									{return symbol(CompilerSymbol.AFFECT); }
	"+="									{return symbol(CompilerSymbol.PLUS_EQ); }
	"-="									{return symbol(CompilerSymbol.MINUS_EQ); }
	"*="									{return symbol(CompilerSymbol.MULT_EQ); }
	"/="									{return symbol(CompilerSymbol.DIV_EQ); }
	"%="									{return symbol(CompilerSymbol.MOD_EQ); }
	"++"									{return symbol(CompilerSymbol.INCR); }

	"+"									{return symbol(CompilerSymbol.PLUS); }
		"--"									{return symbol(CompilerSymbol.DECR); }
	"-"									{return symbol(CompilerSymbol.MINUS); }
	"*"									{return symbol(CompilerSymbol.MULT_OR_MEMORYACCESS); }
	"/"									{return symbol(CompilerSymbol.DIV); }
	"%"									{return symbol(CompilerSymbol.MOD); }
	";"									{return symbol(CompilerSymbol.SEMIC); }
	":"									{return symbol(CompilerSymbol.DOUBLE_POINTS); }	
	"'"									{return symbol(CompilerSymbol.VARIABLE_TYPE); }
	","									{return symbol(CompilerSymbol.COMMA); }

	/* -------------------------------------------------
		Reserved Words
	---------------------------------------------------- */
	"static" 								{return symbol(CompilerSymbol.STATIC); }
	"procedure"                      {return symbol(CompilerSymbol.PROCEDURE); }
	"main"                           {return symbol(CompilerSymbol.MAIN); }
	"repeat"                         {return symbol(CompilerSymbol.REPEAT); }
	"return" 								{return symbol(CompilerSymbol.RETURN); }
	"function" 								{return symbol(CompilerSymbol.FUNCTION); }
	"class" 									{return symbol(CompilerSymbol.CLASS); }
	"in"										{return symbol(CompilerSymbol.IN); }
	"foreach"								{return symbol(CompilerSymbol.FOREACH); }
	"if"	                           {return symbol(CompilerSymbol.IF); }
	"else"	                        {return symbol(CompilerSymbol.ELSE); }
	"while"	                        {return symbol(CompilerSymbol.WHILE); }
	"integer"                     	{return symbol(CompilerSymbol.INTEGER_TYPE); }
	"string"                     		{return symbol(CompilerSymbol.STRING_TYPE); }
	"float"                     		{return symbol(CompilerSymbol.FLOAT_TYPE); }
	"boolean"                     	{return symbol(CompilerSymbol.BOOLEAN_TYPE); }
	"character"                   	{return symbol(CompilerSymbol.CHARACTER_TYPE); }
	"^"										{return symbol(CompilerSymbol.POINTER_OR_XOR); }
	"list of"								{return symbol(CompilerSymbol.LIST); }
	"record"                      	{return symbol(CompilerSymbol.RECORD); }
	"structure"								{return symbol(CompilerSymbol.STRUCTURE); }
	"type"							   	{return symbol(CompilerSymbol.TYPE); }
	
	/* -------------------------------------------------
		Constants
	---------------------------------------------------- */

	{Constants}							{return symbol(CompilerSymbol.CONSTANTS); }

	/* -------------------------------------------------
		Identifier,Integers,Floats..
	--------------------------------------------------- */

	{Identifier}	                {return symbol(CompilerSymbol.IDENTIFIER, yytext()); }
	{IntegerLiteral}	             {return symbol(CompilerSymbol.INTEGER_LITERAL, new Integer(yytext())); }
	{FloatLiteral}	                {return symbol(CompilerSymbol.FLOAT_LITERAL, new Float(yytext())); }
	{CharacterLiteral}	          {return symbol(CompilerSymbol.CHARACTER_LITERAL, yytext()); }

	
	/* -------------------------------------------------
		String
	-------------------------------------------------- */
	
	\" 									 {yybegin(STRING_LITERAL);string.delete(0, string.length()); }

	/* -------------------------------------------------
		Comments
		------------------------------------------------- */

	{WhiteSpace}                   { /* ignore */ }
	{Comment}                      { /* ignore */ }

	/* -------------------------------------------------
		Others
	-------------------------------------------------- */
	
	.										 { /* ignore */ }
}

	/* -------------------------------------------------
		String state
	-------------------------------------------------- */

<STRING_LITERAL> {
	\"                             {yybegin(YYINITIAL);return symbol(CompilerSymbol.STRING_LITERAL, string.toString()); }
	[^\n\r\"\\]+                   { string.append(yytext()); }
	\\t                            { string.append('\t'); }
	\\n                            { string.append('\n'); }
	\\r                            { string.append('\r'); }
	\\\"                           { string.append('\"'); }
	\\                             { string.append('\\'); }
}

