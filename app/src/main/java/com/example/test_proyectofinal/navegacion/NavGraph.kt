package com.example.test_proyectofinal.navegacion



import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import card1
import card2
import card3


@Composable
fun nav(){
    // Se crea un controlador de navegación para manejar las transiciones entre destinos
    val navController= rememberNavController()

    // Componente NavHost que define la estructura de navegación
    NavHost(navController = navController, startDestination = "vist1" ){
        // Definición del destino "login" que muestra la pantalla de inicio de sesión
        composable(route="vist1"){
            card1(navController)
        }
        // Definición del destino "register" que muestra la pantalla de registro
        composable(route="vist2"){
            card2(navController)
        }
        // Definición del destino "registerdos" que muestra otra pantalla de registro (posiblemente diferente a la anterior)
        composable(route="vist3"){
            card3(navController)
        }

    }
}
