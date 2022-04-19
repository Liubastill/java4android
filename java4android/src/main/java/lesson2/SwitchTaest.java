package lesson2;

public class SwitchTaest {
    public static void main(String[] args) {
        final int SEASON_NUMBER = 100;

        convertSeasons(SEASON_NUMBER);
        convertSeasonSwitch(SEASON_NUMBER);
        convertSeasonSwitch2month(9);
    }

    public static void convertSeasons(int seasonNumber) {
        String season;

        if (seasonNumber == 1) {
            season = "Winter";
        } else if (seasonNumber == 2) {
            season = "Spring";
        } else if (seasonNumber == 3) {
            season = "Summer";
        } else if (seasonNumber == 4) {
            season = "Fall";
        } else {
            season = "unknown season";
        }

        System.out.println(season);

    }

    public static void convertSeasonSwitch(int seasonNumber) {
        String season = switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Automn";
            default -> "unknown season";
        };
        System.out.println(season);
    }

    public static void convertSeasonSwitch2month(int monthNumber) {
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Automn";
            default -> "unknown season";
        };

        System.out.println(season);
    }





}


