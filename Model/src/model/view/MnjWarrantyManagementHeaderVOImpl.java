package model.view;

import model.services.CustomViewImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 02 13:59:24 BDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjWarrantyManagementHeaderVOImpl extends CustomViewImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public MnjWarrantyManagementHeaderVOImpl() {
    }

    /**
     * Returns the bind variable value for P_Resp_Id.
     * @return bind variable value for P_Resp_Id
     */
    public String getP_Resp_Id() {
        return (String)getNamedWhereClauseParam("P_Resp_Id");
    }

    /**
     * Sets <code>value</code> for bind variable P_Resp_Id.
     * @param value value to bind as P_Resp_Id
     */
    public void setP_Resp_Id(String value) {
        setNamedWhereClauseParam("P_Resp_Id", value);
    }
}
