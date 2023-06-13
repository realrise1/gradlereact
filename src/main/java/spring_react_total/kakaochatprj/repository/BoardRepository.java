package spring_react_total.kakaochatprj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_react_total.kakaochatprj.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
