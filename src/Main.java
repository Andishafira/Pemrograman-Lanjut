import javax.swing.JOptionPane;
public class Main {
    void pesantiket(){
        String rute=JOptionPane.showInputDialog("Ke Mana Tujuan Anda Dari Jepara? (Malang,Jakarta,Jogja,Bandung,Bogor)");
        String nama=JOptionPane.showInputDialog("Masukkan Nama");
        String Armada=JOptionPane.showInputDialog("Nama Armada(Nusantara,Shantika,Bejeu,Indonesia)");
        String kelas=JOptionPane.showInputDialog("Kelas(Executive/Super Executive)");


        System.out.println("Nama : "+nama);
        System.out.println("Tujuan : " +rute);
        System.out.println("Armada Yang Digunakan : "+Armada);
        System.out.println("Kelas Armada : "+kelas);


        if(Armada.equalsIgnoreCase("Nusantara") && rute.equalsIgnoreCase("Jakarta")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +230000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +2550000);
            }
        }else if(Armada.equalsIgnoreCase("Nusantara") && rute.equalsIgnoreCase("Malang")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +125000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +150000);
            }
        }else if(Armada.equalsIgnoreCase("Nusantara") && rute.equalsIgnoreCase("Jogja")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +120000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +145000);
            }
        }else if(Armada.equalsIgnoreCase("Nusantara") && rute.equalsIgnoreCase("Bogor")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +250000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +175000);
            }
        }else if(Armada.equalsIgnoreCase("Nusantara") && rute.equalsIgnoreCase("Bandung")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +175000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +200000);
            }

        }else if(Armada.equalsIgnoreCase("Shantika") && rute.equalsIgnoreCase("Malang")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +130000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +155000);
            }

        }else if(Armada.equalsIgnoreCase("Shantika") && rute.equalsIgnoreCase("Jakarta")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +235000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +250000);
            }

        }else if(Armada.equalsIgnoreCase("Shantika") && rute.equalsIgnoreCase("Jogja")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +115000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +140000);
            }

        }else if(Armada.equalsIgnoreCase("Shantika") && rute.equalsIgnoreCase("Bandung")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +175000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +200000);
            }

        }else if(Armada.equalsIgnoreCase("Shantika") && rute.equalsIgnoreCase("Bogor")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +255000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +280000);
            }

        }else if(Armada.equalsIgnoreCase("Bejeu") && rute.equalsIgnoreCase("Malang")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +125000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +150000);
            }

        }else if(Armada.equalsIgnoreCase("Bejeu") && rute.equalsIgnoreCase("Jakarta")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +225000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +250000);
            }

        }else if(Armada.equalsIgnoreCase("Bejeu") && rute.equalsIgnoreCase("Jogja")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +115000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +140000);
            }

        }else if(Armada.equalsIgnoreCase("Bejeu") && rute.equalsIgnoreCase("Bandung")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +170000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +195000);
            }

        }else if(Armada.equalsIgnoreCase("Bejeu") && rute.equalsIgnoreCase("Bogor")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +250000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +275000);
            }

        }else if(Armada.equalsIgnoreCase("Indonesia") && rute.equalsIgnoreCase("Malang")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +130000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +155000);
            }

        }else if(Armada.equalsIgnoreCase("Indonesia") && rute.equalsIgnoreCase("Jakarta")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +225000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +250000);
            }

        }else if(Armada.equalsIgnoreCase("Indonesia") && rute.equalsIgnoreCase("Jogja")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +120000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +145000);
            }

        }else if(Armada.equalsIgnoreCase("Indonesia") && rute.equalsIgnoreCase("Bandung")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +175000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +2000000);
            }

        }else if(Armada.equalsIgnoreCase("Indonesia") && rute.equalsIgnoreCase("Bogor")){
            if(kelas.equalsIgnoreCase("Executive")){
                System.out.println("Harga Rp. " +250000);
            }else if(kelas.equalsIgnoreCase("Super Executive")){
                System.out.println("Harga Rp. " +275000);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Data Yang Anda Masukkan Salah\nmohon input dengan benar");
        }

    }
    public static void main(String[] args) {
        Main tik=new Main();
        tik.pesantiket(); //runtime error
    }

}