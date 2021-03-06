
import java.io.FileReader;
import java_cup.runtime.Symbol;
import stree.*;
import itree.*;
import java.io.*;
import type.*;
import evn.*;
public class Main {
		  public static int id=0;
		  public static Env firstEnv=null;
		  public static Env currentEnv=null;
		  public static boolean globaleEnv=false;
		  public static boolean envp=true;

        public static void main(String[] args) {
                try {
                        FileReader  myFile = new FileReader(args[0]);
                        CompilerLexer myLex = new CompilerLexer(myFile);
                        CompilerParser myParser = new CompilerParser(myLex);
                        Symbol result=myParser.debug_parse();
                        try {
                              Stree stree=(Stree)result.value;
                              stree.toDot("data/AST.dot");
                              ITree itree=ITree.toITree(stree);
                              itree.toDot("data/IR.dot");
										Type type=Type.toType(stree);
										try{
											File f=new File("data/Type.txt");
											PrintWriter pw=new PrintWriter(f);
											pw.println(type);
											pw.close();
										}catch(IOException e){}
										 
     									firstEnv.toDot("data/Env.dot");
										currentEnv.toDot("data/Env2.dot");
								}
                        catch (Exception e) {
                                System.out.println("parse error");
                        }
                }
                catch (Exception e){
                        System.out.println(e.getMessage());
                }
        }
}
