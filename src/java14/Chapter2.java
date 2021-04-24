package java14;

public class Chapter2 {
    /**
     * tạo bảng : CREATE TABLE + tên bảng
     *
     * xóa bảng: DROP TABLE + tên bảng
     *
     * thêm(ADD), sửa(thay đổi kiểu dữ liệu)(ALTER/MODIFY COLUMN), xóa(DROP COLUMN) dữ liệu trong bảng : ALTER TABLE + tên bảng
     *
     * Để chèn dữ liệu vào bảng ta dùng câu lệnh INSERT:
     * INSERT INTO TABLE + tên bảng +(tên các cột trong tbl đặt trong '')+ VALUES (trong này là các dữ liệu cụ thể, đặt trong '')
     *
     * Để xóa một dữ liệu nào đó trong bảng ta dùng DELETE:
     * DELETE FROM + tên bảng trong dấu '' + WHERE + điều kiện dữ liệu muốn xóa trong dấu ''
     *
     *Để thay đổi dữ liệu ta dùng câu lệnh UPDATE:
     * UPDATE + tên bảng trong dấu '' + SET + tên cột trong dấu'' muốn thay đổi = dữ liệu muốn đổi + WHERE + điều kiện dữ liệu muốn thay đổi trong dấu ''
     *
     * Để nhóm dữ liệu giống nhau thành một nhóm ta sử dụng câu lệnh Group by:
     * GROUP by + tên cột muốn nhóm dữ liệu
     *
     * Để chọn dữ liệu từ cơ sở dữ liệu ta sử dụng câu lệnh SELECT:
     * SELECT * FROM + tên bảng trong dấu '' : chọn tất cả các dữ liệu trong bảng
     * biến thể:
     * SELECT age, COUNT(age) as + 'Số lượng' + FROM + tên bảng + GROUP by age: Chọn tất cả dữ liệu cột tuổi,
     * tạo cột mới là Số lượng đại diện cho số lượng tuổi, GROUP by nhóm các tuổi trùng vào 1 nhóm
     *
     * SELECT DISTINCT: dùng để chọn dữ liệu khác nhau trong bảng
     *
     * SELECT TOP +số lượng+ FROM + tên bảng: chọn 3 bản ghi đầu tiên trong bảng
     *
     * Sắp xếp dữ liệu theo thứ thự tăng dần(ASC)(mặc định) hoặc giảm dần(DESC) ta sử dụng: ORDER BY
     * SELECT * FROM + tên bảng
     * ORDER BY + tên cột + ASC/DESC
     *
     * AND, OR, NOT được kết hợp với WHERE
     * WHERE: được sử dụng để lọc các dữ liệu với điều kiện chỉ định
     *
     * LIKE được kết hợp với WHERE để tìm kiếm dữ liệu trong bảng với điều kiện chỉ định:
     * WHERE + tên cột + LIKE +.....
     * thường đi với % : a% là có a ở đầu; %a là có a ở cuối; %a% là có a ở bất kì vị trí nào
     * và _ : _a%(có a ở vị trí thứ 2); a__%(bắt đầu bằng a và có ít nhất 3 kí tự)
     *
     * IN : cho phép chỉ định nhiều giá trị trong WHERE, thay thế việc sử dụng nhiều OR
     * WHERE + tên cột + IN +('a','b','c');
     *
     * BETWEEN: dùng để chọn dữ liệu trong một phạm vi chỉ định:
     * WHERE + tên cột + BETWEEN + ...+ AND +....
     *
     * MIN(): trả về giá trị nhỏ nhất trong cột được chọn
     * SELECT MIN(tên cột) FROM + tên bảng
     *
     * MAX(): trả về giá trị lớn nhất trong cột được chọn
     * SELECT MAX(tên cột) FROM + tên bảng
     *
     * COUNT(): trả về số lượng dữ liệu phù hợp với tiêu trí nhất định
     * SELECT COUNT(tên cột)+ FROM + tên bảng
     *
     * AVG(): trả về số lượng trung bình của một cột số
     * SELECT AVG(tên cột) + FROM + tên bảng
     *
     * SUM(): trả về số lượng tổng của một cột số
     * SELECT SUM(tên cột) + FROM + tên bảng
     *
     * EXIST: dùng để kiểm tra sự tồn tại của dữ liệu với điều kiện chỉ định
     * SELECT + tên cột 1 + FROM + tên bảng 1
     * WHERE EXIST (SELECT + tên cột 2+ FROM + tên bảng 2 + WHERE+ ....)
     *
     * UNION: dùng để kết hợp hai hay nhiều câu lệnh SELECT
     * (Mọi SELECT trong UNION phải có cùng số cột, các cột phải có cùng kiểu dữ liệu, các cột trong mọi SELECT phải teo cùng một thứ tự
     * SELECT + tên cột 1 + FROM + tên bảng 1
     * UNION
     * SELECT + tên cột 2 + FROM + tên bảng 2
     * các giá trị không trùng lặp, để có thể trùng lặp thì sử dụng UNION ALL
     *
     * JOIN: được dụng để kết hợp các hàng từ hai hay nhiều bảng
     * SELECT + tên cột + FROM + tên bảng 1
     * INNER JOIN + tên bảng 2
     * ON + tên bảng 1.tên cột = tên bảng 2.tên cột
     */
}
