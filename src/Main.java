import java.util.Scanner;

public class Main {
    static void sortLower(Movie[] mvList) {
        Movie temp;
        for (int i = 0; i < mvList.length - 1; i++) {
            for (int j = 0; j < mvList.length; j++) {
                if (mvList[i].getRanking() < mvList[j].getRanking()) {
                    temp = mvList[i];
                    mvList[i] = mvList[j];
                    mvList[j] = temp;
                }
            }
        }
    }

    static void sortLower(Series[] srList) {
        Series temp;
        for (int i = 0; i < srList.length - 1; i++) {
            for (int j = 0; j < srList.length; j++) {
                if (srList[i].getRanking() < srList[j].getRanking()) {
                    temp = srList[i];
                    srList[i] = srList[j];
                    srList[j] = temp;
                }
            }
        }
    }
    public static void main(String[] arg) {
        //Tạo 2 mảng để quản lý Movie và Series
        Movie[] movieList = new Movie[5];
        movieList[0] = new Movie("MV01", "Tenki no ko", Genre.ROMANCE, 1, 112);
        movieList[1] = new Movie("MV02", "Kimi no nawa", Genre.COMEDY, 2, 134);
        movieList[2] = new Movie("MV03", "SAO: Ordinal scale", Genre.ACTION, 3, 98);
        movieList[3] = new Movie("MV04", "No game no life zero", Genre.FANTASY, 4, 92);
        movieList[4] = new Movie("MV05", "Kimi no suizou wo tabetai", Genre.COMEDY, 5, 104);

        Series[] seriesList = new Series[5];
        seriesList[0] = new Series("SR01", "86", Genre.ACTION, 6, 23, 20);
        seriesList[1] = new Series("SR02", "Spy x family", Genre.COMEDY, 7, 22, 23);
        seriesList[2] = new Series("SR03", "Made in abyss", Genre.FANTASY, 8, 14, 21);
        seriesList[3] = new Series("SR04", "Stein gate", Genre.COMEDY, 9, 48, 25);
        seriesList[4] = new Series("SR05", "Chainsaw man", Genre.ACTION, 10, 36, 26);

        //In thông tin phim ra màn hình
        System.out.println("In thong tin cac bo phim");
        for (int i = 0; i < movieList.length; i++) {
            Movie mvList = movieList[i];
            mvList.printInfo();
        }

        for (int i = 0; i < seriesList.length; i++) {
            Series srList = seriesList[i];
            srList.printInfo();
        }

        //Nhập vào từ khoá tiêu đề film và tìm phim theo tiêu đề ( tìm cả movie và series, tìm theo từ khoá)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten phim");
        String keyword = scanner.nextLine();
        for (int i = 0; i < movieList.length; i++) {
            Movie mvList = movieList[i];
            if (mvList.hasKeyword(keyword)) {
                mvList.printInfo();
            }
        }

        for (int i = 0; i < seriesList.length; i++) {
            Series srList = seriesList[i];
            if (srList.hasKeyword(keyword)) {
                srList.printInfo();
            }
        }
        scanner.close();

        //In ra thông tin film có ranking thấp nhất (kiểm tra cả movie và series)
        System.out.println("Phim co ranking thap nhat la");
        sortLower(movieList);
        sortLower(seriesList);
        if (movieList[0].getRanking() == seriesList[0].getRanking()) {
            movieList[0].printInfo();
            seriesList[0].printInfo();
        } else if (movieList[0].getRanking() > seriesList[0].getRanking()) {
            seriesList[0].printInfo();
        } else {
            movieList[0].printInfo();
        }

        //In ra tên phim của thể loại COMEDY có ranking thấp nhất
        System.out.println("Phim the loai comedy co ranking thap nhat la");
        for (int i = 0; i < movieList.length; i++) {
            Movie mvList = movieList[i];
            if (mvList.getGenre() == Genre.COMEDY) {
                System.out.println(mvList.getTitle());
                break;
            }
        }

        for (int i = 0; i < seriesList.length; i++) {
            Series srList = seriesList[i];
            if (srList.getGenre() == Genre.COMEDY) {
                System.out.println(srList.getTitle());
                break;
            }
        }
    }
}
