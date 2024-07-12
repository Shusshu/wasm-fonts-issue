package mypackage

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import wasmfontissue.composeapp.generated.resources.Res
import wasmfontissue.composeapp.generated.resources.*
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

// https://github.com/JetBrains/kotlinconf-app/blob/69909438506522b279d0771c8f47bdd69baf6c3c/shared/src/mobileMain/kotlin/org/jetbrains/kotlinconf/theme/Typography.kt

@OptIn(ExperimentalResourceApi::class)
val ArturoFamily: FontFamily
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.arturo_thin,
            weight = FontWeight.W100,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.arturo_extra_light,
            weight = FontWeight.W200,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.arturo_light,
            weight = FontWeight.W300,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.arturo_regular,
            weight = FontWeight.W400,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.arturo_regular,
            weight = FontWeight.W500,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.arturo_regular,
            weight = FontWeight.W600,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.arturo_bold,
            weight = FontWeight.W700,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.arturo_extra_bold,
            weight = FontWeight.W800,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.arturo_heavy,
            weight = FontWeight.W900,
            style = FontStyle.Normal,
        ),
        //Italic
        Font(
            resource = Res.font.arturo_thin_italic,
            weight = FontWeight.W100,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.arturo_extra_light_italic,
            weight = FontWeight.W200,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.arturo_light_italic,
            weight = FontWeight.W300,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.arturo_bold_italic,
            weight = FontWeight.W700,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.arturo_extra_bold_italic,
            weight = FontWeight.W800,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.arturo_heavy_italic,
            weight = FontWeight.W900,
            style = FontStyle.Italic,
        ),
    )

@OptIn(ExperimentalResourceApi::class)
val StyleScriptFamily: FontFamily
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.stylescript_regular,
            weight = FontWeight.W300,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.stylescript_regular,
            weight = FontWeight.W400,
            style = FontStyle.Normal,
        )
    )

@OptIn(ExperimentalResourceApi::class)
val MalibuRingFamily: FontFamily
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.malibu_semiscript, // malibu_ring
            weight = FontWeight.W300,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.malibu_semiscript,
            weight = FontWeight.W400,
            style = FontStyle.Normal,
        )
    )


val MyCustomTypography: Typography
    @Composable
    get() {
        val arturo = ArturoFamily
        return Typography(
            displayLarge = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Large,
                fontSize = TypeScaleTokens.TextSize.DisplayLarge,
                lineHeight = TypeScaleTokens.LineHeight.DisplayLarge,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            displayMedium = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Medium,
                fontSize = TypeScaleTokens.TextSize.DisplayMedium,
                lineHeight = TypeScaleTokens.LineHeight.DisplayMedium,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            displaySmall = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Regular,
                fontSize = TypeScaleTokens.TextSize.DisplaySmall,
                lineHeight = TypeScaleTokens.LineHeight.DisplaySmall,
//                platformStyle = PlatformTextStyle(
//                    includeFontPadding = false
//                ),
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            titleLarge = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Large,
                fontSize = TypeScaleTokens.TextSize.Title1,
                lineHeight = TypeScaleTokens.LineHeight.Title1,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            titleMedium = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Medium,
                fontSize = TypeScaleTokens.TextSize.Title2,
                lineHeight = TypeScaleTokens.LineHeight.Title2,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            titleSmall = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Regular,
                fontSize = TypeScaleTokens.TextSize.Title3,
                lineHeight = TypeScaleTokens.LineHeight.Title3,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            headlineLarge = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Medium,
                fontSize = TypeScaleTokens.TextSize.HeadlineLarge,
                lineHeight = TypeScaleTokens.LineHeight.HeadlineLarge,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            headlineMedium = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Medium,
                fontSize = TypeScaleTokens.TextSize.HeadlineMedium,
                lineHeight = TypeScaleTokens.LineHeight.HeadlineMedium,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            headlineSmall = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Medium,
                fontSize = TypeScaleTokens.TextSize.HeadlineSmall,
                lineHeight = TypeScaleTokens.LineHeight.HeadlineSmall,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            bodyLarge = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Medium,
                fontSize = TypeScaleTokens.TextSize.BodyLarge,
                lineHeight = TypeScaleTokens.LineHeight.BodyLarge,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            bodyMedium = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Medium,
                fontSize = TypeScaleTokens.TextSize.BodyMedium,
                lineHeight = TypeScaleTokens.LineHeight.BodyMedium,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            bodySmall = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Light,
                fontSize = TypeScaleTokens.TextSize.BodySmall,
                lineHeight = TypeScaleTokens.LineHeight.BodySmall,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            labelLarge = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Large,
                fontSize = TypeScaleTokens.TextSize.LabelLarge,
                lineHeight = TypeScaleTokens.LineHeight.LabelLarge,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            labelMedium = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Medium,
                fontSize = TypeScaleTokens.TextSize.LabelMedium,
                lineHeight = TypeScaleTokens.LineHeight.LabelMedium,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
            labelSmall = TextStyle(
                fontFamily = arturo,
                fontWeight = TypeScaleTokens.Weight.Light,
                fontSize = TypeScaleTokens.TextSize.LabelSmall,
                lineHeight = TypeScaleTokens.LineHeight.LabelSmall,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Proportional,
                    trim = LineHeightStyle.Trim.None
                )
            ),
        )
    }

