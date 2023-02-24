package tugasOOP;

public class Persegi implements BangunDatar{
    Persegi(){

    }

    @Override
    public double luas (int s1){
        return (s1 * s1);
    }

    @Override
    public double keliling (int s1) {
        return (4 * s1);
    }

}
