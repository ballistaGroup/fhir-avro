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
public class Period extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6274041953503256027L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Period\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"start\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DateTime\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"XsDateTime\",\"fields\":[{\"name\":\"millis\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"zoneId\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"XsDate\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]},{\"type\":\"record\",\"name\":\"XsYearMonth\",\"fields\":[{\"name\":\"year\",\"type\":\"int\"},{\"name\":\"month\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"XsYear\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"}]}]}]}],\"default\":null},{\"name\":\"end\",\"type\":[\"null\",\"DateTime\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Period> ENCODER =
      new BinaryMessageEncoder<Period>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Period> DECODER =
      new BinaryMessageDecoder<Period>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Period> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Period> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Period> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Period>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Period to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Period from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Period instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Period fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private io.carrera.fhir.avro.models.DateTime start;
   private io.carrera.fhir.avro.models.DateTime end;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Period() {}

  /**
   * All-args constructor.
   * @param start The new value for start
   * @param end The new value for end
   */
  public Period(io.carrera.fhir.avro.models.DateTime start, io.carrera.fhir.avro.models.DateTime end) {
    this.start = start;
    this.end = end;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return start;
    case 1: return end;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: start = (io.carrera.fhir.avro.models.DateTime)value$; break;
    case 1: end = (io.carrera.fhir.avro.models.DateTime)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'start' field.
   * @return The value of the 'start' field.
   */
  public io.carrera.fhir.avro.models.DateTime getStart() {
    return start;
  }


  /**
   * Sets the value of the 'start' field.
   * @param value the value to set.
   */
  public void setStart(io.carrera.fhir.avro.models.DateTime value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'end' field.
   * @return The value of the 'end' field.
   */
  public io.carrera.fhir.avro.models.DateTime getEnd() {
    return end;
  }


  /**
   * Sets the value of the 'end' field.
   * @param value the value to set.
   */
  public void setEnd(io.carrera.fhir.avro.models.DateTime value) {
    this.end = value;
  }

  /**
   * Creates a new Period RecordBuilder.
   * @return A new Period RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Period.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Period.Builder();
  }

  /**
   * Creates a new Period RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Period RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Period.Builder newBuilder(io.carrera.fhir.avro.models.Period.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Period.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Period.Builder(other);
    }
  }

  /**
   * Creates a new Period RecordBuilder by copying an existing Period instance.
   * @param other The existing instance to copy.
   * @return A new Period RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Period.Builder newBuilder(io.carrera.fhir.avro.models.Period other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Period.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Period.Builder(other);
    }
  }

  /**
   * RecordBuilder for Period instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Period>
    implements org.apache.avro.data.RecordBuilder<Period> {

    private io.carrera.fhir.avro.models.DateTime start;
    private io.carrera.fhir.avro.models.DateTime.Builder startBuilder;
    private io.carrera.fhir.avro.models.DateTime end;
    private io.carrera.fhir.avro.models.DateTime.Builder endBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Period.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.start)) {
        this.start = data().deepCopy(fields()[0].schema(), other.start);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasStartBuilder()) {
        this.startBuilder = io.carrera.fhir.avro.models.DateTime.newBuilder(other.getStartBuilder());
      }
      if (isValidValue(fields()[1], other.end)) {
        this.end = data().deepCopy(fields()[1].schema(), other.end);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasEndBuilder()) {
        this.endBuilder = io.carrera.fhir.avro.models.DateTime.newBuilder(other.getEndBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Period instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Period other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.start)) {
        this.start = data().deepCopy(fields()[0].schema(), other.start);
        fieldSetFlags()[0] = true;
      }
      this.startBuilder = null;
      if (isValidValue(fields()[1], other.end)) {
        this.end = data().deepCopy(fields()[1].schema(), other.end);
        fieldSetFlags()[1] = true;
      }
      this.endBuilder = null;
    }

    /**
      * Gets the value of the 'start' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.DateTime getStart() {
      return start;
    }


    /**
      * Sets the value of the 'start' field.
      * @param value The value of 'start'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Period.Builder setStart(io.carrera.fhir.avro.models.DateTime value) {
      validate(fields()[0], value);
      this.startBuilder = null;
      this.start = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'start' field has been set.
      * @return True if the 'start' field has been set, false otherwise.
      */
    public boolean hasStart() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'start' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.DateTime.Builder getStartBuilder() {
      if (startBuilder == null) {
        if (hasStart()) {
          setStartBuilder(io.carrera.fhir.avro.models.DateTime.newBuilder(start));
        } else {
          setStartBuilder(io.carrera.fhir.avro.models.DateTime.newBuilder());
        }
      }
      return startBuilder;
    }

    /**
     * Sets the Builder instance for the 'start' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Period.Builder setStartBuilder(io.carrera.fhir.avro.models.DateTime.Builder value) {
      clearStart();
      startBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'start' field has an active Builder instance
     * @return True if the 'start' field has an active Builder instance
     */
    public boolean hasStartBuilder() {
      return startBuilder != null;
    }

    /**
      * Clears the value of the 'start' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Period.Builder clearStart() {
      start = null;
      startBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'end' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.DateTime getEnd() {
      return end;
    }


    /**
      * Sets the value of the 'end' field.
      * @param value The value of 'end'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Period.Builder setEnd(io.carrera.fhir.avro.models.DateTime value) {
      validate(fields()[1], value);
      this.endBuilder = null;
      this.end = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'end' field has been set.
      * @return True if the 'end' field has been set, false otherwise.
      */
    public boolean hasEnd() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'end' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.DateTime.Builder getEndBuilder() {
      if (endBuilder == null) {
        if (hasEnd()) {
          setEndBuilder(io.carrera.fhir.avro.models.DateTime.newBuilder(end));
        } else {
          setEndBuilder(io.carrera.fhir.avro.models.DateTime.newBuilder());
        }
      }
      return endBuilder;
    }

    /**
     * Sets the Builder instance for the 'end' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Period.Builder setEndBuilder(io.carrera.fhir.avro.models.DateTime.Builder value) {
      clearEnd();
      endBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'end' field has an active Builder instance
     * @return True if the 'end' field has an active Builder instance
     */
    public boolean hasEndBuilder() {
      return endBuilder != null;
    }

    /**
      * Clears the value of the 'end' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Period.Builder clearEnd() {
      end = null;
      endBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Period build() {
      try {
        Period record = new Period();
        if (startBuilder != null) {
          try {
            record.start = this.startBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("start"));
            throw e;
          }
        } else {
          record.start = fieldSetFlags()[0] ? this.start : (io.carrera.fhir.avro.models.DateTime) defaultValue(fields()[0]);
        }
        if (endBuilder != null) {
          try {
            record.end = this.endBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("end"));
            throw e;
          }
        } else {
          record.end = fieldSetFlags()[1] ? this.end : (io.carrera.fhir.avro.models.DateTime) defaultValue(fields()[1]);
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
  private static final org.apache.avro.io.DatumWriter<Period>
    WRITER$ = (org.apache.avro.io.DatumWriter<Period>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Period>
    READER$ = (org.apache.avro.io.DatumReader<Period>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










