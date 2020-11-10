package edu.cnm.deepdive.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Index {

  @Expose
  private String name;

  @Expose
  private boolean unique;

  @Expose
  @SerializedName("columnNames")
  private String[] columns;

  @Expose
  @SerializedName("createSql")
  private String ddl;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isUnique() {
    return unique;
  }

  public void setUnique(boolean unique) {
    this.unique = unique;
  }

  public String[] getColumns() {
    return columns;
  }

  public void setColumns(String[] columns) {
    this.columns = columns;
  }

  public String getDdl() {
    return ddl;
  }

  public void setDdl(String ddl) {
    this.ddl = ddl;
  }
}
