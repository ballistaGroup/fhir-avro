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
public class Bundle extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1304677959938989110L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Bundle\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"children\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"record\",\"name\":\"AllergyIntolerance\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"clinicalStatus\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"verificationStatus\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"patient\",\"type\":{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"reaction\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AllergyIntolerance_Reaction\",\"fields\":[{\"name\":\"substance\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"manifestation\",\"type\":{\"type\":\"array\",\"items\":\"CodeableConcept\"}}]}}],\"default\":null}]},{\"type\":\"record\",\"name\":\"Condition\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"clinicalStatus\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"verificationStatus\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"subject\",\"type\":\"Reference\"},{\"name\":\"stage\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Condition_Stage\",\"fields\":[{\"name\":\"summary\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"assessment\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Reference\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null}]}}],\"default\":null},{\"name\":\"onsetDateTime\",\"type\":[\"null\",\"int\"],\"default\":null,\"logicalType\":\"date\"},{\"name\":\"code\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"DiagnosticReport\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"category\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"code\",\"type\":\"CodeableConcept\"},{\"name\":\"subject\",\"type\":[\"null\",\"Reference\"],\"default\":null},{\"name\":\"encounter\",\"type\":[\"null\",\"Reference\"],\"default\":null},{\"name\":\"effectiveDateTime\",\"type\":[\"null\",\"int\"],\"default\":null,\"logicalType\":\"date\"},{\"name\":\"issued\",\"type\":[\"null\",\"int\"],\"default\":null,\"logicalType\":\"date\"},{\"name\":\"result\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Reference\"}],\"default\":null}]},{\"type\":\"record\",\"name\":\"Goal\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"target\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Goal_Target\",\"fields\":[{\"name\":\"measure\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"detailQuantity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"detailRange\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Range\",\"fields\":[{\"name\":\"low\",\"type\":[\"null\",\"Quantity\"],\"default\":null},{\"name\":\"high\",\"type\":[\"null\",\"Quantity\"],\"default\":null}]}],\"default\":null},{\"name\":\"detailCodeableConcept\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"detailString\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"detailBoolean\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"detailInteger\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"detailRatio\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Ratio\",\"fields\":[{\"name\":\"numerator\",\"type\":[\"null\",\"Quantity\"],\"default\":null},{\"name\":\"denominator\",\"type\":[\"null\",\"Quantity\"],\"default\":null}]}],\"default\":null}]}}],\"default\":null},{\"name\":\"startDate\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}],\"default\":null},{\"name\":\"startCodeableConcept\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"lifecycleStatus\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"MedicationRequest\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"intent\",\"type\":\"string\"},{\"name\":\"medicationCodeableConcept\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"subject\",\"type\":\"Reference\"},{\"name\":\"encounter\",\"type\":[\"null\",\"Reference\"],\"default\":null},{\"name\":\"authoredOn\",\"type\":[\"null\",\"int\"],\"default\":null,\"logicalType\":\"date\"},{\"name\":\"requester\",\"type\":[\"null\",\"Reference\"],\"default\":null},{\"name\":\"medicationReference\",\"type\":[\"null\",\"Reference\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"MedicationStatement\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"medicationCodeableConcept\",\"type\":\"CodeableConcept\"},{\"name\":\"subject\",\"type\":\"Reference\"}]},{\"type\":\"record\",\"name\":\"Patient\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"identifier\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"identifier_record\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"name_record\",\"fields\":[{\"name\":\"use\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"family\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"given\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"prefix\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"gender\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"birthDate\",\"type\":[\"null\",\"string\",{\"type\":\"int\",\"logicalType\":\"date\"}],\"default\":null},{\"name\":\"maritalStatus\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"Observation\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"category\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"code\",\"type\":\"CodeableConcept\"},{\"name\":\"subject\",\"type\":[\"null\",\"Reference\"],\"default\":null},{\"name\":\"encounter\",\"type\":[\"null\",\"Reference\"],\"default\":null},{\"name\":\"effective\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"type\":\"int\",\"logicalType\":\"date\"}],\"default\":null},{\"name\":\"issued\",\"type\":[\"null\",\"int\"],\"default\":null,\"logicalType\":\"date\"},{\"name\":\"value\",\"type\":[\"null\",\"string\",\"int\",\"boolean\",\"Quantity\"],\"default\":null},{\"name\":\"interpretation\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"CodeableConcept\"}],\"default\":null}]},{\"type\":\"record\",\"name\":\"ValueSet\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"experimental\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"date\",\"type\":[\"null\",\"int\"],\"default\":null,\"logicalType\":\"date\"},{\"name\":\"publisher\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"compose\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"compose\",\"fields\":[{\"name\":\"include\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"record\",\"name\":\"SimpleCode\",\"fields\":[{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"display\",\"typ","e\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"ValueSetPointer\",\"fields\":[{\"name\":\"valueSet\",\"type\":\"string\"}]}]}}]}],\"default\":null}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Bundle> ENCODER =
      new BinaryMessageEncoder<Bundle>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Bundle> DECODER =
      new BinaryMessageDecoder<Bundle>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Bundle> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Bundle> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Bundle> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Bundle>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Bundle to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Bundle from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Bundle instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Bundle fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.util.List<java.lang.Object> children;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Bundle() {}

  /**
   * All-args constructor.
   * @param children The new value for children
   */
  public Bundle(java.util.List<java.lang.Object> children) {
    this.children = children;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return children;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: children = (java.util.List<java.lang.Object>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'children' field.
   * @return The value of the 'children' field.
   */
  public java.util.List<java.lang.Object> getChildren() {
    return children;
  }


  /**
   * Sets the value of the 'children' field.
   * @param value the value to set.
   */
  public void setChildren(java.util.List<java.lang.Object> value) {
    this.children = value;
  }

  /**
   * Creates a new Bundle RecordBuilder.
   * @return A new Bundle RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Bundle.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Bundle.Builder();
  }

  /**
   * Creates a new Bundle RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Bundle RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Bundle.Builder newBuilder(io.carrera.fhir.avro.models.Bundle.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Bundle.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Bundle.Builder(other);
    }
  }

  /**
   * Creates a new Bundle RecordBuilder by copying an existing Bundle instance.
   * @param other The existing instance to copy.
   * @return A new Bundle RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Bundle.Builder newBuilder(io.carrera.fhir.avro.models.Bundle other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Bundle.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Bundle.Builder(other);
    }
  }

  /**
   * RecordBuilder for Bundle instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Bundle>
    implements org.apache.avro.data.RecordBuilder<Bundle> {

    private java.util.List<java.lang.Object> children;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Bundle.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.children)) {
        this.children = data().deepCopy(fields()[0].schema(), other.children);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing Bundle instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Bundle other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.children)) {
        this.children = data().deepCopy(fields()[0].schema(), other.children);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'children' field.
      * @return The value.
      */
    public java.util.List<java.lang.Object> getChildren() {
      return children;
    }


    /**
      * Sets the value of the 'children' field.
      * @param value The value of 'children'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Bundle.Builder setChildren(java.util.List<java.lang.Object> value) {
      validate(fields()[0], value);
      this.children = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'children' field has been set.
      * @return True if the 'children' field has been set, false otherwise.
      */
    public boolean hasChildren() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'children' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Bundle.Builder clearChildren() {
      children = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Bundle build() {
      try {
        Bundle record = new Bundle();
        record.children = fieldSetFlags()[0] ? this.children : (java.util.List<java.lang.Object>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Bundle>
    WRITER$ = (org.apache.avro.io.DatumWriter<Bundle>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Bundle>
    READER$ = (org.apache.avro.io.DatumReader<Bundle>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










