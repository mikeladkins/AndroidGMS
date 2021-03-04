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
        return when (num) {
            1 -> CharacterClass.DEATH_KNIGHT
            2 -> CharacterClass.DEMON_HUNTER
            3 -> CharacterClass.DRUID
            4 -> CharacterClass.HUNTER
            5 -> CharacterClass.MAGE
            6 -> CharacterClass.MONK
            7 -> CharacterClass.PALADIN
            8 -> CharacterClass.PRIEST
            9 -> CharacterClass.ROGUE
            10 -> CharacterClass.SHAMAN
            11 -> CharacterClass.WARLOCK
            12 -> CharacterClass.WARRIOR
            else -> CharacterClass.DEATH_KNIGHT
        }
    }
}