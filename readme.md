# BÁO CÁO MÔN HỌC KIỂM THỬ PHẦN MỀM

## CHƯƠNG 1 
### Lần 1 – Ngày thực hiện: 05/01/2026 – Thời gian: 14:17

- Website: [Can't Unsee](https://cantunsee.space/)
- Mục đích: Ghi nhận kết quả làm bài theo từng lần thực hiện
- Số lần thực hiện: Lần 1
- Điểm số đạt được: **6.630 điểm**
![Kết quả lần 1](https://github.com/hakhanh2511/Software-testing/blob/main-2/can%2Ct%20unsee%20lan%201.jpg)

### Lần 2 – Ngày thực hiện: 05/01/2026 – Thời gian: 15:27

- Website: [Can't Unsee](https://cantunsee.space/)
- Mục đích: Ghi nhận kết quả làm bài theo từng lần thực hiện
- Số lần thực hiện: Lần 2
- Điểm số đạt được: **7.430 điểm**
![Kết quả lần 2](https://github.com/hakhanh2511/Software-testing/blob/main-2/can't%20unsee%20lan%202.jpg)

### Kết quả bài tập AI chương 1 

- Website : [EDUX – CMCU Elearning](https://edux.cmcu.edu.vn/subject?id=cc41f2eb-373b-478e-8381-4ff9589544d9)
- ![Kết quả bài tập AI chương 1](https://github.com/hakhanh2511/Software-testing/blob/main-2/B%C3%A0i%20T%E1%BA%ADp%20AI%20tu%E1%BA%A7n%201.jpg)

## CHƯƠNG 2 

### Bài đọc thêm - THỰC HÀNH KIỂM THỬ – `StudentAnalyzer` 

### Giới thiệu
`StudentAnalyzer` là chương trình Java được xây dựng nhằm phục vụ cho việc thực hành kiểm thử phần mềm.  
Chương trình tập trung vào việc xử lý dữ liệu điểm số sinh viên, loại bỏ dữ liệu không hợp lệ và đảm bảo kết quả chính xác thông qua các bài kiểm thử đơn vị (Unit Test).

### Chức năng chính

#### 1. Đếm số sinh viên xuất sắc (`countExcellentStudents`) (ISSUE 1)
- Đếm số sinh viên có điểm **từ 8.0 trở lên**.
- Chỉ xét các điểm hợp lệ trong khoảng **[0, 10]**.
- Bỏ qua các giá trị **null** hoặc ngoài phạm vi cho phép.

#### 2. Tính điểm trung bình hợp lệ (`calculateValidAverage`) (ISSUE 2)
- Tính điểm trung bình của các điểm hợp lệ trong khoảng **[0, 10]**.
- Không tính các giá trị **null** hoặc không hợp lệ.
- Trả về **0** nếu không tồn tại điểm hợp lệ.

---

### Hướng dẫn chạy chương trình

#### Yêu cầu
- Java **JDK 8** trở lên  
- **Maven**

#### Biên dịch dự án
Sử dụng Maven để làm sạch và biên dịch mã nguồn:
```bash
cd unit-test
mvn clean 
 ```

#### Cách chạy code test 
```bash
mvn test
 ``` 

#### Cách chạy code test -  trường hợp cụ thể (ISSUE 3)
```bash
mvn test -Dtest=StudentAnalyzerTest#testCountExcellentStudents_normalCase
mvn test -Dtest=StudentAnalyzerTest#testCountExcellentStudents_allValid
 ```
### Các trường hợp kiểm thử 

Các test case được xây dựng nhằm kiểm tra đầy đủ các chức năng của chương trình **StudentAnalyzer**:

- **`testCountExcellentStudents_normalCase` (ISSUE 1)**  
  Kiểm tra chức năng đếm số sinh viên xuất sắc với dữ liệu đầu vào hỗn hợp (bao gồm điểm hợp lệ, không hợp lệ và null).

- **`testCountExcellentStudents_allValid` (ISSUE 2)**  
  Kiểm tra chức năng đếm sinh viên xuất sắc khi tất cả các điểm đầu vào đều hợp lệ.

- **`testCountExcellentStudents_emptyList`**  
  Kiểm tra chức năng đếm sinh viên xuất sắc với danh sách điểm rỗng.

- **`testCalculateValidAverage_mixedValues`**  
  Kiểm tra chức năng tính điểm trung bình với dữ liệu bao gồm cả giá trị hợp lệ và không hợp lệ.

- **`testCalculateValidAverage_boundaryValues`**  
  Kiểm tra chức năng tính điểm trung bình với các giá trị tại ngưỡng biên của miền dữ liệu.

- **`testCalculateValidAverage_emptyList`**  
  Kiểm tra chức năng tính điểm trung bình trong trường hợp danh sách điểm đầu vào rỗng.

### Kết quả bài tập AI chương 2 .

- Website : [EDUX – CMCU Elearning](https://edux.cmcu.edu.vn/subject?id=cc41f2eb-373b-478e-8381-4ff9589544d9)
- ![Kết quả bài tập AI chương 2](https://github.com/hakhanh2511/Software-testing/blob/main-2/b%C3%A0i%20t%E1%BA%ADp%20ai%20ch%C6%B0%C6%A1ng%202.jpg)
