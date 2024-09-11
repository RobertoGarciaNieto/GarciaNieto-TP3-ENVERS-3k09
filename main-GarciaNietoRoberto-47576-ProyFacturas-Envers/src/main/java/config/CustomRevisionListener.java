package config;

import audit.Revision;
import org.hibernate.envers.RevisionListener;


public class CustomRevisionListener implements RevisionListener {   //la implementación sirve para hacer las revisiones, RevisionListener es el encargado de hacerlo
    public void newRevision(Object revisionEntity) {    //Recibe como parámetro a la entidad para hacer la revisión
        final Revision revision = (Revision) revisionEntity;    //Transformamos el objeto en una revisión
    }
}