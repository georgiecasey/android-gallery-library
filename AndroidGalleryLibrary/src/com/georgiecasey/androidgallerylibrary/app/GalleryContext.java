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

package com.georgiecasey.androidgallerylibrary.app;

import com.georgiecasey.androidgallerylibrary.data.DataManager;
import com.georgiecasey.androidgallerylibrary.data.ImageCacheService;
import com.georgiecasey.androidgallerylibrary.util.ThreadPool;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;

public interface GalleryContext {
    public ImageCacheService getImageCacheService();
    public DataManager getDataManager();

    public Context getAndroidContext();

    public Looper getMainLooper();
    public Resources getResources();
    public ContentResolver getContentResolver();
    public ThreadPool getThreadPool();
}
