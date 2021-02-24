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
public class Procedure extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -109800848304148494L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Procedure\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"code\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"subject\",\"type\":{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"encounter\",\"type\":[\"null\",\"Reference\"],\"default\":null},{\"name\":\"performedPeriod\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Period\",\"fields\":[{\"name\":\"start\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"local-timestamp-micros\"}],\"default\":null},{\"name\":\"end\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"long\",\"logicalType\":\"local-timestamp-micros\"}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<Procedure> ENCODER =
      new BinaryMessageEncoder<Procedure>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Procedure> DECODER =
      new BinaryMessageDecoder<Procedure>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Procedure> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Procedure> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Procedure> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Procedure>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Procedure to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Procedure from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Procedure instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Procedure fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence resourceType;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence status;
  @Deprecated public io.carrera.fhir.avro.models.CodeableConcept code;
  @Deprecated public io.carrera.fhir.avro.models.Reference subject;
  @Deprecated public io.carrera.fhir.avro.models.Reference encounter;
  @Deprecated public io.carrera.fhir.avro.models.Period performedPeriod;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Procedure() {}

  /**
   * All-args constructor.
   * @param resourceType The new value for resourceType
   * @param id The new value for id
   * @param status The new value for status
   * @param code The new value for code
   * @param subject The new value for subject
   * @param encounter The new value for encounter
   * @param performedPeriod The new value for performedPeriod
   */
  public Procedure(java.lang.CharSequence resourceType, java.lang.CharSequence id, java.lang.CharSequence status, io.carrera.fhir.avro.models.CodeableConcept code, io.carrera.fhir.avro.models.Reference subject, io.carrera.fhir.avro.models.Reference encounter, io.carrera.fhir.avro.models.Period performedPeriod) {
    this.resourceType = resourceType;
    this.id = id;
    this.status = status;
    this.code = code;
    this.subject = subject;
    this.encounter = encounter;
    this.performedPeriod = performedPeriod;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resourceType;
    case 1: return id;
    case 2: return status;
    case 3: return code;
    case 4: return subject;
    case 5: return encounter;
    case 6: return performedPeriod;
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
    case 3: code = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 4: subject = (io.carrera.fhir.avro.models.Reference)value$; break;
    case 5: encounter = (io.carrera.fhir.avro.models.Reference)value$; break;
    case 6: performedPeriod = (io.carrera.fhir.avro.models.Period)value$; break;
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
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.code = value;
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
   * Gets the value of the 'encounter' field.
   * @return The value of the 'encounter' field.
   */
  public io.carrera.fhir.avro.models.Reference getEncounter() {
    return encounter;
  }


  /**
   * Sets the value of the 'encounter' field.
   * @param value the value to set.
   */
  public void setEncounter(io.carrera.fhir.avro.models.Reference value) {
    this.encounter = value;
  }

  /**
   * Gets the value of the 'performedPeriod' field.
   * @return The value of the 'performedPeriod' field.
   */
  public io.carrera.fhir.avro.models.Period getPerformedPeriod() {
    return performedPeriod;
  }


  /**
   * Sets the value of the 'performedPeriod' field.
   * @param value the value to set.
   */
  public void setPerformedPeriod(io.carrera.fhir.avro.models.Period value) {
    this.performedPeriod = value;
  }

  /**
   * Creates a new Procedure RecordBuilder.
   * @return A new Procedure RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Procedure.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Procedure.Builder();
  }

  /**
   * Creates a new Procedure RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Procedure RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Procedure.Builder newBuilder(io.carrera.fhir.avro.models.Procedure.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Procedure.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Procedure.Builder(other);
    }
  }

  /**
   * Creates a new Procedure RecordBuilder by copying an existing Procedure instance.
   * @param other The existing instance to copy.
   * @return A new Procedure RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Procedure.Builder newBuilder(io.carrera.fhir.avro.models.Procedure other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Procedure.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Procedure.Builder(other);
    }
  }

  /**
   * RecordBuilder for Procedure instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Procedure>
    implements org.apache.avro.data.RecordBuilder<Procedure> {

    private java.lang.CharSequence resourceType;
    private java.lang.CharSequence id;
    private java.lang.CharSequence status;
    private io.carrera.fhir.avro.models.CodeableConcept code;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder codeBuilder;
    private io.carrera.fhir.avro.models.Reference subject;
    private io.carrera.fhir.avro.models.Reference.Builder subjectBuilder;
    private io.carrera.fhir.avro.models.Reference encounter;
    private io.carrera.fhir.avro.models.Reference.Builder encounterBuilder;
    private io.carrera.fhir.avro.models.Period performedPeriod;
    private io.carrera.fhir.avro.models.Period.Builder performedPeriodBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Procedure.Builder other) {
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
      if (isValidValue(fields()[3], other.code)) {
        this.code = data().deepCopy(fields()[3].schema(), other.code);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasCodeBuilder()) {
        this.codeBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getCodeBuilder());
      }
      if (isValidValue(fields()[4], other.subject)) {
        this.subject = data().deepCopy(fields()[4].schema(), other.subject);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasSubjectBuilder()) {
        this.subjectBuilder = io.carrera.fhir.avro.models.Reference.newBuilder(other.getSubjectBuilder());
      }
      if (isValidValue(fields()[5], other.encounter)) {
        this.encounter = data().deepCopy(fields()[5].schema(), other.encounter);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasEncounterBuilder()) {
        this.encounterBuilder = io.carrera.fhir.avro.models.Reference.newBuilder(other.getEncounterBuilder());
      }
      if (isValidValue(fields()[6], other.performedPeriod)) {
        this.performedPeriod = data().deepCopy(fields()[6].schema(), other.performedPeriod);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (other.hasPerformedPeriodBuilder()) {
        this.performedPeriodBuilder = io.carrera.fhir.avro.models.Period.newBuilder(other.getPerformedPeriodBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Procedure instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Procedure other) {
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
      if (isValidValue(fields()[3], other.code)) {
        this.code = data().deepCopy(fields()[3].schema(), other.code);
        fieldSetFlags()[3] = true;
      }
      this.codeBuilder = null;
      if (isValidValue(fields()[4], other.subject)) {
        this.subject = data().deepCopy(fields()[4].schema(), other.subject);
        fieldSetFlags()[4] = true;
      }
      this.subjectBuilder = null;
      if (isValidValue(fields()[5], other.encounter)) {
        this.encounter = data().deepCopy(fields()[5].schema(), other.encounter);
        fieldSetFlags()[5] = true;
      }
      this.encounterBuilder = null;
      if (isValidValue(fields()[6], other.performedPeriod)) {
        this.performedPeriod = data().deepCopy(fields()[6].schema(), other.performedPeriod);
        fieldSetFlags()[6] = true;
      }
      this.performedPeriodBuilder = null;
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
    public io.carrera.fhir.avro.models.Procedure.Builder setResourceType(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.Procedure.Builder clearResourceType() {
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
    public io.carrera.fhir.avro.models.Procedure.Builder setId(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.Procedure.Builder clearId() {
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
    public io.carrera.fhir.avro.models.Procedure.Builder setStatus(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.Procedure.Builder clearStatus() {
      status = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Procedure.Builder setCode(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[3], value);
      this.codeBuilder = null;
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
     * Gets the Builder instance for the 'code' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getCodeBuilder() {
      if (codeBuilder == null) {
        if (hasCode()) {
          setCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(code));
        } else {
          setCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return codeBuilder;
    }

    /**
     * Sets the Builder instance for the 'code' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Procedure.Builder setCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearCode();
      codeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'code' field has an active Builder instance
     * @return True if the 'code' field has an active Builder instance
     */
    public boolean hasCodeBuilder() {
      return codeBuilder != null;
    }

    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Procedure.Builder clearCode() {
      code = null;
      codeBuilder = null;
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
    public io.carrera.fhir.avro.models.Procedure.Builder setSubject(io.carrera.fhir.avro.models.Reference value) {
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
    public io.carrera.fhir.avro.models.Procedure.Builder setSubjectBuilder(io.carrera.fhir.avro.models.Reference.Builder value) {
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
    public io.carrera.fhir.avro.models.Procedure.Builder clearSubject() {
      subject = null;
      subjectBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'encounter' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Reference getEncounter() {
      return encounter;
    }


    /**
      * Sets the value of the 'encounter' field.
      * @param value The value of 'encounter'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Procedure.Builder setEncounter(io.carrera.fhir.avro.models.Reference value) {
      validate(fields()[5], value);
      this.encounterBuilder = null;
      this.encounter = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'encounter' field has been set.
      * @return True if the 'encounter' field has been set, false otherwise.
      */
    public boolean hasEncounter() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'encounter' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Reference.Builder getEncounterBuilder() {
      if (encounterBuilder == null) {
        if (hasEncounter()) {
          setEncounterBuilder(io.carrera.fhir.avro.models.Reference.newBuilder(encounter));
        } else {
          setEncounterBuilder(io.carrera.fhir.avro.models.Reference.newBuilder());
        }
      }
      return encounterBuilder;
    }

    /**
     * Sets the Builder instance for the 'encounter' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Procedure.Builder setEncounterBuilder(io.carrera.fhir.avro.models.Reference.Builder value) {
      clearEncounter();
      encounterBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'encounter' field has an active Builder instance
     * @return True if the 'encounter' field has an active Builder instance
     */
    public boolean hasEncounterBuilder() {
      return encounterBuilder != null;
    }

    /**
      * Clears the value of the 'encounter' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Procedure.Builder clearEncounter() {
      encounter = null;
      encounterBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'performedPeriod' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Period getPerformedPeriod() {
      return performedPeriod;
    }


    /**
      * Sets the value of the 'performedPeriod' field.
      * @param value The value of 'performedPeriod'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Procedure.Builder setPerformedPeriod(io.carrera.fhir.avro.models.Period value) {
      validate(fields()[6], value);
      this.performedPeriodBuilder = null;
      this.performedPeriod = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'performedPeriod' field has been set.
      * @return True if the 'performedPeriod' field has been set, false otherwise.
      */
    public boolean hasPerformedPeriod() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'performedPeriod' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Period.Builder getPerformedPeriodBuilder() {
      if (performedPeriodBuilder == null) {
        if (hasPerformedPeriod()) {
          setPerformedPeriodBuilder(io.carrera.fhir.avro.models.Period.newBuilder(performedPeriod));
        } else {
          setPerformedPeriodBuilder(io.carrera.fhir.avro.models.Period.newBuilder());
        }
      }
      return performedPeriodBuilder;
    }

    /**
     * Sets the Builder instance for the 'performedPeriod' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Procedure.Builder setPerformedPeriodBuilder(io.carrera.fhir.avro.models.Period.Builder value) {
      clearPerformedPeriod();
      performedPeriodBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'performedPeriod' field has an active Builder instance
     * @return True if the 'performedPeriod' field has an active Builder instance
     */
    public boolean hasPerformedPeriodBuilder() {
      return performedPeriodBuilder != null;
    }

    /**
      * Clears the value of the 'performedPeriod' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Procedure.Builder clearPerformedPeriod() {
      performedPeriod = null;
      performedPeriodBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Procedure build() {
      try {
        Procedure record = new Procedure();
        record.resourceType = fieldSetFlags()[0] ? this.resourceType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.status = fieldSetFlags()[2] ? this.status : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (codeBuilder != null) {
          try {
            record.code = this.codeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("code"));
            throw e;
          }
        } else {
          record.code = fieldSetFlags()[3] ? this.code : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[3]);
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
        if (encounterBuilder != null) {
          try {
            record.encounter = this.encounterBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("encounter"));
            throw e;
          }
        } else {
          record.encounter = fieldSetFlags()[5] ? this.encounter : (io.carrera.fhir.avro.models.Reference) defaultValue(fields()[5]);
        }
        if (performedPeriodBuilder != null) {
          try {
            record.performedPeriod = this.performedPeriodBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("performedPeriod"));
            throw e;
          }
        } else {
          record.performedPeriod = fieldSetFlags()[6] ? this.performedPeriod : (io.carrera.fhir.avro.models.Period) defaultValue(fields()[6]);
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
  private static final org.apache.avro.io.DatumWriter<Procedure>
    WRITER$ = (org.apache.avro.io.DatumWriter<Procedure>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Procedure>
    READER$ = (org.apache.avro.io.DatumReader<Procedure>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










