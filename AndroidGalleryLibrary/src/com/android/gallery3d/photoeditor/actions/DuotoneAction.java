/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.gallery3d.photoeditor.actions;

import android.content.Context;
import android.util.AttributeSet;

import com.android.gallery3d.photoeditor.filters.DuotoneFilter;

/**
 * An action handling duo-tone effect.
 */
public class DuotoneAction extends EffectAction {

    private static final int DEFAULT_FIRST_COLOR = 0x004488;
    private static final int DEFAULT_SECOND_COLOR = 0xffff00;

    public DuotoneAction(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void doBegin() {
        // TODO: Add several sets of duo-tone colors to select from.
        DuotoneFilter filter = new DuotoneFilter();
        filter.setDuotone(DEFAULT_FIRST_COLOR, DEFAULT_SECOND_COLOR);
        notifyFilterChanged(filter, true);
        notifyDone();
    }

    @Override
    public void doEnd() {
    }
}
