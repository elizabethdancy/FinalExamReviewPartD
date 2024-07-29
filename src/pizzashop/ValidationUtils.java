public class ValidationUtils {
    public static boolean validateOrder(Order order) {
        // Common validation logic
        return order != null && order.hasValidDetails();
    }
}

// Example usage in existing classes
// In some other file, e.g., OrderManager.java
if (ValidationUtils.validateOrder(order)) {
    // Process order
}
