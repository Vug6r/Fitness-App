open class Exercise(
    private var exerciseName: String,
    private var exerciseDuration: Int,
    private var exerciseDescription: String,
    private var caloriesBurned: Double
) {

    fun getExerciseName() = exerciseName
    fun setExerciseName(name: String) { exerciseName = name }

    fun getExerciseDuration() = exerciseDuration
    fun setExerciseDuration(duration: Int) { exerciseDuration = duration }

    fun getExerciseDescription() = exerciseDescription
    fun setExerciseDescription(desc: String) { exerciseDescription = desc }

    fun getCaloriesBurned() = caloriesBurned
    fun setCaloriesBurned(cal: Double) { caloriesBurned = cal }

    // Polymorphism example
    open fun performExercise() {
        println("Exercise: $exerciseName | Calories: $caloriesBurned")
    }
}