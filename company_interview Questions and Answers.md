`**1. Gspann Company**`
    
    `1. What is conditional Bean`
    
            
       In Spring, a Conditional Bean is a bean that is created only under certain conditions, using the @Conditional annotation or one of its variants. This allows for flexible bean creation based on various criteria such as the presence of specific properties, classes, or even the operating environment.
        
        Examples:
        @Conditional: You can define custom conditions by implementing the Condition interface.
        
        java
        
        Copy
        @Configuration
        public class MyConfig {
        
            @Bean
            @Conditional(MyCondition.class)
            public MyBean myBean() {
                return new MyBean();
            }
        }
        
        public class MyCondition implements Condition {
            @Override
            public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
                // Custom logic to determine whether the bean should be created
                return true;
            }
        }
        @ConditionalOnProperty: This bean will be created only if a specific property is set.
        
        java
        
        Copy
        @Configuration
        public class MyConfig {
        
            @Bean
            @ConditionalOnProperty(name = "feature.enabled", havingValue = "true")
            public MyBean myBean() {
                return new MyBean();
            }
        }
        @ConditionalOnMissingBean: This bean will be created only if a specified bean is not already present in the Spring context.
        
        java
        
        Copy
        @Configuration
        public class MyConfig {
        
            @Bean
            @ConditionalOnMissingBean
            public MyBean myBean() {
                return new MyBean();
            }
        }
        @ConditionalOnClass: This bean will be created only if a specified class is present on the classpath.
        
        java
        
        Copy
        @Configuration
        public class MyConfig {
        
            @Bean
            @ConditionalOnClass(name = "com.example.SomeClass")
            public MyBean myBean() {
                return new MyBean();
            }
        }
        @ConditionalOnExpression: This bean will be created based on the result of a SpEL (Spring Expression Language) expression.
        
        java
        
        Copy
        @Configuration
        public class MyConfig {
        
            @Bean
            @ConditionalOnExpression("${some.expression} == true")
            public MyBean myBean() {
                return new MyBean();
            }
        }
        `
        
    2. What is TransactionalPropagation
            
            You
            What is TransactionalPropagation ?
            Copilot
            In Spring, transactional propagation defines how transactions are managed when multiple transactional methods interact with each other. Essentially, it dictates how the transactions behave in relation to each other. Here's an overview of the different propagation behaviors:
            
            REQUIRED:
            
            If a transaction exists, the current method will run within that transaction. If no transaction exists, a new one will be started.
            
            Example: @Transactional(propagation = Propagation.REQUIRED)
            
            REQUIRES_NEW:
            
            The current method will always run in a new transaction. If an existing transaction is present, it will be suspended while the new one runs.
            
            Example: @Transactional(propagation = Propagation.REQUIRES_NEW)
            
            SUPPORTS:
            
            The current method will run within a transaction if one exists. If no transaction is present, it will run non-transactionally.
            
            Example: @Transactional(propagation = Propagation.SUPPORTS)
            
            NOT_SUPPORTED:
            
            The current method will not run within a transaction. If an existing transaction is present, it will be suspended.
            
            Example: @Transactional(propagation = Propagation.NOT_SUPPORTED)
            
            MANDATORY:
            
            The current method will run within an existing transaction. If no transaction is present, an exception will be thrown.
            
            Example: @Transactional(propagation = Propagation.MANDATORY)
            
            NEVER:
            
            The current method will not run within a transaction. If an existing transaction is present, an exception will be thrown.
            
            Example: @Transactional(propagation = Propagation.NEVER)
            
            NESTED:
            
            The current method will run within a nested transaction if one exists. If no transaction is present, it behaves like REQUIRED.
            
            Example: @Transactional(propagation = Propagation.NESTED)
            
        
    3. How to create Custom Serialization
    
        Creating custom serialization in Java allows you to control how your object is converted to a byte stream and how it is reconstructed from that byte stream. This is done using the Serializable interface along with implementing the writeObject and readObject methods.
        
        Steps to Create Custom Serialization
        Implement the Serializable Interface: The class must implement the Serializable interface to indicate that it can be serialized.
        
        Define writeObject Method: This method is called automatically during serialization. Use it to customize the serialization process.
        
        Define readObject Method: This method is called automatically during deserialization. Use it to customize the deserialization process.
        
        Example:
        java
        
        Copy
        import java.io.*;
        
        class Person implements Serializable {
            private static final long serialVersionUID = 1L;
            private String name;
            private int age;
        
            // Transient fields are not serialized by default
            private transient String hiddenMessage;
        
            public Person(String name, int age, String hiddenMessage) {
                this.name = name;
                this.age = age;
                this.hiddenMessage = hiddenMessage;
            }
        
            private void writeObject(ObjectOutputStream out) throws IOException {
                // Perform default serialization
                out.defaultWriteObject();
                // Custom serialization for transient field
                out.writeObject(encrypt(hiddenMessage));
            }
        
            private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
                // Perform default deserialization
                in.defaultReadObject();
                // Custom deserialization for transient field
                hiddenMessage = decrypt((String) in.readObject());
            }
        
            private String encrypt(String message) {
                // Simple encryption logic (for illustration purposes)
                return new StringBuilder(message).reverse().toString();
            }
        
            private String decrypt(String message) {
                // Simple decryption logic (for illustration purposes)
                return new StringBuilder(message).reverse().toString();
            }
        
            @Override
            public String toString() {
                return "Person{name='" + name + "', age=" + age + ", hiddenMessage='" + hiddenMessage + "'}";
            }
        }
        
        public class CustomSerializationExample {
            public static void main(String[] args) {
                Person person = new Person("Alice", 30, "This is hidden");
        
                // Serialization
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
                    out.writeObject(person);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        
                // Deserialization
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
                    Person deserializedPerson = (Person) in.readObject();
                    System.out.println("Deserialized Person: " + deserializedPerson);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        Explanation:
        writeObject Method: Custom logic for writing the object's data to the ObjectOutputStream. Here, we encrypt the hiddenMessage before writing it.
        
        readObject Method: Custom logic for reading the object's data from the ObjectInputStream. Here, we decrypt the hiddenMessage after reading it.
        
        Transient Fields: Fields marked as transient are not serialized by default. Custom serialization allows us to handle them manually.
        
        
    4. How to create Custom Rate Limiting
    5. How to create comsosite key in JPA
        
        Creating a composite key in JPA (Java Persistence API) involves using a primary key that consists of multiple fields. This is typically done using the @Embeddable and @EmbeddedId annotations.
     6. What is @Primaary annotation
     
        The @Primary annotation in Spring is used to indicate which bean should be given preference when multiple beans of the same type are available. This can be particularly useful when you have multiple implementations of an interface and want to specify a default one.
        
      7. What is kafka consumer and consumer Group ?
      
        Kafka consumer group
        A consumer group is a collection of consumers that work together to process data from topics. The group's partitions are divided among the consumers, and the partitions are reassigned as new members join or leave. 
        Here are some key concepts about Kafka consumer groups:
        Partition assignment: Each consumer in a consumer group is assigned to a different partition. 
        Rebalancing: The partitions are reassigned when new members join or leave the group. 
        Multiple consumer groups: Multiple consumer groups can read from the same topic, but each group will maintain its own set of offsets. 
        Idle consumers: If there are more consumers than partitions, the excess consumers will sit idle and receive no messages. 
        Subscription: Once a consumer is created, it can subscribe to one or more topics.
        
    