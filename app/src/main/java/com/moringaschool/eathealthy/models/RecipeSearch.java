//
//package com.moringaschool.eathealthy.models;
//
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//
//
//public class RecipeSearch {
//
//    @SerializedName("recipe")
//    @Expose
//    private Recipe recipe;
//    @SerializedName("_links")
//    @Expose
//    private Links links;
//
//    /**
//     * No args constructor for use in serialization
//     *
//     */
//    public RecipeSearch() {
//    }
//
//    /**
//     *
//     * @param recipe
//     * @param links
//     */
//    public RecipeSearch(Recipe recipe, Links links) {
//        super();
//        this.recipe = recipe;
//        this.links = links;
//    }
//
//    public Recipe getRecipe() {
//        return recipe;
//    }
//
//    public void setRecipe(Recipe recipe) {
//        this.recipe = recipe;
//    }
//
//    public Links getLinks() {
//        return links;
//    }
//
//    public void setLinks(Links links) {
//        this.links = links;
//    }
//
//}


package com.moringaschool.eathealthy.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class RecipeSearch {

    @SerializedName("q")
    @Expose
    private String q;
    @SerializedName("from")
    @Expose
    private Integer from;
    @SerializedName("to")
    @Expose
    private Integer to;
    @SerializedName("more")
    @Expose
    private Boolean more;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("hits")
    @Expose
    private List<Hit> hits = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public RecipeSearch() {
    }

    /**
     *
     * @param hits
     * @param q
     * @param more
     * @param count
     * @param from
     * @param to
     */
    public RecipeSearch(String q, Integer from, Integer to, Boolean more, Integer count, List<Hit> hits) {
        super();
        this.q = q;
        this.from = from;
        this.to = to;
        this.more = more;
        this.count = count;
        this.hits = hits;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

}

