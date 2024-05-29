public class Main {
  public static void main(String[] args) {
      Logger consoleLogger = LoggerFactory.onConsole();
      Logger fileLogger = LoggerFactory.onFile("log.txt");

      consoleLogger.log(Level.DEBUG, "Este é um log de debug no console.");
      consoleLogger.log(Level.WARNING, "Este é um log de aviso no console.");
      consoleLogger.log(Level.ERROR, "Este é um log de erro no console.");

      fileLogger.log(Level.DEBUG, "Este é um log de debug no arquivo.");
      fileLogger.log(Level.WARNING, "Este é um log de aviso no arquivo.");
      fileLogger.log(Level.ERROR, "Este é um log de erro no arquivo.");
  }
}