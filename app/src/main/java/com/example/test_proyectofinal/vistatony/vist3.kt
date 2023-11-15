
import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_proyectofinal.R

@Composable
fun MyBankView2() {
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

        // Spacer(modifier = Modifier.height(1.dp))
        // Referencia directa a un recurso en la carpeta "drawable"
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFCEAC8))
                .padding(27.dp)
        ){
            val imageResId = R.drawable.ecocajero2

            // Utilización de la imagen en un componente de Compose
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp)

            )}
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(27.dp)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Text(
                    text = "Actividades Recientes",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 20.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) //

                )

                Text(
                    text = "Eco cajero",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) // Alinea el texto hacia la izquierda

                )
                Text(
                    text = "03 nov. 2023 - 12:39 pm",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) // Alinea el texto hacia la izquierda

                )
                Text(
                    text = "Eco cajero",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) // Alinea el texto hacia la izquierda

                )
                Text(
                    text = "03 nov. 2023 - 12:39 pm",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) // Alinea el texto hacia la izquierda

                )
                Text(
                    text = "Eco cajero",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) // Alinea el texto hacia la izquierda

                )
                Text(
                    text = "03 nov. 2023 - 12:39 pm",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) // Alinea el texto hacia la izquierda

                )
                Text(
                    text = "Eco cajero",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) // Alinea el texto hacia la izquierda

                )
                Text(
                    text = "03 nov. 2023 - 12:39 pm",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(8.dp) // Ajusta el relleno según sea necesario
                        .align(Alignment.Start) // Alinea el texto hacia la izquierda

                )
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

                // Reemplaza "mi_icono" con el nombre real de tu icono en "drawable"
                val drawableId = context.resources.getIdentifier("hogar", "drawable", context.packageName)

                // Cargar el icono como ImageBitmap
                val imageBitmap = BitmapFactory.decodeResource(context.resources, drawableId).asImageBitmap()

                // Utilizar el icono en un componente de Compose
                Image(
                    bitmap = imageBitmap,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp),

                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Inicio",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )}
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                val context1 = LocalContext.current

                // Reemplaza "mi_icono" con el nombre real de tu icono en "drawable"
                val drawableId1 = context1.resources.getIdentifier("arbol", "drawable", context1.packageName)

                // Cargar el icono como ImageBitmap
                val imageBitmap1 = BitmapFactory.decodeResource(context1.resources, drawableId1).asImageBitmap()

                // Utilizar el icono en un componente de Compose
                Image(
                    bitmap = imageBitmap1,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp),

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
                val context2 = LocalContext.current

                // Reemplaza "mi_icono" con el nombre real de tu icono en "drawable"
                val drawableId2 = context2.resources.getIdentifier("rompecabezas", "drawable", context2.packageName)

                // Cargar el icono como ImageBitmap
                val imageBitmap2 = BitmapFactory.decodeResource(context2.resources, drawableId2).asImageBitmap()

                // Utilizar el icono en un componente de Compose
                Image(
                    bitmap = imageBitmap2,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp),

                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Ajustes",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
            }

        }



    }
}

@Preview
@Composable
fun MyBankPreview2() {
    MaterialTheme {
        MyBankView2()
    }
}