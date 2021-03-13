package ru.academy.hackathon.data

import ru.academy.hackathon.data.repository.RepositoryCategory


enum class CategoryFant(val idCategory: Int, val text:String)  {
    Category1(RepositoryCategory.CATEGORY_STREET,"Уличные"),
    Category2(RepositoryCategory.CATEGORY_SPORT,"Спортивные"),
    Category3(RepositoryCategory.CATEGORY_CHILDREN,"Детские"),
    Category4(RepositoryCategory.CATEGORY_ALCOHOL,"Алкогольные")
}
