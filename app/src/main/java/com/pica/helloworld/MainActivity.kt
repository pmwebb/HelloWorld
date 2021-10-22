package com.pica.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCenter.start(
            application, "61c18d13-d100-4bd9-8800-0f1e231f2e25",
            Analytics::class.java, Crashes::class.java
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}