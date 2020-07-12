package org.androidtown.animalcrossing

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * 20200705 | gomip | 로그인 화면 작성
 */
class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)
    }
}