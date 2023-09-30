public class AppConfiguration{
    public static void main(String args[]){
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
        Student st = (Student) factory.getBean("student");
        
    }
}