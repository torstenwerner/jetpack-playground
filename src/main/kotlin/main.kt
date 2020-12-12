import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

fun main() = Window(title = "jetpack compose for desktop playground", icon = icAppRounded()) {
    var count by remember { mutableStateOf(0) }

    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Button(modifier = Modifier.align(Alignment.CenterHorizontally), onClick = {
                count++
            }) {
                Text(text = if (count == 0) "Hello, Desktop!" else "clicked: ${count}")
            }
        }
    }
}
