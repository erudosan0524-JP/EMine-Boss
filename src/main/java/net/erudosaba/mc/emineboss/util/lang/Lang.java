package net.erudosaba.mc.emineboss.util.lang;

public enum Lang {
    JAPANESE("lang_ja.yml"),
    ENGLISH("lang_en.yml");

    private String path;

    private Lang(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
