package nextstep.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class LadderTest {

    @Test
    @DisplayName("인원이 1인 경우 사다리 라인 상태 반환 메소드 검증")
    void getLinesStatus() {
        Personnel personnel = Personnel.of(1);
        Length length = Length.of(1);
        List<List<Boolean>> expected = Collections.singletonList(Collections.singletonList(Boolean.FALSE));
        then(Ladder.of(personnel, length).getLinesStatus()).isEqualTo(expected);
    }
}