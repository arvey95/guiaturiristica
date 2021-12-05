package com.example.guiaboyaca;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.guiaboyaca.datos.Producto;
import com.google.android.gms.maps.model.LatLng;


import java.util.ArrayList;


public class ListFragment extends Fragment {


    ArrayList<Producto> Lugares;

    public ListFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Lugares = new ArrayList<>();

        Producto titulon = new Producto();
        titulon.setImage(R.drawable.nobsa);
        titulon.setTitulo("Nobsa");
        titulon.setDesc("Nobsa es un municipio de origen chicha del departamento de Boyacá, situado en el centro-oriente de Colombia, en la región del Alto Chicamocha.  Pertenece a la provincia del Sugamuxi. Fundada en 1593 y declarado municipio en 1811. Se encuentra a 3 horas de Bogota.  \n");
        titulon.setLatLng(new LatLng(5.770595601221457, -72.93993891059718));
        Lugares.add(titulon);


        Producto producto = new Producto();
        producto.setImage(R.drawable.ln1);
        producto.setTitulo("Márquez Puntalarga");
        producto.setDesc("Viñedo Márquez de Puntalarga: Ven y disfruta del viñedo en Puntalarga. Deambula a través del viñedo y disfruta de la vista panorámica del Valle del Sol.\n" +
                "Deguste de un exquisito vino, Riesling seco mientras gozas su sala de degustación. \n");
        producto.setLatLng(new LatLng(5.779490324374775, -72.97686454951945));
        Lugares.add(producto);

        Producto ln2 = new Producto();
        ln2.setImage(R.drawable.ln2);
        ln2.setTitulo("Templo de San Gerónimo\n" +
                "Y capilla de Lourdes\n");
        ln2.setDesc("Templo de 3 naves, construida en 1.898 llama la atención por su torre construida en piedra muy bien talla y su estilo dórico-barroco en él se admira en cuadro de San Jerónimo, lienzo del pintor español Francisco Zurbarán; también se venera el cuadro de San Roque patrono del pueblo cuya romería se lleva a cabo el 8 de septiembre de cada año.\n" +
                "Capilla de Lourdes una de los principales bienes culturales y religiosos del municipio de Nobsa.\n ");
        ln2.setLatLng(new LatLng(5.7710700476558845, -72.93968988265411));
        Lugares.add(ln2);

        Producto ln3 = new Producto();
        ln3.setImage(R.drawable.ln3);
        ln3.setTitulo("Cruz de Aranda");
        ln3.setDesc("La Cruz de Aranda es un monumento ubicado en la zona rural de municipio de Nobsa en el departamento de Boyacá al centro-oriente de Colombia en la región del Alto Chicamocha. Y realizar un vuelo en parapente. ");
        ln3.setLatLng(new LatLng(5.8038796341883065, -72.94292968146137));
        Lugares.add(ln3);


        Producto ln4 = new Producto();
        ln4.setImage(R.drawable.ln4);
        ln4.setTitulo("Centro artesanal y museo del arte");
        ln4.setDesc("Avenida San Roque, Nobsa, Boyacá\n" +
                "Donde en contras gran parte de la artesanía, además varias piezas artesanales para comprar donde se muestra la identidad de la comunidad Nobsana en cuanto a tejidos en lana, artículos en madera y sus tradicionales campanas. \n ");
        ln4.setLatLng(new LatLng(5.77050358376743, -72.9389086407349));
        Lugares.add(ln4);

        Producto tutulom = new Producto();
        tutulom.setImage(R.drawable.mon);
        tutulom.setTitulo("Mongui");
        tutulom.setDesc(" Monguí es un municipio colombiano ubicado en la provincia de Sugamuxi en el departamento de Boyacá. Está situado a unos 97 km de la ciudad de Tunja, capital del departamento. Hace parte de la Red de pueblos patrimonio de Colombia");
        tutulom.setLatLng(new LatLng(5.722207736789219, -72.84951811493697));
        Lugares.add(tutulom);

