package io.opentelemetry.kotlin.metrics

import io.opentelemetry.kotlin.aliases.OtelJavaDoubleCounter
import io.opentelemetry.kotlin.aliases.OtelJavaMeter
import io.opentelemetry.kotlin.attributes.AttributesMutator
import io.opentelemetry.kotlin.attributes.CompatAttributesModel

internal class GenericDoubleCounterAdapter(
    private val nameValue: String,
    private val unit: String?,
    private val description: String?,
    meter: OtelJavaMeter
): GenericCounter<Double> {

    private val counter: OtelJavaDoubleCounter

    init {
        val builder = meter.counterBuilder(name).ofDoubles()
        if (unit != null) {
            builder.setUnit(unit)
        }
        if (description != null) {
            builder.setDescription(description)
        }
        counter = builder.build()
    }

    override val name: String
        get() = nameValue

    override fun getUnit(): String? {
        return unit
    }

    override fun getDescription(): String? {
        return description
    }

    override fun isEnabled(): Boolean {
        return counter.isEnabled()
    }

    override fun add(
        value: Double,
        attributes: (AttributesMutator.() -> Unit)?
    ) {
        val model = CompatAttributesModel()

        counter.add(value)
        if (attributes != null) {
            attributes(model)
        }

    }

}
