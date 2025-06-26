/*
 * Copyright © 2017-2025 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.wireguard.util;


import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation can be applied to a package, class or method to indicate that all
 * class fields and method parameters and return values in that element are nonnull
 * by default unless overridden.
 */
@RestrictTo(Scope.LIBRARY_GROUP_PREFIX)
@Retention(RetentionPolicy.RUNTIME)
public @interface NonNullForAll {}