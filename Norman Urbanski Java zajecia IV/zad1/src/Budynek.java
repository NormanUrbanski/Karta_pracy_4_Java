

public interface Budynek {
    public  double powierzchnia (double powBudynku, double powPodworka, double powParkingu);

  public String adresBudynku (String miejscowosc, String ulica, int nrDomu, String nrLokalu, String   kodPocztowy);

  public void liczbaokben (int vague); // użycie jak setter

  public void liczbaMiszkancow(int vague); // użycie jak seter

 public void kolorDomu(KolorEnum kolor); //użycie jak seter

 public double wyliczCene(double powierzchnia, double cena);
  
 public void setWlasciciel(String imie,String nazwisko);
  
}
