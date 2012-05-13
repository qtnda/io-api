package com.oldratlee.io.api;

public interface Sender<T, SenderThrowableType extends Throwable> {
    <ReceiverThrowableType extends Throwable> void sendTo(Receiver<T, ReceiverThrowableType> receiver)
            throws ReceiverThrowableType, SenderThrowableType;
}