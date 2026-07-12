public class Elapsed_Seconds {
    public int secondsBetweenTimes(String startTime, String endTime) {

        String[] time1 = startTime.split(":");
        String[] time2 = endTime.split(":");

        int start = Integer.parseInt(time1[0]) * 3600
                + Integer.parseInt(time1[1]) * 60
                + Integer.parseInt(time1[2]);

        int end = Integer.parseInt(time2[0]) * 3600
                + Integer.parseInt(time2[1]) * 60
                + Integer.parseInt(time2[2]);

        return end - start;
    }
}
