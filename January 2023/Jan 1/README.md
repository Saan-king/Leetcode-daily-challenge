#### 1.Each character in pattern represents a word in s.
#### 2.No two distinct characters in pattern can represent the same word in s
#### 3.No single character in pattern can represent two distinct words in s.

pattern = 'abab'; s = 'dog cat dog cat'; return True
'a' represents 'dog' and 'b' represents cat

pattern = 'abcb'; s = 'dog cat dog cat'; return False
'a' represents 'dog', 'b' represents 'cat'. 
Then 'c' cannot represent 'dog' again as 'a' already represents 'dog' 
(#2 condition is: No two distinct characters in pattern i.e. 'a' and 'c' can represent same word i.e 'dog'.)
