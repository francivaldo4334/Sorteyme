package br.com.francivaldo.sorteyme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.francivaldo.sorteyme.pages.ItemMenu
import br.com.francivaldo.sorteyme.pages.Menu
import br.com.francivaldo.sorteyme.pages.Numbers
import br.com.francivaldo.sorteyme.ui.theme.SorteymeTheme

class MainActivity : ComponentActivity() {
    companion object{
        lateinit var navControler: NavHostController
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SorteymeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    navControler = rememberNavController()
                    NavHost(navController = navControler, startDestination = Routes.MenuIni){
                        composable(Routes.MenuIni){
                            Menu(items = listOf<ItemMenu>(
                                ItemMenu(stringResource(id = R.string.start_now)){

                                },
                                ItemMenu(stringResource(id = R.string.more_options)){
                                    navControler.navigate(Routes.MoreOptions)
                                }
                            ))
                        }
                        composable(Routes.MoreOptions){
                            Numbers()
                        }
                    }
                }
            }
        }
    }
}
