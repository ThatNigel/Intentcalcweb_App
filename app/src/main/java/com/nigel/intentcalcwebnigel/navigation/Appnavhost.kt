package com.nigel.intentcalcwebnigel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nigel.intentcalcwebnigel.ui.theme.screens.calc.Calc_Screen
import com.nigel.intentcalcwebnigel.ui.theme.screens.home.Home_Screen
import com.nigel.intentcalcwebnigel.ui.theme.screens.intent.Intent_Screen
import com.nigel.intentcalcwebnigel.ui.theme.screens.web.Web_Screen

@Composable
fun Appnavhost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String= ROUTE_HOME) {
    NavHost(navController=navController,modifier=Modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            Home_Screen(navController)
        }
        composable(ROUTE_CALC){
            Calc_Screen(navController)
        }
        composable(ROUTE_INTENT){
            Intent_Screen(navController)
        }
        composable(ROUTE_WEB){
            Web_Screen(navController)
        }

    }

}