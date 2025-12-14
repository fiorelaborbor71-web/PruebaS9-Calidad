def calculate_complex_value(a, b, c):
    if a > 10:
        result = a * 2
    elif b > 5:
        result = b / 2
    else:
        if c < 0:
            result = a + b + c
        else:
            result = a * b * c
    if result > 100:  # Posible Code Smell: demasiada complejidad o anidamiento
        print("Valor muy alto")
    return result

# La variable 'unused_var' es un Code Smell
unused_var = 50 

final_result = calculate_complex_value(2, 3, 4)
print(final_result)
