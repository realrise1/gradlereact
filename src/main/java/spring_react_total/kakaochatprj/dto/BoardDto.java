package spring_react_total.kakaochatprj.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import spring_react_total.kakaochatprj.domain.Board;

@Data
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;

    public BoardDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}