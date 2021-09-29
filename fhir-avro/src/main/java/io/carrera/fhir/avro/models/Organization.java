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
public class Organization extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4610822315729526943L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Organization\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"identifier\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"identifier_record\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Organization> ENCODER =
      new BinaryMessageEncoder<Organization>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Organization> DECODER =
      new BinaryMessageDecoder<Organization>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Organization> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Organization> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Organization> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Organization>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Organization to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Organization from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Organization instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Organization fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence id;
   private java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Organization() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param identifier The new value for identifier
   */
  public Organization(java.lang.CharSequence id, java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier) {
    this.id = id;
    this.identifier = identifier;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return identifier;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: identifier = (java.util.List<io.carrera.fhir.avro.models.identifier_record>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'identifier' field.
   * @return The value of the 'identifier' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.identifier_record> getIdentifier() {
    return identifier;
  }


  /**
   * Sets the value of the 'identifier' field.
   * @param value the value to set.
   */
  public void setIdentifier(java.util.List<io.carrera.fhir.avro.models.identifier_record> value) {
    this.identifier = value;
  }

  /**
   * Creates a new Organization RecordBuilder.
   * @return A new Organization RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Organization.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Organization.Builder();
  }

  /**
   * Creates a new Organization RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Organization RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Organization.Builder newBuilder(io.carrera.fhir.avro.models.Organization.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Organization.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Organization.Builder(other);
    }
  }

  /**
   * Creates a new Organization RecordBuilder by copying an existing Organization instance.
   * @param other The existing instance to copy.
   * @return A new Organization RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Organization.Builder newBuilder(io.carrera.fhir.avro.models.Organization other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Organization.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Organization.Builder(other);
    }
  }

  /**
   * RecordBuilder for Organization instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Organization>
    implements org.apache.avro.data.RecordBuilder<Organization> {

    private java.lang.CharSequence id;
    private java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Organization.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.identifier)) {
        this.identifier = data().deepCopy(fields()[1].schema(), other.identifier);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Organization instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Organization other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.identifier)) {
        this.identifier = data().deepCopy(fields()[1].schema(), other.identifier);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Organization.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Organization.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'identifier' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.identifier_record> getIdentifier() {
      return identifier;
    }


    /**
      * Sets the value of the 'identifier' field.
      * @param value The value of 'identifier'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Organization.Builder setIdentifier(java.util.List<io.carrera.fhir.avro.models.identifier_record> value) {
      validate(fields()[1], value);
      this.identifier = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'identifier' field has been set.
      * @return True if the 'identifier' field has been set, false otherwise.
      */
    public boolean hasIdentifier() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'identifier' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Organization.Builder clearIdentifier() {
      identifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Organization build() {
      try {
        Organization record = new Organization();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.identifier = fieldSetFlags()[1] ? this.identifier : (java.util.List<io.carrera.fhir.avro.models.identifier_record>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Organization>
    WRITER$ = (org.apache.avro.io.DatumWriter<Organization>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Organization>
    READER$ = (org.apache.avro.io.DatumReader<Organization>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.id);
    }

    if (this.identifier == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.identifier.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (io.carrera.fhir.avro.models.identifier_record e0: this.identifier) {
        actualSize0++;
        out.startItem();
        e0.customEncode(out);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.identifier = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<io.carrera.fhir.avro.models.identifier_record> a0 = this.identifier;
        if (a0 == null) {
          a0 = new SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>((int)size0, SCHEMA$.getField("identifier").schema().getTypes().get(1));
          this.identifier = a0;
        } else a0.clear();
        SpecificData.Array<io.carrera.fhir.avro.models.identifier_record> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            io.carrera.fhir.avro.models.identifier_record e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new io.carrera.fhir.avro.models.identifier_record();
            }
            e0.customDecode(in);
            a0.add(e0);
          }
        }
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.identifier = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<io.carrera.fhir.avro.models.identifier_record> a0 = this.identifier;
            if (a0 == null) {
              a0 = new SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>((int)size0, SCHEMA$.getField("identifier").schema().getTypes().get(1));
              this.identifier = a0;
            } else a0.clear();
            SpecificData.Array<io.carrera.fhir.avro.models.identifier_record> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                io.carrera.fhir.avro.models.identifier_record e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new io.carrera.fhir.avro.models.identifier_record();
                }
                e0.customDecode(in);
                a0.add(e0);
              }
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









