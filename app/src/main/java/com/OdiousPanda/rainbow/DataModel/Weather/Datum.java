package com.OdiousPanda.rainbow.DataModel.Weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {
    @SerializedName("time")
    @Expose
    public long time;
    @SerializedName("icon")
    @Expose
    public String icon;
    @SerializedName("visibility")
    @Expose
    public Float visibility;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("precipIntensity")
    @Expose
    private Float precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private Float precipProbability;
    @SerializedName("temperature")
    @Expose
    private Float temperature;
    @SerializedName("apparentTemperature")
    @Expose
    private Float apparentTemperature;
    @SerializedName("dewPoint")
    @Expose
    private Float dewPoint;
    @SerializedName("humidity")
    @Expose
    private Float humidity;
    @SerializedName("pressure")
    @Expose
    private Float pressure;
    @SerializedName("windSpeed")
    @Expose
    private Float windSpeed;
    @SerializedName("windGust")
    @Expose
    private Float windGust;
    @SerializedName("windBearing")
    @Expose
    private Float windBearing;
    @SerializedName("cloudCover")
    @Expose
    private Float cloudCover;
    @SerializedName("uvIndex")
    @Expose
    private Float uvIndex;
    @SerializedName("ozone")
    @Expose
    private Float ozone;
    @SerializedName("precipType")
    @Expose
    private String precipType;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Float getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Float precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Float getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Float precipProbability) {
        this.precipProbability = precipProbability;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(Float apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public Float getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(Float dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Float getWindGust() {
        return windGust;
    }

    public void setWindGust(Float windGust) {
        this.windGust = windGust;
    }

    public Float getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(Float windBearing) {
        this.windBearing = windBearing;
    }

    public Float getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Float cloudCover) {
        this.cloudCover = cloudCover;
    }

    public Float getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Float uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Float getVisibility() {
        return visibility;
    }

    public void setVisibility(Float visibility) {
        this.visibility = visibility;
    }

    public Float getOzone() {
        return ozone;
    }

    public void setOzone(Float ozone) {
        this.ozone = ozone;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }
}
