# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

##요구사항
    List에 담긴 모든 숫자 중 3보다 큰 숫자를 2배 한 후 모든 값의 합을 구한다. 
    지금까지 학습한 map, reduce, filter를 활용해 구현해야 한다.

    nextstep.fp.StreamStudyTest 클래스의 sumOverThreeAndDouble() 테스트를 pass해야 한다.
    map, reduce, filter 실습 2
    nextstep.fp.StreamStudy 클래스의 printLongestWordTop100() 메서드를 구현한다. 
    요구사항은 다음과 같다.

    단어의 길이가 12자를 초과하는 단어를 추출한다.
    12자가 넘는 단어 중 길이가 긴 순서로 100개의 단어를 추출한다.
    단어 중복을 허용하지 않는다. 즉, 서로 다른 단어 100개를 추출해야 한다.
    추출한 100개의 단어를 출력한다. 모든 단어는 소문자로 출력해야 한다.
    힌트
    단어의 길이가 12자를 초과하는 단어를 추출한다.
    12자가 넘는 단어 중 길이가 긴 순서로 100개의 단어를 추출한다.
    sorted() method 활용
    단어 중복을 허용하지 않는다. 즉, 서로 다른 단어 100개를 추출해야 한다.
    distinct() method 활용
    추출한 100개의 단어를 출력한다. 모든 단어는 소문자로 출력해야 한다.
    String.toLowerCase() method 활용
    
    
 #Optional   
 ##요구사항 1 - Optional을 활용해 조건에 따른 반환
    Guide To Java 8 Optional 문서를 참고해 Optional 사용 방법을 익힌다.
    Optional.ofNullable(user)을 활용해 User을 Optional로 생성하는 것이 가능하다.
    Optional의 map(), filter() 메소드등을 활용해 필요한 데이터를 추출
    Optional의 isPresent() 메소드 활용
  
 ##요구사항 2 - Optional에서 값을 반환
    nextstep.optional.Users의 getUser() 메소드를 자바 8의 
    stream과 Optional을 활용해 구현한다.
    
    자바 8의 stream과 Optional을 사용하도록 리팩토링한 후 
    UsersTest의 단위 테스트가 통과해야 한다.
    
    Guide To Java 8 Optional 문서를 참고해 Optional 사용 방법을 익힌다.
    Optional의 orElse() 메소드 활용해 구현한다.
 
 ##요구사항 3 - Optional에서 exception 처리
    nextstep.optional.ExpressionTest의 테스트가 통과하도록 Expression의 of 메소드를 구현한다.
    단, of 메소드를 구현할 때 자바 8의 stream을 기반으로 구현한다.
    
    Guide To Java 8 Optional 문서를 참고해 Optional 사용 방법을 익힌다.
    자바의 enum 전체 값은 values() 메소드를 통해 배열로 접근 가능하다.
    Arrays.stream()을 이용해 배열을 stream으로 생성할 수 있다.
    일치하는 값 하나를 추출할 때 findFirst() 메소드를 활용 가능하다.
    Optional의 orElseThrow() 메소드 활용해 구현한다.
    
 # 의문사항
    요구사항2에 stream과 Optional 을 사용하도록 리팩토링 한 후
    단위테스트 통과라로 쓰여져 있는데요, 해당 stream에 return type이 Optional인데 해당 부분을 수정해서 넣어야 하는걸까요?
    
    