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
