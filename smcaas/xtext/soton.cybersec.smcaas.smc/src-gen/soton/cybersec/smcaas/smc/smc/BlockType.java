/**
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc.smc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Block Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see soton.cybersec.smcaas.smc.smc.SmcPackage#getBlockType()
 * @model
 * @generated
 */
public enum BlockType implements Enumerator
{
  /**
   * The '<em><b>INSERT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSERT_VALUE
   * @generated
   * @ordered
   */
  INSERT(0, "INSERT", "insert_data"),

  /**
   * The '<em><b>COMP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMP_VALUE
   * @generated
   * @ordered
   */
  COMP(1, "COMP", "math_computation"),

  /**
   * The '<em><b>SEARCH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEARCH_VALUE
   * @generated
   * @ordered
   */
  SEARCH(2, "SEARCH", "search"),

  /**
   * The '<em><b>ANONYMIZATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANONYMIZATION_VALUE
   * @generated
   * @ordered
   */
  ANONYMIZATION(3, "ANONYMIZATION", "anonymization"),

  /**
   * The '<em><b>ACCESS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACCESS_VALUE
   * @generated
   * @ordered
   */
  ACCESS(4, "ACCESS", "access_control"),

  /**
   * The '<em><b>PERMISSION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERMISSION_VALUE
   * @generated
   * @ordered
   */
  PERMISSION(5, "PERMISSION", "permission_release");

  /**
   * The '<em><b>INSERT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INSERT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INSERT
   * @model literal="insert_data"
   * @generated
   * @ordered
   */
  public static final int INSERT_VALUE = 0;

  /**
   * The '<em><b>COMP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COMP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMP
   * @model literal="math_computation"
   * @generated
   * @ordered
   */
  public static final int COMP_VALUE = 1;

  /**
   * The '<em><b>SEARCH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SEARCH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SEARCH
   * @model literal="search"
   * @generated
   * @ordered
   */
  public static final int SEARCH_VALUE = 2;

  /**
   * The '<em><b>ANONYMIZATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANONYMIZATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANONYMIZATION
   * @model literal="anonymization"
   * @generated
   * @ordered
   */
  public static final int ANONYMIZATION_VALUE = 3;

  /**
   * The '<em><b>ACCESS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ACCESS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACCESS
   * @model literal="access_control"
   * @generated
   * @ordered
   */
  public static final int ACCESS_VALUE = 4;

  /**
   * The '<em><b>PERMISSION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PERMISSION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERMISSION
   * @model literal="permission_release"
   * @generated
   * @ordered
   */
  public static final int PERMISSION_VALUE = 5;

  /**
   * An array of all the '<em><b>Block Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BlockType[] VALUES_ARRAY =
    new BlockType[]
    {
      INSERT,
      COMP,
      SEARCH,
      ANONYMIZATION,
      ACCESS,
      PERMISSION,
    };

  /**
   * A public read-only list of all the '<em><b>Block Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BlockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Block Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BlockType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BlockType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Block Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BlockType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BlockType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Block Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BlockType get(int value)
  {
    switch (value)
    {
      case INSERT_VALUE: return INSERT;
      case COMP_VALUE: return COMP;
      case SEARCH_VALUE: return SEARCH;
      case ANONYMIZATION_VALUE: return ANONYMIZATION;
      case ACCESS_VALUE: return ACCESS;
      case PERMISSION_VALUE: return PERMISSION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private BlockType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //BlockType
