package by.home.dartlen.movies.data

class FilmRepository private constructor(private val filmDao: FilmDao){
    companion object {
        @Volatile private var instance: FilmRepository? = null
        fun getInstance(filmDao: FilmDao) =
                instance?: synchronized(this){
                    instance ?: FilmRepository(filmDao).also { instance = it }
                }
    }

    fun getFilms() = filmDao.getFilms()
}