package io.opentelemetry.kotlin.metrics

import io.opentelemetry.kotlin.ExperimentalApi
import io.opentelemetry.kotlin.aliases.OtelJavaMeter

@ExperimentalApi
internal class MeterAdapter(
    private val impl: OtelJavaMeter,
) : Meter {
    override fun createIntegerCounter(
        name: String,
        description: String?,
        unit: String?
    ): IntegerCounter {
        return IntegerCounterAdapter(name, description, unit, impl)
    }

    override fun createLongCounter(
        name: String,
        description: String?,
        unit: String?
    ): LongCounter {
        return LongCounterAdapter(name, description, unit, impl)
    }

    override fun createFloatCounter(
        name: String,
        description: String?,
        unit: String?
    ): FloatCounter {
        return FloatCounterAdapter(name, description, unit, impl)
    }

    override fun createDoubleCounter(
        name: String,
        description: String?,
        unit: String?
    ): DoubleCounter {
        return DoubleCounterAdapter(name, description, unit, impl)
    }

    override fun createGenericDoubleCounter(
        name: String,
        description: String?,
        unit: String?
    ): GenericCounter<Double> {
        return GenericDoubleCounterAdapter(name, description, unit, impl)
    }

    /**
     * Needs a type token or `inline` for `reified`. Seems to not be much better than `createGenericDoubleCounter`
     * above
     */
//    override fun <T : Number> createGenericCounter(
//        name: String,
//        description: String?,
//        unit: String?
//    ): GenericCounter<T> {
//
//
//    }
}
