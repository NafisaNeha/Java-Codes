
package cameraworld;


public class CompactCam extends BasicCamFeature implements MirrorLessCam{
    
    @Override
    public void inventYear(String Y){
        System.out.println("The Compact camera invented in a "+ Y);
    }
    
    public void weight(String K, String G){
        System.out.println("Compact pack weight range is "+ K +"to "+G+" kg");
    }
   

    @Override
    public void resolution(String M, String P){
        
        System.out.println("The resoulation range of Mirrorless camera is "+ M + "to "+P);
        
    }
    
}

