
package Controlador;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



public class ElTemario {
    
  
   public static void DevolverUrl(String url) throws URISyntaxException{
       if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               try{
                   java.net.URI uri= new java.net.URI(url);
                   desktop.browse(uri);
               } catch (IOException ex) {
                   Logger.getLogger(ElTemario.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
   }
   
public static Object explicacionTemario="Bienvenido al programa de Oposiciones de Agente de Hacienda.\n"
        + "En este apartado podrás ver las diferentes normativas que tendras que estudiar para poder sacar una plaza en dicha oposición.\n"
        +"Pulsando en dichas normativas se te abrirá un enlace que te dirigirá hasta la página web donde se encuentra la normativa seleccionada.\n"
        +"Además en la parte inferior podrás ver un botón con nombre de 'Jornada de estudio' y al lado una lista desplegable para seleccionar una jornada.\n"
        + "Dichas jornadas son para que el opositador que desea tener un programa de estudio pueda realizarlo, cada jornada se te indicará alguna ley o normativa junto a unos artículos\n"
        + " dichos artículos tienen unas siglas al principio que corresponde a la normativa (por ejemplo LGT corresponde a la Ley General Tributaria).\n"
        + "Cada jornada equivale una semana (en caso de que quieras estudiar de forma intensiva) o 3 semana o un mes según el ritmo del estudiante y tiempo que disponga.\n"
        + "En caso de que no lo sepas te indico a continuación cual es la fase de la oposición que estás opositando.\n"
        + "La fase de Oposición constará de dos ejercicios: Un test y un ejercicio práctico."
        + "Dichos ejercicios se explica con más detalle en los apartados: Test y Ejercicio.";
        


public static Object jornada="Selecciona una jornada de la lista.";

public static Object jornada1="1ºJORNADA:\n" +
"-	La Constitución Española.\n" +                
"-	Los tributos: art.2 LGT + 31CE.\n" +
"-	Potestad tributaria: art.4 LGT, 8 LGT + 133 CE, 20 + 50 + 54+ 55 + 56 LGT.\n" +
"-	Elementos básicos de un tributo: 21 + 22 LGT, 51 + 52 +53 LGT.\n" +
"-	Obligados tributarios: 35 LGT.\n" +
"-	Sujeto pasivo - contribuyente y sustituto del contribuyente: 36 LGT.\n" +
"-	Obligados a realizar pagos a cuenta, a realizar pagos fraccionados, retenedores /obligados a realizar ingresos a cuenta: 37 LGT.\n" +
"-	Obligados en las obligaciones entre particulares resultantes del tributo: 38 LGT.\n" +
"-	Sucesores de personas físicas: 39 LGT.\n" +
"-	Procedimiento para exigir deuda a los sucesores de personas físicas y jurídicas: 177 LGT + 127 RGR.\n" +
"-	Sucesores de personas jurídicas: 40 LGT.\n" +
"-	Responsabilidad: 41 LGT.\n" +
"-	Responsables solidarios: 42 LGT + 35.4 LGT + 175.2 LGT + 125 RGR.\n" +
"-	Responsables subsidiarios: 43 LGT + 79 LGT + 126 RGR.\n" +
"-	Procedimiento frente a responsables: 174-176LGT + 124 RGR.\n" +
"-	Relación jurídica tributaria: 17 LGT.\n" +
"-	Obligaciones materiales del obligado tributario: 19 LGT + 23 LGT + 26-28 LGT + 58LGT + 87 RGAT + 161 LGT.\n" +
"-	Obligaciones formales: 29 LGT.\n" +
"-	Obligaciones derivadas de la normativa del tributo: 31 LGT.\n" +
"-	Procedimiento de devolución iniciado mediante autoliquidación: 124-127 LGT + 122-125 RGAT.\n" +
"-	Devolución de ingresos indebidos: 14-16 RRVA.\n" +
"-	Procedimiento de devolución de ingresos indebidos: 221 LGT + 17-19 RRVA.\n" +
"-	Reembolso del coste de las garantías: 33 LGT + 72-74 RRVA.\n" +
"-	Procedimiento para el reembolso del coste de las garantías: 75-79 RRVA.\n" +
"-	Capacidad de obrar: 44 LGT.\n" +
"-	Representación legal: 45 LGT +110 RGAT.\n" +
"-	Representación voluntaria: 46 LGT +111 RGAT.\n" +
"-	Representación de persona o entidades no residentes: 47 LGT.\n" +
"-	Representación: 112 RGAT.\n" +
"-	Domicilio fiscal: 48 LGT.\n" +
"-	Cambio de domicilio fiscal: 48.3 LGT + 17 RGAT + 59 RGAT + 20 RSAN.\n" +
"-	Procedimiento de comprobación del domicilio fiscal: 48.4 LGT + 148-152 RGAT.\n" +
"-	Notificaciones: 109-112 LGT + 114-115 bis RGAT + 14 y 43 L39/2015.\n" +
"-	Derechos y garantías de los obligados tributarios: 34 LGT + 15 L39/2015 + 93 RGAT + 60.2 RGAT + 99.2 y 3 LGT + 70-76 RGAT + 95 RGAT + 95 bis LGT + 142.3 LGT.\n" +
"-	Actuaciones de información: 86 LGT + 63-64 RGAT.\n" +
"-	Consultas tributarias escritas: 88-89 LGT + 66-68 RGAT.\n" +
"-	Actuaciones previas de valoración: 90 LGT + 69 RGAT + 91 LGT.\n" +
"-	Información y asistencia: 77-78 RGAT.\n" +
"-	Colaboración social: 92 LGT.\n" +
"-	Utilización de tecnologías informáticas y telemáticas: 96 LGT + 82-86 RGAT.";

public static Object jornada2="2ºJORNADA:\n" +
"-	Normas comunes sobre actuaciones y procedimientos tributarios: 97 LGT.\n" +
"-	Fases del procedimiento: \n" +
"•	Inicio: 98 LGT + 87-89 RGAT \n" +
"•	Desarrollo: 99 LGT + 97-100 RGAT \n" +
"•	(Domicilio constitucionalmente: 113 LGT + 90 RGAT) + 91-92 RGAT \n" +
"•	terminación: 100 LGT + 101 RGAT.\n" +
"-	Obligación de resolver: 103 LGT.\n" +
"-	Plazos de resolución: 104 LGT + 102-104 RGAT.\n" +
"-	Cómputo de plazos: 30-31 L39/2015.\n" +
"-	Liquidaciones tributarias: 101 LGT + 190 RGAT.\n" +
"-	La prueba: 105-107 LGT.\n" +


"-	Funciones de gestión tributaria: 117 LGT.\n" +
"-	Personas con las que deben entenderse las actuaciones: 105-112 RGAT.\n" +
"-	Procedimiento de devolución: 124-127 LGT + 122-125 RGAT.\n" +
"-	Procedimiento iniciado mediante declaración: 128-130 LGT + 133-135 RGAT.\n" +
"-	Medios de valoración: 57 LGT + 158 RGAT.\n" +
"-	Procedimiento de comprobación de valores: 134 LGT + 160 RGAT.\n" +
"-	Tasación pericial contradictoria: 135 LGT + 161-162 RGAT.\n" +


"-	Procedimiento de verificación de datos: 131-133 LGT + 155-156 RGAT.\n" +
"-	Procedimiento de comprobación limitada: 136-140 LGT + 163-165 RGAT.";

public static Object jornada3="3ºJORNADA:\n" +
"-	Obligaciones tributarias formales: 17 LGT + 29 LGT.\n" +
"-	Censos tributarios: 2-4 RGAT.\n" +
"-	Censo de empresarios, profesionales y retenedores (CEPR): 3.2 RGAT + 5 RGAT.\n" +
"-	Registro de operadores intracomunitarios (ROI): 3.3 RGAT.\n" +
"-	Registro de devolución mensual (REDEME): 3.4 RGAT.\n" +
"-	Suministro inmediato de información (SII): Orden HFP/417/2017.\n" +
"-	Registro de grandes empresas: 3.5 RGAT.\n" +
"-	Delegación Central de Grandes Contribuyentes: Orden EHA/3230/2005. \n" +
"-	Declaraciones censales: 9 - 11 RGAT  \n" +
"-	Exclusión de otras declaraciones censales: 14 RGAT.\n" +
"-	Sustitución de las declaraciones censales por el documento único electrónico (DUE): 15 RGAT.\n" +
"-	Actuaciones de comprobación censal: 16 RGAT + 144 RGAT.\n" +
"-	Procedimiento de rectificación censal: 145 RGAT.\n" +
"-	Rectificación de oficio de la situación censal: 146 RGAT.\n" +
"-	Obligación de disponer de un NIF: 18 RGAT.\n" +
"-	Asignación del NIF a personas físicas: 19-21 RGAT.\n" +
"-	El NIF de las personas jurídicas y entidades sin personalidad jurídica: 22-24 RGAT.\n" +
"-	Utilización del NIF: 26-28 RGAT + Disposición Adicional 6º LGT.\n" +
"-	Revocación del NIF: 147 RGAT.\n" +
"-	Rehabilitación del NIF: 147.8 RGAT.\n" +

"-	Obligaciones tributarias formales: 29 c LGT + 121 LGT.\n" +
"-	Concepto de declaración tributaria: 119 LGT.\n" +
"-	Declaración complementaria y sustitutiva: 122 LGT + 118 RGAT.\n" +
"-	Obligaciones de información: 93-94 LGT + 30 RGAT.\n" +
"-	Obtención de información con carácter general: 93-94 LGT + 30.2 RGAT.\n" +
"-	Información de operaciones con terceras personas (modelo 347): 93-94 LGT + 31-35 RGAT.\n" +
"-	Obligación de informar acerca de cuentas en entidades de crédito (modelo 126, 1 al 20 mes siguiente fin del trimestre, y 196, 1 al 31 de enero año siguiente): 37 RGAT.\n" +
"-	Obligación de informar acerca de cuentas financieras en el ámbito de la asistencia mutua (modelo 289, 1 de enero al 31 mayo): 37 bis RGAT.\n" +
"-	Obligación de informar acerca de préstamos y créditos y de movimientos de efectivo (modelo 181 y 171, 1 a 31 enero): 38 RGAT.\n" +
"-	Obligación de informar acerca de cobros efectuados mediante tarjetas de crédito o débito (modelo 170, 1 al 28 febrero): 38 bis RGAT.\n" +
"-	Obligación de informar acerca de valores, seguros y rentas (modelo 189, 1 al 31 marzo): 39 RGAT.\n" +
"-	Obligación de informar sobre los titulares de cuentas u otras operaciones que no hayan facilitado el NIF (modelo 195, dentro del mes siguiente a cada trimestre natural): 40 RGAT.\n" +
"-	Obligación de informar acerca del libramiento de cheques por parte de las entidades de crédito (modelo 199, 1 al 20 de febrero): 41 RGAT.\n" +
"-	Obligación de informar sobre determinadas operaciones con activos financieros (modelo 198, 1 al 31 de enero): 42 RGAT.\n" +
"-	Obligación de informar sobre determinados activos situados en el extranjero (modelo 720, 1 de enero al 31 de marzo):  42 bis, 42 ter y 54 bis RGAT.\n" +
"-	Actuaciones de control de presentación de declaraciones: 153-154 RGAT.\n" +
"-	Requerimientos individualizados: 93-94 LGT + 30.3 RGAT + 55- 57 RGAT.\n" +
"-	Concepto de autoliquidación: 120 LGT.\n" +
"-	Rectificación de una autoliquidación: 120.3 LGT + 126-129 RGAT.\n" +
"-	Autoliquidación complementaria: 122.2 LGT + 119 RGAT.\n" +
"-	Pérdidas de beneficios fiscales: 122.2 LGT.\n" +


"-	Obligaciones tributarias formales: 29 LGT + 27 C. Comercio.\n" +
"-	Obligación de llevar y conservar los libros registro de carácter fiscal: 29 RGAT.\n" +
"-	Obligación de expedir, entregar y conservar facturas: 29 e LGT + Real Decreto 1619/2012 + 29 f LGT + 93 LGT + 29 g y h LGT + 206 LGT.\n" +
"-	Obligados a retener o ingresar a cuenta: 76 RIRPF + 101 LIRPF + 75 RIRPF + 80-101 RIRPF.\n" +
"-	Reglas de valoración para las rentas en especie: 43 LIRPF + 103 y 105 RIRPF.\n" +
"-	Rentas no sujetas a retención: 75.3 RIRPF.\n" +
"-	Pagos fraccionados en IRPF: 101.11 LIRPF + 109-111 RIRPF.";
}

    
        
        
        
       
        
        
      
    
    