        Producto lm1 = new Producto();
        lm1.setImage(R.drawable.lm1);
        lm1.setTitulo("Puente real de calicanto");
        lm1.setDesc(" puedes visitar el puente colonial Calicanto construido en el siglo XVII, la Basílica de Nuestra Señora de Monguí patrimonio cultural de Colombia, La Peña de Otí, La Caja del Rey, la escalera La Otra Vida y desde luego el Páramo de Ocetá considerado uno de los más hermosos del mundo y mejor conservados de Colombia.");
        lm1.setLatLng(new LatLng(5.718841642375966, -72.849728827388));
        Lugares.add(lm1);

        Producto lm2 = new Producto();
        lm2.setImage(R.drawable.lm2);
        lm2.setTitulo(" Laguna Negra ");
        lm2.setDesc("se encuentra a 8 kilómetros, 45 minutos en carro y 3 horas aproximadamente caminando; donde se podrá disfrutar del paisaje del páramo de Siscunsí y Ocetá, es un recorrido lleno de frailejones y el ecosistema de paramo y subpáramo.\n" +
                "Es un sendero donde se aprecia y se conserva el medio ambiente, un desarrollo turístico como herramienta de sensibilización de los visitantes y turistas hacia la naturaleza\n ");
        lm2.setLatLng(new LatLng(5.711262586822673, -72.79125409896713));
        Lugares.add(lm2);


        Producto lm3 = new Producto();
        lm3.setImage(R.drawable.lm3);
        lm3.setTitulo(" Paramo de Oceta ");
        lm3.setDesc("Este páramo es considerado uno de los más hermosos del mundo y mejor conservados de Colombia,");
        lm3.setLatLng(new LatLng(5.712394196994742, -72.79813128277087));
        Lugares.add(lm3);

        Producto lm4 = new Producto();
        lm4.setImage(R.drawable.lm4);
        lm4.setTitulo(" Basílica de Nuestra Señora de Mongui ");
        lm4.setDesc("La construcción religiosa más importante de Monguí la conforman la iglesia principal – llamada Basílica de Nuestra Señora de Monguí – y el convento, levantados en piedra de sillería entre 1694 y 1760.");
        lm4.setLatLng(new LatLng(5.72228457010884, -72.84882640527792));
        Lugares.add(lm4);

        Producto titulor = new Producto();
        titulor.setImage(R.drawable.raquira);
        titulor.setTitulo("  RAQUIRA  ");
        titulor.setDesc("Ráquira es un municipio colombiano de la provincia de Ricaurte en el departamento de Boyacá. Está situado a unos 60 kilómetros de Tunja. Ráquira es considerada como la capital artesanal de Colombia y fue galardonada por las Corporaciónes ");
        titulor.setLatLng(new LatLng(5.538142872314822, -73.63304713709441));
        Lugares.add(titulor);

        Producto lr1 = new Producto();
        lr1.setImage(R.drawable.lr1);
        lr1.setTitulo(" Monasterio de la candelaria ");
        lr1.setDesc("Fue el primer monasterio que los monjes Agustinos Recoletos fundaron en América, por iniciativa de fray Mateo Delgado en 1604. En sus inicios reunió a varios habitantes que vivían dispersos en las cuevas de los alrededores.En la actualidad está destinado al noviciado de los religiosos agustinos recoletos y a retiros espirituales, aunque brinda servicio de hospedaje a los turistas, con la atención de un grupo de monjas");
        lr1.setLatLng(new LatLng(5.519807628694023, -73.60389608253053));
        Lugares.add(lr1);

        Producto lr2 = new Producto();
        lr2.setImage(R.drawable.lr2);
        lr2.setTitulo(" Monumentos y puntos de interés ");
        lr2.setDesc("es el pueblo artesanal más colorido de Boyacá y es considerada la capital artesanal de Colombia. De hecho, antes de la conquista española ya se elaboraban recipientes de arcilla. Incluso su nombre, en idioma muisca, significa ciudad de ollas. Es por eso que sus artesanías son ahora tan apreciadas que se exportan a Estados Unidos y Europa.");
        lr2.setLatLng(new LatLng(5.538428528955, -73.63314637882635));
        Lugares.add(lr2);

