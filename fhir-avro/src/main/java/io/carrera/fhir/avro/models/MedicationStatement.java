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
public class MedicationStatement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2201282776001217493L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MedicationStatement\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"medicationCodeableConcept\",\"type\":{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"display\",\"type\":\"string\"}]}}},{\"name\":\"text\",\"type\":[\"string\",\"null\"]}]}},{\"name\":\"subject\",\"type\":{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":\"string\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MedicationStatement> ENCODER =
      new BinaryMessageEncoder<MedicationStatement>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MedicationStatement> DECODER =
      new BinaryMessageDecoder<MedicationStatement>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MedicationStatement> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MedicationStatement> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MedicationStatement> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MedicationStatement>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MedicationStatement to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MedicationStatement from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MedicationStatement instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MedicationStatement fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence resourceType;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence status;
  @Deprecated public io.carrera.fhir.avro.models.CodeableConcept medicationCodeableConcept;
  @Deprecated public io.carrera.fhir.avro.models.Reference subject;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MedicationStatement() {}

  /**
   * All-args constructor.
   * @param resourceType The new value for resourceType
   * @param id The new value for id
   * @param status The new value for status
   * @param medicationCodeableConcept The new value for medicationCodeableConcept
   * @param subject The new value for subject
   */
  public MedicationStatement(java.lang.CharSequence resourceType, java.lang.CharSequence id, java.lang.CharSequence status, io.carrera.fhir.avro.models.CodeableConcept medicationCodeableConcept, io.carrera.fhir.avro.models.Reference subject) {
    this.resourceType = resourceType;
    this.id = id;
    this.status = status;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.subject = subject;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resourceType;
    case 1: return id;
    case 2: return status;
    case 3: return medicationCodeableConcept;
    case 4: return subject;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: resourceType = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: status = (java.lang.CharSequence)value$; break;
    case 3: medicationCodeableConcept = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 4: subject = (io.carrera.fhir.avro.models.Reference)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'resourceType' field.
   * @return The value of the 'resourceType' field.
   */
  public java.lang.CharSequence getResourceType() {
    return resourceType;
  }


  /**
   * Sets the value of the 'resourceType' field.
   * @param value the value to set.
   */
  public void setResourceType(java.lang.CharSequence value) {
    this.resourceType = value;
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
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'medicationCodeableConcept' field.
   * @return The value of the 'medicationCodeableConcept' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getMedicationCodeableConcept() {
    return medicationCodeableConcept;
  }


  /**
   * Sets the value of the 'medicationCodeableConcept' field.
   * @param value the value to set.
   */
  public void setMedicationCodeableConcept(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.medicationCodeableConcept = value;
  }

  /**
   * Gets the value of the 'subject' field.
   * @return The value of the 'subject' field.
   */
  public io.carrera.fhir.avro.models.Reference getSubject() {
    return subject;
  }


  /**
   * Sets the value of the 'subject' field.
   * @param value the value to set.
   */
  public void setSubject(io.carrera.fhir.avro.models.Reference value) {
    this.subject = value;
  }

  /**
   * Creates a new MedicationStatement RecordBuilder.
   * @return A new MedicationStatement RecordBuilder
   */
  public static io.carrera.fhir.avro.models.MedicationStatement.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.MedicationStatement.Builder();
  }

  /**
   * Creates a new MedicationStatement RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MedicationStatement RecordBuilder
   */
  public static io.carrera.fhir.avro.models.MedicationStatement.Builder newBuilder(io.carrera.fhir.avro.models.MedicationStatement.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.MedicationStatement.Builder();
    } else {
      return new io.carrera.fhir.avro.models.MedicationStatement.Builder(other);
    }
  }

  /**
   * Creates a new MedicationStatement RecordBuilder by copying an existing MedicationStatement instance.
   * @param other The existing instance to copy.
   * @return A new MedicationStatement RecordBuilder
   */
  public static io.carrera.fhir.avro.models.MedicationStatement.Builder newBuilder(io.carrera.fhir.avro.models.MedicationStatement other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.MedicationStatement.Builder();
    } else {
      return new io.carrera.fhir.avro.models.MedicationStatement.Builder(other);
    }
  }

  /**
   * RecordBuilder for MedicationStatement instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MedicationStatement>
    implements org.apache.avro.data.RecordBuilder<MedicationStatement> {

    private java.lang.CharSequence resourceType;
    private java.lang.CharSequence id;
    private java.lang.CharSequence status;
    private io.carrera.fhir.avro.models.CodeableConcept medicationCodeableConcept;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder medicationCodeableConceptBuilder;
    private io.carrera.fhir.avro.models.Reference subject;
    private io.carrera.fhir.avro.models.Reference.Builder subjectBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.MedicationStatement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.medicationCodeableConcept)) {
        this.medicationCodeableConcept = data().deepCopy(fields()[3].schema(), other.medicationCodeableConcept);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasMedicationCodeableConceptBuilder()) {
        this.medicationCodeableConceptBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getMedicationCodeableConceptBuilder());
      }
      if (isValidValue(fields()[4], other.subject)) {
        this.subject = data().deepCopy(fields()[4].schema(), other.subject);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasSubjectBuilder()) {
        this.subjectBuilder = io.carrera.fhir.avro.models.Reference.newBuilder(other.getSubjectBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing MedicationStatement instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.MedicationStatement other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.medicationCodeableConcept)) {
        this.medicationCodeableConcept = data().deepCopy(fields()[3].schema(), other.medicationCodeableConcept);
        fieldSetFlags()[3] = true;
      }
      this.medicationCodeableConceptBuilder = null;
      if (isValidValue(fields()[4], other.subject)) {
        this.subject = data().deepCopy(fields()[4].schema(), other.subject);
        fieldSetFlags()[4] = true;
      }
      this.subjectBuilder = null;
    }

    /**
      * Gets the value of the 'resourceType' field.
      * @return The value.
      */
    public java.lang.CharSequence getResourceType() {
      return resourceType;
    }


    /**
      * Sets the value of the 'resourceType' field.
      * @param value The value of 'resourceType'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder setResourceType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.resourceType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceType' field has been set.
      * @return True if the 'resourceType' field has been set, false otherwise.
      */
    public boolean hasResourceType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'resourceType' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder clearResourceType() {
      resourceType = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public io.carrera.fhir.avro.models.MedicationStatement.Builder setId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.status = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder clearStatus() {
      status = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'medicationCodeableConcept' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getMedicationCodeableConcept() {
      return medicationCodeableConcept;
    }


    /**
      * Sets the value of the 'medicationCodeableConcept' field.
      * @param value The value of 'medicationCodeableConcept'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder setMedicationCodeableConcept(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[3], value);
      this.medicationCodeableConceptBuilder = null;
      this.medicationCodeableConcept = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'medicationCodeableConcept' field has been set.
      * @return True if the 'medicationCodeableConcept' field has been set, false otherwise.
      */
    public boolean hasMedicationCodeableConcept() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'medicationCodeableConcept' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getMedicationCodeableConceptBuilder() {
      if (medicationCodeableConceptBuilder == null) {
        if (hasMedicationCodeableConcept()) {
          setMedicationCodeableConceptBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(medicationCodeableConcept));
        } else {
          setMedicationCodeableConceptBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return medicationCodeableConceptBuilder;
    }

    /**
     * Sets the Builder instance for the 'medicationCodeableConcept' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder setMedicationCodeableConceptBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearMedicationCodeableConcept();
      medicationCodeableConceptBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'medicationCodeableConcept' field has an active Builder instance
     * @return True if the 'medicationCodeableConcept' field has an active Builder instance
     */
    public boolean hasMedicationCodeableConceptBuilder() {
      return medicationCodeableConceptBuilder != null;
    }

    /**
      * Clears the value of the 'medicationCodeableConcept' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder clearMedicationCodeableConcept() {
      medicationCodeableConcept = null;
      medicationCodeableConceptBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'subject' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Reference getSubject() {
      return subject;
    }


    /**
      * Sets the value of the 'subject' field.
      * @param value The value of 'subject'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder setSubject(io.carrera.fhir.avro.models.Reference value) {
      validate(fields()[4], value);
      this.subjectBuilder = null;
      this.subject = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'subject' field has been set.
      * @return True if the 'subject' field has been set, false otherwise.
      */
    public boolean hasSubject() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'subject' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Reference.Builder getSubjectBuilder() {
      if (subjectBuilder == null) {
        if (hasSubject()) {
          setSubjectBuilder(io.carrera.fhir.avro.models.Reference.newBuilder(subject));
        } else {
          setSubjectBuilder(io.carrera.fhir.avro.models.Reference.newBuilder());
        }
      }
      return subjectBuilder;
    }

    /**
     * Sets the Builder instance for the 'subject' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder setSubjectBuilder(io.carrera.fhir.avro.models.Reference.Builder value) {
      clearSubject();
      subjectBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'subject' field has an active Builder instance
     * @return True if the 'subject' field has an active Builder instance
     */
    public boolean hasSubjectBuilder() {
      return subjectBuilder != null;
    }

    /**
      * Clears the value of the 'subject' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.MedicationStatement.Builder clearSubject() {
      subject = null;
      subjectBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MedicationStatement build() {
      try {
        MedicationStatement record = new MedicationStatement();
        record.resourceType = fieldSetFlags()[0] ? this.resourceType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.status = fieldSetFlags()[2] ? this.status : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (medicationCodeableConceptBuilder != null) {
          try {
            record.medicationCodeableConcept = this.medicationCodeableConceptBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("medicationCodeableConcept"));
            throw e;
          }
        } else {
          record.medicationCodeableConcept = fieldSetFlags()[3] ? this.medicationCodeableConcept : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[3]);
        }
        if (subjectBuilder != null) {
          try {
            record.subject = this.subjectBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("subject"));
            throw e;
          }
        } else {
          record.subject = fieldSetFlags()[4] ? this.subject : (io.carrera.fhir.avro.models.Reference) defaultValue(fields()[4]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MedicationStatement>
    WRITER$ = (org.apache.avro.io.DatumWriter<MedicationStatement>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MedicationStatement>
    READER$ = (org.apache.avro.io.DatumReader<MedicationStatement>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.resourceType);

    out.writeString(this.id);

    out.writeString(this.status);

    this.medicationCodeableConcept.customEncode(out);

    this.subject.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.resourceType = in.readString(this.resourceType instanceof Utf8 ? (Utf8)this.resourceType : null);

      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);

      if (this.medicationCodeableConcept == null) {
        this.medicationCodeableConcept = new io.carrera.fhir.avro.models.CodeableConcept();
      }
      this.medicationCodeableConcept.customDecode(in);

      if (this.subject == null) {
        this.subject = new io.carrera.fhir.avro.models.Reference();
      }
      this.subject.customDecode(in);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.resourceType = in.readString(this.resourceType instanceof Utf8 ? (Utf8)this.resourceType : null);
          break;

        case 1:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 2:
          this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
          break;

        case 3:
          if (this.medicationCodeableConcept == null) {
            this.medicationCodeableConcept = new io.carrera.fhir.avro.models.CodeableConcept();
          }
          this.medicationCodeableConcept.customDecode(in);
          break;

        case 4:
          if (this.subject == null) {
            this.subject = new io.carrera.fhir.avro.models.Reference();
          }
          this.subject.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









