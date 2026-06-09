# 🍱 FoodOrder 點餐系統

使用 Java Swing 開發的桌面點餐系統，採用 MVC 架構設計，提供便當點餐、數量調整、折扣計算、列印與即時時間顯示功能。

---

## 📌 專案介紹

本系統模擬便當店 POS 點餐流程，使用者可以：

- 新增或減少餐點數量
- 查看即時計算金額
- 選擇內用或外帶
- 選擇額外配菜
- 清空訂單
- 列印訂單
- 顯示目前時間

---

## 🏗️ 系統架構

採用 MVC（Model-View-Controller）設計模式。

### Model

負責資料管理

| 類別 | 功能 |
|--------|--------|
| Order | 訂單資料 |
| OrderItem | 單一商品資料 |
| TimeModel | 時間處理 |
| Chicken | 雞腿飯模型 |
| Pork | 排骨飯模型 |
| Veg | 菜飯模型 |

---

### View

負責畫面顯示

| 類別 | 功能 |
|--------|--------|
| Mainview | Swing UI 畫面 |

---

### Controller

負責事件控制

| 類別 | 功能 |
|--------|--------|
| OrderController | 按鈕事件與畫面更新 |

---

### Service

負責商業邏輯

| 類別 | 功能 |
|--------|--------|
| OrderService | 訂單計算與折扣處理 |

---

## 🍚 商品資訊

| 商品 | 價格 |
|--------|--------|
| 雞腿飯 | NT$120 |
| 排骨飯 | NT$100 |
| 菜飯 | NT$80 |

---

## 💰 折扣規則

當訂單總金額達到：

```text
500 元以上
```

享有：

```text
9 折優惠
```

範例：

```text
原價：600 元
折扣後：540 元
```

---

## ⚙️ 使用技術

- Java
- Java Swing
- MVC Design Pattern
- Event Listener
- OOP 物件導向設計

---

## 🚀 執行方式

1. 使用 Eclipse 匯入專案

```text
File
→ Import
→ Existing Projects into Workspace
```

2. 執行

```java
view.Mainview
```

或直接執行：

```java
Mainview.main()
```

---

## 📂 專案目錄

```text
src
│
├─ controller
│   └─ OrderController.java
│
├─ model
│   ├─ Order.java
│   ├─ OrderItem.java
│   ├─ Chicken.java
│   ├─ Pork.java
│   ├─ Veg.java
│   └─ TimeModel.java
│
├─ service
│   └─ OrderService.java
│
└─ view
    └─ Mainview.java
```

---

## 🎯 學習重點

本專案練習：

- MVC 架構
- Java Swing GUI
- ActionListener 事件處理
- 封裝（Encapsulation）
- 類別職責分離
- 商業邏輯與畫面分離

---

## 🔮 未來可擴充功能

- 資料庫儲存訂單
- 會員系統
- 歷史訂單查詢
- 銷售報表
- 多視窗 POS 系統
- Spring Boot 後端版本
- MySQL 資料庫整合

---

作者：Noah Lai
