public abstract class Task {
    protected String subject;
    protected double start_time;
    protected double end_time;

    public Task(String subject, double start_time, double end_time) {
        setStart_time(start_time);
        setEnd_time(end_time);
    }

    public void setStart_time(double start_time) {
        int houre = (int)start_time;
        int minute = (int)start_time - houre;

        while (true) {
            if (houre < 24 && houre >= 0) {
                if (minute < 60 && minute >= 0) {
                    this.start_time = start_time;
                    break;
                }
            }
            else 
                System.out.print("Your input is not a valid time, enter another one: ");
        }
        
    }

    public void setEnd_time(double end_time) {
        int houre = (int)end_time;
        int minute = (int)end_time - houre;

        while (true) {
            if (houre < 24 && houre >= 0) {
                if (minute < 60 && minute >= 0) {
                    this.end_time = end_time;
                    break;
                }
            }
            else 
                System.out.print("Your input is not a valid time, enter another one: ");
        }
        
    }

    public Task addNewHomeWork(Person prs, String subject, double setStart_time, double end_time) {
        if (prs instanceof Student) {
            HomeWork homeWork = new HomeWork(subject, setStart_time, end_time);
            return homeWork;
        }
        return null;
    }

    public Task addNewQuiz(Person prs, String subject, double setStart_time, double end_time) {
        if (prs instanceof Student) {
            Quiz quiz = new Quiz(subject, setStart_time, end_time);
            return quiz;
        }
        return null;
    }

    public Task addNewExam(Person prs, String subject, double setStart_time, double end_time) {
        if (prs instanceof Student) {
            Exam exam = new Exam(subject, setStart_time, end_time);
            return exam;
        }
        return null;
    }
}
