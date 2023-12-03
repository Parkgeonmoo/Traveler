 # 💡 Topic

- **숙박 예약 서비스**
- 회원이 서비스를 로그인하여 상품의 숙소들을 확인할 수 있으며 주문하고 싶은 상품들을 장바구니에 담을 수도 있으며 ,주문을 할 수 있도록 만든 서비스

# 📝 Summary

- 실제 숙박 예약을 하는 어플로서 로그인하여 주문 및 장바구니 담기 등을 진행할 수 있으며, 상품 전체 리스트 조회와 숙소 하나의 상세 정보도 보여줄 수 있다.
  비회원인 경우 어떤 숙소가 있는지 구경할 수 있다.

# ⭐️ Key Function

- 회원
    - 사람들이 자신의 아이디를 만들어 로그인할 수 있다.
    - 로그인 시간에 만료 시간을 두어 일정 시간이 지나면 서비스 사용을 위해 재로그인을 해야 한다.
    - 아이디와,비밀번호를 통하여 인증을 진행하며 일치하지 않을 경우 서비스 사용을 할 수 없다.
- 주문
    - 주문 내역을 저장할 수 있다.
    - 나의 주문 내역을 불러와 확인할 수 있다.
    - 현재 주문 내역이 주문이 가능한 날짜인지를 확인할 수 있다.
- 숙소
    - OPEN API를 통하여 데이터를 가져와 필요한 숙소의 정보들을 DATABASE에 파싱하여 저장한다.
- 장바구니
    - 장바구니에 숙소 내역을 담을 수 있다.
    - 장바구니에 담은 내역을 삭제할 수 있다.
    - 장바구니에 담은 내역이 품절이 된 지 아닌지를 내 장바구니 조회를 할 때 알 수 있다.

# 🛠 Tech Stack

`JAVA`,`Spring Boot`,`Spring Security`,`Docker`,`MySQL`, `Github`,`Git`,`Slack`,`Redis`

# ⚙️ Architecture

`Domain Design Architecture`

# 🧑🏻‍💻 Team

- 백엔드 개발자 4명,프론트 개발자 5명

# 🤚🏻 Part

- 장바구니 API 개발
- 공통 API Response 개발
- 공통 예외 처리 개발
- QueryDSL 설정
- SpringDoc을 이용한 Swagger 연동
- ERD 설계
- API 명세서 작성
- 장바구니 통합 테스트 코드 작성

# 🤔 Learned

- 여러 테이블이 조인된 부분에서 발생하는 순환참조를 @JsonIgnore를 통해 해결할 수 있는 것을 알게 되었다.
- SpringDoC에 있는 Swagger에서 Authorize가 필요한 부분이 입력받을 수 있는 부분이 Swagger내에 존재하지 않아서 프론트 쪽이 Authorize API 부분을 호출할 수 없었다.
해당 부분을 커스텀하여 Authorize를 넣어 API를 호출할 수 있도록 구현할 수 있게 되었다.
- ERD 설계를 진행하면서 테이블끼리의 엮이는 다대일,일대다 관계에 대해 깊이 알게 되었다.
- 프론트와 협업을 진행하면서 API 명세 및 서버 설정과 API Response를 어떻게 주고받아야 하는지 알게 되었다.
- 통합 테스트 코드 작성을 진행하면서 의존성 및 모의 객체 사용에 대해 이해할 수 있었다.
- QueryDSL을 사용하면서 JPA만으로 조인이 많이 발생하는 부분에 대한 쿼리 작성 어려움을 해결할 수 있게 되었다.

 # ⚙ API 문서
    
  ### Swagger
    
  API 문서는 [실제 구동 테스트 서버](http://api.gamsung.xyz/swagger-ui/index.html)에서 확인해 볼 수 있다.
    


# 📷 Screenshot

# 실행 영상
https://github.com/Parkgeonmoo/Traveler/assets/50697545/b05c0ea8-50b6-4530-b659-39105759c1c4


