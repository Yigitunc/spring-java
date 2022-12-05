public class CustomerManager implements ICustomerService {
    private ICustomerDal customerDal;

    //Setter Injection
    //public void setCustomerDal(ICustomerDal customerDal) {
    //    this.customerDal = customerDal;
    //}

    //Constructor Injection
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(){
        customerDal.add();
    }
}
