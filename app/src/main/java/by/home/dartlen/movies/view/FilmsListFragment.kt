package by.home.dartlen.movies.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import by.home.dartlen.movies.R
import by.home.dartlen.movies.adapters.FilmAdapter
import by.home.dartlen.movies.utils.InjectorUtils
import by.home.dartlen.movies.viewmodel.FilmListViewModel
import kotlinx.android.synthetic.main.fragment_films_list.*

class FilmsListFragment: Fragment(){
    private lateinit var viewModel:FilmListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_films_list, container, false)
        val context = context?: return view

        val factory =InjectorUtils.provideFilmListViewModelFactory(context)
        viewModel = ViewModelProviders.of(this, factory).get(FilmListViewModel::class.java)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = FilmAdapter()
        film_list.adapter = adapter
        film_list.layoutManager = LinearLayoutManager(activity)
        subscribeUi(adapter)
    }

    private fun subscribeUi(adapter:FilmAdapter){
        viewModel.getFilms().observe(viewLifecycleOwner, Observer{film ->
            if(film!=null) ;//adapter.submitList(film)
        })
    }
}