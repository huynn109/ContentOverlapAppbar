package com.example.contentoverlapappbar

import android.graphics.Color.alpha
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.jaeger.library.StatusBarUtil
import kotlinx.android.synthetic.main.activity_scrolling.*
import android.support.design.widget.AppBarLayout
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View


class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setTransparent(this)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
        swipe.setOnRefreshListener {
            swipe.isRefreshing = false
        }
//        appbar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
//            Log.d("Image", "${imageCover.top}")
//            Log.d("Image", "${verticalOffset}")
////            if (verticalOffset <= -90) {
////                imageCover.animate()
////                    .alpha(0.0f).duration = 300
////            } else {
////                imageCover.animate()
////                    .alpha(1.0f).duration = 300
////            }
//            when {
//                Math.abs(verticalOffset) == appBarLayout.totalScrollRange -> {
//                    // Collapsed
//                    imageCover.animate()
//                        .alpha(0.0f).duration = 300
//                }
//                verticalOffset == 0 -> {
//                    // Expanded
//                    imageCover.animate()
//                        .alpha(1.0f).duration = 300
//                }
//                else -> {
//                    // Somewhere in between
//                    imageCover.animate()
//                        .alpha(1.0f).duration = 300
//                }
//            }
//        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
