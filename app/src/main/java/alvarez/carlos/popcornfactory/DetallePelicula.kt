package alvarez.carlos.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)
        val bundle = intent.extras

        var iv_pelicula_img: ImageView = findViewById(R.id.iv_pelicula_img)
        var tv_titulo_detalle_pelicula: TextView = findViewById(R.id.tv_titulo_detalle_pelicula)
        var tv_descripcion_pelicula: TextView = findViewById(R.id.tv_descripcion_pelicula)
        if(bundle != null){
            iv_pelicula_img.setImageResource(bundle.getInt("header"))
            tv_titulo_detalle_pelicula.setText(bundle.getString("nombre"))
            tv_descripcion_pelicula.setText(bundle.getString("sinopsis"))
        }
    }
}