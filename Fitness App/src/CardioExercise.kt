class CardioExercise(
    name: String,
    duration: Int,
    description: String,
    calories: Double
) : Exercise(name, duration, description, calories) {

    override fun performExercise() {
        println("Cardio Etdin!")
    }
}
