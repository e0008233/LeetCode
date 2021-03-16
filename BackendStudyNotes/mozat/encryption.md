https://www.cnblogs.com/chyingp/p/https-introduction.html
https://www.cnblogs.com/yousen/p/5265232.html

1. 消息摘要算法 （MD5, SHA256）  
   简介：
   - 消息摘要算法的主要特征是加密过程不需要密钥，并且经过加密的数据无法被解密
   - 只有输入相同的明文数据经过相同的消息摘要算法才能得到相同的密文。
   - 消息摘要算法主要应用在“数字签名”领域，作为对明文的摘要算法。
   - 著名的摘要算法有RSA公司的MD5算法和SHA-1算法及其大量的变体。    
     
   特点：    
   - 无论输入的消息有多长，计算出来的消息摘要的长度总是固定的。
   - 消息摘要看起来是“伪随机的”。也就是说对相同的信息求摘要结果相同。
   - 消息轻微改变生成的摘要变化会很大
   - 只能进行正向的信息摘要，而无法从摘要中恢复出任何的消息，甚至根本就找不到任何与原信息相关的信息

3. 对称加密 (DES)
   - 加密密钥和解密密钥相同的加密算法。

4. 非对称加密 (RSA)
   - 与对称加密算法不同，非对称加密算法需要两个密钥：公开密钥（public key）和私有密钥 （private key
   - 公开密钥与私有密钥是一对，如果用公开密钥对数据进行加密，只有用对应的私有密钥才能解密；
   - 如果用私有密钥对数据进行加密，那么只有用对应的公开密钥才能解密。
   - 因为加密和解密使用的是两个不同的密钥，所以这种算法叫作非对称加密算法。

    