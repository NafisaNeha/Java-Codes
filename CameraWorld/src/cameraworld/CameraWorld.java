
package cameraworld;


public class CameraWorld {


    public static void main(String[] args) {
        
        System.out.println("ActionCam: ");
        ActionCam a = new ActionCam();
        a.setUses("The ActionCam designed for capturing immersive action shots");
        System.out.println(a.getUses());
        a.VideoQuality("30", "2", "40", "4");
        RedCam obj = new ActionCam();
        obj.inventYear("2005");
        System.out.println("");
        
        
        System.out.println("BasicCam: ");
        BasicCamFeature rare = new BasicCamFeature("George Eastman");
        rare.inventYear(" 1830s");
        rare.VideoQuality("5","8", "10", "15");
        rare.inventor();
        System.out.println("");
        
        
        System.out.println("CompactCam: ");
        CompactCam obj5= new CompactCam();
        obj5.inventYear("1900s");
        obj5.weight("700gm ", "1kg");
        obj5.resolution("2k ", "3k");
        System.out.println("");
        
        System.out.println("RedCam: ");
        
        
        
        
        
        
        
        
        
        
        
        
       
        
    }
    
    
}
