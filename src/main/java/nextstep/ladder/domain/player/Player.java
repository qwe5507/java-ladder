package nextstep.ladder.domain.player;

import nextstep.ladder.exception.NullArgumentException;
import nextstep.ladder.exception.OutOfRangeArgumentException;
import nextstep.util.StringUtils;

public class Player {
    public static final int MAXIMUM_LENGTH_OF_NAME = 5;

    private final String name;

    private Player(String name) {
        validate(name);

        this.name = name;
    }

    private void validate(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new NullArgumentException("Name");
        }

        if (name.length() > MAXIMUM_LENGTH_OF_NAME) {
            throw OutOfRangeArgumentException.lessThanOrEqualTo(MAXIMUM_LENGTH_OF_NAME, name.length());
        }
    }

    public static Player from(String name) {
        return new Player(name);
    }

    public String getName() {
        return name;
    }
}