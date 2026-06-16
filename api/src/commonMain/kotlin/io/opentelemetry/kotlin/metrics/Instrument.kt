package io.opentelemetry.kotlin.metrics

/**
 * Marker interface for an Instrument
 * https://opentelemetry.io/docs/specs/otel/metrics/api/#instrument
 */
public interface Instrument {

    public val name: String
    public val kind: String

    public fun getUnit(): String?
    public fun getDescription(): String?
    public fun isEnabled(): Boolean
}