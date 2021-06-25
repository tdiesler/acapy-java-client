/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * DIDCreate
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class DIDCreate {
    /**
     * Gets or Sets method
     */
    @JsonAdapter(MethodEnum.Adapter.class)
    public enum MethodEnum {
        KEY("key"),

        SOV("sov");

        private String value;

        MethodEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MethodEnum fromValue(String value) {
            for (MethodEnum b : MethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MethodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MethodEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MethodEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_METHOD = "method";
    @SerializedName(SERIALIZED_NAME_METHOD)
    private MethodEnum method;
    public static final String SERIALIZED_NAME_OPTIONS = "options";
    @SerializedName(SERIALIZED_NAME_OPTIONS)
    private DIDCreateOptions options;
}
