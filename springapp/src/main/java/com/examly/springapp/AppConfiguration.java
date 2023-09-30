public class AppConfiguration{
    public static void main(String args[]){
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Student st = (Student) factory.getBean("student");
    }
}