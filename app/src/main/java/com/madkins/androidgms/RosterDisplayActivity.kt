package com.madkins.androidgms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "ROSTER DISPLAY ACTIVITY"

class RosterDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roster_display)

        Log.d(TAG, "Roster Display Activity onCreate")

        val fragment = RosterListFragment.newInstance()
        supportFragmentManager
                .beginTransaction()
                .add(R.id.roster_fragment_container ,fragment)
                .commit()
    }
}