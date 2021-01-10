package com.madkins.androidgms

class Character(name: String, cClass: CharacterClass, spec: String, race: String, level: Int) {
    private lateinit var name: String
    private lateinit var charClass: CharacterClass
    private lateinit var charSpec: String // TODO this should probably be an enum as well, or some kind of JSON mapping
    private lateinit var charRace: String // TODO again, probably an enum or mapping, since certain races can't be certain classes
    private var charLevel: Int = 0
}