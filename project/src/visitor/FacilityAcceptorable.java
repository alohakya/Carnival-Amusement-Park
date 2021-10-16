package visitor;

/**
 * 抽象acceptor类
 */
public interface FacilityAcceptorable {
    // 核心方法，接受Visitor的访问
    void accept(Visitorable visitor);
}
