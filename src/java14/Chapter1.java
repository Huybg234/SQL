package java14;

public class Chapter1 {
    /**
     * database: là những dữ liệu thô, dữ liệu đơn giản nhất, cơ bản nhất, nền tảng nhất, chưa qua thao tác xử lý gì
     * (dữ liệu cơ bản như: tên, tuổi, chiều cao, cân nặng)
     *
     * tác dụng: đóng vai trò là 1 sever, giúp lưu trữ quản lý file, tăng hiệu năng xử lý, dễ chia sẻ dữ liệu
     * DBSever quản lý nhiều file, nên có thể nhiều ứng dụng truy xuất vào đc
     * DBSever có 2 kiểu phổ biến: RDBMS và FLAT DB;
     *
     * RDB: database biểu diễn dưới dạng các quan hệ
     * : dữ liệu được biểu diễn dưới dạng các bảng và quan hệ của chúng ->RDBMS(hệ quản trị của RDB)
     * quan hệ dữ liệu giữa các bảng:1 cột dữ liệu của bảng này sẽ lấy dữ liệu từ bảng khác sang,
     * trong một bảng có ít nhất 1 cột(hoặc nhiều cột) đặc biệt gọi là khóa chính( dữ liệu trong cột không được trùng nhau),
     * nếu không có thì ta phải tự sinh ra
     * nếu 2 bảng quan hệ n-n thì ta phải thêm một bảng khác
     *
     * Phân tích thiết kế database: phân tích thực thể và mối quan hệ của chúng, sau đó tạo ra các bảng và điều chỉnh quan hệ
     *
     * cách ứng dụng(viết code) tương tác với RDBMS: ngôn ngữ SQL
     *
     * học database gồm: 1.học phân tích thiết kế database, 2. học SQL
     *
     * Flat DB: mongoDB tồn tại dưới dạng Json(dạng text: dùng các cặp key_Value để biểu diễn giá trị).
     *
     * blockchain: dữ liệu được tạo từ các block, các block được nối với nhau thành 1 chuỗi.
     */
}
