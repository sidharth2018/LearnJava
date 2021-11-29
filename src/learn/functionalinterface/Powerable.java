package learn.functionalinterface;

@FunctionalInterface
public interface Powerable {
	default void printInfo() {
		System.out.println("Hello");
	}
	int calculate(int s);

}
