package com.obsidiandynamics.zerolog;

import java.util.function.*;

import com.obsidiandynamics.zerolog.Zlg.*;

public final class NopLogChain implements LogChain {
  private static final NopLogChain instance = new NopLogChain();
  
  public static NopLogChain getInstance() { return instance; }
  
  private NopLogChain() {}
  
  @Override
  public LogChain tag(String tag) {
    return this;
  }

  @Override
  public LogChain format(String format) {
    return this;
  }
  
  @Override
  public LogChain message(Object message) {
    return this;
  }

  @Override
  public LogChain arg(boolean arg) {
    return this;
  }

  @Override
  public LogChain arg(BooleanSupplier supplier) {
    return this;
  }

  @Override
  public LogChain arg(byte arg) {
    return this;
  }

  @Override
  public LogChain arg(char arg) {
    return this;
  }

  @Override
  public LogChain arg(double arg) {
    return this;
  }

  @Override
  public LogChain arg(DoubleSupplier supplier) {
    return this;
  }

  @Override
  public LogChain arg(float arg) {
    return this;
  }

  @Override
  public LogChain arg(int arg) {
    return this;
  }

  @Override
  public LogChain arg(IntSupplier supplier) {
    return this;
  }

  @Override
  public LogChain arg(long arg) {
    return this;
  }

  @Override
  public LogChain arg(LongSupplier supplier) {
    return this;
  }

  @Override
  public LogChain arg(short arg) {
    return this;
  }

  @Override
  public LogChain arg(Object arg) {
    return this;
  }

  @Override
  public LogChain arg(Supplier<?> supplier) {
    return this;
  }
  
  @Override
  public LogChain threw(Throwable throwable) {
    return this;
  }
  
  @Override
  public LogChain entrypoint(String entrypoint) {
    return this;
  }

  @Override
  public void flush(String assumedEntrypoint) {}
}