        Producto lr3 = new Producto();
        lr3.setImage(R.drawable.lr3);
        lr3.setTitulo(" Parque principal ");
        lr3.setDesc("La construcción y embellecimiento fue gestionada en 1.980 por la “Asociación de Hijos de Ráquira” y ejecutado ocho años más tarde por el señor Gustavo Alfonso Casas, primer alcalde elegido por voto popular. Las esculturas allí colocadas fueron instaladas paulatinamente y elaborada por artesanos de la localidad.\n");
        lr3.setLatLng(new LatLng(5.538142872314822, -73.63304713709441));
        Lugares.add(lr3);

        Producto lr4 = new Producto();
        lr4.setImage(R.drawable.lr4);
        lr4.setTitulo(" Pozos azules y los viñedos ");
        lr4.setDesc("Fueron cavados a mediados del siglo XX y los minerales naturales les otorgan sus distintivos colores azules. Los pozos son un lugar ideal para hacer senderismo e incluso montar a caballo" );
        lr4.setLatLng(new LatLng(5.596948618277644, -73.6218929833204));
        Lugares.add(lr4);

        Producto titulovilla = new Producto();
        titulovilla.setImage(R.drawable.villadeleyva);
        titulovilla.setTitulo(" VILLADELEYVA ");
        titulovilla.setDesc("Villa de Leyva es una ciudad colombiana en el noreste de Bogotá. Es conocida por sus edificios coloniales encalados, las calles con adoquines y la gran Plaza Mayor. En la plaza está la iglesia de Nuestra Señora del Rosario del siglo XVII y la Casa del Primer Congreso de las Provincias Unidas" );
        titulovilla.setLatLng(new LatLng(5.632212618438222, -73.52370315247187));
        Lugares.add(titulovilla);


        Producto lv1 = new Producto();
        lv1.setImage(R.drawable.lv1);
        lv1.setTitulo(" Parque principal ");
        lv1.setDesc(" Una de las plazas más grandes de América. En este espacio empedrado se destacan una fuente de agua y la iglesia de Nuestra Señora del Rosario.\n" +
                "\n" );
        lv1.setLatLng(new LatLng(5.632303373280549, -73.52327936345432));
        Lugares.add(lv1);

        Producto lv2 = new Producto();
        lv2.setImage(R.drawable.lv2);
        lv2.setTitulo(" Pozos azules ");
        lv2.setDesc("'Pozos Azules' es uno de los puntos turísticos más importantes de la localidad de Villa de Leyva, ubicada a unos 166 kilómetros de Bogotá. En total hay seis pozos de agua azul verdoso, esto debido a las fuertes concentraciones de azufre, selenio y sulfato de cobre." +
                "\n" );
        lv2.setLatLng(new LatLng(5.631425851773362, -73.54591136665263));
        Lugares.add(lv2);

        Producto lv3 = new Producto();
        lv3.setImage(R.drawable.lv3);
        lv3.setTitulo(" Casa museo capitán Antonio Ricaute ");
        lv3.setDesc("La Casa Museo Capitán Antonio Ricaurte ubicada en Villa de Leyva, Boyacá, fue utilizada ocasionalmente por la familia Ricaurte como lugar de veraneo por encontrarse cerca a Santafe de Bogotá. Allí nació el Capitán Antonio Ricaurte el 10 de Junio de 1786." );
        lv3.setLatLng(new LatLng(5.63452502791836, -73.52084628940094));
        Lugares.add(lv3);

        Producto lv4 = new Producto();
        lv4.setImage(R.drawable.lv4);
        lv4.setTitulo(" Parque temático el gran valle de los dinosaurios ");
        lv4.setDesc("La principal atracción del parque, son las réplicas a escala de animales extintos. Algunas de las réplicas son estructuras rígidas construidas en concreto con estructura metálica y otras con materiales flexibles, lo que les permite cierto rango de movimiento. " );
        lv4.setLatLng(new LatLng(5.630950551904692, -73.56951287274006));
        Lugares.add(lv4);





        if(Lugares.size() == 0){
            Toast.makeText(getContext(), "No hay productos agregados", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(this.getContext()).inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(new MyAdapter(this.getContext(),Lugares));


        return view;
    }
}