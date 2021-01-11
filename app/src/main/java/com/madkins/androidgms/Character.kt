package com.madkins.androidgms

class Character(name: String, cClass: CharacterClass, spec: String, race: String, level: Int) {
    var charName:  String = name
    var charClass: CharacterClass = cClass
    var charSpec:  String = spec // TODO this should probably be an enum as well, or some kind of JSON mapping
    var charRace:  String = race // TODO again, probably an enum or mapping, since certain races can't be certain classes
    var charLevel: Int = level
}