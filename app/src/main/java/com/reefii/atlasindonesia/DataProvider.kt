package com.reefii.atlasindonesia

import android.app.Application


class App : Application() {
    companion object {
        lateinit var instance: App private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}

object DataProvider {

    val Item_Atlasin = listOf(
        Item_Atlasin(
            nourutp = 1,
            namep = R.string.NKRI,
            //detailp = "Indonesia, disebut juga dengan Negara Kesatuan Republik Indonesia (NKRI, pengucapan bahasa Indonesia: [nə\\ˈɡara kəsa\\ˈt̪ua̯n re\\ˈpublɪk in.\\ˈdo.nɛ.sja]); atau hanya Republik Indonesia (RI) adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia. Indonesia adalah negara kepulauan terbesar di dunia yang terdiri dari 17.504 pulau.[15] Nama alternatif yang biasa dipakai adalah Nusantara.[16] Dengan populasi mencapai 270.203.917 jiwa pada tahun 2020,[17] Indonesia adalah negara berpenduduk terbesar keempat di dunia dan negara yang berpenduduk Muslim terbesar di dunia, dengan penganut lebih dari 230 juta jiwa. Bentuk negara Indonesia adalah negara kesatuan dan bentuk pemerintahan Indonesia adalah republik, dengan Dewan Perwakilan Rakyat, Dewan Perwakilan Daerah dan Presiden yang dipilih secara langsung. Ibu kota negara Indonesia adalah Jakarta. Indonesia berbatasan darat dengan Malaysia di Pulau Kalimantan dan Pulau Sebatik, dengan Papua Nugini di Pulau Papua dan dengan Timor Leste di Pulau Timor. Negara tetangga lainnya adalah Singapura, Filipina, Australia, dan wilayah persatuan Kepulauan Andaman dan Nikobar di India. Jumlah Pulau di Indonesia (termasuk pulau besar dan pulau kecil) yang tertera pada Undang-Undang no 6 Tahun 1996 tentang Perairan Indonesia adalah 17.508 Pulau, namun adanya permasalahan effective occupation pada 4 Pulau yaitu Pulau Sipadan, Pulau Ligitan, Pulau Yako dan Pulau Kambing menyebabkan lepasnya kedaulatan terhadap Pulau tersebut. Untuk menghindari hal tersebut terulang kembali maka Pemerintah Republik Indonesia melakukan banyak tindakan dan kegiatan di wilayah perbatasan khususnya di Pulau-pulau Kecil dan Pulau-pulau Kecil Terluar. Indonesia mempunyai 111 Pulau-Pulau Kecil Terluar yang telah ditetapkan dalam Kepres 6/2017 tentang Penetapan Pulau-Pulau Kecil Terluar. Di Indonesia terdapat 5 pulau besar meliputi Pulau Sumatra, Pulau Jawa, Pulau Kalimantan, Pulau Sulawesi serta Pulau Papua.\n",
            detailp = R.string.des_NKRI,
            logodaerahp = R.drawable.nkri_logo,
            imagepulaup = R.drawable.nkri
        ),

        Item_Atlasin(
            nourutp = 2,
            //namep = "PULAU SUMATRA",
            //detailp = "Dikutip dalam buku \\'Ayo Mengenal Indonesia: Sumatra 1\\' oleh Munasifah, luas seluruh Pulau Sumatra adalah 473.600 kilometer persegi, hampir seluas negeri Inggris Raya. Di bagian baratnya membentang Samudra Hindia; di bagian timur dan tenggaranya Selat Malaka, Selat Karimata, dan Laut Jawa; sedangkan di bagian selatannya membentang Selat Sunda. Bentuk Pulau Sumatera memanjang dari Ulee Lheue di utara sampai Tanjung Cina di selatan, sepanjang sekitar 1.650 kilometer. Lebarnya di utara antara 100 dan 200 kilometer, sedangkan lebar bagian selatannya sekitar 350 kilometer. Dua teluknya yang terbesar adalah Semangka dan Lampung di Provinsi Lampung. Secara administratif, wilayahnya terbagi dalam satu daerah istimewa (Aceh) dan 9 provinsi (Sumatera Utara, Sumatera Barat, Bengkulu, Riau, Kepulauan Riau, Jambi, Sumatera Selatan, Lampung, Kepulauan Bangka Belitung).\n",
            namep = R.string.PULAUSUMATRA,
            detailp = R.string.des_PULAUSUMATRA,
            logodaerahp = R.drawable.nkri_logo,
            imagepulaup = R.drawable.pul_sumatera
        ),

        Item_Atlasin(
            nourutp = 3,
            //namep = "ACEH",
            //detailp = "Aceh diresmikan sebagai provinsi pada tanggal 7 Desember 1959. Memiliki luas wilayah 57.956,00 km persegi. Saat ini ada 5.371.532 penduduk yang menempati provinsi Aceh. Ibukota dari provinsi Aceh adalah Banda Aceh. Mayoritas agama dari penduduk Aceh adalah Islam.\n",
            namep = R.string.ACEH,
            detailp = R.string.des_ACEH,
            logodaerahp = R.drawable.aceh_logo,
            imagepulaup = R.drawable.aceh
        ),

        Item_Atlasin(
            nourutp = 4,
            //namep = "SUMATRA UTARA",
            //detailp = "Sumatera Utara diresmikan oleh pemerintah pertama kali pada tanggal 29 November 1956. Provinsi ini memiliki luas daerah sebesar 72.981,23 km persegi dengan penduduk sebanyak 15.851.851 jiwa yang mayoritas beragama Islam. Sumatera Utara menjadi provinsi dengan penduduk terbanyak di Indonesia yang menduduki peringkat keempat. Ibu kota dari Sumatera Utara adalah kota Medan.\n",
            namep = R.string.SUMATRAUTARA,
            detailp = R.string.des_SUMATRAUTARA,
            logodaerahp = R.drawable.sumut_logo,
            imagepulaup = R.drawable.sumut
        ),

        Item_Atlasin(
            nourutp = 5,
            //namep = "SUMATRA SELATAN",
            //detailp = "Sumatera Selatan diresmikan oleh pemerintah pertama kali pada tanggal 14 Agustus 1960. Provinsi yang berbatasan dengan Provinsi Jambi ini memiliki luas daerah sebesar 91.592,43 km persegi dengan penduduk sebanyak 7.941.500 jiwa yang mayoritas beragama Islam. Ibu kota dari Provinsi yang terletak di bagian selatan pulau Sumatera ini memiliki kota Palembang sebagai Ibukotanya.\n",
            namep = R.string.SUMATRASELATAN,
            detailp = R.string.des_SUMATRASELATAN,
            logodaerahp = R.drawable.sumsel_logo,
            imagepulaup = R.drawable.sumsel
        ),

        Item_Atlasin(
            nourutp = 6,
            //namep = "SUMATRA BARAT",
            //detailp = "Sumatera Barat diresmikan oleh pemerintah pertama kali pada tanggal 9 Agustus 1957. Provinsi ini memiliki luas daerah sebesar 42.012,89 km persegi dengan penduduk sebanyak 5.131.900 jiwa yang mayoritas beragama Islam. Kota Padang sebagai kota terbesar di bagian barat Pulau Sumatera menjadi Ibu kota dari provinsi ini. Kota Padang merupakan pintu gerbang negara Indonesia dari Samudera Hindia.\n",
            namep = R.string.SUMATRABARAT,
            detailp = R.string.des_SUMATRABARAT,
            logodaerahp = R.drawable.sumbar_logo,
            imagepulaup = R.drawable.sumbar
        ),

        Item_Atlasin(
            nourutp = 7,
            //namep = "BENGKULU",
            //detailp = "Provinsi yang berada di Sumatera ini pertama kali diresmikan sebagai provinsi pada tanggal 18 November 1968. Provinsi Bengkulu memiliki Ibukota yang bernama sama, yaitu Bengkulu. Provinsi yang memiliki luas daerah sebesar 19.919,33 km persegi ini diduduki oleh sebanyak 1.884.800 jiwa dengan mayoritas memeluk agama Islam.\n",
            namep = R.string.BENGKULU,
            detailp = R.string.des_BENGKULU,
            logodaerahp = R.drawable.bengkulu_logo,
            imagepulaup = R.drawable.bengkulu
        ),

        Item_Atlasin(
            nourutp = 8,
            //namep = "RIAU",
            //detailp = "Provinsi Riau memiliki kota Pekanbaru sebagai Ibukotanya. Provinsi yang lahir pada tanggal 9 Agustus 1957 ini berada di bagian tengah pantai Timur kepulauan Sumatera. Penduduk dari provinsi Riau sebanyak 60% nya menganut agama Islam. Provinsi Riau memiliki luas daerah sebesar 50.058,16 km persegi dengan penduduk sebanyak 3.344.400 jiwa.\n",
            namep = R.string.RIAU,
            detailp = R.string.des_RIAU,
            logodaerahp = R.drawable.riau_logo,
            imagepulaup = R.drawable.riau
        ),

        Item_Atlasin(
            nourutp = 9,
            //namep = "KEP. RIAU",
            //detailp = "Provinsi Kepulauan Riau adalah provinsi Indonesia yang berbatasan dengan Kamboja Utara dan Vietnam. Provinsi Kepulauan Riau memiliki kota Tanjungpinang sebagai Ibukotanya. Provinsi ini pertama kali diresmikan oleh pemerintah pada tanggal 25 Oktober tahun 2002. Penduduk yang menempati Kepulauan Riau berjumlah 1.917.415 jiwa dengan mayoritas memeluk agama Islam. kepulauan Riau memiliki luas daerah sebesar 8.201,72 km persegi.\n",
            namep = R.string.KEP_RIAU,
            detailp = R.string.des_KEP_RIAU,
            logodaerahp = R.drawable.kepriau_logo,
            imagepulaup = R.drawable.kepriau
        ),

        Item_Atlasin(
            nourutp = 10,
            //namep = "JAMBI",
            //detailp = "Provinsi Jambi memiliki Ibukota yang bernama sama dengan provinsinya yaitu, Jambi. Pertama kali diresmikan oleh pemerintah pada tanggal 9 Agustus 1957. Provinsi Jambi memiliki luas daerah sebesar 50.058,16 km persegi dengan penduduk sebanyak 3.344.400 jiwa. 65% dari penduduk Provinsi Jambi menganut agama Islam.\n",
            namep = R.string.JAMBI,
            detailp = R.string.des_JAMBI,
            logodaerahp = R.drawable.jambi_logo,
            imagepulaup = R.drawable.jambi
        ),

        Item_Atlasin(
            nourutp = 11,
            //namep = "LAMPUNG",
            //detailp = "Lampung lahir pada tanggal 18 Maret 1964. Provinsi yang terletak di Selatan Pulau Sumatera ini memiliki Ibukota di kota Bandar Lampung. Provinsi Lampung mempunyai dua kota, Kota Bandar Lampung dan Kota Metro. Provinsi Lampung memiliki luas daerah sebesar 34.623,80 km persegi dengan penduduk sebanyak 8.026.191 jiwa. Mayoritas dari penduduk Lampung memeluk agama Islam.\n",
            namep = R.string.LAMPUNG,
            detailp = R.string.des_LAMPUNG,
            logodaerahp = R.drawable.lampung_logo,
            imagepulaup = R.drawable.lampung
        ),

        Item_Atlasin(
            nourutp = 12,
            //namep = "BANGKA BELITUNG",
            //detailp = "Kepulauan Bangka Belitung diresmikan pada tanggal 21 November tahun 2000. Memiliki luas daerah 16.424,05 km persegi dengan penduduk sebanyak 1.343.900 jiwa. Ibukota dari Bangka Belitung adalah Pangkalpinang. Setengah penduduk Bangka Belitung memeluk agama Islam.\n",
            namep = R.string.BANGKABELITUNG,
            detailp = R.string.des_BANGKABELITUNG,
            logodaerahp = R.drawable.babel_logo,
            imagepulaup = R.drawable.babel
        ),

        Item_Atlasin(
            nourutp = 13,
            //namep = "PULAU KALIMANTAN",
            //detailp = "Pulau yang sebagian besar masih terdiri hutan dan menjadi habitat bagi sejumlah tumbuhan serta satwa endemik ini memiliki luas sekitar 743.330 km persegi. Pulau Kalimantan memiliki batas laut sebelah Barat dengan Selat Karimata, sebelah Timur dengan Selat Makassar, sebelah Selatan dengan Laut Jawa, dan sebelah Utara dengan Laut China Selatan.\n",
            namep = R.string.PULAUKALIMANTAN,
            detailp = R.string.des_PULAUKALIMANTAN,
            logodaerahp = R.drawable.nkri_logo,
            imagepulaup = R.drawable.pul_kalimantan
        ),

        Item_Atlasin(
            nourutp = 14,
            //namep = "KALIMANTAN BARAT",
            //detailp = "Kota Pontianak adalah Ibukota dari Provinsi Kalimantan Barat. Kalimantan Barat pertama kali diresmikan sebagai provinsi oleh pemerintah pada tanggal 7 Desember 1956. Provinsi yang terletak di sebelah barat pulau Kalimantan ini memiliki luas daerah sebesar 147.307,00 km persegi yang ditempati oleh sebanyak 4.716.093 jiwa. Setengah penduduk Kalimantan Barat menganut agama Islam. Kalimantan Barat menduduki peringkat keempat sebagai provinsi terbesar di Indonesia.\n",
            namep = R.string.KALIMANTANBARAT,
            detailp = R.string.des_KALIMANTANBARAT,
            logodaerahp = R.drawable.kalbar_logo,
            imagepulaup = R.drawable.kalbar
        ),

        Item_Atlasin(
            nourutp = 15,
            //namep = "KALIMANTAN TIMUR",
            //detailp = "Kalimantan Timur adalah Provinsi Indonesia yang berbatasan dengan Negara Malaysia. Ibukota dari Provinsi Kalimantan Timur adalah Samarinda. Pertama kali diresmikan oleh Pemerintah pada 2 Juli 1958. Kalimantan Timur memiliki luas daerah sebesar 129.066,64 km persegi dengan penduduk sebanyak 3.351.432 yang kebanyakan memeluk agama Islam.\n",
            namep = R.string.KALIMANTANTIMUR,
            detailp = R.string.des_KALIMANTANTIMUR,
            logodaerahp = R.drawable.kaltim_logo,
            imagepulaup = R.drawable.kaltim
        ),

        Item_Atlasin(
            nourutp = 16,
            //namep = "KALIMANTAN SELATAN",
            //detailp = "Provinsi Kalimantan Selatan lahir pada tanggal 7 Desember 1956. Kalimantan Selatan memiliki populasi penduduk sebanyak 3.922.790 dengan luas daerah sebesar 38.744,23 km persegi. 98% dari penduduk provinsi Kalimantan Selatan memeluk agama Islam. Provinsi Kalimantan Selatan memiliki kota Banjarmasin sebagai ibukotanya.\n",
            namep = R.string.KALIMANTANSELATAN,
            detailp = R.string.des_KALIMANTANSELATAN,
            logodaerahp = R.drawable.kalsel_logo,
            imagepulaup = R.drawable.kalsel
        ),

        Item_Atlasin(
            nourutp = 17,
            //namep = "KALIMANTAN TENGAH",
            //detailp = "Palangkaraya adalah Ibukota dari Provinsi Kalimantan tengah. Kalimantan tengah pertama kali diresmikan sebagai provinsi pada tanggal 2 Juli 1958. Provinsi ini memiliki luas daerah sebesar 153.564,50 yang ditempati oleh sebanyak 2.439.858 jiwa. Sebagian besar penduduk Kalimantan Tengah menganut agama Islam.\n",
            namep = R.string.KALIMANTANTENGAH,
            detailp = R.string.des_KALIMANTANTENGAH,
            logodaerahp = R.drawable.kaltengah_logo,
            imagepulaup = R.drawable.kaltengah
        ),

        Item_Atlasin(
            nourutp = 18,
            //namep = "KALIMANTAN UTARA",
            //detailp = "Kalimantan Utara (disingkat Kaltara) adalah sebuah provinsi di Indonesia yang terletak di bagian utara Pulau Kalimantan. Provinsi ini berbatasan langsung dengan negara tetangga Malaysia, yaitu Negara Bagian Sabah dan Sarawak. Pusat pemerintahan Kalimantan Utara saat ini berada di Kota Tanjung Selor, bersama dengan pusat pemerintahan Kabupaten Bulungan. Provinsi ini memiliki luas daerah 75.467,70 km2 dengan penduduk sebanyak 688.426 jiwa \n",
            namep = R.string.KALIMANTANUTARA,
            detailp = R.string.des_KALIMANTANUTARA,
            logodaerahp = R.drawable.kalut_logo,
            imagepulaup = R.drawable.kalut
        ),

        Item_Atlasin(
            nourutp = 19,
            //namep = "PULAU JAWA",
            //detailp = "Meski menjadi tumpuan perputaran ekonomi utama di Indonesia, namun luas Pulau Jawa bukanlah yang terbesar di Indonesia. Berdasarkan peta, Pulau Jawa diperkirakan mencapai 128,297 km² dengan enam provinsi dan pulau-pulau kecil di sekitarnya. Provinsi di Pulau Jawa adalah DKI Jakarta, Jawa Barat, Jawa Tengah, DI Yogyakarta, Jawa Timur, dan Banten. Adapun batas daratan bagian utara yakni Laut Jawa dan Pulau Kalimantan, batas selatan yakni Samudera Hindia, batas Barat yakni Pulau Sumatera, dan batas Timur yakni Pulau Bali. Sementara batas perairan terdapat batas Utara yakni Laut Jawa, batas Selatan yakni Samudera Hindia, batas Barat yakni Selat Sunda, dan batas Timur yakni Selat Bali.\n",
            namep = R.string.PULAUJAWA,
            detailp = R.string.des_PULAUJAWA,
            logodaerahp = R.drawable.nkri_logo,
            imagepulaup = R.drawable.pul_jawa
        ),

        Item_Atlasin(
            nourutp = 20,
            //namep = "BANTEN",
            //detailp = "Banten adalah provinsi yang memiliki Ibukota Serang. Provinsi Banten memiliki penduduk sebanyak 11.704.877 jiwa dengan mayoritas memeluk agama Islam. Provinsi ini mulai diresmikan oleh Pemerintah pada tanggal 4 Oktober tahun 2000. Provinsi Banteng memiliki luas daerah sebesar 9.662,92 km persegi.\n",
            namep = R.string.BANTEN,
            detailp = R.string.des_BANTEN,
            logodaerahp = R.drawable.banten_logo,
            imagepulaup = R.drawable.banten
        ),

        Item_Atlasin(
            nourutp = 21,
            //namep = "DKI. JAKARTA",
            //detailp = "Daerah Khusus Ibukota Jakarta adalah Ibukota dari negara Indonesia. Kota Jakarta merupakan kota yang satu tingkat dengan provinsi. Jakarta menjadi kota terbesar di Indonesia. Ibukota Jakarta lahir pada tanggal 28 Agustus 1961. provinsi ini memiliki luas wilayah sebesar 664,01 km persegi dengan 10.012.271 jiwa yang menempati Ibu Kota Jakarta.\n",
            namep = R.string.DKI_JAKARTA,
            detailp = R.string.des_DKI_JAKARTA,
            logodaerahp = R.drawable.dki_logo,
            imagepulaup = R.drawable.dki
        ),

        Item_Atlasin(
            nourutp = 22,
            //namep = "JAWA BARAT",
            //detailp = "Ibukota dari Provinsi Jawa Barat adalah kota Bandung yang menjadi kota metropolitan terbesar di Provinsi Jawa Barat. Provinsi Jawa Barat pertama kali diresmikan pada tanggal 4 Juli 1950. Penduduk yang ada di Jawa Barat sebanyak 48. 274.162 jiwa dan mayoritas menganut agama Islam. Provinsi Jawa Barat memiliki luas daerah sebesar 35.377,76 km persegi.\n",
            namep = R.string.JAWABARAT,
            detailp = R.string.des_JAWABARAT,
            logodaerahp = R.drawable.jabar_logo,
            imagepulaup = R.drawable.jabar
        ),

        Item_Atlasin(
            nourutp = 23,
            //namep = "JAWA TENGAH",
            //detailp = "Provinsi Jawa Tengah diresmikan oleh pemerintah sebagai provinsi pada tangga; 4 Maret 1950. Jawa Tengah memiliki Semarang sebagai Ibukotanya. Provinsi Jawa Tengah ditempati oleh 3.553.100 penduduk dengan luas daerah sebesar 3.133,15 km persegi.  85% Penduduk dari Provinsi Jawa Tengah memeluk agama Islam\n",
            namep = R.string.JAWATENGAH,
            detailp = R.string.des_JAWATENGAH,
            logodaerahp = R.drawable.jateng_logo,
            imagepulaup = R.drawable.jateng
        ),

        Item_Atlasin(
            nourutp = 24,
            //namep = "DI. YOGYAKARTA",
            //detailp = "Daerah Istimewa Yogyakarta merupakan peleburan dari Negara Kesultanan Yogyakarta dan Kadipaten pakuAlaman. Provinsi yang berada di selatan pulau Jawa ini pertama kali diresmikan oleh pemerintah pada tanggal 4 Maret 1950. Daerah Istimewa Yogyakarta memiliki penduduk sebanyak 3.553.100 jiwa dengan mayoritas pemeluk agama Islam. Provinsi di Jawa ini memiliki luas daerah sebesar 3.133,15 km persegi. Kota Yogyakarta menjadi pusat pemerintahan sekaligus Ibukota dari provinsi daerah Istimewa Yogyakarta. Selain itu, Kota Yogyakarta adalah salah satu kota terbesar di Indonesia.\n",
            namep = R.string.DI_YOGYAKARTA,
            detailp = R.string.des_DI_YOGYAKARTA,
            logodaerahp = R.drawable.diy_logo,
            imagepulaup = R.drawable.diy
        ),

        Item_Atlasin(
            nourutp = 25,
            //namep = "JAWA TIMUR",
            //detailp = "Ibukota dari Provinsi Jawa Timur adalah Surabaya. Provinsi Jawa Timur pertama kali diresmikan pada tanggal 4 Juli 1950. Penduduk yang ada di Jawa Timur sebanyak 38.610.202 jiwa dan mayoritas menganut agama Islam. Provinsi Jawa Timur memiliki luas daerah sebesar 37.799,75 km persegi.\n",
            namep = R.string.JAWATIMUR,
            detailp = R.string.des_JAWATIMUR,
            logodaerahp = R.drawable.jatim_logo,
            imagepulaup = R.drawable.jatim
        ),

        Item_Atlasin(
            nourutp = 26,
            //namep = "PULAU BALI dan NT",
            //detailp = "Kepulauan Nusa Tenggara atau Kepulauan Sunda Kecil[1] (sekarang kadang kala digunakan dalam peta-peta geografis dunia), adalah gugusan pulau-pulau di sebelah timur Pulau Jawa, dari Pulau Bali di sebelah barat, hingga Pulau Timor di sebelah timur.[2] Kepulauan Barat Daya dan Kepulauan Tanimbar yang merupakan bagian dari wilayah Provinsi Maluku secara geologis juga termasuk dalam kepulauan Nusa Tenggara. Secara administratif, sebagian besar Kepulauan Nusa Tenggara termasuk wilayah negara Indonesia, kecuali bagian timur Pulau Timor dan pulau-pulau kecil di sekitarnya yang termasuk wilayah negara Timor Leste. Di awal kemerdekaan Indonesia, kepulauan ini merupakan suatu provinsi tunggal bernama Provinsi Sunda Kecil yang berganti nama menjadi Provinsi Nusa Tenggara pada tahun 1954,[3] yang beribu kota di kota Singaraja. Pada tahun 1975, wilayah ujung timur Kepulauan Nusa Tenggara di bagian timur Pulau Timor diintegrasikan ke dalam negara Indonesia menjadi Provinsi Timor Timur hingga memperoleh kemerdekaannya tahun 2002. Kepulauan ini kini terdiri atas 3 provinsi di Indonesia (berturut-turut dari barat): Bali; Nusa Tenggara Barat; dan Nusa Tenggara Timur, serta 13 distrik milik negara Timor Leste.\n",
            namep = R.string.PULAUBALIdanNT,
            detailp = R.string.des_PULAUBALIdanNT,
            logodaerahp = R.drawable.nkri_logo,
            imagepulaup = R.drawable.kep_bali_nt
        ),

        Item_Atlasin(
            nourutp = 27,
            //namep = "BALI",
            //detailp = "Provinsi Bali memiliki Ibukota yang bernama Denpasar. Bali mulai diresmikan sebagai provinsi pada tanggal 14 Agustus 1958. Saat ini populasi di Provinsi Bali ada 4.104.900 jiwa dengan luas daerah 5.780,06 km persegi. Mayoritas penduduk Bali memeluk agama Hindu.\n",
            namep = R.string.BALI,
            detailp = R.string.des_BALI,
            logodaerahp = R.drawable.bali_logo,
            imagepulaup = R.drawable.bali
        ),

        Item_Atlasin(
            nourutp = 28,
            //namep = "NUSA TENGGARA TIMUR",
            //detailp = "Nusa Tenggara Timur diduduki oleh penduduk sebanyak 5.325.566 jiwa dengan mayoritas memeluk agama Kristen. Ibu kota dari Provinsi Nusa Tenggara Timur adalah kota Kupang. Nusa Tenggara Timur memiliki 22 kabupaten/kota dengan total luas daerah 48.718,10 km persegi. Provinsi yang berada di kepulauan Nusa Tenggara ini pertama kali diresmikan pada tanggal 14 Agustus 1958.\n",
            namep = R.string.NUSATENGGARATIMUR,
            detailp = R.string.des_NUSATENGGARATIMUR,
            logodaerahp = R.drawable.ntt_logo,
            imagepulaup = R.drawable.ntt
        ),

        Item_Atlasin(
            nourutp = 29,
            //namep = "NUSA TENGGARA BARAT",
            //detailp = "Nusa Tenggara Barat diduduki oleh penduduk sebanyak 4.773.795 jiwa dengan mayoritas memeluk agama Islam. Ibu kota dari Provinsi Nusa Tenggara Barat adalah kota Mataram. Nusa Tenggara Barat memiliki 12 kabupaten/kota dengan total luas daerah 18.572,32 km persegi. Provinsi yang berada di kepulauan Nusa Tenggara ini pertama kali diresmikan pada tanggal 14 Agustus 1958.\n",
            namep = R.string.NUSATENGGARABARAT,
            detailp = R.string.des_NUSATENGGARABARAT,
            logodaerahp = R.drawable.ntb_logo,
            imagepulaup = R.drawable.ntb
        ),

        Item_Atlasin(
            nourutp = 30,
            //namep = "PULAU SULAWESI",
            //detailp = "Pulau Sulawesi memiliki luas mencapai 174.600 km². Dengan luas ini, ada enam provinsi yang berdiri di dalamnya, yakni Sulawesi Selatan, Sulawesi Tengah, Sulawesi Tenggara, Sulawesi Utara, Sulawesi Barat, dan Gorontalo. Berdasarkan data Badan Pusat Statistik (BPS) yang dirilis tahun 2018, penduduk di Pulau Sulawesi mencapai 19 juta jiwa. Angka tersebut berasal dari provinsi Sulawesi Selatan sebanyak 8,8 juta, Sulawesi Tengah 3 juta, Sulawesi Tenggara 2,6 juta, Sulawesi Utara 2,4 juta, Sulawesi Barat 1,3 juta, dan Gorontalo sebanyak 1,1 juta.\n",
            namep = R.string.PULAUSULAWESI,
            detailp = R.string.des_PULAUSULAWESI,
            logodaerahp = R.drawable.nkri_logo,
            imagepulaup = R.drawable.pul_sulawesi
        ),

        Item_Atlasin(
            nourutp = 31,
            //namep = "GORONTALO",
            //detailp = "Provinsi Gorontalo diduduki oleh 1.115.633 jiwa dan memiliki luas daerah sebesar 11.257,07 km persegi. Gorontalo memiliki Ibu kota dengan nama yang sama yaitu kota Gorontalo. Provinsi ini memiliki julukan serambi madinah dengan penduduk yang mayoritas memeluk agama Islam. Provinsi Gorontalo lahir pada 22 Desember 2000.\n",
            namep = R.string.GORONTALO,
            detailp = R.string.des_GORONTALO,
            logodaerahp = R.drawable.gorontalo_logo,
            imagepulaup = R.drawable.gorontalo
        ),

        Item_Atlasin(
            nourutp = 32,
            //namep = "SULAWESI BARAT",
            //detailp = "Provinsi yang berada di bagian barat pulau Sulawesi ini pertama kali diresmikan oleh pemerintah sebagai provinsi Indonesia yang ke-33 pada tanggal 5 Oktober tahun 2004. Provinsi Sulawesi Barat memiliki kota Mamuju sebagai Ibukotanya. Provinsi yang memiliki luas daerah sebesar 16.787,18 km persegi ini diduduki oleh sebanyak 1.258.090 jiwa dengan mayoritas memeluk agama Islam.\n",
            namep = R.string.SULAWESIBARAT,
            detailp = R.string.des_SULAWESIBARAT,
            logodaerahp = R.drawable.sulbar_logo,
            imagepulaup = R.drawable.sulbar
        ),

        Item_Atlasin(
            nourutp = 33,
            //namep = "SULAWESI SELATAN",
            //detailp = "Provinsi Sulawesi Selatan pertama kali diresmikan sebagai provinsi pada tanggal 13 Desember 1960. Provinsi yang terletak di bagian selatan pulau Sulawesi ini memiliki kota Makassar sebagai Ibukota dan pusat pemerintahannya. Provinsi Sulawesi Selatan memiliki populasi penduduk sebanyak 8.432.163 jiwa yang mayoritas memeluk agama Islam. Provinsi Sulawesi Selatan memiliki luas daerah sebesar 46.717,48 km persegi.\n",
            namep = R.string.SULAWESISELATAN,
            detailp = R.string.des_SULAWESISELATAN,
            logodaerahp = R.drawable.sulsel_logo,
            imagepulaup = R.drawable.sulsel
        ),

        Item_Atlasin(
            nourutp = 34,
            //namep = "SULAWESI UTARA",
            //detailp = "Provinsi Sulawesi Utara lahir pada tanggal 13 Desember 1960. Provinsi yang terletak di bagian utara pulau Sulawesi ini memiliki kota Manado sebagai Ibukotanya. Provinsi yang berbatasan dengan laut Maluku dan Samudera Pasifik ini memiliki penduduk sebanyak 2.386.604 jiwa yang mayoritas memeluk agama Kristen. Provinsi Sulawesi Utara memiliki luas daerah sebesar 13.851,64 km persegi.\n",
            namep = R.string.SULAWESIUTARA,
            detailp = R.string.des_SULAWESIUTARA,
            logodaerahp = R.drawable.sulut_logo,
            imagepulaup = R.drawable.sulut
        ),

        Item_Atlasin(
            nourutp = 35,
            //namep = "SULAWESI TENGAH",
            //detailp = "Sulawesi Tengah pertama kali diresmikan sebagai provinsi pada tanggal 23 September 1964. Ibukota dari Provinsi Sulawesi Tengah adalah Kota Palu. Ditempati oleh 2.831.283 penduduk, mayoritas dari penduduk Sulawesi Tengah menganut agama Islam. Sulawesi tengah adalah salah satu provinsi yang memiliki wilayah paling luas di antara provinsi lainnya di Pulau Sulawesi dengan luas daerah sebesar 61.841,29 km persegi.\n",
            namep = R.string.SULAWESITENGAH,
            detailp = R.string.des_SULAWESITENGAH,
            logodaerahp = R.drawable.sultengah_logo,
            imagepulaup = R.drawable.sultengah
        ),

        Item_Atlasin(
            nourutp = 36,
            //namep = "SULAWESI TENGGARA",
            //detailp = "Provinsi yang berada di bagian tenggara pulau Sulawesi ini pertama kali diresmikan oleh pemerintah sebagai provinsi pada tanggal 23 September tahun 1964. Provinsi Sulawesi Tenggara memiliki Ibukota kendari. Provinsi yang memiliki luas daerah sebesar 39.067,70 km persegi ini diduduki oleh sebanyak 2.448.081 jiwa dengan mayoritas memeluk agama Islam.\n",
            namep = R.string.SULAWESITENGGARA,
            detailp = R.string.des_SULAWESITENGGARA,
            logodaerahp = R.drawable.sultenggara_logo,
            imagepulaup = R.drawable.sultenggara
        ),

        Item_Atlasin(
            nourutp = 37,
            //namep = "PULAU MALUKU",
            //detailp = "Kepulauan Maluku adalah sekelompok pulau di Indonesia yang merupakan bagian dari Nusantara. Kepulauan Maluku terletak di lempeng Eurasia dan Pasifik. Ia berbatasan dengan Pulau Sulawesi di sebelah barat, Nugini di timur, dan Timor Leste di sebelah selatan, Palau di timur laut. Pada zaman dahulu, bangsa Eropa menamakannya \"Kepulauan rempah–rempah\" — istilah ini juga merujuk kepada Kepulauan Zanzibar yang terletak di pantai Afrika Timur. Sejak 1950 – 1999, Kepulauan Maluku Utara secara administratif merupakan bagian dari Provinsi Maluku. Kabupaten Maluku Utara kemudian ditetapkan sebagai Provinsi Maluku Utara.\n",
            namep = R.string.PULAUMALUKU,
            detailp = R.string.des_PULAUMALUKU,
            logodaerahp = R.drawable.nkri_logo,
            imagepulaup = R.drawable.kep_maluku
        ),

        Item_Atlasin(
            nourutp = 38,
            //namep = "MALUKU UTARA",
            //detailp = "Maluku Utara (disingkat Malut) merupakan provinsi bagian Timur Indonesia yang resmi terbentuk pada 4 Oktober 1999 yang sebelumnya menjadi kabupaten dari Provinsi Maluku bersama dengan Halmahera Tengah, berdasarkan UU RI Noor 46 Tahun 1999 dan UU RI Nomor Tahun 2003. Jumlah penduduk Maluku Utara pada tahun 2020 mencapai 1.305.828 jiwa, dengan kepadatan penduduk sebanyak 41 jiwa/km2. Saat awal pendirian Provinsi Maluku Utara, ibu kota ditempatkan di Kota Ternate berlokasi di kaki Gunung Gamalama dalam kurun waktu kurang lebih 11 tahun, hingga pada 4 Agustus 2010 setelah adanya masa transisi dan persiapan pembangunan, Maluku Utara memindahkan ibukota Maluku Utara ke Sofifi, salah satu kelurahan di Oba Utara, kota Tidore Kepulauan. Kelurahan Sofifi letaknya berada di Pulau Halmahera, pulau terbesar di Maluku Utara.\n",
            namep = R.string.MALUKUUTARA,
            detailp = R.string.des_MALUKUUTARA,
            logodaerahp = R.drawable.malukutara_logo,
            imagepulaup = R.drawable.malukutara
        ),

        Item_Atlasin(
            nourutp = 39,
            //namep = "MALUKU",
            //detailp = "Maluku memiliki kota Ambon sebagai Ibukotanya. Provinsi Maluku berada di antara perbatasan Laut Seram dan Samudra Hindia. Provinsi yang berada di bagian selatan Kepulauan Maluku ini memiliki luas daerah sebesar 46.914,03 km persegi dengan penduduk sebanyak 1.675.409 jiwa yang sebagian besar penduduknya menganut agama Kristen. Provinsi Maluku pertama kali diresmikan oleh pemerintah pada tanggal 17 Juni 1958.\n",
            namep = R.string.MALUKU,
            detailp = R.string.des_MALUKU,
            logodaerahp = R.drawable.maluku_logo,
            imagepulaup = R.drawable.maluku
        ),

        Item_Atlasin(
            nourutp = 40,
            //namep = "PULAU PAPUA",
            //detailp = "Luas pulau Papua tercatat mencapai 786.000 km² namun yang menjadi bagian Indonesia hanya sebesar 418.707,7 km². Sedangkan sisanya menjadi bagian dari Papua Nugini. Pulau ini menjadi salah satu dari 5 pulau terbesar di dunia. Menurut buku Ekologi Papua oleh Yayasan Pustaka Obor Indonesia dan Conservation International, luas wilayah Papua merupakan pulau yang sangat mendukung hutan rimba tropis tua terluas yang masih ada di Asia Pasifik. Di bagian paling barat, Papua didominasi oleh jajaran pegunungan kecil (Kepala Burung, Wandamen, Fakfak, Kumawa) dan kepulauan (Raja Ampat, Teluk Cenderawasih). Dalam banyak hal, Papua mirip dengan daratan Papua Nugini (PNG) tetapi gunung–gunungnya lebih tinggi (mencapai garis salju), rawa–rawanya lebih luas (contohnya, Mamberamo, Asmat). Pulau Papua merupakan habitat bagi 15.000–20.000 jenis tumbuhan (55% endemik), 602 jenis burung (52% endemik), 125 jenis mamalia (58% endemik), dan 223 jenis reptilia (35% endemik). Binatang dan tumbuhan endemik ini mencakup burung cenderawasih, kanguru pohon, ikan pelangi, beragam kupu-kupu dan ribuan tumbuhan dan binatang lainnya.\n",
            namep = R.string.PAPUA,
            detailp = R.string.des_PAPUA,
            logodaerahp = R.drawable.nkri_logo,
            imagepulaup = R.drawable.pul_papua
        ),

        Item_Atlasin(
            nourutp = 41,
            //namep = "PAPUA BARAT",
            //detailp = "Provinsi Papua Barat mencakup wilayah Semennajung Domberai dan Kepulauan Raja Ampat. Provinsi Papua Barat memiliki Ibukota yang terletak di kota Manokwari dan memiliki kota Sorong sebagai kota yang paling besar di Papua Barat. Provinsi Papua Barat memiliki penduduk sebanyak 849.809 dengan mayoritas memeluk agama kristen. Ibukota dari Provinsi Papua adalah kota Jayapura. Provinsi yang lahir pada tanggal 4 Oktober 1999 ini memiliki luas daerah sebesar 6.570,74 km persegi.\n",
            namep = R.string.PAPUABARAT,
            detailp = R.string.des_PAPUABARAT,
            logodaerahp = R.drawable.papuabar_logo,
            imagepulaup = R.drawable.papuabar
        ),

        Item_Atlasin(
            nourutp = 42,
            //namep = "PAPUA",
            //detailp = "Provinsi Papua awalnya memiliki nama Irian Jaya. Bagian timur dari Provinsi Papua adalah negara Papua Nugini. Provinsi Papua memiliki penduduk sebanyak 3.091.047 dengan mayoritas memeluk agama kristen. Ibukota dari Provinsi Papua adalah kota Jayapura. Provinsi yang lahir pada tanggal 10 September 1969 ini memiliki luas daerah sebesar 319.036,05 km persegi.\n",
            namep = R.string.PAPUA,
            detailp = R.string.des_PAPUA,
            logodaerahp = R.drawable.papua_logo,
            imagepulaup = R.drawable.papua
        ),


        )

}