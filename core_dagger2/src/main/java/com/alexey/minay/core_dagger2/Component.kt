package com.alexey.minay.core_dagger2

import java.lang.ref.WeakReference

inline fun <reified Comp> initDaggerComponent(
    weakRef: WeakReference<Comp>?,
    initFactory: () -> Unit
) {
    if (weakRef?.get() == null) {
        synchronized(Comp::class.java) {
            if (weakRef?.get() == null) {
                initFactory()
            }
        }
    }
}