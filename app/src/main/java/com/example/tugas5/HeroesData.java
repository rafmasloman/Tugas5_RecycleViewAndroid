package com.example.tugas5;

import java.util.ArrayList;

public class HeroesData {
    private static String Judul [] = {
            "Bali",
            "England",
            "Japan",
            "Raja Ampat",
            "Paris",
    };

    private static String Genre [] = {

            "Bali, Indonesia",
            "England Country",
            "Japan Country",
            "Raja Ampat, Indonesia",
            "Paris, France"
    };

    private static String Descrition [] = {
            "Bali Merupakan Tempat Wisata yang sering dikunjungi Wisatawan dalam maupun dari luar Indonesia, Dengan Banyaknya tempat-tempat wisata seperti Pantai Kuta, dll Membuat bali menjadi salah satu kota wisata yang patut dikunjungi",
            "England Negeri yang patut dijadikan destinasi jika ingin berlibur keluar negeri, banyak tempat-tempat yang bisa kita kunjungi atau dijadikan destinasi wisata",
            "Jepang, Siapa yang tak mengenal tempat wisata di jepang?, Negeri Sakura ini telah berhasil menjadi salah satu negara maju di Asia bahkan dunia. Produk yang dihasilkan negara ini sudah tidak asing lagi digunakan dalam kehidupan sehari-hari, Tak hanya maju dalam bidang teknologi, Jepang juga terus meningkatkan pamornya di bidang pariwisata. Banya wisatawan asing yang memilih jepang sebagai tempat tujuannya",
            "Siapa yang tidak kenal dengan Raja Ampat? Paket pesona bahari yang dimiliki Raja Ampat menjadikannya sebagai destinasi wisata yang cukup sering dibicarakan dan  dikunjungi para wisatawan, baik wisatawan lokal ataupun mancanegara. Semua objek wisata di Raja Ampat adalah paket wisata yang sungguh menakjubkan. Mulai dari birunya air laut, gugusan pulau karang di tengah laut, hard coral yang tumbuh melebihi batas air, hingga gua bawah laut—semua hal itu pasti akan membuat Anda terpesona oleh keindahannya.",
            "Paris,Sebagai pusat mode di seluruh Eropa dan bahkan dunia, Paris, Prancis merupakan salah satu destinasi liburan urban yang paling diimpikan di dunia. Paris terletak di sisi utara negara ini dan memiliki banyak restoran berbintang Michelin yang menyajikan berbagai makanan lezat; toko label desainer seperti Gucci, Louis Vuitton, Cartier, dan Versace; serta nuansa seni yang mendorong seniman muda berbakat untuk menunjukkan potensi mereka."

    };

    private  static  int HeroImages[] = {
            R.drawable.bali,
            R.drawable.england,
            R.drawable.japan,
            R.drawable.raja_ampat,
            R.drawable.paris,


    };

    public static ArrayList<Hero> getListData(){
      ArrayList<Hero> list = new ArrayList<>();
      for (int position = 0; position < Judul.length; position++){
          Hero hero = new Hero();
          hero.setName(Judul[position]);
          hero.setGenre(Genre[position]);
          hero.setDetail(Descrition[position]);
          hero.setPhoto(HeroImages[position]);
          list.add(hero);
      }
      return list;
    };
}
