package com.example.quizapp

object Constants {
    const val USER_NAME : String= "user_name"
    const val TOTAL_QUESTIONS: String ="total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Denmark", "Germany",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia",
            "Denmark", "Germany",
            2
        )
        questionsList.add(que2)
        val que3 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany", "Australia",
            "Denmark", "Belgium",
            4
        )
        questionsList.add(que3)
        val que4 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Australia",
            "kuwait", "Germany",
            1
        )
        questionsList.add(que4)
        val que5 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_denmark,
            "India", "New Zealand",
            "Denmark", "Germany",
            3
        )
        questionsList.add(que5)
        val que6 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_fiji,
            "Australia", "Fiji",
            "India", "Belgium",
            2
        )
        questionsList.add(que6)
        val que7 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina", "Australia",
            "Denmark", "Germany",
            4
        )
        questionsList.add(que7)
        val que8 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Australia",
            "Kuwait", "Germany",
            1
        )
        questionsList.add(que8)
        val que9 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_kuwait,
            "New Zealand", "Kuwait",
            "Denmark", "Argentina",
            2
        )
        questionsList.add(que9)
        val que10 = Question(
            1,"What country does this flag Belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "China", "Australia",
            "New Zealand", "Pakistan",
            3
        )
        questionsList.add(que10)

        return questionsList
    }

}