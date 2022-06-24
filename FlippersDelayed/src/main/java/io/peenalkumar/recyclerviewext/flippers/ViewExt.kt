package io.peenalkumar.recyclerviewext.flippers

import android.view.View
// TODO: 24-06-2022 Peenalkumar
internal inline var View.isVisible: Boolean
    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }
