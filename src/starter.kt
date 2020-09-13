fun main() {
   /* val shopping = listOf("Tea","Eggs","Milk")
    if(shopping.isNotEmpty()){
        if (shopping.contains("Eggs")) println(shopping.indexOf("Eggs"))
        for(item in shopping)println(item)
    }
    val toAdd = listOf("Cookies","Sugar")

    val toRemove = listOf("Beacon","Sugar")
    val mShopping = mutableListOf("Bread","Butter","Eggs","Milk")
    if (shopping.size > 1) mShopping.removeAt(2)
    if (shopping.contains("Milk")) mShopping.remove("Milk")
    mShopping.add(0,"Cereal")
    mShopping[0] = "Beacon"
    mShopping.addAll(toAdd)
    mShopping.sort()
    mShopping.reverse()
    mShopping.removeAll(toRemove)
    mShopping.retainAll(toAdd)
    val shoppingCopy = mShopping.toList()
    for(item in mShopping)println(item)
    println(shoppingCopy)
    println("")
    println("")

    val a = mutableListOf<String>()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2,"Four")
    a.add(3, "Six")
    println(a)
    if (a.contains("Zero"))a.add("Eight")
    a.removeAt(0)
    println(a)
    if (a.indexOf("Four")!=4)a.add("Ten")
    println(a)
    if (a.contains("Zero"))a.add("Twelve")
    println(a)*/

    /*val friendSet = setOf("Jim","Sue","Sue","Nick","Nick")
    println("Array:${friendSet}, size:${friendSet.size}")
    val a = "Sue"
    val b = a
    val c = "Sue"
    val set = setOf(a,b,c)
    println(set)

    val mFriendSet = mutableSetOf("Jim","Sue")
    mFriendSet.add("Nick")
    mFriendSet.add("Nick")
    mFriendSet.remove("Nick")
    val toAdd = setOf("Joe","Mia")
    mFriendSet.addAll(toAdd)
    val friendSetCopy = mFriendSet.toSet()
    val friendList = mFriendSet.toMutableList()
    println("$friendSetCopy is the same as $friendList")

    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    val petsCopied = petsLiam.toMutableSet()
    petsCopied.addAll(petsSophia)
    petsCopied.addAll(petsNoah)
    petsCopied.addAll(petsEmily)
    println(petsCopied)
    val totalPets = (petsLiam.size + petsSophia.size + petsNoah.size + petsEmily.size)
    println("Total number of Pets: $totalPets")
    val petsList = petsCopied.toMutableList()
    petsList.sort()
    println("Pets Sorted in Alphabetical Order: $petsList")*/

    val r1 = Recipe("Chicken Soup").printRecipe()
    val r2 = Recipe("Quinoa Salad").printRecipe()
    val r3 = Recipe("Thai Curry Soup").printRecipe()


    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    for ((key,value) in recipeMap){
        print("mapOf Key: $key has value: ")
        println(value)
    }
    println(recipeMap.containsKey("Recipe1"))
    if (recipeMap.containsValue(r1)) {
        val recipe = recipeMap.getValue("Recipe2")
        println(recipe)
    }
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)
    mRecipeMap["Recipe3"] = r3
    for ((key,value) in mRecipeMap){
        print("MutableMapOf Key: $key has value: ")
        println(value)
    }

    val r4 = Recipe("Jambalaya").printRecipe()

    val r5 = Recipe("Sausage Rolls").printRecipe()

    val r6 = Recipe("Chicken Soup").printRecipe()

    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5, "Recipe6" to r6)

    mRecipeMap.putAll(recipesToAdd)
    val recipeMapCopy = mRecipeMap.toMap()
    val recipeListCopy = mRecipeMap.toList()
    for ((key,value) in recipeMapCopy){
        print("Was MutableMapOf now is mapOf Key: $key has value: ")
        println(value)
    }
    for ((key,value) in recipeListCopy){
        print("Was MutableMapOf now is mapOf Key: $key has value: ")
        println(value)
    }
    val recipeEntries = mRecipeMap.entries
    println(recipeEntries)

    if (mRecipeMap.size > mRecipeMap.values.toSet().size) {

        println("mRecipeMap contains duplicates values")

    }
    val x = mutableSetOf(1, 2)
    val y = x.toSet()
    println(y)
    x.add(3)
    println(y)

    val w = mutableSetOf(4, 5)
    val z:Set<Int> = w
    println(z)
    w.add(6)
    println(z)

}

abstract class CookBook {
    abstract val name:String
    abstract fun printRecipe(a:String = name):String
}

class Recipe(recipeName:String):CookBook(){
    override val name = recipeName
    override fun printRecipe(a: String):String{
        return a
    }
}