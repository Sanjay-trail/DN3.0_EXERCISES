import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, String> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put(1, "Alice Johnson");
        customers.put(2, "Bob Smith");
    }

    @Override
    public String findCustomerById(int id) {
        return customers.get(id);
    }
}
