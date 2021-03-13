package ru.academy.hackathon.data.repository

import android.util.Log
import ru.academy.hackathon.data.Fant

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
        fants.add(
            Fant(
                1, 3, "Стать инициатором хоровода вокруг дерева",
                "push_up.webp", 1, false
            )
        )

        fants.add(
            Fant(
                2, 3, "Отжаться 15 раз",
                "push_up.webp", 1, true
            )
        )
        fants.add(
            Fant(
                3, 3, "Изобразить как играет футболист",
                "push_up.webp", 1, true
            )
        )
        fants.add(
            Fant(
                4, 3, "Стать инициатором хоровода вокруг дерева",
                "push_up.webp", 1, false
            )
        )

        fants.add(
            Fant(
                1, 4, "Отжаться 15 раз",
                "push_up.webp", 1, true
            )
        )
        fants.add(
            Fant(
                2, 4, "Изобразить как играет футболист",
                "push_up.webp", 1, true
            )
        )
    }

public fun  getFantsList(idCategory: Int):List<Fant> {
    Log.v("getFantsList","idCategory: ${idCategory}")

    var fants: List<Fant>  =  fants.filter { it -> it .idCategory == idCategory}
    Log.v("getFantsList","${fants.size}")

    return fants
}
}
