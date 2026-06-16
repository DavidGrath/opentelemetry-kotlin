package io.opentelemetry.kotlin.metrics

import io.opentelemetry.kotlin.ExperimentalApi
import io.opentelemetry.kotlin.attributes.AttributesMutator


@OptIn(ExperimentalApi::class)
public interface DoubleCounter: Instrument {

    override val kind: String
        get() = "synchronous-counter"

    /**
     * @param value Must be non-negative
     */
    public fun add(value: Double, attributes: (AttributesMutator.() -> Unit)? = null)
}