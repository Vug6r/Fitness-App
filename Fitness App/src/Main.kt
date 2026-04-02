fun main() {

    val workout = Workout(
        "Itirilen Kilo", 8, "Yag Eritme",
        "HIIT", 30, "Tezyiqli idman", "Yuksek"
    )

    workout.displayProgram()

    val exercise = Exercise("Qacir", 30, "Kardio", 100.0)
    exercise.performExercise()

    val cardio = CardioExercise("Velo", 25, "Çöldə vorkout", 200.0)
    cardio.performExercise()

    val meal = Meal("Salat", "Saglamliq üçün yemək", 250.0)
    meal.logMeal("Salat")

    val caloriesNeeded = meal.calculateCalories(70.0, 175.0, 22, "moderate")
    println("Calories needed: $caloriesNeeded")
}
