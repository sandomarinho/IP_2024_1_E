
# Números Primos

	Um número primo é um número natural maior que um, que só é divisível por um e por ele mesmo.
	Por exemplo, 2, 3, 5, 7 são primos. O número 6 não é primo, pois é divisível por 2 e por 3.

	A seguir uma lista com os 100 primeiros números primos:

	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 
	61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 
	131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 
	193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 
	263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 
	337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 
	409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 
	479, 487, 491, 499, 503, 509, 521, 523, 541, 547.

## Exemplos de Decomposição em Fatores Primos

### Exemplo1:

**Para decompor o número 1600**

Iniciamos divindo o número pelo menor número primo 2 e enquanto o resto da divisão for zero continuo dividindo por 2.
- 1600 | 2
-  800 | 2
-  400 | 2
-  200 | 2
-  100 | 2
-   50 | 2   
-   25 | 5    <<<***25 dividido por 2 é 12,5 neste caso, o resto da divisão é maior que 0,então devo tentar a divisão pelo próximo número primo que é 3, dividindo 25 por 3 o resultado é 8,33, ou seja, o resto da divisão também é maior que 0, então devo tentar dividir pelo próximo número primo que é 5, assim 25 dividido por 5 é 5, neste caso, não teve resto da divisão***>>>
-    5 | 5   <<<***se eu tentar dividir 5 por 5 também não sobra resto na divisão***>>>
-    1       <<<***Aqui então finaliza o processo de decomposição, pois chegamos no resultado = 1***>>>
	   

### Exemplo2:

**Para decompor o número 180**

Iniciamos divindo o número pelo menor número primo 2
Enquanto o resto da divisão for zero continuo dividindo por 2.

- 180 | 2
-  90 | 2 
-  45 | 3  <<<***45 dividido por 2 é 22,5, neste caso, o resto da divisão é maior que zero então devo tentar dividir pelo próximo número primo 3. 45 dividio por 3 é 15, então não tivemos resto na divisão***>>>
-  15 | 3 
-   5 | 5   <<<***5 dividido por 3 é 1,6 sendo assim, o resto dessa divisão é maior que zero, então tento dividir pelo próximo número primo que é 5, como 5 divido por 5 é 1 o resto da divisão é 0***>>>
-   1	   <<<***Aqui finaliza o processo de decomposição, pois chegamos no resultado = 1***>>>

----------
