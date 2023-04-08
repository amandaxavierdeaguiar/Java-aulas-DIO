package Strategy.Robot;

public class Main {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robot robot = new Robot();
        robot.setStrategy(normal);
        robot.mover();
        robot.mover();
        robot.setStrategy(defensivo);
        robot.mover();
        robot.mover();
        robot.mover();
        robot.setStrategy(agressivo);
        robot.mover();
    }
}
