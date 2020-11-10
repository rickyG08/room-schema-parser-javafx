package edu.cnm.deepdive.model;

import com.google.gson.annotations.Expose;
import java.util.List;

public class Database {

  @Expose
  private List<Entity> entities;

  @Expose
  private List<View> views;

  public List<Entity> getEntities() {
    return entities;
  }

  public void setEntities(List<Entity> entities) {
    this.entities = entities;
  }

  public List<View> getViews() {
    return views;
  }

  public void setViews(List<View> views) {
    this.views = views;
  }

}
