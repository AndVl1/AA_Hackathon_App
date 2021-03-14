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
                R.drawable.neznakom,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Загадать кому-нибудь из случайных людей трудную загадку",
                R.drawable.zagadka,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Стать инициатором хоровода вокруг дерева",
                R.drawable.horovod,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Встать под деревом и поздравить людей с праздником по-президентски",
                R.drawable.i_prezident,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Выпить шампанского с понравившимся прохожим",
                R.drawable.shampan,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Дарить бенгальские огни незнакомцам, обнимая каждого из них",
                R.drawable.bengalskie_ogni,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Приставать к людям, предлагая погадать по руке",
                R.drawable.gadanie,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id, CATEGORY_STREET,
                "Завязать знакомство с 5 мужчинами и женщинами",
                R.drawable.znakomstvo,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id, CATEGORY_STREET,
                "Угощать печеньем всех встречающихся малышей",
                R.drawable.pechenie,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Получить 10 комплиментов от 5 людей противоположного пола",
                R.drawable.compliment,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Раздеться до белья, выбежать во двор и попросить у первого встречного соль",
                R.drawable.sol,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Накрасить помадой нос и сыграть Деда Мороза",
                R.drawable.ne_ded_moroz,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Зайти к каждому соседу и поздравить с праздником",
                R.drawable.sosedy,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Притвориться иностранным гражданином и пытаться узнать дорогу к посольству у проходящих мимо людей",
                R.drawable.shpion,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Броситься на шею прохожему, а потом притвориться, что обознался",
                R.drawable.oboznalsa,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Опросить прохожих, интересуясь их мечтами и планами на следующий год",
                R.drawable.mechta,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_STREET,
                "Попросить у 5 людей противоположного пола номер телефона",
                R.drawable.telefon,
                1,
                true
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
                R.drawable.footbol,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Присесть 30 раз",
                R.drawable.prisedanie,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Встать на руки",
                R.drawable.na_rukah,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить как играет баскетболист",
                R.drawable.basket,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить как играет хоккеист",
                R.drawable.hokey,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить празднование гола в футболе",
                R.drawable.gol,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить празднование гола в баскетболе",
                R.drawable.gol_b,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Изобразить празднование гола в хоккеи",
                R.drawable.gol_h,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Оббежать вокруг стола 10 раз",
                R.drawable.beg,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Сделать гимнастическую фигуру мостик",
                R.drawable.mostik,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Сделать гимнастическую фигуру ласточку",
                R.drawable.lastochka,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_SPORT,
                "Подпрыгнуть на одной ноге 50 раз",
                R.drawable.noga,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Рассказать стих",
                R.drawable.stih,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Спеть песню",
                R.drawable.pesny,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Нарисовать портрет кого-либо из участников",
                R.drawable.portret,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "С завязанными глазами, не помогая себе руками, ртом взять кусочек фрукта с блюда и отгадать, что это",
                R.drawable.zavyzan,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Изобразить котенка, который лакает молочко из тарелки",
                R.drawable.kotik,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Из бумаги как можно быстрее сложить какой-либо предмет",
                R.drawable.is_bumagi,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "С завязанными глазами нарисовать домашнее животное",
                R.drawable.risunot_kot,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "С закрытыми глазами определить на ощупь, какой предмет ведущий положил в руку",
                R.drawable.zakrit_glaza,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Станцевать с полным стаканом воды в руке",
                R.drawable.stakan,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Вспомнить как можно больше вежливых слов",
                R.drawable.vspomnit2,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Поменять обувь с левой ноги на правую, пройти в таком виде красивой походкой",
                R.drawable.obuv,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Показать так персонажа мультфильма, чтобы все игроки угадали, кто это",
                R.drawable.personag,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Успеть выпить напиток из стакана за 15 секунд через трубочку",
                R.drawable.is_trubochki,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Изобразить любую профессию так, чтобы другие смогли отгадать",
                R.drawable.prof,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id, CATEGORY_CHILDREN,
                "Назвать десять слов на одну букву.",
                R.drawable.mozg,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Побыть собачкой, вертеть хвостиком и выпрашивать еду (без слов)",
                R.drawable.pes,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Набрать в рот воды и не отвечать на вопросы других участников 2 минуты.",
                R.drawable.v_rot_voda,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Съесть кусочек лимона и не скривиться при этом.",
                R.drawable.limon,
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
                R.drawable.tcaply,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_CHILDREN,
                "Представить, что вы робот и двигаться как он. Задавать вопросы голосом робота",
                R.drawable.robot,
                1,
                true
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпить бокал шампанского без помощи рук",
                R.drawable.s_bez_ruk,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Сказать праздничный тост и выпить одну рюмку",
                R.drawable.tost,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпить «на брудершафт» с соседом",
                R.drawable.brud,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Сделайте каждому игроку алкогольный коктейль",
                R.drawable.koktel,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку с закрытыми глазами",
                R.drawable.rumka,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку за 5 глотков",
                R.drawable.rumka2,
                1,
                false
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку из рук соседа",
                R.drawable.rumka3,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку без помощи рук",
                R.drawable.bez_ruk,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Сделай коктейль из всех напитков и выпей его",
                R.drawable.koktel2,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей рюмку под столом",
                R.drawable.pod_stol,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей, стоя в позе ласточки",
                R.drawable.lastoch,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выпей лежа на полу или на диване",
                R.drawable.lega,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Разрекламировать выпиваемый напиток",
                R.drawable.relkama2,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Придумай 20 хвалебных описаний выпитой рюмке (содержимому)",
                R.drawable.reklama3,
                1,
                false
            )
        )

        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Сделай рюмку из яблока или мандарина и угости каждого присутствующего из нее.",
                R.drawable.mandarinka,
                1,
                true
            )
        )
        fants.add(
            Fant(
                ++id,
                CATEGORY_ALCOHOL,
                "Выйди в подъезд и выпей в нем с первым попавшимся",
                R.drawable.v_podezd,
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
                R.drawable.is_tufli,
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
                R.drawable.solomka,
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
