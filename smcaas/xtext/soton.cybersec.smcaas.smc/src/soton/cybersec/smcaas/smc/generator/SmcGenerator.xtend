/*
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import soton.cybersec.smcaas.smc.smc.Smc
import soton.cybersec.smcaas.smc.smc.MainSMC
import soton.cybersec.smcaas.smc.smc.BlockSMC
import soton.cybersec.smcaas.smc.smc.BlockType
import soton.cybersec.smcaas.smc.smc.Expression
import soton.cybersec.smcaas.smc.smc.Command
import soton.cybersec.smcaas.smc.smc.Invocation
import soton.cybersec.smcaas.smc.smc.Print
import soton.cybersec.smcaas.smc.smc.VariableDecl
import soton.cybersec.smcaas.smc.smc.VariableAssignment
import soton.cybersec.smcaas.smc.smc.IfThenElse
import soton.cybersec.smcaas.smc.smc.While
import soton.cybersec.smcaas.smc.smc.Or
import soton.cybersec.smcaas.smc.smc.And
import soton.cybersec.smcaas.smc.smc.StringLiteral
import soton.cybersec.smcaas.smc.smc.Block
import soton.cybersec.smcaas.smc.smc.Equality
import soton.cybersec.smcaas.smc.smc.Comparison
import soton.cybersec.smcaas.smc.smc.PlusOrMinus
import soton.cybersec.smcaas.smc.smc.MulOrDiv
import soton.cybersec.smcaas.smc.smc.Not
import soton.cybersec.smcaas.smc.smc.IntLiteral
import soton.cybersec.smcaas.smc.smc.DoubleLiteral
import soton.cybersec.smcaas.smc.smc.BooleanLiteral
import soton.cybersec.smcaas.smc.smc.DateLiteral
import soton.cybersec.smcaas.smc.smc.TimeLiteral
import soton.cybersec.smcaas.smc.smc.VariableRef
import soton.cybersec.smcaas.smc.smc.List
import soton.cybersec.smcaas.smc.smc.SecType
import soton.cybersec.smcaas.smc.smc.InvocationVoid
import soton.cybersec.smcaas.smc.smc.BasicType
import soton.cybersec.smcaas.smc.smc.ParamDecl
import soton.cybersec.smcaas.smc.smc.AbstractAssignment
import soton.cybersec.smcaas.smc.smc.Download
import javax.xml.ws.Dispatch
import soton.cybersec.smcaas.smc.smc.Tuple
import soton.cybersec.smcaas.smc.smc.Dict

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SmcGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(e: resource.contents.filter(typeof(Smc))) {
			fsa.generateFile('main.sc',compile(e))
		}
	}
	
	def compile(Smc smc) '''
		import shared3p;
		import shared3p_table_database;
		import stdlib;
		import table_database;
		import shared3p_bloom;
		import shared3p_random;
		import shared3p_aes;
		
		domain pd_shared3p shared3p;
		
		�FOR block : smc.blocks�
			�block.compile�
		�ENDFOR�
		
		�IF smc.main !== null��smc.main.compile��ENDIF�
	'''
		
	def compile(BlockSMC block)'''
		�switch (block.type) {
			case INSERT: {
				''''''
			}
			case COMP: {
				'''comp - TO ADD MODULE'''
			}
			case SEARCH: {
				'''search - TO ADD MODULE'''
			}
			case ANONYMIZATION: {
				'''anon - TO ADD MODULE'''
			}
			case ACCESS: {
				'''access - TO ADD MODULE'''
			}
			case PERMISSION: {
				'''perm - TO ADD MODULE'''
			}
		}�
	'''
	
	/* blocks */
	
	def addDataset()'''
		void addDataset(string ds, string tbl, string [[1]] clm_names, pd_shared3p uint64 [[2]] values){
		
		  // First create table
		  uint params = tdbVmapNew();
		
		  for (uint i = 0; i < size(clm_names); ++i) {
		    pd_shared3p uint64 vtype;
		    tdbVmapAddType(params, "types", vtype);
		    tdbVmapAddString(params, "names", clm_names[i]);
		  }
		
		  tdbTableCreate(ds, tbl, params);
		
		  // Then insert values into database:
		  uint length = size(values) / size(clm_names);
		  for (uint i = 0; i < length; ++i) {
		
		    tdbVmapClear(params);
		
		    for (uint j = 0; j < size(clm_names); ++j) {
		      tdbVmapAddValue(params, "values", values[j]);
		    }
		
		    tdbInsertRow(ds, tbl, params);
		  }
		  tdbVmapDelete(params);
		
		  return tbl;
		}
	'''
	
	def compile(MainSMC mainSmc)'''
		void main() {
			
			string ds = "DS1";
			
			tdbOpenConnection(ds);
			
			�FOR c : mainSmc.commands�
				�compileCommand(c)�
			�ENDFOR�
			
			tdbCloseConnection(ds);
		}
	'''
	
	/* commands */
	
	def dispatch compileCommand(Command c){
		c.compileCommand
	}
	
	def dispatch compileCommand(Block c)'''
		{
			�FOR x : c.commands�
				�x.compileCommand�
			�ENDFOR�
		}
	'''
	
	def dispatch compileCommand(VariableDecl c)'''
		�c.visibility.toSecrecVisibility� �c.type.toSecrecType� 
		�IF c.array�[[1]] �ENDIF��c.name�
		�IF c.option !== null� = �c.option.compileAssignment��ENDIF�
		;
	'''
	
	def dispatch compileAssignment(Expression a)'''
		�a.compileEx�
	'''
	
	def dispatch compileAssignment(Download a)'''
		argument("�a.arg�")
	'''
	
	def getToSecrecVisibility(SecType type) {
		switch (type) {
			case PUBLIC: {
				''''''
			}
			case PRIVATE: {
				'''pd_shared3p'''
			}
		}
	}
	
	def getToSecrecType(BasicType type) {
		switch (type) {
			case INT: {
				'''uint64'''
			}
			case DOUBLE: {
				'''float64'''
			}
			case BOOLEAN: {
				'''bool'''
			}
			case STRING: {
				'''string'''
			}
			case ENCRYPTED: {
				'''xor_uint64'''
			}
		}
	}
	
	def dispatch compileCommand(VariableAssignment c)'''
		�c.^var.name� = �c.option.compileAssignment�;
	'''
	
	def dispatch compileCommand(IfThenElse c)'''
		if(�c.condition.compileEx�)�c.thenBrach.compileCommand�
		�IF c.elseBranch !== null�
			else �c.elseBranch.compileCommand�
		�ENDIF�
	'''
	
	def dispatch compileCommand(While c)'''
		while (�c.condition.compileEx�) �c.body.compileCommand�
	'''
	
	def dispatch compileCommand(Print c) '''
		print("�c.value.compileEx�");
	'''
	
	def dispatch compileCommand(InvocationVoid c)'''
		�compileEx(c.call)�;
	'''
	
	def dispatch compileCommand(ParamDecl c)'''
		
	'''
	/* expressions */
	
	def dispatch compileEx (Expression e){
		e.compileEx
	}
	
	def dispatch compileEx (Or e)'''
		(�e.left.compileEx�) || (�e.right.compileEx�)
	'''
	
	def dispatch compileEx (And e)'''
		(�e.left.compileEx�) && (�e.right.compileEx�)
	'''
	
	def dispatch compileEx (Equality e)'''
		�switch (e.op) {
			case "==": {
				'''(�e.left.compileEx�) == (�e.right.compileEx�)'''
			}
			case "!=": {
				'''(�e.left.compileEx�) != (�e.right.compileEx�)'''
			}
		}�
	'''
	
	def dispatch compileEx (Comparison e)'''
		�switch (e.op) {
			case ">=": {
				'''(�e.left.compileEx�) >= (�e.right.compileEx�)'''
			}
			case "<=": {
				'''(�e.left.compileEx�) <= (�e.right.compileEx�)'''
			}
			case ">": {
				'''(�e.left.compileEx�) > (�e.right.compileEx�)'''
			}
			case "<": {
				'''(�e.left.compileEx�) < (�e.right.compileEx�)'''
			}
		}�
	'''
	
	def dispatch compileEx (PlusOrMinus e)'''
		�switch (e.op) {
			case '+': {
				'''(�e.left.compileEx�) + (�e.right.compileEx�)'''
			}
			case '-': {
				'''(�e.left.compileEx�) - (�e.right.compileEx�)'''
			}
		}�
	'''
	
	def dispatch compileEx (MulOrDiv e)'''
		�switch (e.op) {
			case '*': {
				'''(�e.left.compileEx�) * (�e.right.compileEx�)'''
			}
			case '/': {
				'''(�e.left.compileEx�) / (�e.right.compileEx�)'''
			}
		}�
	'''
	
	def dispatch compileEx (Not e)'''
		!(�e.expression.compileEx�)
	'''
	
	def dispatch compileEx (IntLiteral e)'''
		�e.value�
	'''
	
	def dispatch compileEx (DoubleLiteral e)'''
		�e.value�
	'''
	
	def dispatch compileEx (BooleanLiteral e)'''
		�e.value�
	'''
	
	def dispatch compileEx (StringLiteral e)'''
		"�e.value�"
	'''
	
	def dispatch compileEx (DateLiteral e)'''
		�e.value�
	'''
	
	def dispatch compileEx (TimeLiteral e)'''
		�e.value�
	'''
	
	def dispatch compileEx (VariableRef e)'''
		�e.variable.name�
	'''
	
	//not useful for secreC
