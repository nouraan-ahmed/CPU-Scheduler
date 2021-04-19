
    package sample;

    public class process {
        private double arrivalTime;
        private double burstTime;
        private double timeSlice;
        private int priority;

        public process(double arrivalTime, double burstTime, double timeSlice, int priority) {
            this.arrivalTime = arrivalTime;
            this.burstTime = burstTime;
            this.timeSlice = timeSlice;
            this.priority = priority;
        }

        public double getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(double arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public double getBurstTime() {
            return burstTime;
        }

        public void setBurstTime(double burstTime) {
            this.burstTime = burstTime;
        }

        public double getTimeSlice() {
            return timeSlice;
        }

        public void setTimeSlice(double timeSlice) {
            this.timeSlice = timeSlice;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    }
    
