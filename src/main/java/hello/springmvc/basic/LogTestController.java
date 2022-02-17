package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 로그 사용시 장점
 * 쓰레드 정보, 클래스 이름 같은 부가 정보를 함께 볼 수 있다.
 * 로그 레벨에 따라 개발 서버, 운영 서버의 출력 로그를 조절할 수 있다.(보통 개발은 debug, 운영은 info 레벨로 설정한다.)
 * 콘솔 뿐만 아니라 파일이나 네트워크에도 로그를 남길 수 있다.
 * 성능도 System.out 보다 좋다.(내부 버퍼링, 멀티 쓰레드 등등)
 */
@Slf4j // private final Logger log = LoggerFactory.getLogger(getClass()); 이거 자동으로 넣어주는 것.
// @Conroller는 view가 반환되는데 @RestController는 String이 그냥 반환된다.
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        // 시간, PID(process Id), Thread 정보 등을 알려준다.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);
        // log.trace("trace log=" + name); 이렇게 쓰면 연산이 발생해서 자원이 사용되기 때문에 하지마라.
        return "ok";
    }
}
