### Comparación de eficiencia: IntArrayList vs IntVector

Tanto `IntArrayList` como `IntVector` son listas dinámicas de número enteros (integer) que aumentan su capacidad 
cuando están llenas, pero lo hacen de forma diferente:

- `IntArrayList` incrementa su tamaño en un **50%** cada vez que se llena.
- `IntVector` **duplica** su tamaño cuando se llena.

#### 🧠 ¿Cuándo es más eficiente usar `IntArrayList`?

Usa `IntArrayList` cuando:
- Esperas añadir una cantidad moderada de elementos.
- Quieres ahorrar memoria creciendo poco a poco.
- Te importa más la eficiencia en espacio que la velocidad.

**Ejemplo**: Una lista que almacena valoraciones de usuarios en una aplicación pequeña, donde el crecimiento es lento y la memoria es limitada.

#### ⚡ ¿Cuándo es más eficiente usar `IntVector`?

Usa `IntVector` cuando:
- Esperas añadir una gran cantidad de elementos rápidamente.
- Quieres minimizar el número de redimensionamientos.
- Te importa más el rendimiento que el uso de memoria.

**Ejemplo**: Análisis de datos financieros, en los que se procesan miles de datos rápidamente y necesitas que el 
array crezca sin frenar el rendimiento.