//	def dispatch compileEx (Tuple e)'''
//		
//	'''
	
	def dispatch compileEx (List e)'''{
		�FOR x : e.args SEPARATOR ','�
			�x.compileEx�
		�ENDFOR�}
	'''
	
	//not useful for secreC
//	def dispatch compileEx (Dict e)'''
//		
//	'''
	
	def dispatch compileEx(Invocation c){
		switch (c.blockName.type){
			case INSERT: {
				switch (c.funcName){
					case CREATE_DB: {
						'''
���						modificare la grammatica per prendere la tbl corretta
						if (tdbTableExists(ds, tbl)) {
							print("Table `" + tbl + "` already exists, deleting...");
							tdbTableDelete(ds, tbl);
						}
						
						�IF c.args !== null�
							uint params = tdbVmapNew();
							
							�FOR x : c.args�
								{
									�x.stype.toSecrecVisibility� �x.btype.toSecrecType� vtype;
									tdbVmapAddType(params, "types", vtype);
									tdbVmapAddString(params, "names", "�x.parName�");
								}
								
							�ENDFOR�	
						�ENDIF�
						tdbTableCreate(ds, tbl, params);
						
						tdbVmapDelete(params);
						'''
					}
					case ADD_VALUES: {
						'''
						tdbVmapClear(params);
���						bisogna inserire qualcosa che non sia solo una tupla ma qualcos'altro, tipo la variabile ma proveniente da argument
						�IF c.args !== null�
							�FOR x : c.args SEPARATOR ','�
								tdbVmapAddValue(params, "values", �x.name�);
							�ENDFOR�
						�ENDIF�
						tdbInsertRow(ds, tbl, params);
						tdbVmapDelete(params);
						'''
					}
				}		
			}
			case ACCESS: {
			}
			case ANONYMIZATION: {
			}
			case COMP: {
			}
			case PERMISSION: {
			}
			case SEARCH: {
			}
		}
	}
	
}
