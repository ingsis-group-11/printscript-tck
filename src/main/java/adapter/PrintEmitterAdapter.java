package adapter;

import interpreter.PrintEmitter;
import providers.printProvider.PrintProvider;

public class PrintEmitterAdapter implements PrintProvider {

  private PrintEmitter printEmitter;

  public PrintEmitterAdapter(PrintEmitter printEmitter) {

    this.printEmitter = printEmitter;
  }
  @Override
  public void print(String s) {
    printEmitter.print(s);
  }
}