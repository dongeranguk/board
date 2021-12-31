package board.dao;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {

/*create table board (
	bno serial not null,
	title varchar(50) not null,
	content text not null,
	writer varchar(30) not null,
	regDate timestamp not null default now(),
	viewCnt integer default 0,
	primary key(bno)
);*/

	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;
}
