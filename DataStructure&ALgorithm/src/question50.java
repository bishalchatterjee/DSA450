public class question50 {
    //WHY ARE STRINGS IMMUTABLE IN JAVA?

    /*
    ANSWER--
    In object-oriented programming, the immutable string or objects that cannot be modified once it is created.
    But we can only change the reference to the object. We restrict to change the object itself.
    The String is immutable in Java because of the security, synchronization and concurrency, caching, and class loading.
    The reason of making string final is to destroy the immutability and to not allow others to extend it.
    The String objects are cached in the String pool, and it makes the String immutable.

    These are some more reasons of making String immutable:

    The String pool cannot be possible if String is not immutable in Java.
    A lot of heap space is saved by JRE.
    The same string variable can be referred to by more than one string variable in the pool.
    String interning can also not be possible if the String would not be immutable.
    If we don't make the String immutable, it will pose a serious security threat to the application.
    For example, database usernames, passwords are passed as strings to receive database connections.
    The socket programming host and port descriptions are also passed as strings.
    The String is immutable, so its value cannot be changed.
    If the String doesn't remain immutable, any hacker can cause a security issue in the application by changing the reference value.
    The String is safe for multithreading because of its immutableness.
    Different threads can access a single "String instance". It removes the synchronization for thread safety because we make strings thread-safe implicitly.
    Immutability gives the security of loading the correct class by Classloader.
    For example, suppose we have an instance where we try to load java.sql.Connection class but the changes in the referenced value to the myhacked.Connection class does unwanted things to our database.
     */
}
