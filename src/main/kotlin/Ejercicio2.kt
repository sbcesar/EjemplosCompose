import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun MainScreenEjercicio2() {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(color = Color.Cyan)
                .align(alignment = Alignment.Center)
                .size(width = 300.dp, height = 170.dp)
                .padding(all = 20.dp)
        ) {
            Text(
                text = "Bienvenidos al abismo de los lamentos.",
                modifier = Modifier
                    .align(alignment = Alignment.BottomCenter),
            )
        }
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1200.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejercicio 1",
        state = windowState
    ) {
        MainScreenEjercicio2()
    }
}