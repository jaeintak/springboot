package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TraceTimeAop {

    @Around("execution(* hello.hellospring..*(..))")
    public Object execute(ProceedingJoinPoint jointPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("Start: "+jointPoint.toString());
        try{
            return jointPoint.proceed();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMS = finish - start;
            System.out.println("End: "+jointPoint.toString()+" "+timeMS +"ms");
        }
    }
}
