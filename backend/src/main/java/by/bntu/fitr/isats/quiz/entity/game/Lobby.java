package by.bntu.fitr.isats.quiz.entity.game;

import by.bntu.fitr.isats.quiz.entity.question.Question;
import by.bntu.fitr.isats.quiz.entity.user.Admin;
import by.bntu.fitr.isats.quiz.entity.user.Player;
import by.bntu.fitr.isats.quiz.entity.user.Winner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Lobby {

    private Integer id;
    private Admin admin;
    private String password;
    private List<Player> players;
    private int playersAmountToStart;
    private List<Question> questions;
    private int currentQuestionIndex;
    private GameStatus status;
    private List<Winner> winners;

}
