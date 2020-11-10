package edu.cnm.deepdive.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Entity {

  @Expose
  @SerializedName("tableName")
  private String name;

  @Expose
  @SerializedName("createSql")
  private String ddl;

  @Expose
  private List<Index> indices;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDdl() {
    return ddl;
  }

  public void setDdl(String ddl) {
    this.ddl = ddl;
  }

  public List<Index> getIndices() {
    return indices;
  }

  public void setIndices(List<Index> indices) {
    this.indices = indices;
  }

}
