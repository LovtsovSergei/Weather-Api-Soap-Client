
package com.epamacademy.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epamacademy.webservice.service package. 
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

    private final static QName _AddResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "addResponse");
    private final static QName _ListAllResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "listAllResponse");
    private final static QName _Test_QNAME = new QName("http://service.webservice.epamacademy.com/", "test");
    private final static QName _Add_QNAME = new QName("http://service.webservice.epamacademy.com/", "add");
    private final static QName _GetForecastByCity_QNAME = new QName("http://service.webservice.epamacademy.com/", "getForecastByCity");
    private final static QName _ListNonRainyResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "listNonRainyResponse");
    private final static QName _ListRainy_QNAME = new QName("http://service.webservice.epamacademy.com/", "listRainy");
    private final static QName _CountResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "countResponse");
    private final static QName _Forecast_QNAME = new QName("http://service.webservice.epamacademy.com/", "forecast");
    private final static QName _Count_QNAME = new QName("http://service.webservice.epamacademy.com/", "count");
    private final static QName _GetForecastByZipCode_QNAME = new QName("http://service.webservice.epamacademy.com/", "getForecastByZipCode");
    private final static QName _AddAll_QNAME = new QName("http://service.webservice.epamacademy.com/", "addAll");
    private final static QName _GetHottest_QNAME = new QName("http://service.webservice.epamacademy.com/", "getHottest");
    private final static QName _GetForecastByZipCodeResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "getForecastByZipCodeResponse");
    private final static QName _ListAll_QNAME = new QName("http://service.webservice.epamacademy.com/", "listAll");
    private final static QName _AddAllResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "addAllResponse");
    private final static QName _DeleteById_QNAME = new QName("http://service.webservice.epamacademy.com/", "deleteById");
    private final static QName _TestResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "testResponse");
    private final static QName _DeleteByZipCode_QNAME = new QName("http://service.webservice.epamacademy.com/", "deleteByZipCode");
    private final static QName _CannotAddDataException_QNAME = new QName("http://service.webservice.epamacademy.com/", "CannotAddDataException");
    private final static QName _ListNonRainy_QNAME = new QName("http://service.webservice.epamacademy.com/", "listNonRainy");
    private final static QName _DeleteByCity_QNAME = new QName("http://service.webservice.epamacademy.com/", "deleteByCity");
    private final static QName _DeleteByCityResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "deleteByCityResponse");
    private final static QName _GetForecastById_QNAME = new QName("http://service.webservice.epamacademy.com/", "getForecastById");
    private final static QName _DeleteByZipCodeResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "deleteByZipCodeResponse");
    private final static QName _GetForecastByIdResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "getForecastByIdResponse");
    private final static QName _GetHottestResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "getHottestResponse");
    private final static QName _ListRainyResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "listRainyResponse");
    private final static QName _GetForecastByCityResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "getForecastByCityResponse");
    private final static QName _DeleteByIdResponse_QNAME = new QName("http://service.webservice.epamacademy.com/", "deleteByIdResponse");
    private final static QName _DBAccessException_QNAME = new QName("http://service.webservice.epamacademy.com/", "DBAccessException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epamacademy.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListNonRainy }
     * 
     */
    public ListNonRainy createListNonRainy() {
        return new ListNonRainy();
    }

    /**
     * Create an instance of {@link CannotAddDataException }
     * 
     */
    public CannotAddDataException createCannotAddDataException() {
        return new CannotAddDataException();
    }

    /**
     * Create an instance of {@link DeleteByZipCode }
     * 
     */
    public DeleteByZipCode createDeleteByZipCode() {
        return new DeleteByZipCode();
    }

    /**
     * Create an instance of {@link GetForecastById }
     * 
     */
    public GetForecastById createGetForecastById() {
        return new GetForecastById();
    }

    /**
     * Create an instance of {@link DeleteByCity }
     * 
     */
    public DeleteByCity createDeleteByCity() {
        return new DeleteByCity();
    }

    /**
     * Create an instance of {@link DeleteByCityResponse }
     * 
     */
    public DeleteByCityResponse createDeleteByCityResponse() {
        return new DeleteByCityResponse();
    }

    /**
     * Create an instance of {@link DeleteByIdResponse }
     * 
     */
    public DeleteByIdResponse createDeleteByIdResponse() {
        return new DeleteByIdResponse();
    }

    /**
     * Create an instance of {@link GetForecastByCityResponse }
     * 
     */
    public GetForecastByCityResponse createGetForecastByCityResponse() {
        return new GetForecastByCityResponse();
    }

    /**
     * Create an instance of {@link GetHottestResponse }
     * 
     */
    public GetHottestResponse createGetHottestResponse() {
        return new GetHottestResponse();
    }

    /**
     * Create an instance of {@link ListRainyResponse }
     * 
     */
    public ListRainyResponse createListRainyResponse() {
        return new ListRainyResponse();
    }

    /**
     * Create an instance of {@link GetForecastByIdResponse }
     * 
     */
    public GetForecastByIdResponse createGetForecastByIdResponse() {
        return new GetForecastByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteByZipCodeResponse }
     * 
     */
    public DeleteByZipCodeResponse createDeleteByZipCodeResponse() {
        return new DeleteByZipCodeResponse();
    }

    /**
     * Create an instance of {@link DBAccessException }
     * 
     */
    public DBAccessException createDBAccessException() {
        return new DBAccessException();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link GetForecastByCity }
     * 
     */
    public GetForecastByCity createGetForecastByCity() {
        return new GetForecastByCity();
    }

    /**
     * Create an instance of {@link ListAllResponse }
     * 
     */
    public ListAllResponse createListAllResponse() {
        return new ListAllResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link Forecast }
     * 
     */
    public Forecast createForecast() {
        return new Forecast();
    }

    /**
     * Create an instance of {@link ListRainy }
     * 
     */
    public ListRainy createListRainy() {
        return new ListRainy();
    }

    /**
     * Create an instance of {@link ListNonRainyResponse }
     * 
     */
    public ListNonRainyResponse createListNonRainyResponse() {
        return new ListNonRainyResponse();
    }

    /**
     * Create an instance of {@link GetHottest }
     * 
     */
    public GetHottest createGetHottest() {
        return new GetHottest();
    }

    /**
     * Create an instance of {@link AddAll }
     * 
     */
    public AddAll createAddAll() {
        return new AddAll();
    }

    /**
     * Create an instance of {@link GetForecastByZipCode }
     * 
     */
    public GetForecastByZipCode createGetForecastByZipCode() {
        return new GetForecastByZipCode();
    }

    /**
     * Create an instance of {@link AddAllResponse }
     * 
     */
    public AddAllResponse createAddAllResponse() {
        return new AddAllResponse();
    }

    /**
     * Create an instance of {@link DeleteById }
     * 
     */
    public DeleteById createDeleteById() {
        return new DeleteById();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link ListAll }
     * 
     */
    public ListAll createListAll() {
        return new ListAll();
    }

    /**
     * Create an instance of {@link GetForecastByZipCodeResponse }
     * 
     */
    public GetForecastByZipCodeResponse createGetForecastByZipCodeResponse() {
        return new GetForecastByZipCodeResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SqlException }
     * 
     */
    public SqlException createSqlException() {
        return new SqlException();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "listAllResponse")
    public JAXBElement<ListAllResponse> createListAllResponse(ListAllResponse value) {
        return new JAXBElement<ListAllResponse>(_ListAllResponse_QNAME, ListAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForecastByCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "getForecastByCity")
    public JAXBElement<GetForecastByCity> createGetForecastByCity(GetForecastByCity value) {
        return new JAXBElement<GetForecastByCity>(_GetForecastByCity_QNAME, GetForecastByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNonRainyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "listNonRainyResponse")
    public JAXBElement<ListNonRainyResponse> createListNonRainyResponse(ListNonRainyResponse value) {
        return new JAXBElement<ListNonRainyResponse>(_ListNonRainyResponse_QNAME, ListNonRainyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRainy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "listRainy")
    public JAXBElement<ListRainy> createListRainy(ListRainy value) {
        return new JAXBElement<ListRainy>(_ListRainy_QNAME, ListRainy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Forecast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "forecast")
    public JAXBElement<Forecast> createForecast(Forecast value) {
        return new JAXBElement<Forecast>(_Forecast_QNAME, Forecast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForecastByZipCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "getForecastByZipCode")
    public JAXBElement<GetForecastByZipCode> createGetForecastByZipCode(GetForecastByZipCode value) {
        return new JAXBElement<GetForecastByZipCode>(_GetForecastByZipCode_QNAME, GetForecastByZipCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "addAll")
    public JAXBElement<AddAll> createAddAll(AddAll value) {
        return new JAXBElement<AddAll>(_AddAll_QNAME, AddAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHottest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "getHottest")
    public JAXBElement<GetHottest> createGetHottest(GetHottest value) {
        return new JAXBElement<GetHottest>(_GetHottest_QNAME, GetHottest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForecastByZipCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "getForecastByZipCodeResponse")
    public JAXBElement<GetForecastByZipCodeResponse> createGetForecastByZipCodeResponse(GetForecastByZipCodeResponse value) {
        return new JAXBElement<GetForecastByZipCodeResponse>(_GetForecastByZipCodeResponse_QNAME, GetForecastByZipCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "listAll")
    public JAXBElement<ListAll> createListAll(ListAll value) {
        return new JAXBElement<ListAll>(_ListAll_QNAME, ListAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "addAllResponse")
    public JAXBElement<AddAllResponse> createAddAllResponse(AddAllResponse value) {
        return new JAXBElement<AddAllResponse>(_AddAllResponse_QNAME, AddAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "deleteById")
    public JAXBElement<DeleteById> createDeleteById(DeleteById value) {
        return new JAXBElement<DeleteById>(_DeleteById_QNAME, DeleteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByZipCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "deleteByZipCode")
    public JAXBElement<DeleteByZipCode> createDeleteByZipCode(DeleteByZipCode value) {
        return new JAXBElement<DeleteByZipCode>(_DeleteByZipCode_QNAME, DeleteByZipCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CannotAddDataException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "CannotAddDataException")
    public JAXBElement<CannotAddDataException> createCannotAddDataException(CannotAddDataException value) {
        return new JAXBElement<CannotAddDataException>(_CannotAddDataException_QNAME, CannotAddDataException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNonRainy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "listNonRainy")
    public JAXBElement<ListNonRainy> createListNonRainy(ListNonRainy value) {
        return new JAXBElement<ListNonRainy>(_ListNonRainy_QNAME, ListNonRainy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "deleteByCity")
    public JAXBElement<DeleteByCity> createDeleteByCity(DeleteByCity value) {
        return new JAXBElement<DeleteByCity>(_DeleteByCity_QNAME, DeleteByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "deleteByCityResponse")
    public JAXBElement<DeleteByCityResponse> createDeleteByCityResponse(DeleteByCityResponse value) {
        return new JAXBElement<DeleteByCityResponse>(_DeleteByCityResponse_QNAME, DeleteByCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForecastById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "getForecastById")
    public JAXBElement<GetForecastById> createGetForecastById(GetForecastById value) {
        return new JAXBElement<GetForecastById>(_GetForecastById_QNAME, GetForecastById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByZipCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "deleteByZipCodeResponse")
    public JAXBElement<DeleteByZipCodeResponse> createDeleteByZipCodeResponse(DeleteByZipCodeResponse value) {
        return new JAXBElement<DeleteByZipCodeResponse>(_DeleteByZipCodeResponse_QNAME, DeleteByZipCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForecastByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "getForecastByIdResponse")
    public JAXBElement<GetForecastByIdResponse> createGetForecastByIdResponse(GetForecastByIdResponse value) {
        return new JAXBElement<GetForecastByIdResponse>(_GetForecastByIdResponse_QNAME, GetForecastByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHottestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "getHottestResponse")
    public JAXBElement<GetHottestResponse> createGetHottestResponse(GetHottestResponse value) {
        return new JAXBElement<GetHottestResponse>(_GetHottestResponse_QNAME, GetHottestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRainyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "listRainyResponse")
    public JAXBElement<ListRainyResponse> createListRainyResponse(ListRainyResponse value) {
        return new JAXBElement<ListRainyResponse>(_ListRainyResponse_QNAME, ListRainyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForecastByCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "getForecastByCityResponse")
    public JAXBElement<GetForecastByCityResponse> createGetForecastByCityResponse(GetForecastByCityResponse value) {
        return new JAXBElement<GetForecastByCityResponse>(_GetForecastByCityResponse_QNAME, GetForecastByCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "deleteByIdResponse")
    public JAXBElement<DeleteByIdResponse> createDeleteByIdResponse(DeleteByIdResponse value) {
        return new JAXBElement<DeleteByIdResponse>(_DeleteByIdResponse_QNAME, DeleteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBAccessException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.epamacademy.com/", name = "DBAccessException")
    public JAXBElement<DBAccessException> createDBAccessException(DBAccessException value) {
        return new JAXBElement<DBAccessException>(_DBAccessException_QNAME, DBAccessException.class, null, value);
    }

}
