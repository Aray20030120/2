package tw.pu.edu.gm.s1101711

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import tw.pu.edu.gm.s1101711.ui.theme.洪靖睿2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            洪靖睿2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("洪靖睿")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Image(
        painter = painterResource(id = R.drawable.map),
        contentDescription = stringResource(id = R.string.map_content_description)
    )

    Text(text = "作者 $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    洪靖睿2Theme {
        Greeting("Android")
    }
}