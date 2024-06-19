package com.example.arabee.data.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hijaiyah {
     private String ID;
     private String image;

     public Hijaiyah(String ID, String image) {
          this.ID = ID;
          this.image = image;
     }

     public String getID() {
          return ID;
     }

     public void setID(String ID) {
          this.ID = ID;
     }

     public String getImage() {
          return image;
     }

     public void setImage(String image) {
          this.image = image;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Hijaiyah hijaiyah = (Hijaiyah) o;
          return Objects.equals(ID, hijaiyah.ID) && Objects.equals(image, hijaiyah.image);
     }

     @Override
     public int hashCode() {
          return Objects.hash(ID, image);
     }

}
