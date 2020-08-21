package co.potatoproject.audiofx

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

import co.potatoproject.effectsplugin.EffectsPluginService

class BootCompleteReceiver : BroadcastReceiver() {

    @SuppressLint("LongLogTag")
    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            Log.i(TAG, "AudioFX init triggered!")
            context.startService(Intent(context, EffectsPluginService::class.java))
        }
    }

    companion object {
        private const val TAG = "AudioFXNative"
    }
}
