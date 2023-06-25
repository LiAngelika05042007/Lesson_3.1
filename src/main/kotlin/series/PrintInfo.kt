package series

class PrintInfo {
    fun printSeriesInfo(series: DataClass) {
        println("Название: ${series.name}")
        println("Сюжет: ${series.plot}")
        println("Дата выхода: ${series.releaseDate}")
        println("В главных ролях: ${series.starring}")
    }

}



