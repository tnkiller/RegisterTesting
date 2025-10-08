# 🧪 Testing Exercises – Course Repository

![Status](https://img.shields.io/badge/status-active-brightgreen) ![JUnit](https://img.shields.io/badge/JUnit-5.x-25A162) ![Build](https://img.shields.io/badge/build-Maven-blue) ![Coverage](https://img.shields.io/badge/coverage-JaCoCo-purple)  
A collection of hands-on exercises for the **Software Testing** course, focusing on unit testing, test design techniques, and CI-ready Java test suites.

## 🎯 Mục tiêu
- Luyện viết **unit tests** với JUnit 5 và Mockito.  
- Áp dụng **test design techniques** (Equivalence, Boundary, Decision Table, State, Pairwise…).  
- Nâng cao chất lượng qua **code coverage** (JaCoCo) và **clean test code**.

## 🗂 Cấu trúc thư mục
```
/src
  /main/java          # Mã nguồn mẫu/đối tượng kiểm thử
  /test/java          # JUnit tests
/exercises
  01-equivalence/
  02-boundary/
  03-mock-stub/
  ...
/docs                 # Tài liệu, báo cáo test, hình ảnh
```

## ⚙️ Công nghệ / Thư viện
- **Java 17+**
- **JUnit 5**, **Mockito**
- **Maven** (Surefire, Failsafe), **JaCoCo** (coverage)
- (Tuỳ chọn) **GitHub Actions** cho CI

## 🚀 Chạy test nhanh
```bash
# Chạy toàn bộ unit tests
mvn -q test

# Sinh báo cáo coverage (target/site/jacoco/index.html)
mvn -q clean test jacoco:report
```

## 🧱 Quy ước đặt tên & tổ chức test
- Tên lớp test: `ClassNameTest` hoặc `ClassNameShould`.  
- Tên phương thức test: `method_shouldExpectedBehavior_whenCondition()`.  
- Một test = 3 phần rõ ràng: **Arrange – Act – Assert**.

## ✅ Checklist cho mỗi bài
- [ ] Xác định input domain & case quan trọng  
- [ ] Bao phủ happy path, edge cases, error handling  
- [ ] Mock/Stub dependencies (nếu có)  
- [ ] Đảm bảo test **độc lập** & **deterministic**  
- [ ] Coverage mục tiêu ≥ **80%** (hoặc theo yêu cầu môn học)

## 🔄 Quy trình làm bài (gợi ý)
1. Viết yêu cầu test (test cases) trong `/docs`  
2. TDD (nếu áp dụng): **viết test → chạy đỏ → viết code → chạy xanh → refactor**  
3. Kiểm tra coverage & cải thiện nơi cần thiết  
4. Commit nhỏ, message rõ ràng: `feat(test): ...`, `fix: ...`, `refactor: ...`

## 🤝 Đóng góp
PR được chào mừng! Vui lòng:
- Tuân thủ **style code** & **quy ước test**  
- Đính kèm minh chứng **coverage** và **mô tả case** trong PR

## 📄 License
MIT (hoặc theo yêu cầu môn học)

---

_Chúc bạn học tốt và “test what matters”!_
