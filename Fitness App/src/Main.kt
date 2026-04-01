fun main() {

    val workout = Workout(
        "Weight Loss", 8, "Fat burning program",
        "HIIT", 30, "High intensity workout", "High"
    )

    workout.displayProgram()

    val exercise = Exercise("Running", 20, "Cardio", 200.0)
    exercise.performExercise()

    val cardio = CardioExercise("Cycling", 25, "Outdoor cardio", 300.0)
    cardio.performExercise()

    val meal = Meal("Salad", "Healthy meal", 250.0)
    meal.logMeal("Salad")

    val caloriesNeeded = meal.calculateCalories(70.0, 175.0, 22, "moderate")
    println("Calories needed: $caloriesNeeded")
}