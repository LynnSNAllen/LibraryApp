package com.lynnpadc.libraryapp.uitests.search

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.lynnpadc.libraryapp.activities.MainActivity
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.uitests.first
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SearchTestFlow {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun tapOnSearchBar_goToSearchActivity(){
        onView(withId(R.id.etSearch))
            .perform(click())
        onView(withId(R.id.etSearch))
            .check(matches(isDisplayed()))
        onView(withId(R.id.etSearch))
            .perform(typeText("chemistry"), closeSoftKeyboard())

        Thread.sleep(3000L)

        onView(withId(R.id.tlBook))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tvGoogle))
            .check(matches(isDisplayed()))

        onView(withId(R.id.rvSearchBookList))
            .check(matches(isDisplayed()))

        onView(first<View>(withId(R.id.tvBookTitle)))
            .check(matches(isDisplayed()))

        onView(first<View>(withId(R.id.tvAuthor)))
            .check(matches(isDisplayed()))
    }
}