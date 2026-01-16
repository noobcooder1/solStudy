package board;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class board {
    String wtitle, wline;
    int inp;
    int revise;
    int count = 0;
    int removenum;
    String date;

    Scanner s1 = new Scanner(System.in);
    ArrayList<String[]> wri = new ArrayList<String[]>();
    ArrayList<Integer> cnt = new ArrayList<Integer>();

    public static void main(String[] args) {

    }

    public void boardStart() {
        loop: while (true) {
            func.sys("----------------------------게시판입니다!--------------------------");
            func.sys("글쓰기는 1번을, 글 읽기는 2번을, 글 수정은 3번을, 글삭제는 4번을, 종료하시려면 0번을 눌러주세요.");
            inp = s1.nextInt();

            if (inp == 1) {
                write();
            } else if (inp == 2) {
                seeWrite();
            } else if (inp == 3) {
                revise();
            } else if (inp == 4) {
                delete();
            } else if (inp == 0) {
                func.sys("안녕히가세요!");
                break loop;
            } else {
                func.sys("제대로 입력하세요.");
            }
        }
    }

    public void write() {
        func.sys("글의 제목을 입력하세요. 저장하시려면 엔터키를 눌러서 저장하세요!");
        s1.nextLine(); // 버퍼 비우기
        wtitle = "제목 : " + s1.nextLine();

        LocalDateTime wdate = LocalDateTime.now();
        DateTimeFormatter dte = DateTimeFormatter.ofPattern("yy-MM-DD HH-mm-ss");
        date = "작성시간" + wdate.format(dte);

        func.sys("글의 내용을 입력하세요. 저장하시려면 엔터키를 눌러서 저장하세요!");
        wline = "내용 : " + s1.nextLine() + "\n";
        count++;
        cnt.add(count);
        String[] ww = { wtitle, date, wline };
        wri.add(ww);
    }

    public void seeWrite() {
        for (int i = 0; i < wri.size(); i++) {
            // func.syi(cnt.get(i));
            func.syi(i + 1);
            func.sya(wri.get(i));
        }
    }

    public void revise() {
        func.sys("수정할 글의 번호를 입력하세요.");
        revise = s1.nextInt();

        if (cnt.contains(revise)) {
            func.sys("수정할 글의 제목을 입력하세요. 수정완료시 엔터키를 눌러서 저장하세요!");
            s1.nextLine(); // 버퍼 비우기
            wtitle = "제목 : " + s1.nextLine();

            LocalDateTime wdate = LocalDateTime.now();
            DateTimeFormatter dte = DateTimeFormatter.ofPattern("yy-MM-DD HH-mm-ss");
            date = "수정시간" + wdate.format(dte);

            func.sys("수정할 글의 내용을 입력하세요. 수정완료시 엔터키를 눌러서 저장하세요!");
            wline = "내용 : " + s1.nextLine() + "\n";
            String[] rv = { wtitle, date, wline };
            wri.set(revise - 1, rv);
        } else {
            func.sys("없는 글번호입니다.");
        }
    }

    public void delete() {
        int del;
        func.sys("삭제할 글의 번호를 입력하세요.");
        removenum = s1.nextInt();

        if (cnt.contains(removenum)) {
            func.sys("정말 삭제할까요? 삭제하려면 1을 아니면 2를 입력하세요.");
            del = s1.nextInt();
            if (del == 1) {
                wri.remove(removenum - 1);
                cnt.remove(removenum - 1);
                func.sys("삭제되었습니다!");
            } else if (del == 2) {
                func.sys("삭제를 취소합니다.");
            } else {
                func.sys("제대로 입력하세요!");
            }
        } else {
            func.sys("없는 글번호입니다.");
        }
    }
}