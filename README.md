
# E-commerce Platform: Search Functionality

This Java project demonstrates linear and binary search to find products in an e-commerce platform.

## ✅ Concepts Covered
### Big O Notation:
- **O(1)**: Constant time
- **O(n)**: Linear time (e.g., linear search)
- **O(log n)**: Logarithmic time (e.g., binary search)
- **O(n log n)**: Typical sorting time

### Search Complexities:
- **Linear Search**:
  - Best case: O(1) (match at start)
  - Average case: O(n/2)
  - Worst case: O(n)
- **Binary Search**:
  - Requires sorted data
  - Best case: O(1)
  - Average & Worst case: O(log n)

## 🧪 Product Class
- productId
- productName
- category

## 🧮 Algorithms
- `linearSearch(Product[] products, String name)`
- `binarySearch(Product[] products, String name)`

## 📂 Project Structure
```
src/
  Product.java
  SearchUtil.java
  SearchTest.java
```

## 💻 How to Run

### Compile:
```bash
javac src/*.java
```

### Run:
```bash
java -cp src SearchTest
```
