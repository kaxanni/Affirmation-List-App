package com.example.ganoy.data

import com.example.ganoy.R
import com.example.ganoy.models.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.img1),
            Affirmation(R.string.affirmation2, R.drawable.img2),
            Affirmation(R.string.affirmation3, R.drawable.img3),
            Affirmation(R.string.affirmation4, R.drawable.img4),
            Affirmation(R.string.affirmation5, R.drawable.img5),
        )
    }
}