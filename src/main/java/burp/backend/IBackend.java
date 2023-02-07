package burp.backend;

import burp.IRequestInfo;

public interface IBackend {
    boolean supportBatchCheck();

    String getName();

    String getNewPayload();

    String getNewPayload2(IRequestInfo requestInfo);

    String[] batchCheck(String[] payloads);

    boolean CheckResult(String payload);

    boolean flushCache();

    boolean flushCache(int count);

    boolean getState();

    int[] getSupportedPOCTypes();

    void close();
}