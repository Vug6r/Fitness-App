interface Nutrition {
    fun calculateCalories(weight: Double, height: Double, age: Int, activityLevel: String): Double
    fun logMeal(mealName: String)
}