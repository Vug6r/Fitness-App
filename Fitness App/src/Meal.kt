class Meal(
    private var mealName: String,
    private var mealDescription: String,
    private var calories: Double
) : Nutrition {

    fun getMealName() = mealName
    fun setMealName(name: String) { mealName = name }

    fun getMealDescription() = mealDescription
    fun setMealDescription(desc: String) { mealDescription = desc }

    fun getCalories() = calories
    fun setCalories(cal: Double) { calories = cal }

    override fun calculateCalories(weight: Double, height: Double, age: Int, activityLevel: String): Double {
        val bmr = 10 * weight + 6.25 * height - 5 * age + 5

        return when (activityLevel.lowercase()) {
            "low" -> bmr * 1.2
            "moderate" -> bmr * 1.55
            "high" -> bmr * 1.9
            else -> bmr
        }
    }

    override fun logMeal(mealName: String) {
        println("Meal logged: $mealName")
    }
}