package by.home.dartlen.movies.adapters

import androidx.recyclerview.widget.DiffUtil
import by.home.dartlen.movies.data.Film

class FilmDiffCallback  : DiffUtil.ItemCallback<Film>(){
    override fun areContentsTheSame(oldItem: Film, newItem: Film): Boolean {
        return oldItem == newItem
    }

    override fun areItemsTheSame(oldItem: Film, newItem: Film): Boolean {
        return oldItem.filmId == newItem.filmId
    }
}