# isa2024-healtcalc
Health calculator
# Casos de prueba para la calculadora

## Tests para el método *idealBodyWeight(int height, char gender): float*:

### · Test de entrada de altura negativa: En el caso de especificar una entrada de altura negativa, se espera un error saltando una excepción.

### · Test de entrada de género erróneo: En el caso de especificar una entrada de género diferente a las esperadas "H" o "M", se espera un error saltando una excepción.

### · Test de entrada de altura mínima: En el caso de especificar una entrada de altura inferior a 0.5m, se espera un error saltando una excepción.

### · Test de entrada de altura máxima: En el caso de especificar una entrada de altura superior a 2.72m, se espera un error saltando una excepción.

### · Test de uso estándar en hombres: En el caso de especificar entradas estándares con el género masculino, se espera evaluar el resultado.

### · Test de uso estándar en mujeres: En el caso de especificar entradas estándares con el género femenino, se espera evaluar el resultado.

## Test para el método *basalMetabolicRate(float weight, int height, char gender): float*:

### · Test de entrada de peso negativo: En el caso de especificar una entrada de peso inferior a 0, se espera un error saltando una excepción.

### · Test de entrada de peso mínimo: En el caso de especificar una entrada de peso inferior a 15kg, se espera un error saltando una excepción.

### · Test de entrada de peso máximo: En el caso de especificar una entrada de peso superior a 500kg, se espera un error saltando una excepción.

### · Test de entrada de altura negativa: En el caso de especificar una entrada de altura negativa, se espera un error saltando una excepción.

### · Test de entrada de altura mínima: En el caso de especificar una entrada de altura inferior a 0.5m, se espera un error saltando una excepción.

### · Test de entrada de altura máxima: En el caso de especificar una entrada de altura superior a 2.72m, se espera un error saltando una excepción.

### · Test de entrada de género erróneo: En el caso de especificar una entrada de género diferente a las esperadas "H" o "M", se espera un error saltando una excepción.

### · Test de uso estándar en hombres: En el caso de especificar entradas estándares con el género masculino, se espera evaluar el resultado.

### · Test de uso estándar en mujeres: En el caso de especificar entradas estándares con el género femenino, se espera evaluar el resultado.

### · Test de edad errónea: En el caso de especificar una entrada de edad inferior a 0 o superior a 100, se espera un error saltando una excepción.

## Captura de pantalla del resultado de ejecutar los tests

###

![Casos de prueba pasados](Casosdeprueba.jpg)

## Captura de pantalla del registro de instantáneas (commits) que he ido realizando durante el desarrollo de la práctica:

###     

![Commits](Commits.jpg)

# Práctica 3

Historias de usuario:

· Cálculo del peso ideal de una persona:

Como usuario de la calculadora de salud, quiero poder calcular el peso ideal de una persona para ayudar a establecer objetivos de peso saludables.

- Criterios de aceptación:

Se deben proporcionar dos opciones para seleccionar el género: masculino y femenino.

El usuario debe poder ingresar la altura de la persona en centímetros.

Al presionar el botón de calcular, la calculadora debe mostrar el peso ideal de la persona en kilogramos con dos decimales de precisión.

El cálculo del peso ideal debe basarse en la fórmula de Lorentz para hombres y mujeres.

- Escenario 1: Calculando el peso ideal para una persona de sexo masculino.

Dado que ingreso la altura de la persona como 175 cm.

Cuando selecciono el género masculino y presiono el botón de calcular.

Entonces la calculadora muestra que el peso ideal para la persona es de aproximadamente 68.75 kg.

- Escenario 2: Calculando el peso ideal para una persona de sexo femenino.

Dado que ingreso la altura de la persona como 155 cm.

Cuando selecciono el género femenino y presiono el botón de calcular.

Entonces la calculadora muestra que el peso ideal para la persona es de aproximadamente 53 kg.

· Cálculo de la tasa metabólica basal de una persona:

Como usuario de la calculadora de salud, quiero poder calcular la tasa metabólica basal (TMB) de una persona para estimar sus necesidades calóricas diarias.

- Criterios de aceptación:

Se debe proporcionar una opción para seleccionar el género: masculino o femenino.

El usuario debe poder ingresar la edad de la persona en años, el peso en kilogramos y la altura en centímetros.

Al presionar el botón de calcular TMB, la calculadora debe mostrar la tasa metabólica basal (TMB) de la persona en kilocalorías por día (kcal/día) con dos decimales de precisión.

El cálculo de la TMB debe basarse en la fórmula específica para hombres y mujeres según los estándares de salud.

- Escenario 1: Calculando la TMB para una persona de 80 años de edad, 90 kg de peso, 167 cm de altura y sexo masculino.

Dado que ingreso la edad de la persona como 80 años, el peso como 90 kg y la altura como 167 cm.

Cuando selecciono el género masculino y presiono el botón de calcular TMB.

Entonces la calculadora muestra que la TMB para la persona es de aproximadamente 1548.75 kcal/día.

- Escenario 2: Calculando la TMB para una persona de 25 años de edad, 60 kg de peso, 150 cm de altura y sexo femenino.

Dado que ingreso la edad de la persona como 25 años, el peso como 60 kg y la altura como 150 cm.

Cuando selecciono el género femenino y presiono el botón de calcular TMB.

Entonces la calculadora muestra que la TMB para la persona es de aproximadamente 1351.50 kcal/día.