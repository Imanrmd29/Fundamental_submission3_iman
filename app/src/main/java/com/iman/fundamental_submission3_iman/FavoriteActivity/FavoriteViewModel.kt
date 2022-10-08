package com.iman.fundamental_submission3_iman.FavoriteActivity

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.iman.fundamental_submission3_iman.database.FavoritDao
import com.iman.fundamental_submission3_iman.database.FavoriteUser
import com.iman.fundamental_submission3_iman.database.UserFavDatabase

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private var userDao: FavoritDao?
    private var db : UserFavDatabase?

    init {
        db = UserFavDatabase.getInstance(application)
        userDao = db?.favoritDao()
    }

    fun getFavUser(): LiveData<List<FavoriteUser>>? {
        return userDao?.getAllFavUser()
    }


}