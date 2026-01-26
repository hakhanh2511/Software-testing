# BÁO CÁO MÔN HỌC KIỂM THỬ PHẦN MỀM

## CHƯƠNG 1 - Nguyên lí của kiểm thử 
### Lần 1 – Ngày thực hiện: 05/01/2026 – Thời gian: 14:17

- Đường dẫn: [Can't Unsee](https://cantunsee.space/)
- Mục đích: Ghi nhận kết quả làm bài theo từng lần thực hiện
- Số lần thực hiện: Lần 1
- Điểm số đạt được: **6.630 điểm**
![Kết quả lần 1](https://github.com/hakhanh2511/Software-testing/blob/main-2/can%2Ct%20unsee%20lan%201.jpg)

### Lần 2 – Ngày thực hiện: 05/01/2026 – Thời gian: 15:27

- Đường dẫn: [Can't Unsee](https://cantunsee.space/)
- Mục đích: Ghi nhận kết quả làm bài theo từng lần thực hiện
- Số lần thực hiện: Lần 2
- Điểm số đạt được: **7.430 điểm**
![Kết quả lần 2](https://github.com/hakhanh2511/Software-testing/blob/main-2/can't%20unsee%20lan%202.jpg)

### Kết quả bài tập AI chương 1 

- Đường dẫn: [EDUX – CMCU Elearning](https://edux.cmcu.edu.vn/subject?id=cc41f2eb-373b-478e-8381-4ff9589544d9)
![Kết quả bài tập AI chương 1](https://github.com/hakhanh2511/Software-testing/blob/main-2/B%C3%A0i%20T%E1%BA%ADp%20AI%20tu%E1%BA%A7n%201.jpg)

## CHƯƠNG 2 - Quy trình kiểm thử

### Bài đọc thêm - Thực hành kiểm thử – `StudentAnalyzer` 

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

### Kết quả bài tập AI chương 2 

- Đường dẫn: [EDUX – CMCU Elearning](https://edux.cmcu.edu.vn/subject?id=cc41f2eb-373b-478e-8381-4ff9589544d9)
![Kết quả bài tập AI chương 2](https://github.com/hakhanh2511/Software-testing/blob/main-2/b%C3%A0i%20t%E1%BA%ADp%20ai%20ch%C6%B0%C6%A1ng%202.jpg)

## CHƯƠNG 3 - Kiểm thử tĩnh 

### Bài đọc thêm - Kiểm thử tự động End-to-End với Cypress

### Giới thiệu 
Cypress là một framework kiểm thử tự động End-to-End (E2E) hiện đại dành cho các ứng dụng web. Cypress được thiết kế nhằm giúp lập trình viên và kiểm thử viên dễ dàng viết, chạy và gỡ lỗi các bài kiểm thử giao diện người dùng trực tiếp trên trình duyệt.

Khác với nhiều công cụ kiểm thử truyền thống, Cypress chạy trực tiếp trong trình duyệt, cho phép kiểm soát toàn bộ luồng thực thi của ứng dụng web và cung cấp khả năng quan sát chi tiết từng bước kiểm thử.

### Hướng dẫn chạy chương trình

#### Tạo một thư mục dự án mới và khởi tạo npm:
```bash
mkdir cypress-exercise
cd cypress-exercise
npm init -y
 ```

#### Cài đặt Cypress:
```bash
npm install cypress --save-dev
 ```

#### Mở Cypress:
```bash
npx cypress open
 ```
Sau khi chạy lệnh này, Cypress sẽ tạo cấu trúc thư mục và các tệp mẫu trong thư mục cypress.

#### Các kịch bản kiểm thử

#### Kịch bản 1: Kiểm tra đăng nhập thành công
Mục tiêu: Kiểm tra xem người dùng có thể đăng nhập thành công với thông tin hợp lệ.

##### Các bước thực hiện:

Truy cập trang https://www.saucedemo.com.

Nhập tên người dùng: standard_user.

Nhập mật khẩu: secret_sauce.

Nhấn nút "Login".

Xác minh rằng trang được chuyển hướng đến trang danh sách sản phẩm (URL chứa /inventory.html).

##### Kết quả:
![Kết quả kịch bản kiểm thử 1](https://github.com/hakhanh2511/Software-testing/blob/main-2/test%20case%20login%20success.png)

#### Kịch bản 2: Kiểm tra đăng nhập thất bại
Mục tiêu: Kiểm tra xem hệ thống hiển thị thông báo lỗi khi đăng nhập với thông tin không hợp lệ.

##### Các bước thực hiện:

Truy cập trang https://www.saucedemo.com.

Nhập tên người dùng: invalid_user.

Nhập mật khẩu: wrong_password.

Nhấn nút "Login".

Xác minh rằng thông báo lỗi được hiển thị với nội dung: Username and password do not match.

##### Kết quả:
![Kết quả kịch bản kiểm thử 2](https://github.com/hakhanh2511/Software-testing/blob/main-2/test%20case%20login%20failed.png)

#### Kịch bản 3: Kiểm tra chức năng thêm sản phẩm vào giỏ hàng
Mục tiêu: Kiểm tra xem người dùng có thể thêm một sản phẩm vào giỏ hàng sau khi đăng nhập.

##### Các bước thực hiện:

Đăng nhập với thông tin hợp lệ (standard_user/secret_sauce).

Nhấn nút "Add to cart" của sản phẩm đầu tiên trong danh sách.

Xác minh rằng số lượng sản phẩm trong giỏ hàng hiển thị là 1.

##### Kết quả:
![Kết quả kịch bản kiểm thử 3](https://github.com/hakhanh2511/Software-testing/blob/main-2/add%20product%20to%20cart%20test%20case.png)

#### Kịch bản 4: Kiểm tra chức năng tìm kiếm sản phẩm
Mục tiêu: Kiểm tra xem bộ lọc sản phẩm hoạt động đúng khi chọn "Price (low to high)".

##### Bước thực hiện:

Đăng nhập với thông tin hợp lệ.

Chọn bộ lọc "Price (low to high)" từ dropdown.

Xác minh rằng sản phẩm đầu tiên trong danh sách có giá thấp nhất.

##### Kết quả:
![Kết quả kịch bản kiểm thử 4](https://github.com/hakhanh2511/Software-testing/blob/main-2/sort%20product%20by%20price%20test%20case.png)

#### Kịch bản 5: Kiểm tra chức năng xoá sản phẩm vào giỏ hàng
Mục tiêu: Kiểm tra xem người dùng có thể thêm một sản phẩm vào giỏ hàng sau khi đăng nhập.

##### Các bước thực hiện:

Đăng nhập với thông tin hợp lệ (standard_user/secret_sauce).

Nhấn nút "Remove" của sản phẩm đầu tiên trong danh sách.

Xác minh rằng sản phẩm đã bị xoá khỏi giỏ hàng.

##### Kết quả:
![Kết quả kịch bản kiểm thử 5](https://github.com/hakhanh2511/Software-testing/blob/main-2/delete%20product%20test%20case.png)

#### Kịch bản 6: Kiểm tra quy trình mua hàng hoàn thiện 

##### Kết quả:
![Kết quả kịch bản kiểm thử 6](https://github.com/hakhanh2511/Software-testing/blob/main-2/Screenshot%202026-01-19%20135540.png)

### Kết quả bài tập AI chương 3 

- Đường dẫn: [EDUX – CMCU Elearning](https://edux.cmcu.edu.vn/subject?id=cc41f2eb-373b-478e-8381-4ff9589544d9)
  
![Kết quả bài tập AI chương 3](https://github.com/hakhanh2511/Software-testing/blob/main-2/b%C3%A0i%20t%E1%BA%ADp%20ai%20ch%C6%B0%C6%A1ng%203.png)

## CHƯƠNG 4 - Kiểm thử tự động 

### Bài đọc thêm - Thực hành kiểm thử – `Kiểm thử hiệu năng với JMeter`



## 1. Giới thiệu 
- Website được kiểm thử: https://vnexpress.net &  https://en.wikipedia.org
- Công cụ: Apache JMeter
- Mục tiêu: Đánh giá hiệu năng website với các mức tải khác nhau



## 2. Mô tả các kịch bản kiểm thử và kết quả 

### Thread Group 1 – Kịch bản cơ bản
- Số người dùng: 10
- Số vòng lặp: 5
- Hành vi: Gửi HTTP GET đến trang chủ

### Thread Group 2 – Kịch bản tải nặng
- Số người dùng: 50
- Ramp-up: 30 giây
- Hành vi: GET trang chủ và trang con (/the-gioi)

### Thread Group 3 – Kịch bản tùy chỉnh
- Số người dùng: 20
- Thời gian chạy: 60 giây
- Hành vi: GET hai trang con (/kinh-doanh, /the-thao)







