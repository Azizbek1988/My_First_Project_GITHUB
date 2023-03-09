package day_27_Arrays05;

public class Tools {
    public static void main(String[] args) {
        //Java ==> programming language
        //
        //	Selenium ==> Test Automation
        //	TestNG ==> Unit Tests
        //	JUnit ==> Unit Tests
        //	Cucumber ==> BDD Style Testing
        //	GIT ==> Version control
        //	Maven ==> Building and execution for project

        String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","GIT","Maven"};
        String[] tools2 = {"programming language","Test Automation","Unit Tests","Unit Tests","BDD Style Testing","Version control","Building and execution for project"};

        for(String t: tools) {
            switch(t.toLowerCase()){
                case "Java":
                    System.out.println("Java ==> programming language");
                    break;
                case "Selenium":
                    System.out.println("Selenium ==> Test Automation");
                    break;
                case "TestNG":
                case "JUnit":
                    System.out.println("Unit Tests");
                    break;
                case "Cucumber":
                    System.out.println("BDD Style Testing");
                    break;
                case "GIT":
                    System.out.println("Version control");
                    break;
                case "Maven":
                    System.out.println("Building and execution for project");
                    break;
                default:
                    System.out.println("#####################################");
            }

        }
    }
}
