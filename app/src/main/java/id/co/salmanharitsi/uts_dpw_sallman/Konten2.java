package id.co.salmanharitsi.uts_dpw_sallman;

public class Konten2 {

    private int img;



    public Konten2(int img){
        this.img = img;
    }

    public int getImg(){
        return img;
    }

    public void setImg(int img){
        this.img = img;
    }


    @Override
    public String toString(){
        return "Konten{" +
                "img=" + img;
    }
}
