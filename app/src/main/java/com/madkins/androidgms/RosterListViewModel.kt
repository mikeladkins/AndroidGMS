package com.madkins.androidgms

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class RosterListViewModel: ViewModel() {
    val characters = mutableListOf<Character>()

    init {
        for (i in 0 until 40) {
            Log.d("Mikel", "index: $i")
            var cClass = mapNum(Random.nextInt(1, 12))
            var character =  Character(
                    "Player # $i",
                            cClass,
                     "Test Spec",
                     "Test Race",
                            i)
            characters.add(character)
        }
    }

    private fun mapNum(num: Int): CharacterClass {
        when (num) {
            1 -> return CharacterClass.DEATH_KNIGHT
            2 -> return CharacterClass.DEMON_HUNTER
            3 -> return CharacterClass.DRUID
            4 -> return CharacterClass.HUNTER
            5 -> return CharacterClass.MAGE
            6 -> return CharacterClass.MONK
            7 -> return CharacterClass.PALADIN
            8 -> return CharacterClass.PRIEST
            9 -> return CharacterClass.ROGUE
            10 -> return CharacterClass.SHAMAN
            11 -> return CharacterClass.WARLOCK
            12 -> return CharacterClass.WARRIOR
            else -> return CharacterClass.DEATH_KNIGHT
        }
    }
}