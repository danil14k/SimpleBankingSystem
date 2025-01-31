# Problemas con el código 

1.Responsabilidad única: El método calcularFactura está haciendo demasiado: asigna valores, realiza cálculos y muestra los resultados. Idealmente, cada parte del proceso debería estar separada.
2.Dificultad de mantenimiento: Si más tarde necesitas cambiar cómo se calcula el impuesto o cómo se muestran los resultados, tendrías que modificar un único método que tiene muchas responsabilidades.
3.Reusabilidad: El código de cálculo de impuestos o el cálculo del total no se puede reutilizar fácilmente en otras clases o métodos.

# Refactorización:
La refactorización consistirá en dividir las responsabilidades en métodos más pequeños, que sean más fáciles de entender, probar y modificar.

## Explicación de la refactorización:
Métodos pequeños y enfocados: Ahora, cada método tiene una única responsabilidad:

establecerSubtotal(): Establece el valor del subtotal.

calcularImpuestos(): Calcula los impuestos en función de un porcentaje.

calcularTotal(): Calcula el total de la factura.

mostrarFactura(): Muestra la factura final.

1. Código más claro y comprensible: El código ahora es más legible porque las responsabilidades están divididas en métodos más pequeños. Cada uno de esos métodos es fácil de entender y modificar por separado.

2. Reusabilidad: Ahora, si en algún momento quieres usar el cálculo de impuestos en otra parte de tu código, puedes llamar solo a calcularImpuestos(), sin necesidad de duplicar código.

3. Facilidad de prueba: Ahora es mucho más fácil probar cada parte del código por separado. Si necesitas probar el cálculo de impuestos, puedes hacerlo sin preocuparte de otros cálculos.