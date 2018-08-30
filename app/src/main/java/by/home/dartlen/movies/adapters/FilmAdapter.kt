package by.home.dartlen.movies.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import by.home.dartlen.movies.R
import by.home.dartlen.movies.data.Film

class FilmAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_film, parent, false))
    }

    private fun createOnClickListener(filmId:Int):View.OnClickListener{
        return View.OnClickListener {
            //TODO:('navigate to detals')
        }
    }

    override fun getItemCount(): Int {
        return 5
    }

    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view) {
        fun bind(listener: View.OnClickListener, item: Film){
            /*binding.apply{
                clickListener = listener
                film = item
                excutePendingBindings()
            }*/
        }
    }
}