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
public class ValueSet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8644384603851174965L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ValueSet\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"experimental\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"date\",\"type\":[\"null\",\"int\"],\"default\":null,\"logicalType\":\"date\"},{\"name\":\"publisher\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"compose\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"compose\",\"fields\":[{\"name\":\"include\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"record\",\"name\":\"SimpleCode\",\"fields\":[{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"ValueSetPointer\",\"fields\":[{\"name\":\"valueSet\",\"type\":\"string\"}]}]}}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ValueSet> ENCODER =
      new BinaryMessageEncoder<ValueSet>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ValueSet> DECODER =
      new BinaryMessageDecoder<ValueSet>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ValueSet> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ValueSet> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ValueSet> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ValueSet>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ValueSet to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ValueSet from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ValueSet instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ValueSet fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence resourceType;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public java.lang.CharSequence description;
  @Deprecated public java.lang.CharSequence status;
  @Deprecated public java.lang.Boolean experimental;
  @Deprecated public java.lang.Integer date;
  @Deprecated public java.lang.CharSequence publisher;
  @Deprecated public io.carrera.fhir.avro.models.compose compose;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ValueSet() {}

  /**
   * All-args constructor.
   * @param resourceType The new value for resourceType
   * @param id The new value for id
   * @param name The new value for name
   * @param title The new value for title
   * @param description The new value for description
   * @param status The new value for status
   * @param experimental The new value for experimental
   * @param date The new value for date
   * @param publisher The new value for publisher
   * @param compose The new value for compose
   */
  public ValueSet(java.lang.CharSequence resourceType, java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence title, java.lang.CharSequence description, java.lang.CharSequence status, java.lang.Boolean experimental, java.lang.Integer date, java.lang.CharSequence publisher, io.carrera.fhir.avro.models.compose compose) {
    this.resourceType = resourceType;
    this.id = id;
    this.name = name;
    this.title = title;
    this.description = description;
    this.status = status;
    this.experimental = experimental;
    this.date = date;
    this.publisher = publisher;
    this.compose = compose;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resourceType;
    case 1: return id;
    case 2: return name;
    case 3: return title;
    case 4: return description;
    case 5: return status;
    case 6: return experimental;
    case 7: return date;
    case 8: return publisher;
    case 9: return compose;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: resourceType = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: name = (java.lang.CharSequence)value$; break;
    case 3: title = (java.lang.CharSequence)value$; break;
    case 4: description = (java.lang.CharSequence)value$; break;
    case 5: status = (java.lang.CharSequence)value$; break;
    case 6: experimental = (java.lang.Boolean)value$; break;
    case 7: date = (java.lang.Integer)value$; break;
    case 8: publisher = (java.lang.CharSequence)value$; break;
    case 9: compose = (io.carrera.fhir.avro.models.compose)value$; break;
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
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.CharSequence getTitle() {
    return title;
  }


  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
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
   * Gets the value of the 'experimental' field.
   * @return The value of the 'experimental' field.
   */
  public java.lang.Boolean getExperimental() {
    return experimental;
  }


  /**
   * Sets the value of the 'experimental' field.
   * @param value the value to set.
   */
  public void setExperimental(java.lang.Boolean value) {
    this.experimental = value;
  }

  /**
   * Gets the value of the 'date' field.
   * @return The value of the 'date' field.
   */
  public java.lang.Integer getDate() {
    return date;
  }


  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.Integer value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'publisher' field.
   * @return The value of the 'publisher' field.
   */
  public java.lang.CharSequence getPublisher() {
    return publisher;
  }


  /**
   * Sets the value of the 'publisher' field.
   * @param value the value to set.
   */
  public void setPublisher(java.lang.CharSequence value) {
    this.publisher = value;
  }

  /**
   * Gets the value of the 'compose' field.
   * @return The value of the 'compose' field.
   */
  public io.carrera.fhir.avro.models.compose getCompose() {
    return compose;
  }


  /**
   * Sets the value of the 'compose' field.
   * @param value the value to set.
   */
  public void setCompose(io.carrera.fhir.avro.models.compose value) {
    this.compose = value;
  }

  /**
   * Creates a new ValueSet RecordBuilder.
   * @return A new ValueSet RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ValueSet.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.ValueSet.Builder();
  }

  /**
   * Creates a new ValueSet RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ValueSet RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ValueSet.Builder newBuilder(io.carrera.fhir.avro.models.ValueSet.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.ValueSet.Builder();
    } else {
      return new io.carrera.fhir.avro.models.ValueSet.Builder(other);
    }
  }

  /**
   * Creates a new ValueSet RecordBuilder by copying an existing ValueSet instance.
   * @param other The existing instance to copy.
   * @return A new ValueSet RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ValueSet.Builder newBuilder(io.carrera.fhir.avro.models.ValueSet other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.ValueSet.Builder();
    } else {
      return new io.carrera.fhir.avro.models.ValueSet.Builder(other);
    }
  }

  /**
   * RecordBuilder for ValueSet instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ValueSet>
    implements org.apache.avro.data.RecordBuilder<ValueSet> {

    private java.lang.CharSequence resourceType;
    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence title;
    private java.lang.CharSequence description;
    private java.lang.CharSequence status;
    private java.lang.Boolean experimental;
    private java.lang.Integer date;
    private java.lang.CharSequence publisher;
    private io.carrera.fhir.avro.models.compose compose;
    private io.carrera.fhir.avro.models.compose.Builder composeBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.ValueSet.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.title)) {
        this.title = data().deepCopy(fields()[3].schema(), other.title);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.description)) {
        this.description = data().deepCopy(fields()[4].schema(), other.description);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.experimental)) {
        this.experimental = data().deepCopy(fields()[6].schema(), other.experimental);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.date)) {
        this.date = data().deepCopy(fields()[7].schema(), other.date);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.publisher)) {
        this.publisher = data().deepCopy(fields()[8].schema(), other.publisher);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.compose)) {
        this.compose = data().deepCopy(fields()[9].schema(), other.compose);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (other.hasComposeBuilder()) {
        this.composeBuilder = io.carrera.fhir.avro.models.compose.newBuilder(other.getComposeBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ValueSet instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.ValueSet other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.title)) {
        this.title = data().deepCopy(fields()[3].schema(), other.title);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.description)) {
        this.description = data().deepCopy(fields()[4].schema(), other.description);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.experimental)) {
        this.experimental = data().deepCopy(fields()[6].schema(), other.experimental);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.date)) {
        this.date = data().deepCopy(fields()[7].schema(), other.date);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.publisher)) {
        this.publisher = data().deepCopy(fields()[8].schema(), other.publisher);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.compose)) {
        this.compose = data().deepCopy(fields()[9].schema(), other.compose);
        fieldSetFlags()[9] = true;
      }
      this.composeBuilder = null;
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
    public io.carrera.fhir.avro.models.ValueSet.Builder setResourceType(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.ValueSet.Builder clearResourceType() {
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
    public io.carrera.fhir.avro.models.ValueSet.Builder setId(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.ValueSet.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder setName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.CharSequence getTitle() {
      return title;
    }


    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.title = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder clearTitle() {
      title = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.description = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder clearDescription() {
      description = null;
      fieldSetFlags()[4] = false;
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
    public io.carrera.fhir.avro.models.ValueSet.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.status = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder clearStatus() {
      status = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'experimental' field.
      * @return The value.
      */
    public java.lang.Boolean getExperimental() {
      return experimental;
    }


    /**
      * Sets the value of the 'experimental' field.
      * @param value The value of 'experimental'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder setExperimental(java.lang.Boolean value) {
      validate(fields()[6], value);
      this.experimental = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'experimental' field has been set.
      * @return True if the 'experimental' field has been set, false otherwise.
      */
    public boolean hasExperimental() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'experimental' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder clearExperimental() {
      experimental = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public java.lang.Integer getDate() {
      return date;
    }


    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder setDate(java.lang.Integer value) {
      validate(fields()[7], value);
      this.date = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder clearDate() {
      date = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'publisher' field.
      * @return The value.
      */
    public java.lang.CharSequence getPublisher() {
      return publisher;
    }


    /**
      * Sets the value of the 'publisher' field.
      * @param value The value of 'publisher'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder setPublisher(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.publisher = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'publisher' field has been set.
      * @return True if the 'publisher' field has been set, false otherwise.
      */
    public boolean hasPublisher() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'publisher' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder clearPublisher() {
      publisher = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'compose' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.compose getCompose() {
      return compose;
    }


    /**
      * Sets the value of the 'compose' field.
      * @param value The value of 'compose'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder setCompose(io.carrera.fhir.avro.models.compose value) {
      validate(fields()[9], value);
      this.composeBuilder = null;
      this.compose = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'compose' field has been set.
      * @return True if the 'compose' field has been set, false otherwise.
      */
    public boolean hasCompose() {
      return fieldSetFlags()[9];
    }

    /**
     * Gets the Builder instance for the 'compose' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.compose.Builder getComposeBuilder() {
      if (composeBuilder == null) {
        if (hasCompose()) {
          setComposeBuilder(io.carrera.fhir.avro.models.compose.newBuilder(compose));
        } else {
          setComposeBuilder(io.carrera.fhir.avro.models.compose.newBuilder());
        }
      }
      return composeBuilder;
    }

    /**
     * Sets the Builder instance for the 'compose' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.ValueSet.Builder setComposeBuilder(io.carrera.fhir.avro.models.compose.Builder value) {
      clearCompose();
      composeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'compose' field has an active Builder instance
     * @return True if the 'compose' field has an active Builder instance
     */
    public boolean hasComposeBuilder() {
      return composeBuilder != null;
    }

    /**
      * Clears the value of the 'compose' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ValueSet.Builder clearCompose() {
      compose = null;
      composeBuilder = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ValueSet build() {
      try {
        ValueSet record = new ValueSet();
        record.resourceType = fieldSetFlags()[0] ? this.resourceType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.title = fieldSetFlags()[3] ? this.title : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.description = fieldSetFlags()[4] ? this.description : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.status = fieldSetFlags()[5] ? this.status : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.experimental = fieldSetFlags()[6] ? this.experimental : (java.lang.Boolean) defaultValue(fields()[6]);
        record.date = fieldSetFlags()[7] ? this.date : (java.lang.Integer) defaultValue(fields()[7]);
        record.publisher = fieldSetFlags()[8] ? this.publisher : (java.lang.CharSequence) defaultValue(fields()[8]);
        if (composeBuilder != null) {
          try {
            record.compose = this.composeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("compose"));
            throw e;
          }
        } else {
          record.compose = fieldSetFlags()[9] ? this.compose : (io.carrera.fhir.avro.models.compose) defaultValue(fields()[9]);
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
  private static final org.apache.avro.io.DatumWriter<ValueSet>
    WRITER$ = (org.apache.avro.io.DatumWriter<ValueSet>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ValueSet>
    READER$ = (org.apache.avro.io.DatumReader<ValueSet>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










