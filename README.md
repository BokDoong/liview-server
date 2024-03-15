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
## Details
### 1️⃣ 주요 기능
* 사진을 업로드하면, 사진에 저장되어 있는 메타 정보의 위치 좌표를 통해 자동으로 위치와 함께 저장됩니다.
* 자신의 하루 기록을 기록하여 관리하고 다른 사용자와 함께 공유할 수 있습니다.
* 지도를 기반으로 자신 및 사용자의 하루를 되돌아 볼 수 있습니다.

### 2️⃣ ERD
![Copy of liview_erd](https://github.com/BokDoong/liview-server/assets/102129660/316f900d-a2cc-402e-a085-3916275561dc)

