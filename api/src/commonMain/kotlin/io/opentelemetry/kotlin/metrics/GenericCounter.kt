package io.opentelemetry.kotlin.metrics

import io.opentelemetry.kotlin.ExperimentalApi
import io.opentelemetry.kotlin.attributes.AttributesMutator

@OptIn(ExperimentalApi::class)
public interface GenericCounter<in NumericType: Number>: Instrument {

    override val kind: String
        get() = "synchronous-counter"

    /**
     * @param value Must be non-negative
     */
    public fun add(value: NumericType, attributes: (AttributesMutator.() -> Unit)? = null)
}