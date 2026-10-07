package function;

import java.time.LocalDateTime;
import java.util.function.Supplier;

import static java.lang.String.valueOf;

public class SupplierDemo {
    public static void main(String[] args) {

        // 1. 4-Digit OTP Generator Supplier
        Supplier<Integer> otpSupplier = () -> {
            int otp = (int) (Math.random() * 9000) + 1000;
            return otp;
        };

        System.out.println("Generated OTP 1: " + otpSupplier.get());
        System.out.println("Generated OTP 2: " + otpSupplier.get());
    }
}