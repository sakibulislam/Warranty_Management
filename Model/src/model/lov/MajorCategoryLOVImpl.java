package model.lov;

import java.util.List;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaItem;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 11 11:53:21 BDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MajorCategoryLOVImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public MajorCategoryLOVImpl() {
    }
    
    @Override
        public void applyViewCriteria(ViewCriteria viewCriteria, boolean b) {
            super.applyViewCriteria(supressStartsWithClauseForLov(viewCriteria), b);
        }
        
        public ViewCriteria supressStartsWithClauseForLov(ViewCriteria vc){
            if(vc != null && vc.getName().contains("__lov__filterlist__vcr__")){
                ViewCriteriaRow currentRow = (ViewCriteriaRow)vc.getCurrentRow();
                if(currentRow != null){
                    List criteriaItems = currentRow.getCriteriaItems();
                    for(int i = 0 ; i < criteriaItems.size() ; i++){
                        ViewCriteriaItem object = (ViewCriteriaItem)criteriaItems.get(i);
                        if(object != null){
                            System.out.println("Operator is : "+object.getOperator());
                            if("STARTSWITH".equals(object.getOperator())){
                                object.setOperator("CONTAINS");
                            }
                        }
                    }
                }
            }
            return vc;
        }
}
