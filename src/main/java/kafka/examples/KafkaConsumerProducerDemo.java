package kafka.examples;

public class KafkaConsumerProducerDemo {
  public static void main(String[] args) {

    Consumer consumerThread = new Consumer("test");
    consumerThread.start();
  }
}
