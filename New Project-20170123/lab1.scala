1. 1/0:Int
int
java.lang.ArithmeticException: / by zero                                                         
  ... 31 elided   
you can't divide by 0

2. if ((1/0)==42) 1 else 2
int
java.lang.ArithmeticException: / by zero                                                         
  ... 31 elided
you can't divide by zero

3. true*3
true*3:Boolean
true*3:Int
boolean
<console>:11: error: value * is not a member of Boolean
multiplication is not an operator of Boolean logic

4. if (true) 1/0 else 2
int
java.lang.ArithmeticException: / by zero                                                         
  ... 31 elided
boolean is true so expression goes to e1 which is 1/0, the expression 1/0 results in the arithmetic exception because you can't divide by 0

5. if (false) 1/0 else 2
int
2
boolean is false, expression evaluates to e2 which is 2: Int

6. (if(true) 42 else true):Boolean
Boolean
<console>:11: error: type mismatch;                                                              
 found   : Int(42)                                                                               
 required: Boolean                                                                               
       (if(true) 42 else true):Boolean
42 is an int in an expression of boolean, types of both expressions must match

7. (if(true) 42 else true):Int
Int
<console>:11: error: type mismatch;                                                              
 found   : Boolean(true)                                                                         
 required: Int                                                                                   
       (if(true) 42 else true):Int 
true is a boolean when console is expecting int, types of both expressions must match

8. (if(true)42 else true)
int
AnyVal = 42
because no data type has been declared, the expressions do not have to match and the output is AnyVal

9. true&&true
boolean
boolean = true
because the first expression is true, the second expression is evaluated and true, because both branches are true, the overall expression is true

10. true&&false
boolean
boolean = true
because the first expression is true, the second expression is evaluated and true, because one of the branches is false, the overall expression is false

11. false&&{val x:Int=1/0 false}
boolean
boolean = false
because the first expression is false, the compiler stops evaluating the expression because if one branch is false the expression is false

12. true||true
boolean
boolean = true
the first expression is true, the second expression is true, both branches are true, the overall expression is true

13. true||false
boolean
boolean = true

14. false||{val x:Int=1/0 false}