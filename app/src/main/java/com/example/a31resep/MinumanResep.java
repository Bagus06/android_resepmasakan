package com.example.a31resep;

import java.util.ArrayList;

public class MinumanResep {
    public static String[][] data = new String[][]{
            {
                    "Kolak biji salak",
                    "250 gram ubi oranye kukus\r\n75 gram tepung sagu\r\n1/4 sendok teh garam\r\n750 ml air\r\n150 gram gula merah, disisir\r\n50 gram gula pasir\r\n1/2 sendok teh garam\r\n3 lembar daun pandan, diikat\r\n150 ml santan instan\r\n\r\n",
                    "08 Feb 2020",
                    "https://selerasa.com/wp-content/uploads/2017/05/images_Resep-kolak-biji-salak.JPG",
                    "1. Rebus air, gula merah, gula pasir, garam, dan daun pandan sampai mendidih. Sisihkan.\r\n2. Campur ubi bersama tepung sagu dan garam. Uleni sampai rata.\r\n3. Bentuk lonjong. Rebus di dalam air mendidih sampai terapung.\r\n4. Angkat, masukkan ke dalam rebusan gula. Rebus kembali di atas api kecil sampai biji salak matang dan kecokelatan,\r\n5. Masukkan santan. Biarkan mendidih kembali.\r\n\r\n"
            },
            {
                    "Es Kopyor",
                    "700 ml air putih\r\n\r\n130 ml santan kelapa siap pakai\r\n\r\n1 bungkus agar-agar rasa kelapa muda\r\n\r\n3 sendok makan gula\r\n\r\n1/2 sendok teh garam\r\n\r\n\r\nSirup rasa cocopandan secukupnya\r\n\r\nSusu kental manis secukupnya\r\n\r\nEs batu secukupnya",
                    "27 Feb 2020",
                    "https://www.herworld.co.id/gallery/teaser/Cara-Membuat-Es-Kopyor-Dengan-Kelapa-Buatan_41_20180220101500.jpg",
                    "1. Masukkan bubuk agar-agar, gula, garam, santan, dan air putih ke dalam panci. Aduk hingga merata dan masak sampai mendidih.\r\n2. Masukkan es batu ke dalam mangkuk ukuran besar. Tuang agar-agar ke atas es batu. Serut agar-agar dengan parutan kelapa agar lebih menyerupai kelapa. Simpan di dalam kulkas hingga dingin.\r\n3. Tuang agar-agar, air putih, sirup, dan susu kental manis sesuai selera ke dalam gelas. Aduk hingga merata. Tambahkan es batu secukupnya.\r\n4, Es kopyor sederhana dengan kelapa buatan siap disajikan!",
            },
            {
                    "Es Blewah",
                    "\u00BD buah Blewah\r\n\u00BD buah Timun suri\r\nNata de Coco, secukupnya\r\nBiji selasih, secukupnya\r\nAir, secukupnya\r\nSirup, secukupnya\r\nEs batu, secukupnya",
                    "27 Feb 2020",
                    "https://blog.brambang.com/wp-content/uploads/2019/05/es-blewah-timun-suri-1024x1024.jpg",
                    "Keruk daging buah blewah memanjang dengan pengeruk buah atau sendok kecil, sisihkan.\r\nPotong dadu timun suri, sisihkan.\r\nTuang sirup ke dalam wadah, masukkan blewah, timun suri, nata de coco, biji selasih, dan es batu ke dalamnya. Kemudian tambahkan air secukupnya.\r\nEs blewah timun suri siap dihidangkan untuk menu buka puasa."
            },
            {
                    "Es Dalimun",
                    "1/2 kotak cincau hijau\r\n50 gr kolang-kaling, rebus dan tiriskan\r\n250 ml santan\r\nGula merah yang dicairkan secukupnya\r\nEs serut secukupnya",
                    "27 Feb 2020",
                    "https://cdn-image.hipwee.com/wp-content/uploads/2018/05/hipwee-CfazbT1UMAAoE-f-640x640.jpg",
                    "Masak santan di atas api kecil sambil terus diaduk sampai matang.\r\nTuang santan dan sebagian gula merah ke dalam wadah saji. Aduk rata. Lalu masukkan potongan cincau, kolang-kaling, dan es serut.\r\nEs Dalimun pun siap dinikmati sebagai takjilan!"
            },
            {
                    "Jus Jeruk",
                    "Jeruk peras,3 bh\r\nGula pasir,3 Sdm\r\nJar es batu,1 gelas\r\nAir matang,secukupnya",
                    "27 Feb 2020",
                    "https://doktersehat.com/wp-content/uploads/2018/09/jus-jeruk.jpg",
                    "Peras jeruk sebanyak 3 buah kemudian buang biji-bijinya.\r\nSiapkan blender dan isi dengan es batu yang sudah diremukkan sebelumnya bersama dengan gula pasir. Tambahkan juga isi dalam blender dengan hasil perasan jeruk.\r\nKemudian nyalakan blender dan biarkan bahan-bahan yang sudah dimasukkan ke dalam blender tersebut halus dan tercampur merata,\r\nAmbil gelas dan tuangkan hasil blenderan tadi ke dalam gelas tersebut.\r\nJus jeruk manis segar telah siap disuguhkan."
            },
            {
                    "Selendang mayang",
                    "500 ml air\r\n1 lbr daun pandan\r\n50 gr tepung hun kwe\r\n25 gr tepung beras\r\n1/4 sdt vanili\r\n1/4 sdt garam\r\n2 sdm gula pasir \r\nSecukupnya pasta pandan\r\nSecukupnya pewarna merah\r\n150 gr gula merah\r\n50 gr gula pasir\r\n100 ml air putih\r\n1 lbr daun pandan\r\n250 ml santan (150 ml santan instan + air)\r\nSecukupnya garam\r\n1 lbr daun pandan",
                    "27 Feb 2020",
                    "https://resepgulaku.com/wp-content/uploads/2018/03/Resep-Gulaku_2018_800x400px_Es-Selendang-Mayang.jpg",
                    "Peras jeruk sebanyak 3 buah kemudian buang biji-bijinya.\r\nSiapkan blender dan isi dengan es batu yang sudah diremukkan sebelumnya bersama dengan gula pasir. Tambahkan juga isi dalam blender dengan hasil perasan jeruk.\r\nKemudian nyalakan blender dan biarkan bahan-bahan yang sudah dimasukkan ke dalam blender tersebut halus dan tercampur merata,\r\nAmbil gelas dan tuangkan hasil blenderan tadi ke dalam gelas tersebut.\r\nJus jeruk manis segar telah siap disuguhkan."
            },
            {
                    "Bubur Kacang Hijau",
                    "250 gram kacang hijau\r\n2 lembar daun pandan\r\n2 keping gula merah (sisir)\r\n2 cm jahe (geprek)\r\n2 sdm tepung sagu (karena habis saya pakai 5 sdm tepung beras)\r\ngula pasir (sesuai selera)\r\nsejumput garam (sesuai selera)\r\nsecukupnya air\r\nbahan santan :\r\n1 sachet santan bubuk\r\n2 cup air (sesuai selera)\r\n1 lembar daun pandan\r\nsejumput garam",
                    "27 Feb 2020",
                    "https://thegorbalsla.com/wp-content/uploads/2019/03/Resep-Bubur-Kacang-Hijau.jpg",
                    "1 Rendam kacang hijau minimal 6 jam. kalau saya rendam semalaman. bersihkan. lalu rebus dg daun pandan dan jahe hingga kacang hijau empuk sekali.\r\n\r\n  \r\n2 Jika sudah empuk dan air menyusut, tambahkan gula merah sisir, garam, gula pasir. aduk-aduk kira-kira 5 menit baru tambahkan larutan tepung sagu (karena habis saya pakai tepung beras 5 sdm + 3 cup air). aduk-aduk terus supaya tidak lengket bawahnya dan hingga meletup-letup. cek rasa. angkat sisihkan.\r\n\r\n  \r\n3 Kuah santan : larutkan santan bubuk dan air. rebus bersama daun pandan dan sedikit garam. aduk-aduk supaya tidak pecah. angkat. ssisihkan.\r\n\r\n  \r\n4 Tata di piring saji, bubur kacang hijau dan santan. sajikan."
            },
            {
                    "Es Rumput Laut",
                    "500 ml air\r\n4-5 sendok makan gula pasir\r\nsecukupnya garam\r\n2 sachet SKM\r\nsesuai selera kolang kaling\r\nsesuai selera cincau hitam\r\nsesuai selera rumput laut\r\n1 buah buah alpukat",
                    "27 Feb 2020",
                    "https://s0.bukalapak.com/uploads/content_attachment/5f3002e323e5d159455b5ab5/w-744/resep_es_rumput_laut_2.jpg",
                    "1 Potong dadu kolang kaling,cincau hitam,dan alpukat\r\n\r\n  \r\n2 Didihkan air, masukkan gula dan garam aduk hingga tercampur rata.dinginkan\r\n\r\n  \r\n3 Setelah air rebusan dingin campur dengan susu kental manis,aduk hingga rata. Lalu masukkan kolang kaling,cincau hitam, alpukat dan rumput laut..jadi deh..bisa ditambahin es Batu biar lebih seger\r\n\r\n  ."
            },
            {
                    "Sop Buah",
                    "Bahan-Bahan yang Dibutuhkan Untuk Membuat Es Buah Spesial 100 gram mangga 100 gram semangka 100 gram kelapa muda 100 gram stroberi 100 gram kiwi hijau 100 gram alpukat 100 gram buah naga putih 100 gram melon Bahan Sirup 50 gram gula pasir 600 ml jus jambu merah 150 ml susu cair Bahan Sarang Burung 1 bungkus agar-agar bubuk 400 ml jus bit Bahan Untuk Pelengkap 5 sdt susu kental manis\r\n\r\n",
                    "27 Feb 2020",
                    "https://awsimages.detik.net.id/community/media/visual/2018/05/19/9e06a33e-1375-4115-bb79-1a8777550426_43.jpeg?w=700&q=90",
                    "Pertama kali langkah yang harus dilakukan yaitu memotong buah-buahan. Silakan ambil buah semangka yang sudah anda siapkan, lalu 1 1 potong dengan bentuk bulat. Sisihkan. Kemudian, kupas mangga. Lalu potong kotak dengan ukuran 1 cm. \r\n2 Setelah itu, potong bulat melon. Selanjutnya, silakan belah buah alpukat menjadi dua bagian.\r\n3 Lalu keluarkan dagingnya. Kemudian anda bisa memotong-motong buah alpukat membentuk kotak.\r\n4 Langkah berikutnya, silakan keruk lebar kelapa muda dan potong kotak buah naga. Untuk buah stroberi belah menjadi 4 bagian.\r\n\r\n888"
            },
            {
                    "Es Kelapa Muda",
                    "Bahan utama yang dibutuhkan adalah daging kelapa muda yang sudah dikerok sebelumnya kurang lebih sebanyak 200 gram \u2013 250 gram\r\nAir kelapa muda segar kurang lebih sebanyak 400 ml saja\r\nGula putih kurang lebih sebanyak 90 gram-110 gram\r\nsecukupnya Es batu\r\n1 botol marjan kelapa\r\nAir panas secukupnya untuk melarutkan gula merahnya\r\n1 kaleng susu kental manis",
                    "27 Feb 2020",
                    "https://s1.bukalapak.com/img/6433794311/w-1000/Es_kelapa_Muda.jpg",
                    "Siapkan gelad saji, lalu masukkan kelapa muda secukupnya.\r\n\r\n  \r\nTambahkan susu dan gulanyang sudah dilarutkan secukupnya. \r\nLalu, tuangkan air kelapa muda dan sirup secukupnya.\r\n\r\n  \r\nJangan lupa tambahkan es batu yang diserut atau kotak-kotak kecil.\r\n\r\n  \r\nEs kelapa mudah siap disajikan bersama keluarga.\r\n\r\n"
            },
            {
                    "Bubur Sum Sum",
                    "50 gr tepung beras\r\n500 ml santan (dari 1/3 kelapa)\r\n1/4 sdt garam\r\n1 lembar daun pandan\r\n\uD83C\uDF00 Kuah Kinca \uD83C\uDF00\r\n150 gr gula merah\r\n1 sdt gula pasir\r\n150 ml air\r\n1 lbr daun pandan\r\nCatatan : jika santannya ingin dipisah maka ganti dgn air\r\nDengan perbandingan yg sama 1:10 agar buburnya lembut",
                    "27 Feb 2020",
                    "https://cdn0-production-images-kly.akamaized.net/eQ7WxYmYNR0EasRFSlwf8B84WzU=/0x564:5472x3648/640x360/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2720203/original/096998100_1549263363-shutterstock_1156628947.JPG",
                    "Bagi 2 santan, jerang santan bagian satu dgn 1 lbr daun pandan dan garam\r\n\r\nBubur Sumsum Super Lembut langkah memasak 1 foto\r\n  \r\nCampurkan bagian santan kedua dgn tepung beras, aduk rata sampai tdk ada yg bergerindil\r\n\r\nBubur Sumsum Super Lembut langkah memasak 2 foto\r\n  \r\nSetelah santan bagian satu mendidih, kecilkan api, masukkan campuran santan kedua, terus aduk bubur sampai meletup letup, matikan api\r\n\r\nBubur Sumsum Super Lembut langkah memasak 3 foto\r\n  \r\nMembuat kuah kinca : masak semua bahan sampai mendidih, matikan api, saring\r\n\r\n  \r\nSiram bubur dgn kuah kinca, sajikan"
            },
            {
                    "Es Pisang Hijau",
                    "isang raja 6 buah, kukus\r\nTepung terigu 60 gram\r\nTepung beras 60 gram\r\nGula pasir 5 sendok makan\r\nSantan 150 mili liter\r\nAir matang 100 mili liter\r\nPasta pandan 4 tetes\r\nGaram 1/4 sendok teh",
                    "27 Feb 2020",
                    "https://merahputih.com/media/2016/09/25/Fg8KPA01n21474782829.jpg",
                    "Pertama-tama selain pisang, campurkan semua bahan dalam satu wadah. Aduk rata menggunakan whisk sampai adonan licin, lalu saring. Kemudian tuang adonan dalam loyang atau wadah tahan panas lainnya. Sisihkan.\r\nPanaskan dandang atau panci kukus, lalu kukus adonan kurang lebih selama 15 menit sampai adonan matang. Keluarkan loyang dan biarkan dingin sampai uap panasnya hilang.\r\nSelanjutnya keluarkan adonan dari loyang, lalu uleni hingga kalis. Bagi adonan jadi 6 bagian kemudian masing-masing pipihkan.\r\nTaruh pisang kukus di atas adonan yang sudah dipipihkan. Gulung, kemudian rapatkan kedua ujungnya.\r\nUlangi langkah ini dan lakukan hingga adonan habis.\r\nPanaskan kembali panci kukusan/dandang. Lapisi dasarnya dengan daun pisang atau plastik tahan panas.\r\nLalu kukus pisang ijo kembali selama 10-15 menit. Angkat dan dinginkan"
            },
            {
                    "Es Dawet",
                    "Bahan Dawet :\r\n125 gr tepung sagu aren\r\n25 gr tepung beras\r\n400 gr air\r\n100 ml air daun suji (30 lbr daun suji blender bersama 150 ml air, saring)\r\n3 tetes pewarna hijau\r\nBahan Kuah Gula Merah :\r\n250 gr gula merah, iris tipis\r\n300 ml air\r\n1 lbr daun pandan\r\nBahan Kuah Santan :\r\n750 ml santan dari 1 btr kelapa\r\n1/2 sdt garam\r\n2 lbr daun pandan",
                    "27 Feb 2020",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTybTsFyvsqa5UjThsVU9UyffLD-NiM7LttLjzvm3cnI9gTDyFY",
                    "Aduk rata bahan dawet, masak sambil diaduk hingga meletup-letup. Angkat, tuang ke cetakan cendol, tekan cetakan cendol.\r\nTampung cendol yang keluar ke dalam baskom berisi air dingin.\r\nRebus kuah gula merah sambil diaduk hingga mendidih, saring, dinginkan.\r\nRebus kuah santan sambil diaduk hingga mendidih, dinginkan.\r\nSendokkan cendol ke dalam gelas. Tambahkan kuah gula merah dan santan. Sajikan dengan es batu."
            },
            {
                    "Jus Mangga",
                    "3 buah mangga manis\r\n6 sdm susu-kental-manis\r\nes batu secukupnya",
                    "27 Feb 2020",
                    "https://cdn1-production-images-kly.akamaized.net/5S0omtJNKtxXk_MfiLAAcxftmmQ=/0x366:4990x3178/375x208/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2952663/original/065258500_1572335694-2019-10-29.jpg",
                    "1Blender hingga halus mangga dicampur dengan susu kental manis dan es batu\r\n2Potong dadu mangga untuk topping atas\r\n3Susun dan letakkan dalam gelas secara berurutan; puree/jus mangga setengah gelas, whipped cream (sesuai selera), mangga puree kembali dan topping dengan mangga potong\r\n4Sajikan."
            },
            {
                    "Selendang Mayang",
                    "Tepung sagu tani - 100 gram\r\nTepung hunkwe - 100 gram\r\nAir - 1 liter\r\nAir - 200 ml\r\nGula merah - 200 gram\r\nDaun pandan - 1 lembar\r\nSantan - 500 ml\r\nGaram - 1 sdt\r\nDaun pandan - 1 lembar\r\nPewarna makanan hijau - secukupnya\r\nPerwarna makanan merah - secukupnya\r\nEs batu - secukupnya",
                    "27 Feb 2020",
                    "https://resepkoki.id/wp-content/uploads/2017/05/Resep-Selendang-Mayang-1024x1021.jpg",
                    "Siapkan loyang. Alasi permukaannya dengan plastik. Sisihkan.\r\nDalam wadah, campur bahan selendang mayang dan aduk sampai merata. Bagi adonan jadi 3 bagian lalu beri satu bagian pewarna hijau, beri satu bagian pewarna merah, dan biarkan satu bagiannya tetap berwarna putih.\r\nMasak adonan warna merah dengan api kecil sambil terus diaduk hingga meletup-letup dan adonan terlihat jadi bening. Tuang ke dalam loyang. Sisihkan.\r\nMasak adonan warna putih dengan api kecil sambil terus diaduk hingga meletup-letup dan adonan terlihat jadi bening. Tuang ke dalam loyang di atas adonan merah. Sisihkan.\r\nMasak adonan warna hijau dengan api kecil sambil terus diaduk hingga meletup-letup dan adonan terlihat jadi bening. Tuang ke dalam loyang di atas adonan putih. Sisihkan dan biarkan mengeras.\r\nDalam panci, campur semua bahan saus gula. Masak hingga mendidih dan gula larut. Angkat dan sisihkan.\r\nDalam panci, campur semua bahan kuah santan. Masak hingga mendidih sambil terus diaduk-aduk. Angkat dan sisihkan.\r\nKeluarkan selendang mayang dari loyang dan potong-potong kotak sesuai selera.\r\nPenyelesaian: Tata selendang mayang dalam gelas saji. Tuang kuah santan dan saus gula. Beri es batu. Siap disajikan.\r\n"
            },
            {
                    "Es Alpukat Kocok",
                    "1 buah alpukat matang\r\n1 sachet skm coklat (opsional)\r\n1 sdm skm putih\r\nEs batu secukupnya",
                    "27 Feb 2020",
                    "https://thumb.netz.id/image/2018/05/14/df7eef51f463fe4e3d83811ec1c7e91b.jpg",
                    "Keruk daging alpukat. Hancurkan menggunakan sendok jangan sampai terlalu halus. Tambahkan 1 sendok makan skm putih\r\nAmbil gelas, tata es batu di bawah. Tuang skm coklat secukupnya (opsional). Masukkan alpukat kocok lalu tutup dengan es batu.\r\nTunggu hingga es batu agak meleleh. Es kocok alpukat siap dinikmati"
            },
            {
                    "Es Soda Gembira",
                    "1 kaleng minuman bersoda rasa stroberi\r\n5 sendok makan susu kental manis\r\nEs batu secukupnya",
                    "27 Feb 2020",
                    "https://www.resepkuerenyah.com/wp-content/uploads/2015/08/Cara-Membuat-Es-Soda-Gembira-Segar-dan-Nikmat.jpg",
                    "1.Tuang susu kental manis ke dalam gelas.\r\n2.Tambahkan es batu sesuai selera.\r\n3.Tuang minuman bersoda ke dalam.\r\n4.Es soda gembira siap dinikmati!"
            },
            {
                    "Wedang Ronde",
                    "150 gram tepung ketan putih\r\n1/4 sendok teh garam\r\n135 ml air hangat\r\n2 tetes pewarna hijau tua\r\n2 tetes pewarna merah cabai\r\n50 gram kacang tanah kupas, disangrai\r\n25 gram gula pasir\r\n1/8 sendok teh garam\r\n2.000 ml air\r\n400 gram gula pasir\r\n400 gram jahe, dibakar, dimemarkan\r\n1 sendok teh garam\r\n4 lembar daun pandan\r\n6 batang serai, dimemarkan\r\n200 gram kolang-kaling, direbus, diiris\r\n3 buah roti tawar tanpa kulit, dipotong kotak\r\n25 gram sagu mutiara merah\r\n1 kaleng (200 gram) lengkeng, ditiriskan",
                    "27 Feb 2020",
                    "https://cdn.idntimes.com/content-images/community/2019/08/cover-49ca1168447338683bd3e43e95af8c00_600x400.jpg",
                    "Pertama kita akan membuat Isi, blender kacang tanah hangat-hangat, gula pasir , dan juga garam sampai rata. Anda bentuk menjadi bulatan kecil-kecil dan kemudian anda sisihkan.\r\nKedua kita membuat Rondenya, campur tepung ketan dan garam lalu anda aduk rata. Anda juga harus tambahkan air hangat sedikit-sedikit sambil diuleni sampai kalis.\r\nSelanjutnya bagi adonan menjadi tiga bagian. Pertama satu bagian tambahkan pewarna merah, Kedua satu bagian tambahkan pewarna hijau, dan juga sisanya biarkan putih kemudian aduk rata masing-masing adonan.\r\nKemudian ambil sedikit bahan ronde. Pipihkan. Beri isi. Bentuk bulat. Lakukan sampai adonan habis.\r\nLalu didihkan air. Masukkan bola-bola ketan. Rebus hingga mengapung. Angkat dan tiriskan.\r\nUntuk membuat Sirup jahe anda perlukan adalah pertama rebus air, gula pasir, jahe,daun pandan, dan serai dengan api kecil sampai mendidih dan harum.\r\nTerakhir anda sajikan ronde bersama sirup jahe serta pelengkapnya."
            },
            {
                    "Es Kacang Merah",
                    "250 gr kacang merah (rndam sekitar 4 jam supaya empuk) \r\nDaun pandan 3 lembar (cuci bersih dan ikat sebelum dimasak)\r\n10 buah nangka (potong kecil-kecil) \r\nSusu kental manis secukupnya 300 ml \r\nsantan kental 1 sendok makan bubuk coklat\r\nGula pasir secukupnya \r\nVanila secukupnya Garam secukupnya \r\nEs batu, es kristal atau es parut dan air bersih secukupnya \r\n",
                    "27 Feb 2020",
                    "https://m.ayobandung.com/images-bandung/post/articles/2019/05/20/52825/es_kacang_merah.jpg",
                    "Siapkan panci untuk merebus kacang merah. Rebus kacang merah yang sudah direndam dengan api sedang kecil sampai benar benar empuk. Setelah empuk masukkan daun pandan yang sudah dicuci bersih. Aduk aduk sebentar.\r\nMasukkan garam dapur, gula, dan vanili bubuknya. Aduk aduk sebentar sampai semua bahan tercampur rata.\r\nLarutkan bubuk coklat dengan air secukupnya. Tuang ke dalam adonan dan aduk aduk sebentar sampai mendidih dan kacang merah agak mengental.\r\nMasak santan dan beri sedikit garam. Aduk-aduk sampai santan mendidih. Jangan lupa jaga jangan sampai santan pecah.\r\nSetelah semua bahan masak, dinginkan. Cara penyajiannya, taruh kacang merah dalam wadah gelas atau mangkok. Beri irisan nangka dan beberapa butir es batu. Terakhir, tuang dengan santan kental dan beri sedikit susu kental manis di atasnya."
            },
            {
                    "Es Sekoteng",
                    "850 ml air\r\n50 gram jahe (bakar dan memarkan)\r\n4 batang serai\r\n2 cm kayu manis\r\n2 lembar daun jeruk\r\n2 lembar daun pandan\r\n150 gram gula pasir.\r\n75 gram kolang kaling, dipotong-potong\r\n50 gram kacang hijau rebus\r\n50 gram pacar cina rebus\r\n4 lembar roti tawar\r\n50 gram kacang tanah kupas yang sudah disangrai.",
                    "27 Feb 2020",
                    "https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/LyytpEcU3b.jpg",
                    "Rebus semua bahan hingga mendidih, angkat, lalu saring.\r\nSiapkan dalam mangkuk saji: kolang kaling, kacang hijau rebus, dan pacar cina.\r\nTuang air rempah-rempah ke dalam mangkok\r\nTaburi dengan roti tawar dan kacang tanah.\r\nSajikan dalam keadaan panas."
            },
            {
                    "Manggo thai",
                    "1 kg mangga atau 4 buah mangga ukuran sedang\r\n250 ml susu UHT full cream\r\n50 gram gula halus\r\n50 gram whipping cream\r\n1 sendok makan madu\r\nAir es secukupnya",
                    "27 Feb 2020",
                    "https://img-global.cpcdn.com/recipes/a0b1343b9cd7d73f/751x532cq70/mango-thai-drink-jus-mangga-kekinian-foto-resep-utama.jpg",
                    "Untuk membuat slushie mangga : Kupas 1 buah mangga lalu parut menggunakan parutan keju, masukkan ke dalam freezer minimal 4 jam sebelum di pakai\r\nUntuk topping mangga : Kupas 1 buah mangga lalu potong dadu kotak-kotak kecil dan sisihkan dahulu\r\nUntuk membuat smoothie mangga : Kupas 2 buah mangga, potong-potong dan masukkan ke blender. Tambahkan susu UHT 250 ml, 1 sendok makan madu lalu blender hingga mangga halus dan kental. Sisihkan terlebih dahulu\r\nMembuat whipping cream : Masukkan 50 gram whipping cream, campur dengan 50 gram gula halus dan tuang air es hingga cukup terendam. Mixer whipping cream sampai mengembang, kental dan kaku\r\nCara Penyajian : Tuang smoothie mangga ke dalam gelas hingga ukuran setengah gelas, tambahkan whipping cream diatasnya lalu tambahkan slushie mangga dan terakhir potongan mangga sebagai toppingnya\r\nSajikan langsung atau bisa di masukkan terlebih dahulu, setelah dingin baru di sajikan"
            },
            {
                    "Es Kopyor",
                    "300 gr Santan\r\n300 ml Air\r\n1 bks Agar-agar putih\r\n50 gr Gula pasir\r\n\u00BD sdt Garam\r\nEs batu secukupnya.",
                    "27 Feb 2020",
                    "https://www.sahabatnestle.co.id/uploads/media/recipe/0001/07/thumb_6340_recipe_image_383x254.jpeg",
                    "Kopyor: tuang air dan santan ke dalam panci lalu tambahkan agar-agar, gula pasir dan garam, masak sambil diaduk hingga mendidih. Angkat.\r\nTuang adonan sesendok demi sendok di atas bongkahan es batu hingga adonan membeku, ambil kopyor dari es batu menggunakan garpu.\r\nSiapkan gelas saji, susun di dalamnya daging kelapa muda, nata de coco, kopyor dan tuang air kelapa muda. Tambahkan es batu, Susu Kental Manis CARNATION dan sirup cocopandan, sajikan dingin."
            },
            {
                    "Jus Buah Naga",
                    "1 buah naga merah berukuran besar (sekitar 500 gram daging buah)\r\n3 botol kecil yakult (sekitar 200 ml)\r\n3 butir es batu",
                    "27 Feb 2020",
                    "https://cdns.klimg.com/merdeka.com/i/w/news/2018/01/12/928822/670x335/resep-cara-membuat-jus-buah-naga-merah-yang-enak-segar-dan-tidak-bau-langu.jpg",
                    "Kerok daging buah naga. Jangan dikerok sampai ke dekat kulit bagian dalam. \r\nMasukkan ke dalam blender.\r\nTuangkan tiga botol yakult ke dalam blender.\r\nMasukkan tiga butir es batu. \r\nKemudian proses dengan blender sampai menjadi jus yang lembut.\r\nTuangkan jus ke dalam gelas dan sajikan dalam keadaan dingin. Tidak perlu disaring."
            },
            {
                    "Bandrek",
                    "1 liter air mineral\r\n350 gram gula merah yang disisir halus\r\n3 batang batang serai kemudian digeprek\r\n80 gram jahe bakar kemudian digeprek\r\n\u00BD sdm garam\r\n1 lembar daun pandan (Sebelum digunakan, dibersihkan terlebih dahulu)\r\nSusu kental manis vanila (Secukupnya, disesuaikan dengan jumlah bahan lainnya agar pas)",
                    "27 Feb 2020",
                    "https://i0.wp.com/resepkoki.id/wp-content/uploads/2017/07/Resep-Bandrek.jpg?fit=2322%2C2322&ssl=1",
                    "1.Langkah pertama yang harus anda lakukan adalah merebus dalam panci, gula bersama air hingga mendidih.\r\n2. Setelah air mendidih, tambahkan daun pandan yang dapat anda buat menyerupai pita, jahe bakar yang telah dimemarkan beserta batang serai. Kemudian aduk larutan air gula merah tersebut beberapa kali saja.\r\n3. Kemudian, masukkan garam sesuai dengan selera dan aduk kembali minuman bandrek dalam panci.\r\n4. Jika rasa yang dihasilkan sudah pas dan bahan beserta bumbu telah teraduk rata, maka matikan api dan angkat bakal minuman bandrek ini.\r\n5. Kamu bisa meletakkannya di teko atau tempat lainnya. Penyajiannya, bisa dilakukan di atas gelas bersih.\r\n6. Untuk tahapan terakhir, kamu bisa menambahkan susu kental manis pada bandrek yang telah siap diminum. Dengan begitu, minuman ini siap untuk diminum di tengah cuaca dingin bersama keluarga.\r\n\r\n."
            },
            {
                    "Es Teler",
                    "5 buah Alpukat\r\n10 biji Buah nangka\r\n2 buah Kelapa muda (air dan daging)\r\n1 ons Biji selasih\r\n1 kaleng susu Kental manis\r\n500 gram Gula pasir\r\n2 liter Air\r\n2 sdt Vanila bubuk",
                    "27 Feb 2020",
                    "https://i.pinimg.com/originals/e4/78/47/e47847ed66e42e8cca5b7b9350da49d0.jpg",
                    "Potong-potong buah nangka dan alpukat. Lalu campur ke dalam wadah yang sudah berisi kelapa muda juga biji selasih yang telah lebih dulu di seduh.\r\n\r\n  \r\nMasukkan gula pasir yang telah dilarutkan bersama dengan vanila bubuk beserta susu kental manis ke wadah yang berisi buah-buahan, aduk hingga rata.\r\n\r\n  \r\nSetelah semua tercampur rata dan manis sesuai yang diingikan, tambahkan es batu/es serut.\r\n\r\n  \r\nEs Teler selesai dan siap dinikmati.\r\n\r\n  \r\nNote : Bagi yang ngga suka selasih ngga usah dipake. Selamat mencoba \u263A\uFE0F"
            },
            {
                    "Wedang Ronde",
                    "200 gram tepung beras ketan\r\n80 gram kentang kukus yg sudah dihaluskan\r\n1 sdm gula pasir\r\nSejumput garam\r\nAir secukupnya sampai adonan kalis\r\nsecukupnya Pasta pandan dan pewarna merah\r\nBahan kuah jahe\r\n1-1,5 liter air\r\n3 lembar daun pandan\r\nsesuai selera Gula merah\r\n5 buah jahe utuh/10 jempol jahe\r\nBahan isian\r\n2 sdm wijen sangrai\r\n5 sdm kacang cincang sangrai\r\nsesuai selera Gula pasir/gula merah\r\nSedikit air untuk menyatukan adonan",
                    "27 Feb 2020",
                    "https://cdn.idntimes.com/content-images/community/2018/08/3187e478b1ded978280cab82ded10846_600x400.jpg",
                    "Campur tepung ketan, gula, kentang, garam dan air sedikit2 hingga adonan kalis dan tidak lengket. Bagi menjadi 3 bulatan sama rata. Beri pasta pandan dan pewarna merah pada 2 bulatan. Uleni hingga warna tercampur rata.\r\n\r\nWedang Ronde langkah memasak 1 foto\r\n \r\nWedang Ronde langkah memasak 1 foto\r\n \r\nWedang Ronde langkah memasak 1 foto\r\nCampur semua bahan isian ke dalam dry mill, blender sebentar asal kacang sedikit hancur. Pindahkan dalam piring. Berikan sedikit air agar campuran kacang menyatu dan dapat dipulung.\r\n\r\nWedang Ronde langkah memasak 2 foto\r\n  \r\nPanaskan air dalam panci untuk merebus ronde. Sambil menunggu panas, bentuk adonan ronde, beri isian lalu bulatkan. Lakukan sampai habis. Rebus ronde dalam air mendidih, tunggu hingga mengambang dan matang. Angkat, lalu tiriskan.\r\n\r\nWedang Ronde langkah memasak 3 foto\r\n \r\nWedang Ronde langkah memasak 3 foto\r\n \r\nKuah : panaskan air, masukkan gula merah/gula pasir/mix keduanya sesuai selera dan jahe masak hingga mendidih. Masukkan daun pandan. Koreksi rasa dan masak kuah jahe menggunakan api kecil beberapa saat hingga gula menjadi lbh pekat dan jahe mengeluarkan aroma serta rasa yg cukup kuat.\r\n\r\nWedang Ronde langkah memasak 4 foto\r\n  \r\nPenyelesaian : tata ronde dalam mangkuk, siram dengan kuah jahe sambil di saring. Siap disajikan.\r\n\r\nWedang Ronde langkah memasak 5 foto\r\n  ."
            },
            {
                    "Jus Apel Hijau",
                    "2 buah apel potong-potong\r\n1 kaleng susu bear brand\r\n1 sdt gula\r\n1 buah mangga\r\nkolang kaling\r\n250 ml air\r\nes batu",
                    "27 Feb 2020",
                    "https://i.pinimg.com/originals/e6/18/32/e618326b1e56cca1450231e116906f43.jpg",
                    "Apel di potong-potong, ditambahkan susu beruang, es batu dan gula kemudian di blender\r\n\r\nJus Apel langkah memasak 1 foto\r\n \r\nJus Apel langkah memasak 1 foto\r\n \r\nJus Apel langkah memasak 1 foto\r\nLetakkan buah mangga, apel dipotong, dan kolang-kaling di letakkan di atas permukaan jus.\r\n\r\nJus Apel langkah memasak 2 foto\r\n  \r\nSiap di sajikan."
            },
            {
                    "Es Tape Ketan Hitam",
                    "1/2 kg beras ketan hitam\r\n1/4 gula merah\r\n3 sdm gula putih (sesuai selera)\r\nVanili\r\n1/2 sdt garam\r\n3 lembar daun pandan\r\n2 sachset santan kara (65ml)\r\nAir secukup ny",
                    "27 Feb 2020",
                    "https://img-global.cpcdn.com/recipes/0705ed634a2f2d25/751x532cq70/bubur-ketan-hitam-saus-santan-foto-resep-utama.jpg",
                    "Bersihkan beras ketan lalu rendam selama 1 jam\r\n\r\n  \r\nLalu masak beras ketan dengan metode 5307 x (rebus 5 menit di hitunf dari mendidih, matikan kompor tutup rapat panci rebusan, diamkan selama 30 menit\r\n\r\n  \r\nLalu masak lagi selama 7 menit di hitung dari mendidih. Metode ini bertujuan untuk menghemat gas) atau sampai matang\r\n\r\n  \r\nMasukkan gula,vanili aduk rata. Matikan kompor, dan sisihkan\r\n\r\n  \r\nRebus santan kara dengan segelas air, daun pandan dan garam sambil di aduk\r\n\r\n  \r\nSajikan bubur ketan dengan santan"
            },
            {
                    "Es kuwut",
                    "1/2 melon daging orange\r\n1 bungkus nata de coco sedang\r\n2 jeruk nipis kecil\r\nsecukupnya Sirup marjan merah\r\nsecukupnya Selasih\r\n200 ml air / 2 gelas air putih\r\nkotak Es batu",
                    "27 Feb 2020",
                    "https://dev.farizdotid.com/api/halopwk/gambar/kuliner/es_kuwut.jpg",
                    "Siapkan baskom : Tuang semua nata de coco. Kerok melon menjadi bentuk panjang-panjang, masukan air, sirup, dan sedikit selasih.\r\n\r\nKreasi Es Kuwut langkah memasak 1 foto\r\n  \r\nAduk tercampur jadi satu dan dirasakan apakah uda manis asem.\r\n\r\nKreasi Es Kuwut langkah memasak 2 foto\r\n  \r\nSiapkan gelas, masukan es batu, tuang adonan kuwut yg sudah jadi, lalu taburi selasih di atasnya. Selamat mencobaaa"
            },
            {
                    "cincau cappucino",
                    "Bahan Cincau :\r\n3 bungkus nutrijell cincau\r\n200 ml gula pasir\r\n1,5 liter air\r\n4 lembar daun pandan\r\nBahan Gula :\r\n300 gr gula jawa\r\n450 ml air\r\n80 gr coffee-mate\r\nSejumput garam",
                    "27 Feb 2020",
                    "https://storage.googleapis.com/finansialku_media/wordpress_media/2019/08/aba6fea7-peluang-usaha-cappucino-cincau-yang-menguntungkan-ikuti-8-langkah-ini-03-finansialku.jpg",
                    "Campur nutrijell, gula, dan air. Aduk rata dahulu di panci.\r\n\r\nEs Cincau Coffee-Mate langkah memasak 1 foto\r\n \r\nEs Cincau Coffee-Mate langkah memasak 1 foto\r\n \r\nEs Cincau Coffee-Mate langkah memasak 1 foto\r\nLalu tambahkan daun pandan yang sudah disimpulkan. Baru nyalakan api. Aduk sampai mendidih. Angkat, taruh di wadah. Tunggu dingin dan mengeras, masukkan ke kulkas minimal 1 jam.\r\n\r\nEs Cincau Coffee-Mate langkah memasak 2 foto\r\n \r\nEs Cincau Coffee-Mate langkah memasak 2 foto\r\n \r\nSetelah dingin, keluarkan dari kulkas, serut cincau. Sisihkan.\r\n\r\nEs Cincau Coffee-Mate langkah memasak 3 foto\r\n \r\nEs Cincau Coffee-Mate langkah memasak 3 foto\r\n \r\nEs Cincau Coffee-Mate langkah memasak 3 foto\r\nDi panci lain, rebus gula jawa, air, dan garam sampai mendidih dan gula jawa larut. Kemudian saring.\r\n\r\nEs Cincau Coffee-Mate langkah memasak 4 foto\r\n \r\nEs Cincau Coffee-Mate langkah memasak 4 foto\r\n \r\nKemudian tambahkan coffee-mate, aduk rata hingga mendidih. Matikan api. Angkat\r\n\r\nEs Cincau Coffee-Mate langkah memasak 5 foto\r\n \r\nEs Cincau Coffee-Mate langkah memasak 5 foto\r\n \r\nEs Cincau Coffee-Mate langkah memasak 5 foto\r\nPenyajian : Ambil cincau secukupnya, tambahkan saus gula. Lalu masukkan es batu secukupnya."
            }

    };

    public static ArrayList<Minuman> getListDAta() {
        Minuman minuman = null;
        ArrayList<Minuman> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            minuman = new Minuman();
            minuman.setName(data[i][0]);
            minuman.setBahan(data[i][1]);
            minuman.setDate(data[i][2]);
            minuman.setFoto(data[i][3]);
            minuman.setCara(data[i][4]);

            list.add(minuman);
        }
        return list;

    }
}
