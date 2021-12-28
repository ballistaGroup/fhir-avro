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
public class Money extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4754296710472878007L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Money\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Decimal\",\"fields\":[{\"name\":\"unscaled_value\",\"type\":\"bytes\",\"logicalType\":\"decimal\"},{\"name\":\"precision\",\"type\":\"int\"},{\"name\":\"scale\",\"type\":\"int\"}]}],\"default\":null},{\"name\":\"currency\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Money> ENCODER =
      new BinaryMessageEncoder<Money>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Money> DECODER =
      new BinaryMessageDecoder<Money>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Money> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Money> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Money> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Money>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Money to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Money from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Money instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Money fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private io.carrera.fhir.avro.models.Decimal value;
   private java.lang.CharSequence currency;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Money() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   * @param currency The new value for currency
   */
  public Money(io.carrera.fhir.avro.models.Decimal value, java.lang.CharSequence currency) {
    this.value = value;
    this.currency = currency;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return currency;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (io.carrera.fhir.avro.models.Decimal)value$; break;
    case 1: currency = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public io.carrera.fhir.avro.models.Decimal getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(io.carrera.fhir.avro.models.Decimal value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'currency' field.
   * @return The value of the 'currency' field.
   */
  public java.lang.CharSequence getCurrency() {
    return currency;
  }


  /**
   * Sets the value of the 'currency' field.
   * @param value the value to set.
   */
  public void setCurrency(java.lang.CharSequence value) {
    this.currency = value;
  }

  /**
   * Creates a new Money RecordBuilder.
   * @return A new Money RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Money.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Money.Builder();
  }

  /**
   * Creates a new Money RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Money RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Money.Builder newBuilder(io.carrera.fhir.avro.models.Money.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Money.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Money.Builder(other);
    }
  }

  /**
   * Creates a new Money RecordBuilder by copying an existing Money instance.
   * @param other The existing instance to copy.
   * @return A new Money RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Money.Builder newBuilder(io.carrera.fhir.avro.models.Money other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Money.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Money.Builder(other);
    }
  }

  /**
   * RecordBuilder for Money instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Money>
    implements org.apache.avro.data.RecordBuilder<Money> {

    private io.carrera.fhir.avro.models.Decimal value;
    private io.carrera.fhir.avro.models.Decimal.Builder valueBuilder;
    private java.lang.CharSequence currency;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Money.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasValueBuilder()) {
        this.valueBuilder = io.carrera.fhir.avro.models.Decimal.newBuilder(other.getValueBuilder());
      }
      if (isValidValue(fields()[1], other.currency)) {
        this.currency = data().deepCopy(fields()[1].schema(), other.currency);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Money instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Money other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      this.valueBuilder = null;
      if (isValidValue(fields()[1], other.currency)) {
        this.currency = data().deepCopy(fields()[1].schema(), other.currency);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Decimal getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Money.Builder setValue(io.carrera.fhir.avro.models.Decimal value) {
      validate(fields()[0], value);
      this.valueBuilder = null;
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
     * Gets the Builder instance for the 'value' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Decimal.Builder getValueBuilder() {
      if (valueBuilder == null) {
        if (hasValue()) {
          setValueBuilder(io.carrera.fhir.avro.models.Decimal.newBuilder(value));
        } else {
          setValueBuilder(io.carrera.fhir.avro.models.Decimal.newBuilder());
        }
      }
      return valueBuilder;
    }

    /**
     * Sets the Builder instance for the 'value' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Money.Builder setValueBuilder(io.carrera.fhir.avro.models.Decimal.Builder value) {
      clearValue();
      valueBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'value' field has an active Builder instance
     * @return True if the 'value' field has an active Builder instance
     */
    public boolean hasValueBuilder() {
      return valueBuilder != null;
    }

    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Money.Builder clearValue() {
      value = null;
      valueBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'currency' field.
      * @return The value.
      */
    public java.lang.CharSequence getCurrency() {
      return currency;
    }


    /**
      * Sets the value of the 'currency' field.
      * @param value The value of 'currency'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Money.Builder setCurrency(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.currency = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'currency' field has been set.
      * @return True if the 'currency' field has been set, false otherwise.
      */
    public boolean hasCurrency() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'currency' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Money.Builder clearCurrency() {
      currency = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Money build() {
      try {
        Money record = new Money();
        if (valueBuilder != null) {
          try {
            record.value = this.valueBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("value"));
            throw e;
          }
        } else {
          record.value = fieldSetFlags()[0] ? this.value : (io.carrera.fhir.avro.models.Decimal) defaultValue(fields()[0]);
        }
        record.currency = fieldSetFlags()[1] ? this.currency : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Money>
    WRITER$ = (org.apache.avro.io.DatumWriter<Money>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Money>
    READER$ = (org.apache.avro.io.DatumReader<Money>)MODEL$.createDatumReader(SCHEMA$);

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
      this.value.customEncode(out);
    }

    if (this.currency == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.currency);
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
        if (this.value == null) {
          this.value = new io.carrera.fhir.avro.models.Decimal();
        }
        this.value.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.currency = null;
      } else {
        this.currency = in.readString(this.currency instanceof Utf8 ? (Utf8)this.currency : null);
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.value = null;
          } else {
            if (this.value == null) {
              this.value = new io.carrera.fhir.avro.models.Decimal();
            }
            this.value.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.currency = null;
          } else {
            this.currency = in.readString(this.currency instanceof Utf8 ? (Utf8)this.currency : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









