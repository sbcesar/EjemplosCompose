import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
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
fun MainScreen() {
    Surface(
        color = Color.Black,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(100.dp)
        ) {
            Surface(
                color = Color.Blue,
                modifier = Modifier.size(60.dp)
            ) {}
            Surface(
                color = Color.Red,
                modifier = Modifier.size(60.dp)
            ) {}
        }
//        Text(
//            text = "Hi mates!!",
//            style = MaterialTheme.typography.h5,
//            modifier = Modifier
//                .wrapContentSize(Alignment.Center)
//                .background(Color.White)
//                .padding(all = 100.dp)
//        )
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1200.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Mi Login",
        state = windowState
    ) {
        MainScreen()
    }
}
