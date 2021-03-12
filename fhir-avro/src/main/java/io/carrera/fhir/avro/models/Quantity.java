/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.carrera.fhir.avro.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Quantity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5627686501179005338L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Quantity\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"comparator\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Quantity> ENCODER =
      new BinaryMessageEncoder<Quantity>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Quantity> DECODER =
      new BinaryMessageDecoder<Quantity>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Quantity> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Quantity> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Quantity> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Quantity>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Quantity to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Quantity from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Quantity instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Quantity fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Float value;
  @Deprecated public java.lang.CharSequence unit;
  @Deprecated public java.lang.CharSequence system;
  @Deprecated public java.lang.CharSequence code;
  @Deprecated public java.lang.CharSequence comparator;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Quantity() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   * @param unit The new value for unit
   * @param system The new value for system
   * @param code The new value for code
   * @param comparator The new value for comparator
   */
  public Quantity(java.lang.Float value, java.lang.CharSequence unit, java.lang.CharSequence system, java.lang.CharSequence code, java.lang.CharSequence comparator) {
    this.value = value;
    this.unit = unit;
    this.system = system;
    this.code = code;
    this.comparator = comparator;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return unit;
    case 2: return system;
    case 3: return code;
    case 4: return comparator;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Float)value$; break;
    case 1: unit = (java.lang.CharSequence)value$; break;
    case 2: system = (java.lang.CharSequence)value$; break;
    case 3: code = (java.lang.CharSequence)value$; break;
    case 4: comparator = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.Float getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Float value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'unit' field.
   * @return The value of the 'unit' field.
   */
  public java.lang.CharSequence getUnit() {
    return unit;
  }


  /**
   * Sets the value of the 'unit' field.
   * @param value the value to set.
   */
  public void setUnit(java.lang.CharSequence value) {
    this.unit = value;
  }

  /**
   * Gets the value of the 'system' field.
   * @return The value of the 'system' field.
   */
  public java.lang.CharSequence getSystem() {
    return system;
  }


  /**
   * Sets the value of the 'system' field.
   * @param value the value to set.
   */
  public void setSystem(java.lang.CharSequence value) {
    this.system = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'comparator' field.
   * @return The value of the 'comparator' field.
   */
  public java.lang.CharSequence getComparator() {
    return comparator;
  }


  /**
   * Sets the value of the 'comparator' field.
   * @param value the value to set.
   */
  public void setComparator(java.lang.CharSequence value) {
    this.comparator = value;
  }

  /**
   * Creates a new Quantity RecordBuilder.
   * @return A new Quantity RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Quantity.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Quantity.Builder();
  }

  /**
   * Creates a new Quantity RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Quantity RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Quantity.Builder newBuilder(io.carrera.fhir.avro.models.Quantity.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Quantity.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Quantity.Builder(other);
    }
  }

  /**
   * Creates a new Quantity RecordBuilder by copying an existing Quantity instance.
   * @param other The existing instance to copy.
   * @return A new Quantity RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Quantity.Builder newBuilder(io.carrera.fhir.avro.models.Quantity other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Quantity.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Quantity.Builder(other);
    }
  }

  /**
   * RecordBuilder for Quantity instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Quantity>
    implements org.apache.avro.data.RecordBuilder<Quantity> {

    private java.lang.Float value;
    private java.lang.CharSequence unit;
    private java.lang.CharSequence system;
    private java.lang.CharSequence code;
    private java.lang.CharSequence comparator;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Quantity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.unit)) {
        this.unit = data().deepCopy(fields()[1].schema(), other.unit);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.system)) {
        this.system = data().deepCopy(fields()[2].schema(), other.system);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.code)) {
        this.code = data().deepCopy(fields()[3].schema(), other.code);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.comparator)) {
        this.comparator = data().deepCopy(fields()[4].schema(), other.comparator);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Quantity instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Quantity other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.unit)) {
        this.unit = data().deepCopy(fields()[1].schema(), other.unit);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.system)) {
        this.system = data().deepCopy(fields()[2].schema(), other.system);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.code)) {
        this.code = data().deepCopy(fields()[3].schema(), other.code);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.comparator)) {
        this.comparator = data().deepCopy(fields()[4].schema(), other.comparator);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.Float getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder setValue(java.lang.Float value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder clearValue() {
      value = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'unit' field.
      * @return The value.
      */
    public java.lang.CharSequence getUnit() {
      return unit;
    }


    /**
      * Sets the value of the 'unit' field.
      * @param value The value of 'unit'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder setUnit(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.unit = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'unit' field has been set.
      * @return True if the 'unit' field has been set, false otherwise.
      */
    public boolean hasUnit() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'unit' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder clearUnit() {
      unit = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'system' field.
      * @return The value.
      */
    public java.lang.CharSequence getSystem() {
      return system;
    }


    /**
      * Sets the value of the 'system' field.
      * @param value The value of 'system'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder setSystem(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.system = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'system' field has been set.
      * @return True if the 'system' field has been set, false otherwise.
      */
    public boolean hasSystem() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'system' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder clearSystem() {
      system = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.code = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder clearCode() {
      code = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'comparator' field.
      * @return The value.
      */
    public java.lang.CharSequence getComparator() {
      return comparator;
    }


    /**
      * Sets the value of the 'comparator' field.
      * @param value The value of 'comparator'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder setComparator(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.comparator = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'comparator' field has been set.
      * @return True if the 'comparator' field has been set, false otherwise.
      */
    public boolean hasComparator() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'comparator' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Quantity.Builder clearComparator() {
      comparator = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Quantity build() {
      try {
        Quantity record = new Quantity();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Float) defaultValue(fields()[0]);
        record.unit = fieldSetFlags()[1] ? this.unit : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.system = fieldSetFlags()[2] ? this.system : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.code = fieldSetFlags()[3] ? this.code : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.comparator = fieldSetFlags()[4] ? this.comparator : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Quantity>
    WRITER$ = (org.apache.avro.io.DatumWriter<Quantity>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Quantity>
    READER$ = (org.apache.avro.io.DatumReader<Quantity>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.value == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeFloat(this.value);
    }

    if (this.unit == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.unit);
    }

    if (this.system == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.system);
    }

    if (this.code == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.code);
    }

    if (this.comparator == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.comparator);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.value = null;
      } else {
        this.value = in.readFloat();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.unit = null;
      } else {
        this.unit = in.readString(this.unit instanceof Utf8 ? (Utf8)this.unit : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.system = null;
      } else {
        this.system = in.readString(this.system instanceof Utf8 ? (Utf8)this.system : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.code = null;
      } else {
        this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.comparator = null;
      } else {
        this.comparator = in.readString(this.comparator instanceof Utf8 ? (Utf8)this.comparator : null);
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.value = null;
          } else {
            this.value = in.readFloat();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.unit = null;
          } else {
            this.unit = in.readString(this.unit instanceof Utf8 ? (Utf8)this.unit : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.system = null;
          } else {
            this.system = in.readString(this.system instanceof Utf8 ? (Utf8)this.system : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.code = null;
          } else {
            this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.comparator = null;
          } else {
            this.comparator = in.readString(this.comparator instanceof Utf8 ? (Utf8)this.comparator : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










