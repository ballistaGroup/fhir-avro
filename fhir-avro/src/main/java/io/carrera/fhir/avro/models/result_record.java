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
public class result_record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2082656675521520526L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"result_record\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"reference\",\"type\":\"string\"},{\"name\":\"display\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<result_record> ENCODER =
      new BinaryMessageEncoder<result_record>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<result_record> DECODER =
      new BinaryMessageDecoder<result_record>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<result_record> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<result_record> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<result_record> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<result_record>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this result_record to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a result_record from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a result_record instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static result_record fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence reference;
   private java.lang.CharSequence display;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public result_record() {}

  /**
   * All-args constructor.
   * @param reference The new value for reference
   * @param display The new value for display
   */
  public result_record(java.lang.CharSequence reference, java.lang.CharSequence display) {
    this.reference = reference;
    this.display = display;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reference;
    case 1: return display;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reference = (java.lang.CharSequence)value$; break;
    case 1: display = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'reference' field.
   * @return The value of the 'reference' field.
   */
  public java.lang.CharSequence getReference() {
    return reference;
  }


  /**
   * Sets the value of the 'reference' field.
   * @param value the value to set.
   */
  public void setReference(java.lang.CharSequence value) {
    this.reference = value;
  }

  /**
   * Gets the value of the 'display' field.
   * @return The value of the 'display' field.
   */
  public java.lang.CharSequence getDisplay() {
    return display;
  }


  /**
   * Sets the value of the 'display' field.
   * @param value the value to set.
   */
  public void setDisplay(java.lang.CharSequence value) {
    this.display = value;
  }

  /**
   * Creates a new result_record RecordBuilder.
   * @return A new result_record RecordBuilder
   */
  public static io.carrera.fhir.avro.models.result_record.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.result_record.Builder();
  }

  /**
   * Creates a new result_record RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new result_record RecordBuilder
   */
  public static io.carrera.fhir.avro.models.result_record.Builder newBuilder(io.carrera.fhir.avro.models.result_record.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.result_record.Builder();
    } else {
      return new io.carrera.fhir.avro.models.result_record.Builder(other);
    }
  }

  /**
   * Creates a new result_record RecordBuilder by copying an existing result_record instance.
   * @param other The existing instance to copy.
   * @return A new result_record RecordBuilder
   */
  public static io.carrera.fhir.avro.models.result_record.Builder newBuilder(io.carrera.fhir.avro.models.result_record other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.result_record.Builder();
    } else {
      return new io.carrera.fhir.avro.models.result_record.Builder(other);
    }
  }

  /**
   * RecordBuilder for result_record instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<result_record>
    implements org.apache.avro.data.RecordBuilder<result_record> {

    private java.lang.CharSequence reference;
    private java.lang.CharSequence display;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.result_record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reference)) {
        this.reference = data().deepCopy(fields()[0].schema(), other.reference);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.display)) {
        this.display = data().deepCopy(fields()[1].schema(), other.display);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing result_record instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.result_record other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.reference)) {
        this.reference = data().deepCopy(fields()[0].schema(), other.reference);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.display)) {
        this.display = data().deepCopy(fields()[1].schema(), other.display);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'reference' field.
      * @return The value.
      */
    public java.lang.CharSequence getReference() {
      return reference;
    }


    /**
      * Sets the value of the 'reference' field.
      * @param value The value of 'reference'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.result_record.Builder setReference(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.reference = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'reference' field has been set.
      * @return True if the 'reference' field has been set, false otherwise.
      */
    public boolean hasReference() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'reference' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.result_record.Builder clearReference() {
      reference = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'display' field.
      * @return The value.
      */
    public java.lang.CharSequence getDisplay() {
      return display;
    }


    /**
      * Sets the value of the 'display' field.
      * @param value The value of 'display'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.result_record.Builder setDisplay(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.display = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'display' field has been set.
      * @return True if the 'display' field has been set, false otherwise.
      */
    public boolean hasDisplay() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'display' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.result_record.Builder clearDisplay() {
      display = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public result_record build() {
      try {
        result_record record = new result_record();
        record.reference = fieldSetFlags()[0] ? this.reference : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.display = fieldSetFlags()[1] ? this.display : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<result_record>
    WRITER$ = (org.apache.avro.io.DatumWriter<result_record>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<result_record>
    READER$ = (org.apache.avro.io.DatumReader<result_record>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.reference);

    out.writeString(this.display);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.reference = in.readString(this.reference instanceof Utf8 ? (Utf8)this.reference : null);

      this.display = in.readString(this.display instanceof Utf8 ? (Utf8)this.display : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.reference = in.readString(this.reference instanceof Utf8 ? (Utf8)this.reference : null);
          break;

        case 1:
          this.display = in.readString(this.display instanceof Utf8 ? (Utf8)this.display : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










