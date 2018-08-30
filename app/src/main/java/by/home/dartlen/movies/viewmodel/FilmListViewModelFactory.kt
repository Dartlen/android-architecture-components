package by.home.dartlen.movies.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import by.home.dartlen.movies.data.FilmRepository

class FilmListViewModelFactory(private val repository: FilmRepository): ViewModelProvider.NewInstanceFactory(){
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>) = FilmListViewModel(repository) as T
}