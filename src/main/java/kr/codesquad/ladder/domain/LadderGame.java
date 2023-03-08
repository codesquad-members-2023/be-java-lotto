package kr.codesquad.ladder.domain;

import kr.codesquad.ladder.view.InputView;
import kr.codesquad.ladder.view.OutputView;

import java.io.IOException;
import java.util.List;

public class LadderGame {
    public void run() {
        try {
            InputView inputView = new InputView();
            OutputView outputView = new OutputView();

            List<String> userNames = inputView.getUserNames();
            int stepNum = inputView.getStepNum();

            Ladder ladder = new Ladder(stepNum, userNames);

            System.out.println(outputView.getStringLadder(ladder));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}