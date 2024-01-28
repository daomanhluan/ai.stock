package com.example.ai.stock.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;

@Configuration
@EnableAspectJAutoProxy
public class ThreadPoolConfig {
  private final Integer POOL_SIZE = 50;

  @Bean("threadPool1")
  public Executor getThreadPool1() throws UnknownHostException {
    //    int poolSize = Runtime.getRuntime().availableProcessors() * 8 * 8;
    return buildTaskExecutor("Thread-pool-run-1-", POOL_SIZE);
  }

//  @Bean("threadPoo2")
//  public Executor getThreadPool2() throws UnknownHostException {
//    return buildTaskExecutor("Thread-pool-2-", POOL_SIZE);
//  }

  /*Dung cho sleuth*/
  //  @Autowired private BeanFactory beanFactory;

  public Executor buildTaskExecutor(String prefix, int poolSize) throws UnknownHostException {
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

    InetAddress localhost = InetAddress.getLocalHost();

    executor.initialize();
    executor.setCorePoolSize(poolSize);
    executor.setMaxPoolSize(poolSize);
    executor.setQueueCapacity(500);
    executor.setWaitForTasksToCompleteOnShutdown(true);
    executor.setAllowCoreThreadTimeOut(false);
    executor.setThreadNamePrefix(prefix + localhost.getHostName() + "-");

    return executor;
    /*Dung cho sleuth*/
    //    return new LazyTraceExecutor(beanFactory, executor);
  }
}
