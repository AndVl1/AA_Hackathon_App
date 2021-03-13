package ru.academy.hackathon.ui.main

import android.util.Log
import ru.academy.hackathon.R

class RepositoryCategory {
    var fants: MutableList<Fant> = mutableListOf()

    init {

        fants.add(
            Fant(
                1, 1, "Поздравлять каждого прохожего с праздником, желая всего наилучшего",
                "push_up.webp", 1, true
            )
        )
        fants.add(
            Fant(
                2, 1, "Загадать кому-нибудь из случайных людей трудную загадку",
                "push_up.webp", 1, true
            )
        )
        fants.add(
            Fant(
                3, 1, "Стать инициатором хоровода вокруг дерева",
                "push_up.webp", 1, false
            )
        )
        fants.add(
            Fant(
                4, 1, "Стать инициатором хоровода вокруг дерева",
                "push_up.webp", 1, false
            )
        )

        fants.add(
            Fant(
                1, 2, "Отжаться 15 раз",
                "push_up.webp", 1, true
            )
        )
        fants.add(
            Fant(
                2, 2, "Изобразить как играет футболист",
                "push_up.webp", 1, true
            )
        )
    }

public fun  getFantsList(idCategory: Long):List<Fant> {
    Log.v("getFantsList","${fants.size}")

    return fants.filter { it -> it.id == idCategory }
}
}
