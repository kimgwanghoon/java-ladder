package nextstep.ladder.domian;

import nextstep.ladder.domain.Name;
import nextstep.ladder.exception.BlankNameException;
import nextstep.ladder.exception.NameOverLengthException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    private Name name;

    @DisplayName("이름을 생성한다")
    @Test
    void 이름을_생성한다() {
        name = new Name("pobi");
    }

    @DisplayName("이름은 5자를 초과할 수 없다")
    @Test
    void 이름은_5자를_초과할_수_없다() {
        assertThatThrownBy(() -> new Name("pobico")).isInstanceOf(NameOverLengthException.class);
    }

    @DisplayName("공백은 이름으로 인정하지 않는다")
    @Test
    void 공백은_이름으로_인정하지_않는다() {
        assertThatThrownBy(() -> new Name("")).isInstanceOf(BlankNameException.class);
    }
}
