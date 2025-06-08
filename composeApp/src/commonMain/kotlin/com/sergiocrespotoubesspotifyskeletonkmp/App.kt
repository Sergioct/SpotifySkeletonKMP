package com.sergiocrespotoubesspotifyskeletonkmp

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.sergiocrespotoubesspotifyskeletonkmp.theme.SpotifyTheme
import com.sergiocrespotoubesspotifyskeletonkmp.theme.getColorsTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val colors = getColorsTheme()
    val navController = rememberNavController()

    SpotifyTheme {
        Scaffold(
            /*topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Text(
                            text = getTopAppBarTitle(backStackEntry)
                        )
                    },
                    navigationIcon = {
                        if(backStackEntry?.destination?.hasRoute<Screen.CharacterDetail>() == true) {
                            Image(
                                painter = painterResource(Res.drawable.arrow_back),
                                contentDescription = "Vector Image",
                                modifier = Modifier.size(32.dp).clickable {
                                    navController.navigateUp()
                                }
                            )
                        }
                    },
                    scrollBehavior = scrollBehavior,
                )
            }*/
        ) { innerPadding ->
            /*NavHost(navController = navController, startDestination = Screen.CharactersList) {
                composable<Screen.CharactersList> { CharacterListScreen(
                    onItemClick = { characterId ->
                        navController.navigate(Screen.CharacterDetail(id = characterId))
                    },
                    modifier = Modifier.padding(innerPadding),
                ) }
                composable<Screen.CharacterDetail> { backStackEntry ->
                    val characterDetail: Screen.CharacterDetail = backStackEntry.toRoute()
                    CharacterDetailScreen(
                        id = characterDetail.id,
                        modifier = Modifier.padding(innerPadding),
                    ) }

            }*/
        }
    }
}