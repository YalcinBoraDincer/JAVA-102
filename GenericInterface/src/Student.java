public class Student <T> implements IDataBase<T>{
    @Override
    public boolean insert(T data) {
        System.out.println("Veri Eklendi");
        return true;
    }

    @Override
    public boolean delete(T data) {

        System.out.println("Veri Silindi");
        return true;
    }

    @Override
    public boolean update(T data) {

        System.out.println("Veri Guncellendi");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Veri cekildi ! ");
        return null;
    }
}
