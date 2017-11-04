package geniusk.geniuskutils

import android.content.Context
import android.widget.Toast

/**
 * Created by young on 2017-11-04/오후 11:55
 * This Project is UtilsLib
 */
object ToastUtil {
    fun showShort(ctx: Context, str: String) {
        Toast.makeText(ctx, str, Toast.LENGTH_SHORT).show()
    }

    fun showLong(ctx: Context, str: String) {
        Toast.makeText(ctx, str, Toast.LENGTH_LONG).show()
    }
}