
package cameraworld;


public class BasicCamFeature extends ActionCam{
    String g;
    BasicCamFeature(){
        
    }
    
    BasicCamFeature(String X){
        g=X;
    }
    void inventor(){
        System.out.println("Invented by: "+g);
    }
    
    
    @Override
    public void inventYear(String Y){
        System.out.println("The Action camera invented in a"+ Y);
     }
    @Override
    public void VideoQuality(String A, String B, String C, String D){
        System.out.println("The Basic Camera captures " +A+ "  frames per second at"+ B+"K resolution and "+C+ "frames per second at "+ 4+"K resolution");
    }
}
