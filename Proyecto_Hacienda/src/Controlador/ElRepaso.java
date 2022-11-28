
package Controlador;

import java.util.Random;


public class ElRepaso {
    
    public static String n1="";
    public static String siglas= "";
    public static Object selecJornadaR;
    public static String articuloRepaso;
    public static Object articuloJornada="Selecciona una jornada de la lista.";
    public static Object ayudaRepaso="En el apartado 'Repaso' podrás hacer ejercicio de memoria cogiendo una carta con un artículo que hayas estudiado\n"
            + "en alguna de las jornadas que te hemos presentado en el apartado temario.\n"
            + "Para ello primero deberás seleccionar una jornada y posteriormente hacer clic en la baraja de cartas.\n"
            + "Tanto si lo recuerdas como si no, dale al botón 'Solución' para ver que artículo era.";
    
    public static void aleatorioJornada1(){
        Random aleatorio = new Random();
            int num = aleatorio.nextInt(10);    //el número de mensajes posibles
            //String p = null;
//            Font fuente = new Font("Rockwell", Font.BOLD, 15);
//            g.setFont(fuente);
            switch (num) {
                case 0:
                    n1="2";
                    siglas="LGT";
                    articuloJornada="Artículo 2. Concepto, fines y clases de los tributos.\n" +
"1. Los tributos son los ingresos públicos que consisten en prestaciones pecuniarias exigidas por una Administración pública como consecuencia de la realización del supuesto de hecho al que la ley vincula el deber de contribuir, con el fin primordial de obtener los ingresos necesarios para el sostenimiento de los gastos públicos.\n" +
"\n" +
"Los tributos, además de ser medios para obtener los recursos necesarios para el sostenimiento de los gastos públicos, podrán servir como instrumentos de la política económica general y atender a la realización de los principios y fines contenidos en la Constitución.\n" +
"\n" +
"2. Los tributos, cualquiera que sea su denominación, se clasifican en tasas, contribuciones especiales e impuestos:\n" +
"\n" +
"a) Tasas son los tributos cuyo hecho imponible consiste en la utilización privativa o el aprovechamiento especial del dominio público, la prestación de servicios o la realización de actividades en régimen de derecho público que se refieran, afecten o beneficien de modo particular al obligado tributario, cuando los servicios o actividades no sean de solicitud o recepción voluntaria para los obligados tributarios o no se presten o realicen por el sector privado.\n" +
"\n" +
"b) Contribuciones especiales son los tributos cuyo hecho imponible consiste en la obtención por el obligado tributario de un beneficio o de un aumento de valor de sus bienes como consecuencia de la realización de obras públicas o del establecimiento o ampliación de servicios públicos.\n" +
"\n" +
"c) Impuestos son los tributos exigidos sin contraprestación cuyo hecho imponible está constituido por negocios, actos o hechos que ponen de manifiesto la capacidad económica del contribuyente.";
                    break;
                case 1:
                    n1="31";
                    siglas="CE";
                    articuloJornada="Artículo 31\n" +
"1. Todos contribuirán al sostenimiento de los gastos públicos de acuerdo con su capacidad económica mediante un sistema tributario justo inspirado en los principios de igualdad y progresividad que, en ningún caso, tendrá alcance confiscatorio.\n" +
"\n" +
"2. El gasto público realizará una asignación equitativa de los recursos públicos, y su programación y ejecución responderán a los criterios de eficiencia y economía.\n" +
"\n" +
"3. Sólo podrán establecerse prestaciones personales o patrimoniales de carácter público con arreglo a la ley.";
                    break;
                case 2:
                    n1="4";
                    siglas="LGT";
                    articuloJornada="Artículo 4. Potestad tributaria.\n" +
"1. La potestad originaria para establecer tributos corresponde exclusivamente al Estado, mediante ley.\n" +
"\n" +
"2. Las comunidades autónomas y las entidades locales podrán establecer y exigir tributos, de acuerdo con la Constitución y las leyes.\n" +
"\n" +
"3. Las demás entidades de derecho público podrán exigir tributos cuando una ley así lo determine.\n" +
"";
                    break;
                case 3:
                    n1="8";
                    siglas="LGT";
                    articuloJornada="Artículo 8. Reserva de ley tributaria.\n" +
"Se regularán en todo caso por ley:\n" +
"\n" +
"a) La delimitación del hecho imponible, del devengo, de la base imponible y liquidable, la fijación del tipo de gravamen y de los demás elementos directamente determinantes de la cuantía de la deuda tributaria, así como el establecimiento de presunciones que no admitan prueba en contrario.\n" +
"\n" +
"b) Los supuestos que dan lugar al nacimiento de las obligaciones tributarias de realizar pagos a cuenta y su importe máximo.\n" +
"\n" +
"c) La determinación de los obligados tributarios previstos en el apartado 2 del artículo 35 de esta ley y de los responsables.\n" +
"\n" +
"d) El establecimiento, modificación, supresión y prórroga de las exenciones, reducciones, bonificaciones, deducciones y demás beneficios o incentivos fiscales.\n" +
"\n" +
"e) El establecimiento y modificación de los recargos y de la obligación de abonar intereses de demora.\n" +
"\n" +
"f) El establecimiento y modificación de los plazos de prescripción y caducidad, así como de las causas de interrupción del cómputo de los plazos de prescripción.\n" +
"\n" +
"g) El establecimiento y modificación de las infracciones y sanciones tributarias.\n" +
"\n" +
"h) La obligación de presentar declaraciones y autoliquidaciones referidas al cumplimiento de la obligación tributaria principal y la de pagos a cuenta.\n" +
"\n" +
"i) Las consecuencias del incumplimiento de las obligaciones tributarias respecto de la eficacia de los actos o negocios jurídicos.\n" +
"\n" +
"j) Las obligaciones entre particulares resultantes de los tributos.\n" +
"\n" +
"k) La condonación de deudas y sanciones tributarias y la concesión de moratorias y quitas.\n" +
"\n" +
"l) La determinación de los actos susceptibles de reclamación en vía económico-administrativa.\n" +
"\n" +
"m) Los supuestos en que proceda el establecimiento de las intervenciones tributarias de carácter permanente.";
                    break;
                case 4:
                    n1="133";
                    siglas="CE";
                    articuloJornada="Artículo 133\n" +
"1. La potestad originaria para establecer los tributos corresponde exclusivamente al Estado, mediante ley.\n" +
"\n" +
"2. Las Comunidades Autónomas y las Corporaciones locales podrán establecer y exigir tributos, de acuerdo con la Constitución y las leyes.\n" +
"\n" +
"3. Todo beneficio fiscal que afecte a los tributos del Estado deberá establecerse en virtud de ley.\n" +
"\n" +
"4. Las administraciones públicas sólo podrán contraer obligaciones financieras y realizar gastos de acuerdo con las leyes.";
                    break;
                case 5:
                    n1="20";
                    siglas="LGT";
                    articuloJornada="Artículo 20. Hecho imponible.\n" +
"1. El hecho imponible es el presupuesto fijado por la ley para configurar cada tributo y cuya realización origina el nacimiento de la obligación tributaria principal.\n" +
"\n" +
"2. La ley podrá completar la delimitación del hecho imponible mediante la mención de supuestos de no sujeción.";
                    break;
                case 6:
                    n1="50";
                    siglas="LGT";
                    articuloJornada="Jurisprudencia\n" +
"Artículo 50. Base imponible: concepto y métodos de determinación.\n" +
"1. La base imponible es la magnitud dineraria o de otra naturaleza que resulta de la medición o valoración del hecho imponible.\n" +
"\n" +
"2. La base imponible podrá determinarse por los siguientes métodos:\n" +
"\n" +
"a) Estimación directa.\n" +
"\n" +
"b) Estimación objetiva.\n" +
"\n" +
"c) Estimación indirecta.\n" +
"\n" +
"3. Las bases imponibles se determinarán con carácter general a través del método de estimación directa. No obstante, la ley podrá establecer los supuestos en que sea de aplicación el método de estimación objetiva, que tendrá, en todo caso, carácter voluntario para los obligados tributarios.\n" +
"\n" +
"4. La estimación indirecta tendrá carácter subsidiario respecto de los demás métodos de determinación y se aplicará cuando se produzca alguna de las circunstancias previstas en el artículo 53 de esta ley.";
                    break;
                case 7:
                    n1="54";
                    siglas="LGT";
                    articuloJornada="Artículo 54. Base liquidable.\n" +
"La base liquidable es la magnitud resultante de practicar, en su caso, en la base imponible las reducciones establecidas en la ley.";
                    break;
                case 8:
                    n1="55";
                    siglas="LGT";
                    articuloJornada="Artículo 55. Tipo de gravamen.\n" +
"1. El tipo de gravamen es la cifra, coeficiente o porcentaje que se aplica a la base liquidable para obtener como resultado la cuota íntegra.\n" +
"\n" +
"2. Los tipos de gravamen pueden ser específicos o porcentuales, y deberán aplicarse según disponga la ley propia de cada tributo a cada unidad, conjunto de unidades o tramo de la base liquidable.\n" +
"\n" +
"El conjunto de tipos de gravamen aplicables a las distintas unidades o tramos de base liquidable en un tributo se denominará tarifa.\n" +
"\n" +
"3. La ley podrá prever la aplicación de un tipo cero, así como de tipos reducidos o bonificados.";
                    break;
                case 9:
                    n1="56";
                    siglas="LGT";
                    articuloJornada="Artículo 56. Cuota tributaria.\n" +
"1. La cuota íntegra se determinará:\n" +
"\n" +
"a) Aplicando el tipo de gravamen a la base liquidable.\n" +
"\n" +
"b) Según cantidad fija señalada al efecto.\n" +
"\n" +
"2. Para el cálculo de la cuota íntegra podrán utilizarse los métodos de determinación previstos en el apartado 2 del artículo 50 de esta ley.\n" +
"\n" +
"3. La cuota íntegra deberá reducirse de oficio cuando de la aplicación de los tipos de gravamen resulte que a un incremento de la base corresponde una porción de cuota superior a dicho incremento. La reducción deberá comprender al menos dicho exceso.\n" +
"\n" +
"Se exceptúan de esta regla los casos en que la deuda tributaria deba pagarse por medio de efectos timbrados.\n" +
"\n" +
"4. El importe de la cuota íntegra podrá modificarse mediante la aplicación de las reducciones o límites que la ley de cada tributo establezca en cada caso.\n" +
"\n" +
"5. La cuota líquida será el resultado de aplicar sobre la cuota íntegra las deducciones, bonificaciones, adiciones o coeficientes previstos, en su caso, en la ley de cada tributo.\n" +
"\n" +
"6. La cuota diferencial será el resultado de minorar la cuota líquida en el importe de las deducciones, pagos fraccionados, retenciones, ingresos a cuenta y cuotas, conforme a la normativa de cada tributo.";
                    break;
               
            } 
            
            
                
                    
    }
    
}