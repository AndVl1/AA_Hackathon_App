package ru.academy.hackathon.data.repository

import android.util.Log
import ru.academy.hackathon.R
import ru.academy.hackathon.data.Fant

class RepositoryCategory {
    var fants: MutableList<Fant> = mutableListOf()

    init {

        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Поздравлять каждого прохожего с праздником, желая всего наилучшего",
                R.drawable.street,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Загадать кому-нибудь из случайных людей трудную загадку",
                R.drawable.street,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Стать инициатором хоровода вокруг дерева",
                R.drawable.street,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Встать под деревом и поздравить людей с праздником по-президентски",
                R.drawable.street,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Выпить шампанского с понравившимся прохожим",
                R.drawable.street,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Дарить бенгальские огни незнакомцам, обнимая каждого из них",
                R.drawable.street,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Приставать к людям, предлагая погадать по руке",
                R.drawable.street,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id, CATEGORY_STREET,
                "Завязать знакомство с 5 мужчинами и женщинами",
                R.drawable.street,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id, CATEGORY_STREET,
                "Угощать печеньем всех встречающихся малышей",
                R.drawable.street,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Получить 10 комплиментов от 5 людей противоположного пола",
                R.drawable.street,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Раздеться до белья, выбежать во двор и попросить у первого встречного соль",
                R.drawable.street,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Накрасить помадой нос и сыграть Деда Мороза",
                R.drawable.street,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Зайти к каждому соседу и поздравить с праздником",
                R.drawable.street,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Притвориться иностранным гражданином и пытаться узнать дорогу к посольству у проходящих мимо людей",
                R.drawable.street,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Броситься на шею прохожему, а потом притвориться, что обознался",
                R.drawable.street,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Опросить прохожих, интересуясь их мечтами и планами на следующий год",
                R.drawable.street,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Попросить у 5 людей противоположного пола номер телефона",
                R.drawable.street,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Отжаться 15 раз",
                R.drawable.push_up,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить как играет футболист",
                R.drawable.push_up,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Присесть 30 раз",
                R.drawable.push_up,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Встать на руки",
                R.drawable.push_up,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить как играет баскетболист",
                R.drawable.push_up,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить как играет хоккеист",
                R.drawable.push_up,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить празднование гола в футболе",
                R.drawable.push_up,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить празднование гола в баскетболе",
                R.drawable.push_up,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить празднование гола в хоккеи",
                R.drawable.push_up,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Оббежать вокруг стола 10 раз",
                R.drawable.push_up,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Сделать гимнастическую фигуру мостик",
                R.drawable.push_up,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Сделать гимнастическую фигуру ласточку",
                R.drawable.push_up,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Подпрыгнуть на одной ноге 50 раз",
                R.drawable.push_up,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Рассказать стих",
                R.drawable.children,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Спеть песню",
                R.drawable.children,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Нарисовать портрет кого-либо из участников",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "С завязанными глазами, не помогая себе руками, ртом взять кусочек фрукта с блюда и отгадать, что это",
                R.drawable.children,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Изобразить котенка, который лакает молочко из тарелки",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Из бумаги как можно быстрее сложить какой-либо предмет",
                R.drawable.children,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "С завязанными глазами нарисовать домашнее животное",
                R.drawable.children,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "С закрытыми глазами определить на ощупь, какой предмет ведущий положил в руку",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Станцевать с полным стаканом воды в руке",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Вспомнить как можно больше вежливых слов",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Поменять обувь с левой ноги на правую, пройти в таком виде красивой походкой",
                R.drawable.children,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Показать так персонажа мультфильма, чтобы все игроки угадали, кто это",
                R.drawable.children,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Успеть выпить напиток из стакана за 15 секунд через трубочку",
                R.drawable.children,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Изобразить любую профессию так, чтобы другие смогли отгадать",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id, CATEGORY_CHILDREN,
                "Назвать десять слов на одну букву.",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Побыть собачкой, вертеть хвостиком и выпрашивать еду (без слов)",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Набрать в рот воды и не отвечать на вопросы других участников 2 минуты.",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Съесть кусочек лимона и не скривиться при этом.",
                R.drawable.children,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Представить себя цаплей, стоять на одной ноге и " +
                        "попытаться при этом что-то съесть со стола не пользуясь руками.",
                R.drawable.children,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Представить, что вы робот и двигаться как он. Задавать вопросы голосом робота",
                R.drawable.children,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпить бокал шампанского без помощи рук",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Сказать праздничный тост и выпить одну рюмку",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпить «на брудершафт» с соседом",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Сделайте каждому игроку алкогольный коктейль",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку с закрытыми глазами",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку за 5 глотков",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку из рук соседа",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку без помощи рук",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Сделай коктейль из всех напитков и выпей его",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку под столом",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей, стоя в позе ласточки",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей лежа на полу или на диване",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Разрекламировать выпиваемый напиток",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "ридумай 20 хвалебных описаний выпитой рюмке (содержимому)",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Сделай рюмку из яблока или мандарина и угости каждого присутствующего из нее.",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выйди в подъезд и выпей в нем с первым попавшимся",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей из туфельки соседки по столу",
                R.drawable.alcoholic_beverages,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Вылей рюмку в тарелку и выпей  с помощью ложки",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Разлить всем в рюмки (бокалы) без рук",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку через соломинку",
                R.drawable.alcoholic_beverages,
                1,
                false
            )
        )
    }

    public fun getFantsList(idCategory: Int): List<Fant> {
        Log.v("getFantsList", "idCategory: ${idCategory}")

        var fants: List<Fant> = fants.filter { it -> it.idCategory == idCategory }
        Log.v("getFantsList", "${fants.size}")

        return fants
    }

    companion object {
        private var id = 0
        const val CATEGORY_STREET = 1
        const val CATEGORY_SPORT = 2
        const val CATEGORY_CHILDREN = 3
        const val CATEGORY_ALCOHOL = 4
    }
}
