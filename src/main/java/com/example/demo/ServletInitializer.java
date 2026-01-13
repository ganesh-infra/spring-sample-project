@SpringBootApplication
public class CrudOperationApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CrudOperationApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudOperationApplication.class, args);
    }
}
