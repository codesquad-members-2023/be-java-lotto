package kr.codesquad;

import static kr.codesquad.OutView.*;

public class LadderGame {
    private InputView inputView;
    private Ladder ladder;

    public LadderGame() {
        inputView = new InputView();
    }

    public void start() {
        printHowManyParticipates();
        int participantsNum = inputView.getParticipantsNumber();

        printHowMuchHigh();
        int ladderheight = inputView.getLadderHeight();

        ladder = new Ladder(participantsNum, ladderheight);
        ladder.makeLadder();
        printWholeLadder(ladder.getLadder());
        System.out.println();
    }
}