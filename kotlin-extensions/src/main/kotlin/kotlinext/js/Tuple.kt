@file:Suppress("NOTHING_TO_INLINE")

package kotlinext.js

// TODO: make external in IR
class Tuple<out A, out B>
private constructor() {
    inline operator fun component1(): A = asDynamic()[0]
    inline operator fun component2(): B = asDynamic()[1]
}

inline fun <A, B> Tuple(a: A, b: B): Tuple<A, B> =
    arrayOf(a, b).unsafeCast<Tuple<A, B>>()
