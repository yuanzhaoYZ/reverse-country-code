package uk.recurse.geocoding.reverse;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonFormat(shape = Shape.ARRAY)
@JsonPropertyOrder({"x", "y"})
class Point implements Serializable {

    private final float lat;
    private final float lon;

    @JsonCreator
    Point(@JsonProperty("y") float lat, @JsonProperty("x") float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    float latitude() {
        return lat;
    }

    float longitude() {
        return lon;
    }
}
