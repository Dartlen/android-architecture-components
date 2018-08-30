package by.home.dartlen.movies.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "film")
data class Film(
        @PrimaryKey @ColumnInfo(name = "id") val filmId:Int?,
        val overview: String = "",
        val originalLanguage: String = "",
        val originalTitle: String = "",
        val video: Boolean = false,
        val title: String = "",
        //val genreIds: List<Int?>? = null,
        val posterPath: String = "",
        val backdropPath: String = "",
        val releaseDate: String = "",
        val popularity: Double = 0.0,
        val voteAverage: Double = 0.0,
        val adult: Boolean = false,
        val voteCount: Int = 0
)