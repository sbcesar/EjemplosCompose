import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
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
fun MainScreenEjercicio1() {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(color = Color.Cyan)
                .size(50.dp)
                .align(alignment = Alignment.Center)
        )
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1200.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejercicio 1",
        state = windowState
    ) {
        MainScreenEjercicio1()
    }
}