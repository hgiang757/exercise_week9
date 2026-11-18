package com.lab;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {
    // 1. Khai báo Logger
    private static final Logger logger = LoggerFactory.getLogger(AppService.class);

    public void processOrder(String orderId) {
        // 2. Dùng Parameterized Logging (INFO) thay cho System.out.println
        logger.info("Bắt đầu xử lý đơn hàng ID: {}", orderId);

        try {
            // Logic xử lý...
        } catch (Exception e) {
            // 3. Ghi log ngoại lệ (ERROR) kèm stacktrace
            logger.error("Lỗi khi xử lý đơn hàng ID: {}", orderId, e);
        }
    }
}
