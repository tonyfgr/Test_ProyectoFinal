import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.test_proyectofinal.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun card2(navController: NavHostController) {
    Scaffold(
        content = { MyBankView1(navController) }
    )
}

@Composable
fun MyBankView1(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF8CBF3F))
                .padding(16.dp)
        ) {
            Text(
                text = "Hola Jose!\nBienvenido de nuevo a tu banco.",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFCEAC8))
                .padding(27.dp)
        ) {
            val imageResId = R.drawable.ecocajero1

            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFCEAC8)),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFFFCEAC8))
                    .padding(5.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(35.dp)
                        .background(
                            color = Color(0xFFF24E29),
                            shape = CircleShape
                        )
                        .clickable { navController.navigate("vist1") },
                )

                Box(
                    modifier = Modifier
                        .size(35.dp)
                        .clickable { navController.navigate("vist2") }
                        .background(
                            color = Color(0xFF962831),
                            shape = CircleShape
                        )
                )

                Box(
                    modifier = Modifier
                        .size(35.dp)
                        .background(
                            color = Color(0xFF962831),
                            shape = CircleShape
                        )
                        .clickable { navController.navigate("vist3") }
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(27.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Actividades Recientes",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 20.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                )

                Text(
                    text = "Eco cajero",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "03 nov. 2023 - 12:39 pm",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "Eco cajero",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "03 nov. 2023 - 12:39 pm",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "Eco cajero",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "03 nov. 2023 - 12:39 pm",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "Eco cajero",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "03 nov. 2023 - 12:39 pm",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .align(Alignment.Start)
                )

                // Repite estas líneas según sea necesario para más actividades recientes

            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF8CBF3F))
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                val context = LocalContext.current

                val drawableId =
                    context.resources.getIdentifier("hogar", "drawable", context.packageName)
                val imageBitmap =
                    BitmapFactory.decodeResource(context.resources, drawableId).asImageBitmap()

                Image(
                    bitmap = imageBitmap,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Inicio",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                val context = LocalContext.current

                val drawableId =
                    context.resources.getIdentifier("arbol", "drawable", context.packageName)
                val imageBitmap =
                    BitmapFactory.decodeResource(context.resources, drawableId).asImageBitmap()

                Image(
                    bitmap = imageBitmap,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Mi arbol",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )


            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                val context = LocalContext.current

                val drawableId =
                    context.resources.getIdentifier("rompecabezas", "drawable", context.packageName)
                val imageBitmap =
                    BitmapFactory.decodeResource(context.resources, drawableId).asImageBitmap()

                Image(
                    bitmap = imageBitmap,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Ajustes",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )


            }


            // ... otros bloques de código similares para "Mi árbol" y "Ajustes"
        }
    }}