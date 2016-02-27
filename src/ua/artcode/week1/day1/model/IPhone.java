package ua.artcode.week1.day1.model;

/**
 * Created by serhii on 17.01.16.
 */
public class IPhone {

    private int ram = 1;
    private int rom = 8;
    private String version;

    public IPhone(String version){
        this.version = version;
    }

    public IPhone(int ram, int rom, String version){
        this.ram = ram;
        this.rom = rom;
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IPhone iPhone = (IPhone) o;

        if (ram != iPhone.ram) return false;
        if (rom != iPhone.rom) return false;
        return !(version != null ? !version.equals(iPhone.version) : iPhone.version != null);

    }

    @Override
    public int hashCode() {
        int result = ram;
        result = 31 * result + rom;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getVersion() {
        return version;
    }
}
