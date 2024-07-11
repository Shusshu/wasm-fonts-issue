
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mypackage.MalibuRingFamily
import mypackage.MyCustomTypography
import mypackage.TypeScaleTokens
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme(
        typography = MyCustomTypography,
    ) {
        Row() {
            NavigationRail(
                containerColor = Color.Transparent,
            ) {
                TabNavigationRailItemOne()
                TabNavigationRailItemOne()
            }
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .fillMaxWidth()
                            .padding(vertical = 16.dp)
                            .background(MaterialTheme.colorScheme.surface)
                            .padding(
                                vertical = 16.dp,
                                horizontal = 16.dp,
                            ),
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "this is the first description",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.secondary,
                            textAlign = TextAlign.Center,
                        )
                        Spacer(Modifier.height(16.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth()
                                .padding(start = 16.dp),
                            text = "Malibu font",
                            style = MaterialTheme.typography.displayMedium,
                            fontFamily = MalibuRingFamily,
                            fontSize = 56.sp,
                            color = MaterialTheme.colorScheme.secondary,
                        )
                        Spacer(Modifier.height(16.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "this is a description",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = TypeScaleTokens.Weight.Thin,
                            textAlign = TextAlign.Justify,
                        )
                        Spacer(Modifier.height(16.dp))
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Text(
                                text = "more text here",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = TypeScaleTokens.Weight.Thin,
                                textAlign = TextAlign.Center,
                            )
                        }
                        Spacer(Modifier.height(16.dp))
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Button(
                                onClick = {},
                            ) {
                                Text(
                                    text = "click me",
                                    style = MaterialTheme.typography.bodyMedium
                                )
                            }
                        }
                        Spacer(Modifier.height(16.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "caption",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = TypeScaleTokens.Weight.Thin,
                            textAlign = TextAlign.Justify,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TabNavigationRailItemOne() {
    NavigationRailItem(
        icon = {
            Box(Modifier.size(12.dp).background(color = Color.Red))
        },
        label = {
            Text(
                text = "title",
            )
        },
        selected = true,
        onClick = {  },
    )
}
