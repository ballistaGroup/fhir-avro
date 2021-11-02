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
public class Condition_Stage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1532175755292485242L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Condition_Stage\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"summary\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"assessment\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Condition_Stage> ENCODER =
      new BinaryMessageEncoder<Condition_Stage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Condition_Stage> DECODER =
      new BinaryMessageDecoder<Condition_Stage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Condition_Stage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Condition_Stage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Condition_Stage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Condition_Stage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Condition_Stage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Condition_Stage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Condition_Stage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Condition_Stage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private io.carrera.fhir.avro.models.CodeableConcept summary;
   private java.util.List<io.carrera.fhir.avro.models.Reference> assessment;
   private io.carrera.fhir.avro.models.CodeableConcept type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Condition_Stage() {}

  /**
   * All-args constructor.
   * @param summary The new value for summary
   * @param assessment The new value for assessment
   * @param type The new value for type
   */
  public Condition_Stage(io.carrera.fhir.avro.models.CodeableConcept summary, java.util.List<io.carrera.fhir.avro.models.Reference> assessment, io.carrera.fhir.avro.models.CodeableConcept type) {
    this.summary = summary;
    this.assessment = assessment;
    this.type = type;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return summary;
    case 1: return assessment;
    case 2: return type;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: summary = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 1: assessment = (java.util.List<io.carrera.fhir.avro.models.Reference>)value$; break;
    case 2: type = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'summary' field.
   * @return The value of the 'summary' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getSummary() {
    return summary;
  }


  /**
   * Sets the value of the 'summary' field.
   * @param value the value to set.
   */
  public void setSummary(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.summary = value;
  }

  /**
   * Gets the value of the 'assessment' field.
   * @return The value of the 'assessment' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.Reference> getAssessment() {
    return assessment;
  }


  /**
   * Sets the value of the 'assessment' field.
   * @param value the value to set.
   */
  public void setAssessment(java.util.List<io.carrera.fhir.avro.models.Reference> value) {
    this.assessment = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.type = value;
  }

  /**
   * Creates a new Condition_Stage RecordBuilder.
   * @return A new Condition_Stage RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Condition_Stage.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Condition_Stage.Builder();
  }

  /**
   * Creates a new Condition_Stage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Condition_Stage RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Condition_Stage.Builder newBuilder(io.carrera.fhir.avro.models.Condition_Stage.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Condition_Stage.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Condition_Stage.Builder(other);
    }
  }

  /**
   * Creates a new Condition_Stage RecordBuilder by copying an existing Condition_Stage instance.
   * @param other The existing instance to copy.
   * @return A new Condition_Stage RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Condition_Stage.Builder newBuilder(io.carrera.fhir.avro.models.Condition_Stage other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Condition_Stage.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Condition_Stage.Builder(other);
    }
  }

  /**
   * RecordBuilder for Condition_Stage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Condition_Stage>
    implements org.apache.avro.data.RecordBuilder<Condition_Stage> {

    private io.carrera.fhir.avro.models.CodeableConcept summary;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder summaryBuilder;
    private java.util.List<io.carrera.fhir.avro.models.Reference> assessment;
    private io.carrera.fhir.avro.models.CodeableConcept type;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder typeBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Condition_Stage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.summary)) {
        this.summary = data().deepCopy(fields()[0].schema(), other.summary);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasSummaryBuilder()) {
        this.summaryBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getSummaryBuilder());
      }
      if (isValidValue(fields()[1], other.assessment)) {
        this.assessment = data().deepCopy(fields()[1].schema(), other.assessment);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasTypeBuilder()) {
        this.typeBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getTypeBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Condition_Stage instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Condition_Stage other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.summary)) {
        this.summary = data().deepCopy(fields()[0].schema(), other.summary);
        fieldSetFlags()[0] = true;
      }
      this.summaryBuilder = null;
      if (isValidValue(fields()[1], other.assessment)) {
        this.assessment = data().deepCopy(fields()[1].schema(), other.assessment);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      this.typeBuilder = null;
    }

    /**
      * Gets the value of the 'summary' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getSummary() {
      return summary;
    }


    /**
      * Sets the value of the 'summary' field.
      * @param value The value of 'summary'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Condition_Stage.Builder setSummary(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[0], value);
      this.summaryBuilder = null;
      this.summary = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'summary' field has been set.
      * @return True if the 'summary' field has been set, false otherwise.
      */
    public boolean hasSummary() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'summary' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getSummaryBuilder() {
      if (summaryBuilder == null) {
        if (hasSummary()) {
          setSummaryBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(summary));
        } else {
          setSummaryBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return summaryBuilder;
    }

    /**
     * Sets the Builder instance for the 'summary' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Condition_Stage.Builder setSummaryBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearSummary();
      summaryBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'summary' field has an active Builder instance
     * @return True if the 'summary' field has an active Builder instance
     */
    public boolean hasSummaryBuilder() {
      return summaryBuilder != null;
    }

    /**
      * Clears the value of the 'summary' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Condition_Stage.Builder clearSummary() {
      summary = null;
      summaryBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'assessment' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.Reference> getAssessment() {
      return assessment;
    }


    /**
      * Sets the value of the 'assessment' field.
      * @param value The value of 'assessment'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Condition_Stage.Builder setAssessment(java.util.List<io.carrera.fhir.avro.models.Reference> value) {
      validate(fields()[1], value);
      this.assessment = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'assessment' field has been set.
      * @return True if the 'assessment' field has been set, false otherwise.
      */
    public boolean hasAssessment() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'assessment' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Condition_Stage.Builder clearAssessment() {
      assessment = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Condition_Stage.Builder setType(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[2], value);
      this.typeBuilder = null;
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'type' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getTypeBuilder() {
      if (typeBuilder == null) {
        if (hasType()) {
          setTypeBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(type));
        } else {
          setTypeBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return typeBuilder;
    }

    /**
     * Sets the Builder instance for the 'type' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Condition_Stage.Builder setTypeBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearType();
      typeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'type' field has an active Builder instance
     * @return True if the 'type' field has an active Builder instance
     */
    public boolean hasTypeBuilder() {
      return typeBuilder != null;
    }

    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Condition_Stage.Builder clearType() {
      type = null;
      typeBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Condition_Stage build() {
      try {
        Condition_Stage record = new Condition_Stage();
        if (summaryBuilder != null) {
          try {
            record.summary = this.summaryBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("summary"));
            throw e;
          }
        } else {
          record.summary = fieldSetFlags()[0] ? this.summary : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[0]);
        }
        record.assessment = fieldSetFlags()[1] ? this.assessment : (java.util.List<io.carrera.fhir.avro.models.Reference>) defaultValue(fields()[1]);
        if (typeBuilder != null) {
          try {
            record.type = this.typeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("type"));
            throw e;
          }
        } else {
          record.type = fieldSetFlags()[2] ? this.type : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[2]);
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
  private static final org.apache.avro.io.DatumWriter<Condition_Stage>
    WRITER$ = (org.apache.avro.io.DatumWriter<Condition_Stage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Condition_Stage>
    READER$ = (org.apache.avro.io.DatumReader<Condition_Stage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.summary == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.summary.customEncode(out);
    }

    if (this.assessment == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.assessment.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (io.carrera.fhir.avro.models.Reference e0: this.assessment) {
        actualSize0++;
        out.startItem();
        e0.customEncode(out);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    if (this.type == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.type.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.summary = null;
      } else {
        if (this.summary == null) {
          this.summary = new io.carrera.fhir.avro.models.CodeableConcept();
        }
        this.summary.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.assessment = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<io.carrera.fhir.avro.models.Reference> a0 = this.assessment;
        if (a0 == null) {
          a0 = new SpecificData.Array<io.carrera.fhir.avro.models.Reference>((int)size0, SCHEMA$.getField("assessment").schema().getTypes().get(1));
          this.assessment = a0;
        } else a0.clear();
        SpecificData.Array<io.carrera.fhir.avro.models.Reference> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.Reference>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            io.carrera.fhir.avro.models.Reference e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new io.carrera.fhir.avro.models.Reference();
            }
            e0.customDecode(in);
            a0.add(e0);
          }
        }
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.type = null;
      } else {
        if (this.type == null) {
          this.type = new io.carrera.fhir.avro.models.CodeableConcept();
        }
        this.type.customDecode(in);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.summary = null;
          } else {
            if (this.summary == null) {
              this.summary = new io.carrera.fhir.avro.models.CodeableConcept();
            }
            this.summary.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.assessment = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<io.carrera.fhir.avro.models.Reference> a0 = this.assessment;
            if (a0 == null) {
              a0 = new SpecificData.Array<io.carrera.fhir.avro.models.Reference>((int)size0, SCHEMA$.getField("assessment").schema().getTypes().get(1));
              this.assessment = a0;
            } else a0.clear();
            SpecificData.Array<io.carrera.fhir.avro.models.Reference> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.Reference>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                io.carrera.fhir.avro.models.Reference e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new io.carrera.fhir.avro.models.Reference();
                }
                e0.customDecode(in);
                a0.add(e0);
              }
            }
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.type = null;
          } else {
            if (this.type == null) {
              this.type = new io.carrera.fhir.avro.models.CodeableConcept();
            }
            this.type.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










