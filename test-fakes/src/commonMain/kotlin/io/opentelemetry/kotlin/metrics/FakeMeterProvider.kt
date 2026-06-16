package io.opentelemetry.kotlin.metrics

import io.opentelemetry.kotlin.attributes.AttributesMutator

class FakeMeterProvider : MeterProvider {

    val map = mutableMapOf<String, FakeMeter>()

    override fun getMeter(
        name: String,
        version: String?,
        schemaUrl: String?,
        attributes: (AttributesMutator.() -> Unit)?
    ): Meter = map.getOrPut(name) {
        FakeMeter(name)
    }
}
