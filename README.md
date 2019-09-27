# contract-testing-in-microservices  
> by somkiat.cc 27/09/2019

Reference
 - [https://martinfowler.com/articles/microservice-testing](https://martinfowler.com/articles/microservice-testing/)
 - [https://microservices.io/patterns/index.html](https://microservices.io/patterns/index.html)

## Intro Microservices
Domain in microservice able to mapping 
คนๆเดียวกัน อยู่ต่างที่ ถูกเรียกต่างกัน ถือเป็นคนละ Domain ( ขอบเขต )
ปริมาณเทสน้อย

Business logic stay in service layer

Intergration Test การทดสอบช่วงตะเข็บชายแดน ( การเชื่อมต่อ , ติดต่อสื่อสาร )
ในที่นี้คือการยิงจริง!! เพราะเป็นการทดสอบการเชื่อมต่อะ

ยิ่งอยู่ใกล้ผู้ใช้งานเท่าไหร่ ต้องยิ่งเช็คจุด Intergration 

ที่ทำอยู่ตอนนี้เราเรียก Componention ว่า Integration 

Integration
การทดสอบ 1 ----> 2
เราทดสอบที่ 1

Contract 
มุมมอง API - API 

การทดสอบ 2 <-----1 
2 ให้บริการกับ 1
ทดสอบว่า ผู้รับบริการของเรายังสามารถใช้งานได้ปกติ
**Optional 
การแก้ไขไม่ให้เกิด Break กับตัวเก่า
Interface คือ contract

Common issues
	- เปลี่ยนชื่อ endpoint
	- เปลี่ยน/เพิ่ม parameter
	- เปลี่ยน Validation ( require field )
	- เปลี่ยน response

**Compatability is KEY**

"Contract" สัญญาไม่เปลี่ยน

การทำ Versioning ก็สามารถ Map ไปเรื่อง Contract ได้
เราคุยกันเรื่อง Compatability

A Contact จะมีรายละเอียดถึง Consumer ทั้งหมด
API ก็สามารถมีหลาย endpoint ทั้ง Success และ Fail Case

Contract คือ Argreement 
Argreement คือ Test

STEP

API Document -> Create Contract -> Implement

