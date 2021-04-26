package java14;

public class Chapter3 {
    /*
    RowSet sẽ giúp các lập trình viên thực hiện các thao tác thêm, xoá
    và cập nhật một cách tiện lợi mà không cần phải viết các câu lệnh sql.

    3 tầng: model, view , controller(chứa DTO hiển thị dữ liệu)
    1 bảng trong database có 2 class trong từng modol:
    1 class đại diện cho dữ liệu của bảng, 1 class đại diện cho việc kết nối từ java đến bảng(DAO)
    dùng interface trong tầng controller để kết nối các tầng

    ---kết nối database: tạo ra createStatement/prepareStatement
    Connection cnn = a.open();
    PrepareStatement st = cnn.prepareStatement("select * from student")
    ----Set dữ liệu
    st.executeQuery() --> ResultSet rs = st.executeQuery();
    rs.getMetaData() --> ResultSetMetaData  rsmd = .......;
    rsmd dùng để get
    ResultSet còn dùng để tương tác dữ liệu: insert, update
     */
}
