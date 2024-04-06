import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
    override val randomUUID: String = java.util.UUID.randomUUID().toString()
}

actual fun getPlatform(): Platform = AndroidPlatform()





