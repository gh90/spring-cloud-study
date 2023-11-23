# 주요 기능
- spring cloud config 기본 적용
  - spring.cloud.config.server.git.search-paths=*/** 적용
    - config repository 에서 디렉토리 구조 갈수 있도록 적용
  - private repository 적용 부분 주석처리
    - System.setProperty 적용 하여 private key는 로컬 파일에서 읽도록 설정