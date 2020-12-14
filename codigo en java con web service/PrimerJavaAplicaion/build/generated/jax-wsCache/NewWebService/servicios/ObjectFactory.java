
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultaResponse_QNAME = new QName("http://servicios/", "ConsultaResponse");
    private final static QName _NombreAlumnoResponse_QNAME = new QName("http://servicios/", "Nombre_alumnoResponse");
    private final static QName _Suma_QNAME = new QName("http://servicios/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://servicios/", "sumaResponse");
    private final static QName _NombreAlumno_QNAME = new QName("http://servicios/", "Nombre_alumno");
    private final static QName _Consulta_QNAME = new QName("http://servicios/", "Consulta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link NombreAlumno }
     * 
     */
    public NombreAlumno createNombreAlumno() {
        return new NombreAlumno();
    }

    /**
     * Create an instance of {@link Consulta }
     * 
     */
    public Consulta createConsulta() {
        return new Consulta();
    }

    /**
     * Create an instance of {@link ConsultaResponse }
     * 
     */
    public ConsultaResponse createConsultaResponse() {
        return new ConsultaResponse();
    }

    /**
     * Create an instance of {@link NombreAlumnoResponse }
     * 
     */
    public NombreAlumnoResponse createNombreAlumnoResponse() {
        return new NombreAlumnoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "ConsultaResponse")
    public JAXBElement<ConsultaResponse> createConsultaResponse(ConsultaResponse value) {
        return new JAXBElement<ConsultaResponse>(_ConsultaResponse_QNAME, ConsultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NombreAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "Nombre_alumnoResponse")
    public JAXBElement<NombreAlumnoResponse> createNombreAlumnoResponse(NombreAlumnoResponse value) {
        return new JAXBElement<NombreAlumnoResponse>(_NombreAlumnoResponse_QNAME, NombreAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NombreAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "Nombre_alumno")
    public JAXBElement<NombreAlumno> createNombreAlumno(NombreAlumno value) {
        return new JAXBElement<NombreAlumno>(_NombreAlumno_QNAME, NombreAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "Consulta")
    public JAXBElement<Consulta> createConsulta(Consulta value) {
        return new JAXBElement<Consulta>(_Consulta_QNAME, Consulta.class, null, value);
    }

}
