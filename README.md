# LIVIEW 프로젝트 - 하루를 기록하다
<img width="1400" alt="image" src="https://github.com/BokDoong/liview-server/assets/102129660/355ce592-3c52-4eb7-aac2-4636c2d0749d">


## Introduction
전국 연합 개발동아리 UMC 5기에서 진행한 프로젝트입니다.
<br/><br/>

### ✈️ 프로젝트 설명
하루를 기록하여 남겨두고 싶지만, 일일히 캘린더에 하루 기록을 남기기 번거롭습니다.<br/>
하루에 찍었던 사진을 업로드하여 사진의 촬영 장소를 기반으로 하루를 기록할 수 있는 서비스입니다.

### 🏋️ 프로젝트 기간
* 기획 및 디자인: 2023.11 ~ 2023.12
* 개발: 2024.01 ~ 2024.02

### 🧑‍🤝‍🧑 팀 구성
* 기획:1, 디자인:1, 웹:3, 백엔드: 4

### 🧑‍💻 나의 역할
* 팀장
* 인증 - JWT 토큰, OAuth2.0 구글 소셜 로그인
* Redis를 활용한 API 개발 - 인기 검색어 랭킹, 최근 검색 기록 및 조회 기록
* 인프라 - 예외처리 로직, 캐싱을 통한 인터셉터 및 Spring 컨트롤러 단에서 터뜨리는 Request&Response Logger 구현
* AWS Service - EC2를 통한 호스팅, Logger를 활용한 CloudWatch 도입

<br/><br/>
## BE Skills
<img width="626" alt="image" src="https://github.com/BokDoong/liview-server/assets/102129660/ed503fc9-d93d-4278-b74f-3c9772fd50a4">

* JDK 17
* Springboot 3.xx
* MySQL, Redis
* Spring Data JPA
* AWS 인프라(EC2, RDS, S3, CloudWatch)
* Docker
* Notion, Git, Swagger

<br/><br/>
## Main Functions
### 1️⃣ ChatGPT를 활용한 동화 창작 및 열람
* 자신이 원하는 키워드를 입력하면, 해당 키워드와 관련된 영어 동화를 ChatGPT OpenAPI를 이용해 창작합니다.
* 창작된 동화의 영어본 뿐 아닌, 한글 자막본을 확인할 수 있으며 TTS를 통해 발음을 들으며 공부할 수 있는 기능을 제공합니다.

### 2️⃣ 회원제 서비스
* 이메일 및 인증을 통해 회원가입을 진행합니다.
* 유저 정보 관리 및 생성 동화, 커뮤니티의 찜한 동화 관리 및 확인할 수 있습니다.

### 3️⃣ 커뮤니티 서비스
* 자신이 창작한 동화를 커뮤니티에 올리고 다른 회원들의 동화를 확인할 수 있습니다.
* 좋아요 기능을 통해 동화들을 좋아요순으로 확인할 수 있습니다.
