/*
 * Copyright (c) 2015 PocketHub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pockethub;

import android.app.Application;

import com.alorma.github.basesdk.client.credentials.GithubDeveloperCredentials;
import com.alorma.github.basesdk.client.credentials.MetaDeveloperCredentialsProvider;
import com.bugsnag.android.Bugsnag;

public class PocketHub extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GithubDeveloperCredentials.init(new MetaDeveloperCredentialsProvider(getApplicationContext()));
        Bugsnag.init(this);
        Bugsnag.setNotifyReleaseStages("production");
    }
}
