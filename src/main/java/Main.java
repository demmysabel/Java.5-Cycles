import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.ShouldCountSquareInRange(100, 800);
        System.out.println(result);

    }
}
