public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);

        String customerName = customerService.getCustomerName(1);
        System.out.println("Customer Name: " + customerName);

        customerName = customerService.getCustomerName(2);
        System.out.println("Customer Name: " + customerName);
    }
}
