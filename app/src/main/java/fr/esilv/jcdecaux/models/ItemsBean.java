package fr.esilv.jcdecaux.models;

class ItemsBean {
    private String kind;
    private String etag;
    private IdBean id;
    private SnippetBean snippet;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public IdBean getId() {
        return id;
    }

    public void setId(IdBean id) {
        this.id = id;
    }

    public SnippetBean getSnippet() {
        return snippet;
    }

    public void setSnippet(SnippetBean snippet) {
        this.snippet = snippet;
    }
}
