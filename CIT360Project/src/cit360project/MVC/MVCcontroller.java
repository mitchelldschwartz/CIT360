public class EmployeeController {
   private Employee model; 
 private EmployeeView view;

   public EmployeeController(Employee model, EmployeeView view){
      this.model = model;
      this.view = view;
   }

   public void setEmployeeName(String name){
      model.setName(name);		
   }

   public String getEmployeeName(){
      return model.getName();		
   }

   public void setemplID(String emplID){
      model.setemplID(emplID);		
   }

   public String getemplID(){
      return model.getemplID();		
   }

   public void updateView(){				
      view.printEmployeeDetails(model.getName(), model.getemplID());
   }	
}