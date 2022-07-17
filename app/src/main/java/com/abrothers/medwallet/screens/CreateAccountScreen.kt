package com.abrothers.medwallet.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abrothers.medwallet.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccountScreen(navController: NavController) {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    var firstName by remember {
        mutableStateOf("")
    }

    var lastName by remember {
        mutableStateOf("")
    }

    val isFormValid by derivedStateOf {
        firstName.isNotBlank() &&
                lastName.isNotBlank() &&
                email.isNotBlank()
                    .and(android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) &&
                password.isNotBlank().and(password.length >= 8)
    }

    Text(
        text = stringResource(R.string.create_account),
        modifier = Modifier.padding( vertical = 18.dp).fillMaxWidth(),
        fontSize = MaterialTheme.typography.titleLarge.fontSize,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary
    )

    Column(
        Modifier
            .fillMaxSize()
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextField(
                value = firstName,
                onValueChange = { firstName = it },
                label = { Text(text = stringResource(R.string.first_name)) })

            TextField(
                value = lastName,
                onValueChange = { lastName = it },
                label = { Text(text = stringResource(R.string.last_name)) })
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = stringResource(R.string.email)) },
            isError = !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                    Icon(
                        imageVector = if (isPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                        contentDescription = stringResource(R.string.password_toggle)
                    )
                }
            },
            label = { Text(text = stringResource(R.string.password)) }, isError = password.length < 8
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /*TODO*/ }, enabled = isFormValid) {
            Text(text = stringResource(R.string.create_account).uppercase())
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CreateAccountScreenPreview() {
    CreateAccountScreen(navController = rememberNavController())
}