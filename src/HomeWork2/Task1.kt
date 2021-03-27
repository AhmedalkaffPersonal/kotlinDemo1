package HomeWork2

/*
TODO: Mandatory
 The following is some code designed for a video game. There is an
 Alien class to represent a monster and an AlienPack class that represents a band
 of aliens and how much damage they can inflict:
 The code is not very object oriented and does not support information hiding in
 the Alien class. Rewrite the code so that inheritance is used to represent the different
 types of aliens instead of the “type” parameter. This should result in deletion of
 the “type” parameter. Also rewrite the Alien class to hide the instance variables
 and create a getDamage method for each derived class that returns the amount of damage
 the alien inflicts. Finally, rewrite the calculateDamage method to use getDamage and write
 a main method that tests the code.

 */

class Alien(
    var type: Int,      // Stores one of the three  types
    // (Snake = 1, Orge = 2 and Marshmallow man = 3)
    var health: Int, // 0=dead, 100=full strength
    var name: String) {

}

class AlienPack(numAliens: Int) {
    val aliens: Array<Alien?>
    fun addAlien(
        newAlien: Alien?,
        index: Int
    ) {
        aliens[index] = newAlien
    }

    init {
        aliens = arrayOfNulls(numAliens)
    }
    fun calculateDamage():Int {
        var damage: Int = 0
        for (i in aliens) {
            if(i!!.type == 1)
                damage += 10
            else if(i!!.type == 2)
                damage += 6
            else if (i!!.type ==3)
                damage++

        }
        return  damage
    }
}
