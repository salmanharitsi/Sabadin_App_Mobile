package id.co.salmanharitsi.uts_dpw_sallman;

public class Konten {

    private int img;

    private String tgl;

    private String author;

    private String desc;

    public Konten(int img, String tgl, String author, String desc){
        this.img = img;
        this.tgl = tgl;
        this.author = author;
        this.desc=desc;;
    }

    public int getImg(){
        return img;
    }

    public void setImg(int img){
        this.img = img;
    }

    public String getTgl(){
        return tgl;
    }

    public void setTgl(String tgl){
        this.tgl=tgl;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc=desc;
    }

    @Override
    public String toString(){
        return "Konten{" +
                "img=" + img +
                ", tgl='" + tgl + '\'' +
                ", author='" + author + '\''+
                ", desc='" + desc + '\'' +
                '}';
    }
}
