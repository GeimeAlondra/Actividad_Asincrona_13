package com.example.catalogofruta

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val imgFruta  = findViewById<ImageView>(R.id.imgFrutaDetalle)
        val txtTitulo = findViewById<TextView>(R.id.txtTituloFruta)
        val txtDesc   = findViewById<TextView>(R.id.txtDescripcionFruta)

        val clave = intent.getStringExtra("FRUTA_CLAVE")

        when (clave) {
            "bananas" -> {
                imgFruta.setImageResource(R.drawable.bananas)
                txtTitulo.text = "Bananas"
                txtDesc.text = "La banana es una fruta tropical rica en potasio y vitamina B6. " +
                        "Es fuente de energía rápida, ideal para deportistas y estudiantes. " +
                        "Su consumo regular ayuda a regular la presión arterial, mejorar " +
                        "el estado de ánimo gracias al triptófano, y favorecer la digestión " +
                        "por su contenido en fibra soluble."
            }
            "cerezas" -> {
                imgFruta.setImageResource(R.drawable.cerezas)
                txtTitulo.text = "Cerezas"
                txtDesc.text = "Las cerezas son pequeñas frutas de color rojo intenso con " +
                        "propiedades antiinflamatorias y antioxidantes. Son ricas en vitamina C, " +
                        "melatonina y antocianinas. Ayudan a combatir el insomnio, reducir el " +
                        "ácido úrico y proteger el corazón. Se consumen frescas, en jugos o " +
                        "como ingrediente en repostería."
            }
            "frambuesas" -> {
                imgFruta.setImageResource(R.drawable.frambuesas)
                txtTitulo.text = "Frambuesas"
                txtDesc.text = "Las frambuesas son frutos del bosque de sabor agridulce, " +
                        "ricas en fibra, vitamina C y antioxidantes como las antocianinas. " +
                        "Contribuyen a la salud cardiovascular, al control del peso y a la " +
                        "prevención del envejecimiento celular. Son populares en batidos, " +
                        "mermeladas y postres."
            }
            "fresas" -> {
                imgFruta.setImageResource(R.drawable.fresas)
                txtTitulo.text = "Fresas"
                txtDesc.text = "Las fresas son frutas bajas en calorías y ricas en vitamina C, " +
                        "folato y antioxidantes. Tienen efectos beneficiosos sobre la salud " +
                        "cardiovascular, la piel y el sistema inmune. Su color rojo brillante " +
                        "se debe a los flavonoides que contienen. Son ampliamente usadas en " +
                        "jugos, postres y ensaladas."
            }
            "kiwis" -> {
                imgFruta.setImageResource(R.drawable.kiwis)
                txtTitulo.text = "Kiwis"
                txtDesc.text = "El kiwi es una fruta originaria de China con un altísimo " +
                        "contenido de vitamina C, superior incluso al de la naranja. " +
                        "También aporta vitamina K, potasio y fibra. Favorece la digestión, " +
                        "fortalece el sistema inmunológico y tiene propiedades anticoagulantes " +
                        "naturales. Su sabor es dulce y ligeramente ácido."
            }
            "mangos" -> {
                imgFruta.setImageResource(R.drawable.mangos)
                txtTitulo.text = "Mangos"
                txtDesc.text = "El mango es conocido como el rey de las frutas tropicales. " +
                        "Es rico en vitaminas A, C y B6, además de fibra y antioxidantes. " +
                        "Favorece la vista, mejora la digestión y fortalece el sistema inmune. " +
                        "Su pulpa jugosa y dulce lo hace ideal para jugos, ensaladas de " +
                        "frutas y platos agridulces."
            }
            "manzanas" -> {
                imgFruta.setImageResource(R.drawable.manzanas)
                txtTitulo.text = "Manzanas"
                txtDesc.text = "La manzana es una de las frutas más consumidas del mundo. " +
                        "Rica en fibra soluble (pectina), vitamina C y antioxidantes. " +
                        "Ayuda a reducir el colesterol, mejorar la digestión y controlar " +
                        "el azúcar en sangre. Existen más de 7,500 variedades. El dicho " +
                        "'una manzana al día mantiene al médico en lejanía' tiene fundamento."
            }
            "melon" -> {
                imgFruta.setImageResource(R.drawable.melon)
                txtTitulo.text = "Melón"
                txtDesc.text = "El melón es una fruta refrescante con alto contenido de agua, " +
                        "ideal para la hidratación en climas cálidos. Es rico en vitaminas A " +
                        "y C, potasio y betacarotenos. Tiene propiedades diuréticas y " +
                        "antioxidantes. Su sabor dulce y suave lo hace perfecto para " +
                        "ensaladas, jugos y postres veraniegos."
            }
            "naranjas" -> {
                imgFruta.setImageResource(R.drawable.naranjas)
                txtTitulo.text = "Naranjas"
                txtDesc.text = "La naranja es la fruta cítrica más popular del mundo. " +
                        "Una sola naranja cubre el 100% de la dosis diaria recomendada de " +
                        "vitamina C. Sus flavonoides protegen el corazón y tienen efectos " +
                        "antiinflamatorios. También aporta folato, potasio y fibra, " +
                        "beneficiando la piel, el sistema inmune y la digestión."
            }
            "pera" -> {
                imgFruta.setImageResource(R.drawable.pera)
                txtTitulo.text = "Pera"
                txtDesc.text = "La pera es una fruta suave y jugosa con alto contenido " +
                        "de fibra, vitamina C y vitamina K. Es una de las frutas con " +
                        "menor índice glucémico, ideal para personas con diabetes. " +
                        "Sus antioxidantes ayudan a combatir la inflamación y proteger " +
                        "contra enfermedades crónicas. Existen más de 3,000 variedades."
            }
            "pina" -> {
                imgFruta.setImageResource(R.drawable.pina)
                txtTitulo.text = "Piña"
                txtDesc.text = "La piña contiene bromelina, una enzima única que facilita " +
                        "la digestión de proteínas y tiene propiedades antiinflamatorias. " +
                        "Es rica en vitamina C, manganeso y fibra. Ayuda a fortalecer " +
                        "los huesos, mejorar la cicatrización y reducir la inflamación. " +
                        "Es originaria de Sudamérica y símbolo de hospitalidad."
            }
            "sandia" -> {
                imgFruta.setImageResource(R.drawable.sandia)
                txtTitulo.text = "Sandía"
                txtDesc.text = "La sandía está compuesta en un 92% de agua, siendo una " +
                        "de las frutas más hidratantes. Contiene licopeno, un potente " +
                        "antioxidante que protege el corazón y reduce el riesgo de ciertos " +
                        "cánceres. También aporta vitaminas A y C. Es baja en calorías " +
                        "y perfecta para el verano."
            }
            "uvas" -> {
                imgFruta.setImageResource(R.drawable.uvas)
                txtTitulo.text = "Uvas"
                txtDesc.text = "Las uvas contienen resveratrol, un antioxidante que protege " +
                        "el corazón y tiene propiedades antiinflamatorias. Son ricas en " +
                        "vitaminas C y K, y en flavonoides. Se consumen frescas, en jugos, " +
                        "pasas o vino. Ayudan a mejorar la circulación, proteger el cerebro " +
                        "y reducir el colesterol malo."
            }
            "zarzamora" -> {
                imgFruta.setImageResource(R.drawable.zarzamora)
                txtTitulo.text = "Zarzamora"
                txtDesc.text = "Las zarzamoras son frutos silvestres de color negro-morado, " +
                        "cargados de antocianinas y vitamina C. Tienen uno de los niveles " +
                        "más altos de antioxidantes entre todas las frutas. Contribuyen a " +
                        "la salud cerebral, la memoria y la protección cardiovascular. " +
                        "Son deliciosas en mermeladas, batidos y postres."
            }
            else -> {
                txtTitulo.text = "Fruta no encontrada"
                txtDesc.text = "No se encontró información para esta fruta."
            }
        }
    }
}