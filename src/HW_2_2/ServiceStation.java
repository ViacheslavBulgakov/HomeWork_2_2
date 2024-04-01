package HW_2_2;

public class ServiceStation {
    public void service(String modelName, int wheelsCount, int engine, int trailer) {
        if (modelName != null) {
            System.out.println(" Обслуживаем " + modelName);
            for (int i = 0; i < wheelsCount; i++) {
                System.out.println("Меняем покрышку ");
            }
            System.out.println("Проверяем двигатель ");
            System.out.println("Проверяем прицеп ");
        }
    }

    public void service(String modelName, int wheelsCount, int engine) {
        if (modelName != null) {
            System.out.println(" Обслуживаем " + modelName);
            for (int i = 0; i < wheelsCount; i++) {
                System.out.println("Меняем покрышку ");
            }
            System.out.println("Проверяем двигатель ");
        }
    }

    public void service(String modelName, int wheelsCount) {
        if (modelName != null) {
            System.out.println(" Обслуживаем " + modelName);
            for (int i = 0; i < wheelsCount; i++) {
                System.out.println("Меняем покрышку ");
            }
        }
    }
}
