package com.abrothers.medwallet.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abrothers.medwallet.R
import com.abrothers.medwallet.Screen
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccountScreen(navController: NavController) {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var name by remember {
        mutableStateOf("")
    }

    var acceptTerms by remember {
        mutableStateOf(false)
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.primary) {
        Column(
            Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // TODO: Change image in the future, this is just a placeholder
            Image(
                painter = painterResource(id = R.drawable.ic__793766328_main),
                contentDescription = "App Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(1.5f)
            )

            Card(
                modifier = Modifier
                    .weight(2f)
                    .padding(8.dp), shape = RoundedCornerShape(32.dp)
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = stringResource(R.string.create_account),
                        fontWeight = FontWeight.Bold,
                        fontSize = 32.sp
                    )

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {

                        TextField(
                            label = { Text(text = stringResource(R.string.email)) },
                            value = email,
                            onValueChange = { email = it }
                        )

                        TextField(
                            label = { Text(text = stringResource(R.string.first_and_last_name)) },
                            value = name,
                            onValueChange = { name = it }
                        )

                        TextField(
                            label = { Text(text = stringResource(R.string.password)) },
                            value = password,
                            onValueChange = { password = it },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Password,
                                imeAction = ImeAction.Done
                            ),
                            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                            trailingIcon = {
                                IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                                    Icon(
                                        imageVector = if (isPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                                        contentDescription = stringResource(R.string.password_toggle)
                                    )
                                }
                            }
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Checkbox(
                                checked = acceptTerms,
                                onCheckedChange = { acceptTerms = it }
                            )
                            Text(
                                text = stringResource(R.string.terms_and_conditions),
                                style = MaterialTheme.typography.bodyLarge,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }

                        Button(onClick = { navController.navigate(Screen.Home.route) }, modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = stringResource(R.string.create_account).uppercase(Locale.getDefault())
                            )
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CreateAccountScreenPreview() {
    CreateAccountScreen(navController = rememberNavController())
}