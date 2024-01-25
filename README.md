## 멀티 모듈과 JPA

```Java
@SpringBootApplication(scanBasePackages = {"com.batch.core", "com.batch.batch"})
public class BatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(BatchApplication.class, args);
    }
}

```
batch모듈에서 core모듈에 적용되어있는 multi datasource읽어올때 componentScan범위를 넓혀주자
