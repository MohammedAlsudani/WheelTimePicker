import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import wheelTimePicker.DropdownMenuTimePicker

@Composable
@Preview
fun App() {
    MaterialTheme {
        Box(Modifier.fillMaxWidth()) {
            var popupControl by remember { mutableStateOf(false) }
            var h by remember { mutableStateOf("") }
            var m by remember { mutableStateOf("") }
            TextButton(modifier = Modifier.align(Alignment.Center),
                onClick = { popupControl = !popupControl }
            ) {
                Text("Open normal popup : h = $h m = $m")
                DropdownMenuTimePicker(popupControl,
                    onMinuteSelected =  {m = it},
                    onHourSelected =  {h = it},
                    onDismissDropdown = { popupControl = false })
            }
        }
    }
}

