package br.com.francivaldo.sorteyme.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import br.com.francivaldo.sorteyme.R

data class ItemMenu(val name: String, val onClick: () -> Unit)
@Composable
fun Menu(items:List<ItemMenu>){
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        items.forEach {
            Spacer(modifier = Modifier.size(16.dp))
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                onClick = it.onClick) {
                Text(text = it.name)
            }
        }
    }
}