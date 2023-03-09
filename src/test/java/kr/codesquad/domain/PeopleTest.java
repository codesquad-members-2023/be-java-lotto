package kr.codesquad.domain;

import kr.codesquad.view.View;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void getPeople() {
        List<String> peopleNames = List.of("honux", "jk", "pobi", "crong");
        Ladder ladder = new Ladder();

        People people = new People(peopleNames, ladder);

        System.out.println("디버그 포인트");
    }

    @Test
    @DisplayName("이름으로 사람을 검색하여 해당 사람의 사다리타기 결과값을 제대로 받는 지 확인한다.")
    void findDestinationOf() {
        List<String> peopleNames = List.of("honux", "jk", "pobi", "crong");
        Ladder ladder = new Ladder();

        People people = new People(peopleNames, ladder);

        String ladderResult = ladder.make(peopleNames, 5);

        View view = new View();
        view.printResult(peopleNames, ladderResult);

        int destination = people.findDestinationOf("jk");

        System.out.println("시작하는 사람 : jk");
        System.out.println("도착위치 : " + (destination + 1));
    }

    @Test
    @DisplayName("검색한 사람이름이 존재하지 않는 경우, 예외를 제대로 던지는 지 확인한다.")
    void noNameValidation() {
        List<String> peopleNames = List.of("honux", "jk", "pobi", "crong");
        Ladder ladder = new Ladder();

        People people = new People(peopleNames, ladder);

        String ladderResult = ladder.make(peopleNames, 5);

        View view = new View();
        view.printResult(peopleNames, ladderResult);

        assertThatThrownBy(() -> {
            int destination = people.findDestinationOf("hk");
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 해당하는 이름은 없습니다. 입력한 이름 : hk");
    }
}