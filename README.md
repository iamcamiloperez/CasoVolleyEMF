# Metalenguajes

Los metalenguajes hacen referencia a lenguajes que pueden ser definidos por un modelo o un metamodelo 

-- Un modelo se expresa en un lenguaje 

-- Un lenguaje se define por un metamodelo

-- Un metamodelo se expresa en un metalenguaje


metalenguaje = meta-metamodelo

meta-metalenguaje = meta-meta-metamodelo


Los lenguajes de programación son un conjunto finito o infinito de sentencias. Los lenguajes de programación con un número
de sentencias finito se pueden especificar exhaustivamente enumerando todas sus sentencias. Sin embargo, para los lenguajes con un
número de sentencias infinito ésto no es posible, pues los medios que tenemos para describirlo son finitos. El medio habitual para
describir un lenguaje es su gramática, pero las gramáticas que se utilizan en los lenguajes de programación necesitan una modelización
metamatemática que haga factible su implementación en los compiladores. 

Los metalenguajes son herramientas para la descripción formal de los lenguajes, facilitando no sólo la comprensión del
lenguaje, sino también el desarrollo del compilador correspondiente. Ejemplos: las expresiones regulares que describen los componentes
léxicos del lenguaje; las notaciones BNF, EBNF y los diagramas sintácticos que describen la sintaxis de los lenguajes.


# Metalenguaje BNF
La notación BNF (Backus-Naur Form)
John Backus participó en la creación del primer lenguaje de alto nivel, el lenguaje FORTRAN, y posteriormente participó a
principios de los años 60 en el desarrollo del lenguaje ALGOL, que utilizó por primera vez la forma BNF.

La notación BNF utiliza los siguientes metasímbolos

> < > encierra conceptos definidos o por definir. Se utiliza para los símbolos no terminales.

> ::= sirve para definir o indicar equivalencia

> | separa las distintas alternativas

> " " Indica que el metasímbolo que aparece entre comillas es un carácter que forma parte de la sintaxis del lenguaje

> ( ) Se permite el uso del paréntesis para hacer agrupaciones


Existen símbolos con entidad propia llamados símbolos terminales. También existen otros que se deben de definir y se denominan
no terminales.

### Ejemplo: Definición de un identificador

```sh
<ident> ::= <letra> | <ident> <letra> | <ident> <digito>

<letra> ::= a | b | c | ... | y | z

<digito> ::= 0 | 1 | 2 | ... | 8 | 9

```
En este caso a, b, c, ..., y, z y 0, 1, 2,...9 son los símbolos terminales, y el resto los símbolos no terminales. Puede observarse que se ha definido identificador de una manera recursiva.


# Anexo CasoVolleyEMF
Desarrollo de tutorial EMF y aplicación de Eclipse Modeling Framework (EMF) en el caso Volley

![alt text](https://github.com/iamcamiloperez/CasoVolleyEMF/blob/master/CasoVolleyEMF.png)
