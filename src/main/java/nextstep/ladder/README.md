# 사다리타기 

# 기능 목록

### User
- 사람이름을 멤버변수로 가지고 있는 클래스
- 사람이름의 최대길이에 대한 검증

### Users
- User에 대한 일급 콜렉션

### Line 
- 사다리를 2차원 배열로 표현했을 때 행에 해당하는 정보를 가지고 있음
- 선이 있는 곳은 true 없는 곳은 false로 한다 
- 단, Line의 길이는 Users의 길이 - 1이다.
- true가 나오고 또 true가 나오면 안됨   
|----|----| 이렇게 되면 사다리타기를 할 수 없음

### Ladder
- 행에 대한 정보를 사다리높이 만큼 가지고 있음

### LadderHeight 
- 사다리 높이에 대한 정보를 가지고 있음
- 사다리 높이에 대한 검증

### WinningCategory
- 실행 결과에 대한 정보를 가지고 있음 

### WinningCategories
- WinningCategory 일급컬렉션

### LadderGame
- ladder, users를 가지고 사다리의 결과를 생성하는 객체

### LadderResult
- LadderGame의 결과를 담는 객체