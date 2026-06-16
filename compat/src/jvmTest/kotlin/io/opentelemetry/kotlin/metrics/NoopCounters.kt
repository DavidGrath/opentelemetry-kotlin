package io.opentelemetry.kotlin.metrics

import io.opentelemetry.kotlin.attributes.AttributesMutator

internal object NoopTestLongCounter: LongCounter {

    override val name: String
        get() = "noop"

    override fun getUnit(): String? {
        return null
    }

    override fun getDescription(): String? {
        return null
    }

    override fun isEnabled(): Boolean {
        return false
    }

    override fun add(
        value: Long,
        attributes: (AttributesMutator.() -> Unit)?
    ) {

    }
}

internal object NoopTestIntegerCounter: IntegerCounter {

    override val name: String
        get() = "noop"

    override fun getUnit(): String? {
        return null
    }

    override fun getDescription(): String? {
        return null
    }

    override fun isEnabled(): Boolean {
        return false
    }

    override fun add(
        value: UInt,
        attributes: (AttributesMutator.() -> Unit)?
    ) {

    }
}


internal object NoopTestFloatCounter: FloatCounter {

    override val name: String
        get() = "noop"

    override fun getUnit(): String? {
        return null
    }

    override fun getDescription(): String? {
        return null
    }

    override fun isEnabled(): Boolean {
        return false
    }

    override fun add(
        value: Float,
        attributes: (AttributesMutator.() -> Unit)?
    ) {

    }
}

internal object NoopTestDoubleCounter: DoubleCounter {

    override val name: String
        get() = "noop"

    override fun getUnit(): String? {
        return null
    }

    override fun getDescription(): String? {
        return null
    }

    override fun isEnabled(): Boolean {
        return false
    }

    override fun add(
        value: Double,
        attributes: (AttributesMutator.() -> Unit)?
    ) {

    }
}

internal object NoopTestGenericDoubleCounter: GenericCounter<Double> {
    override val name: String
        get() = "noop"

    override fun getUnit(): String? {
        return null
    }

    override fun getDescription(): String? {
        return null
    }

    override fun isEnabled(): Boolean {
        return false
    }

    override fun add(
        value: Double,
        attributes: (AttributesMutator.() -> Unit)?
    ) {

    }
}