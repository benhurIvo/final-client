
package final1.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.final1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @param rPid
     * @return
     *     returns final1.ws.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.final1/", className = "final1.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.ReadPersonResponse")
    @Action(input = "http://ws.final1/People/readPersonRequest", output = "http://ws.final1/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "rPid", targetNamespace = "")
        int rPid);

    /**
     * 
     * @return
     *     returns java.util.List<final1.ws.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPeopleList", targetNamespace = "http://ws.final1/", className = "final1.ws.GetPeopleList")
    @ResponseWrapper(localName = "getPeopleListResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.GetPeopleListResponse")
    @Action(input = "http://ws.final1/People/getPeopleListRequest", output = "http://ws.final1/People/getPeopleListResponse")
    public List<Person> getPeopleList();

    /**
     * 
     * @param delPid
     * @return
     *     returns java.util.List<final1.ws.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.final1/", className = "final1.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.DeletePersonResponse")
    @Action(input = "http://ws.final1/People/deletePersonRequest", output = "http://ws.final1/People/deletePersonResponse")
    public List<Person> deletePerson(
        @WebParam(name = "del_pid", targetNamespace = "")
        int delPid);

    /**
     * 
     * @param hisMeasure
     * @param hisPid
     * @return
     *     returns java.util.List<final1.ws.Healthprofile>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://ws.final1/", className = "final1.ws.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.ReadPersonHistoryResponse")
    @Action(input = "http://ws.final1/People/readPersonHistoryRequest", output = "http://ws.final1/People/readPersonHistoryResponse")
    public List<Healthprofile> readPersonHistory(
        @WebParam(name = "his_pid", targetNamespace = "")
        int hisPid,
        @WebParam(name = "his_measure", targetNamespace = "")
        String hisMeasure);

    /**
     * 
     * @return
     *     returns java.util.List<final1.ws.Type>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://ws.final1/", className = "final1.ws.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.ReadMeasureTypesResponse")
    @Action(input = "http://ws.final1/People/readMeasureTypesRequest", output = "http://ws.final1/People/readMeasureTypesResponse")
    public List<Type> readMeasureTypes();

    /**
     * 
     * @param mMeasure
     * @param mid
     * @param mPid
     * @return
     *     returns final1.ws.Healthprofile
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://ws.final1/", className = "final1.ws.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.ReadPersonMeasureResponse")
    @Action(input = "http://ws.final1/People/readPersonMeasureRequest", output = "http://ws.final1/People/readPersonMeasureResponse")
    public Healthprofile readPersonMeasure(
        @WebParam(name = "m_pid", targetNamespace = "")
        int mPid,
        @WebParam(name = "m_measure", targetNamespace = "")
        String mMeasure,
        @WebParam(name = "mid", targetNamespace = "")
        int mid);

    /**
     * 
     * @param sMeasure
     * @param sPid
     * @param value
     * @return
     *     returns java.util.List<final1.ws.Healthprofile>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.final1/", className = "final1.ws.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.SavePersonMeasureResponse")
    @Action(input = "http://ws.final1/People/savePersonMeasureRequest", output = "http://ws.final1/People/savePersonMeasureResponse")
    public List<Healthprofile> savePersonMeasure(
        @WebParam(name = "s_pid", targetNamespace = "")
        int sPid,
        @WebParam(name = "s_measure", targetNamespace = "")
        String sMeasure,
        @WebParam(name = "value", targetNamespace = "")
        String value);

    /**
     * 
     * @param uphisMeasure
     * @param measureObj
     * @param mid
     * @param uphisPid
     * @return
     *     returns final1.ws.Healthprofile
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePersonHealthProfile", targetNamespace = "http://ws.final1/", className = "final1.ws.UpdatePersonHealthProfile")
    @ResponseWrapper(localName = "updatePersonHealthProfileResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.UpdatePersonHealthProfileResponse")
    @Action(input = "http://ws.final1/People/updatePersonHealthProfileRequest", output = "http://ws.final1/People/updatePersonHealthProfileResponse")
    public Healthprofile updatePersonHealthProfile(
        @WebParam(name = "uphis_pid", targetNamespace = "")
        int uphisPid,
        @WebParam(name = "uphis_measure", targetNamespace = "")
        String uphisMeasure,
        @WebParam(name = "MeasureObj", targetNamespace = "")
        int measureObj,
        @WebParam(name = "mid", targetNamespace = "")
        int mid);

    /**
     * 
     * @param crePerson
     * @param healthp
     * @return
     *     returns final1.ws.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.final1/", className = "final1.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.CreatePersonResponse")
    @Action(input = "http://ws.final1/People/createPersonRequest", output = "http://ws.final1/People/createPersonResponse")
    public Person createPerson(
        @WebParam(name = "cre_person", targetNamespace = "")
        Person crePerson,
        @WebParam(name = "healthp", targetNamespace = "")
        Healthprofile healthp);

    /**
     * 
     * @param upPid
     * @param upPerson
     * @return
     *     returns final1.ws.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.final1/", className = "final1.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.UpdatePersonResponse")
    @Action(input = "http://ws.final1/People/updatePersonRequest", output = "http://ws.final1/People/updatePersonResponse")
    public Person updatePerson(
        @WebParam(name = "up_person", targetNamespace = "")
        Person upPerson,
        @WebParam(name = "up_pid", targetNamespace = "")
        int upPid);

    /**
     * 
     * @return
     *     returns java.util.List<final1.ws.Goal>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGoalList", targetNamespace = "http://ws.final1/", className = "final1.ws.GetGoalList")
    @ResponseWrapper(localName = "getGoalListResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.GetGoalListResponse")
    @Action(input = "http://ws.final1/People/getGoalListRequest", output = "http://ws.final1/People/getGoalListResponse")
    public List<Goal> getGoalList();

    /**
     * 
     * @param goal
     * @param gPerson
     * @param tid
     * @return
     *     returns final1.ws.Goal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://ws.final1/", className = "final1.ws.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.CreateGoalResponse")
    @Action(input = "http://ws.final1/People/createGoalRequest", output = "http://ws.final1/People/createGoalResponse")
    public Goal createGoal(
        @WebParam(name = "g_person", targetNamespace = "")
        Person gPerson,
        @WebParam(name = "tid", targetNamespace = "")
        Type tid,
        @WebParam(name = "goal", targetNamespace = "")
        String goal);

    /**
     * 
     * @param goal
     * @return
     *     returns final1.ws.Goal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateGoal", targetNamespace = "http://ws.final1/", className = "final1.ws.UpdateGoal")
    @ResponseWrapper(localName = "updateGoalResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.UpdateGoalResponse")
    @Action(input = "http://ws.final1/People/updateGoalRequest", output = "http://ws.final1/People/updateGoalResponse")
    public Goal updateGoal(
        @WebParam(name = "goal", targetNamespace = "http://ws.final1/")
        Goal goal);

    /**
     * 
     * @param goalId
     * @return
     *     returns java.util.List<final1.ws.Goal>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteGoal", targetNamespace = "http://ws.final1/", className = "final1.ws.DeleteGoal")
    @ResponseWrapper(localName = "deleteGoalResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.DeleteGoalResponse")
    @Action(input = "http://ws.final1/People/deleteGoalRequest", output = "http://ws.final1/People/deleteGoalResponse")
    public List<Goal> deleteGoal(
        @WebParam(name = "GoalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @param creType
     * @return
     *     returns final1.ws.Type
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createType", targetNamespace = "http://ws.final1/", className = "final1.ws.CreateType")
    @ResponseWrapper(localName = "createTypeResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.CreateTypeResponse")
    @Action(input = "http://ws.final1/People/createTypeRequest", output = "http://ws.final1/People/createTypeResponse")
    public Type createType(
        @WebParam(name = "creType", targetNamespace = "")
        Type creType);

    /**
     * 
     * @param upType
     * @return
     *     returns final1.ws.Type
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateType", targetNamespace = "http://ws.final1/", className = "final1.ws.UpdateType")
    @ResponseWrapper(localName = "updateTypeResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.UpdateTypeResponse")
    @Action(input = "http://ws.final1/People/updateTypeRequest", output = "http://ws.final1/People/updateTypeResponse")
    public Type updateType(
        @WebParam(name = "upType", targetNamespace = "")
        Type upType);

    /**
     * 
     * @param delType
     * @return
     *     returns java.util.List<final1.ws.Type>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteType", targetNamespace = "http://ws.final1/", className = "final1.ws.DeleteType")
    @ResponseWrapper(localName = "deleteTypeResponse", targetNamespace = "http://ws.final1/", className = "final1.ws.DeleteTypeResponse")
    @Action(input = "http://ws.final1/People/deleteTypeRequest", output = "http://ws.final1/People/deleteTypeResponse")
    public List<Type> deleteType(
        @WebParam(name = "delType", targetNamespace = "")
        Type delType);

}
