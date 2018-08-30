package by.home.dartlen.movies.viewmodel

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import by.home.dartlen.movies.data.Film
import by.home.dartlen.movies.data.FilmRepository

class FilmListViewModel internal  constructor(
        private val filmRepository: FilmRepository
):ViewModel(){

    private val filmList = MediatorLiveData<List<Film>>()

    init {
        filmList.addSource(filmRepository.getFilms(), filmList::setValue)
    }

    fun getFilms() = filmList
}
