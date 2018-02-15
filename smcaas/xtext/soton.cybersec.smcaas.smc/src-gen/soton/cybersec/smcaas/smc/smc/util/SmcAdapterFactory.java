/**
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc.smc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import soton.cybersec.smcaas.smc.smc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see soton.cybersec.smcaas.smc.smc.SmcPackage
 * @generated
 */
public class SmcAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmcPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmcAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SmcPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmcSwitch<Adapter> modelSwitch =
    new SmcSwitch<Adapter>()
    {
      @Override
      public Adapter caseSmc(Smc object)
      {
        return createSmcAdapter();
      }
      @Override
      public Adapter caseBlockSMC(BlockSMC object)
      {
        return createBlockSMCAdapter();
      }
      @Override
      public Adapter caseMainSMC(MainSMC object)
      {
        return createMainSMCAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseParamDecl(ParamDecl object)
      {
        return createParamDeclAdapter();
      }
      @Override
      public Adapter caseInvocationVoid(InvocationVoid object)
      {
        return createInvocationVoidAdapter();
      }
      @Override
      public Adapter casePrint(Print object)
      {
        return createPrintAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseIfThenElse(IfThenElse object)
      {
        return createIfThenElseAdapter();
      }
      @Override
      public Adapter caseVariableDecl(VariableDecl object)
      {
        return createVariableDeclAdapter();
      }
      @Override
      public Adapter caseVariableAssignment(VariableAssignment object)
      {
        return createVariableAssignmentAdapter();
      }
      @Override
      public Adapter caseAbstractAssignment(AbstractAssignment object)
      {
        return createAbstractAssignmentAdapter();
      }
      @Override
      public Adapter caseDownload(Download object)
      {
        return createDownloadAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseTuple(Tuple object)
      {
        return createTupleAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseDict(Dict object)
      {
        return createDictAdapter();
      }
      @Override
      public Adapter caseInvocation(Invocation object)
      {
        return createInvocationAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseEquality(Equality object)
      {
        return createEqualityAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter casePlusOrMinus(PlusOrMinus object)
      {
        return createPlusOrMinusAdapter();
      }
      @Override
      public Adapter caseMulOrDiv(MulOrDiv object)
      {
        return createMulOrDivAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseDoubleLiteral(DoubleLiteral object)
      {
        return createDoubleLiteralAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseDateLiteral(DateLiteral object)
      {
        return createDateLiteralAdapter();
      }
      @Override
      public Adapter caseTimeLiteral(TimeLiteral object)
      {
        return createTimeLiteralAdapter();
      }
      @Override
      public Adapter caseVariableRef(VariableRef object)
      {
        return createVariableRefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Smc <em>Smc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Smc
   * @generated
   */
  public Adapter createSmcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.BlockSMC <em>Block SMC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.BlockSMC
   * @generated
   */
  public Adapter createBlockSMCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.MainSMC <em>Main SMC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.MainSMC
   * @generated
   */
  public Adapter createMainSMCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.ParamDecl <em>Param Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.ParamDecl
   * @generated
   */
  public Adapter createParamDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.InvocationVoid <em>Invocation Void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.InvocationVoid
   * @generated
   */
  public Adapter createInvocationVoidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Print
   * @generated
   */
  public Adapter createPrintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.IfThenElse
   * @generated
   */
  public Adapter createIfThenElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.VariableDecl
   * @generated
   */
  public Adapter createVariableDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.VariableAssignment
   * @generated
   */
  public Adapter createVariableAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.AbstractAssignment <em>Abstract Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.AbstractAssignment
   * @generated
   */
  public Adapter createAbstractAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Download <em>Download</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Download
   * @generated
   */
  public Adapter createDownloadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Tuple
   * @generated
   */
  public Adapter createTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Dict <em>Dict</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Dict
   * @generated
   */
  public Adapter createDictAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Invocation <em>Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Invocation
   * @generated
   */
  public Adapter createInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Equality
   * @generated
   */
  public Adapter createEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.PlusOrMinus <em>Plus Or Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.PlusOrMinus
   * @generated
   */
  public Adapter createPlusOrMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.MulOrDiv <em>Mul Or Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.MulOrDiv
   * @generated
   */
  public Adapter createMulOrDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.DoubleLiteral
   * @generated
   */
  public Adapter createDoubleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.DateLiteral <em>Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.DateLiteral
   * @generated
   */
  public Adapter createDateLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.TimeLiteral <em>Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.TimeLiteral
   * @generated
   */
  public Adapter createTimeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soton.cybersec.smcaas.smc.smc.VariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soton.cybersec.smcaas.smc.smc.VariableRef
   * @generated
   */
  public Adapter createVariableRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SmcAdapterFactory
