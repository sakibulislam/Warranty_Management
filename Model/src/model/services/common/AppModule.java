package model.services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 25 12:09:57 BDT 2019
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {
    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);
}
