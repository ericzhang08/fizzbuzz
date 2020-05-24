27. 编程题
你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：

1. 让所有学生排成一队，然后按顺序报数。

2. 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。

3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。

 

考核点：

1. 业务需求Tasking规范和可视化记录

2. TDD开发节奏，三顶帽子切换

3. Git小步提交，Commit信息

tasking:
given 数字2不能被3，5，7整除 when 报数  then 返回相同数字2
given 数字3只可以被3整除      when报数   then 返回Fizz
given 数字5只可以被5整除      when报数   then 返回Buzz
given 数字7只可以被7整除      when报数   then 返回Whizz

given 数字15可以被 3 和5整除  when报数   then 返回FizzBuzz
given 数字21可以被 3 和7整除  when报数   then 返回FizzWhizz
given 数字35可以被 5 和7整除  when报数   then 返回BuzzWhizz

given 数字105可以被3，5 和7整除  when报数   then 返回FizzBuzzWhizz