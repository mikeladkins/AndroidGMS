package com.madkins.androidgms

// RGBA value have to be explicitly converted to Ints, otherwise they would be read as longs
enum class CharacterClass(val className: String, val color: Int, val resourceID: Int) {
    DEATH_KNIGHT("Death Knight", 0xFFC41F3B.toInt(), R.drawable.death_knight_transparent),
    DEMON_HUNTER("Demon Hunter",0xFFA330C9.toInt(), R.drawable.demon_hunter_transparent),
    DRUID("Druid", 0xFFFF7D0A.toInt(), R.drawable.druid_transparent),
    HUNTER("Hunter", 0xFFABD473.toInt(), R.drawable.hunter_transparent),
    MAGE("Mage", 0xFF69CCF0.toInt(), R.drawable.mage_transparent),
    MONK("Monk",0xFF00FF96.toInt(), R.drawable.monk_transparent),
    PALADIN("Paladin", 0xFFF58CBA.toInt(), R.drawable.paladin_transparent),
    PRIEST("Priest", 0xFFFFFFFF.toInt(), R.drawable.priest_transparent),
    ROGUE("Rogue", 0xFFFFF569.toInt(), R.drawable.rogue_transparent),
    SHAMAN("Shaman", 0xFF0070DE.toInt(), R.drawable.shaman_trasparent),
    WARLOCK("Warlock", 0xFF9482C9.toInt(), R.drawable.warlock_transparent),
    WARRIOR("Warrior", 0xFFC79C6E.toInt(), R.drawable.warrior_transparent)
}