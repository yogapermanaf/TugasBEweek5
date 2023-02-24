package tugasOOP;

public class Segitiga implements BangunDatar{
    Segitiga(){

    }

    @Override
    public double luas (int s1, int s2){
        return (0.5 * s1 * s2);
    }

    @Override
    public double keliling (int s1, int s2, int s3, int s4) {
        return (s1 + s2 + s3 + s4);
    }
}
