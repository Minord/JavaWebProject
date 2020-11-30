package app.entidades;

import app.entidades.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-29T15:05:21")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile SingularAttribute<Categorias, String> descripcion;
    public static volatile SingularAttribute<Categorias, byte[]> foto;
    public static volatile ListAttribute<Categorias, Productos> productosList;
    public static volatile SingularAttribute<Categorias, Integer> categoriaID;
    public static volatile SingularAttribute<Categorias, String> nombreCategoria;

}