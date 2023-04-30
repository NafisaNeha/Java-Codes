
package cameraworld;


public abstract class RedCam implements DSLR,MirrorLessCam{
    
    abstract void VideoQuality(String A, String B, String C, String D );
    
    @Override
    public void supportableLens(String S, String R){
        System.out.println("The supportables lens are between "+S+ "mmto "+R+"mm");
    }
    public void inventYear(String Y){
        System.out.println("The camera invented in "+ Y);
    }
    
    @Override
    public void resolution(String M, String P){
        System.out.println("The resolution of the RedCam is "+M+" to"+P);
    }
    
    @Override
    public void priceRange(int T, int K){
        System.out.println("The price is between "+ T + " and "+ K);
    }
}
