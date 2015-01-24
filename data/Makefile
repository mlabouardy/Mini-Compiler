DOT=dot -Tpdf 
SHOW=evince

AST:
	$(DOT) AST.dot -o AST.pdf
	$(SHOW) AST.pdf &
	$(DOT) IR.dot -o IR.pdf
	$(SHOW) IR.pdf &

clean:
	rm *.pdf
	rm *.dot
	rm *.*~	

	
