package by.home.dartlen.movies.utils

import android.content.Context
import by.home.dartlen.movies.data.AppDatabase
import by.home.dartlen.movies.data.FilmRepository
import by.home.dartlen.movies.viewmodel.FilmListViewModelFactory

object InjectorUtils {

    private fun getFilmRepository(context: Context): FilmRepository {
        return FilmRepository.getInstance(AppDatabase.getInstance(context).filmDao())
    }

    /*private fun getGardenPlantingRepository(context: Context): GardenPlantingRepository {
        return GardenPlantingRepository.getInstance(
                AppDatabase.getInstance(context).gardenPlantingDao())
    }*/

    /*fun provideGardenPlantingListViewModelFactory(
            context: Context
    ): GardenPlantingListViewModelFactory {
        val repository = getGardenPlantingRepository(context)
        return GardenPlantingListViewModelFactory(repository)
    }*/

    fun provideFilmListViewModelFactory(context: Context): FilmListViewModelFactory {
        val repository = getFilmRepository(context)
        return FilmListViewModelFactory(repository)
    }

    /*fun providePlantDetailViewModelFactory(
            context: Context,
            plantId: String
    ): PlantDetailViewModelFactory {
        return PlantDetailViewModelFactory(getPlantRepository(context),
                getGardenPlantingRepository(context), plantId)
    }*/
}