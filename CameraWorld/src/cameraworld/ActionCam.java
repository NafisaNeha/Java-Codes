
package cameraworld;


public class ActionCam extends RedCam{
    
    private String uses;
    

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }
    
    @Override
    public void inventYear(String Y){
        System.out.println("The Action camera invented in "+ Y);
     }
    
    @Override
    public void VideoQuality(String A, String B, String C, String D){
        System.out.println("It captures " +A+ "  frames per second at "+ B+"K resolution and "+C+ " frames per second at "+ 4+"K resolution");
    }
}
