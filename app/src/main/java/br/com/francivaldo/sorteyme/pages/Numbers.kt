package br.com.francivaldo.sorteyme.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import br.com.francivaldo.sorteyme.R

@Composable
fun Numbers(){
    var v1 by remember{ mutableStateOf("0") }
    var v2 by remember{ mutableStateOf("10") }
    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = stringResource(R.string.value_init))
        TextField(
            value = v1,
            onValueChange = {v1 = it},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = stringResource(R.string.value_init))
        TextField(
            value = v2,
            onValueChange = {v2 = it},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.start_now))
        }
    }
}