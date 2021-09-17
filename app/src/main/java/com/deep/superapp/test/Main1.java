package com.deep.superapp.test;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.deep.superapp.ITest1;

import io.sapp.core.internal.IPCMain;
import io.sapp.core.internal.RootIPC;

public class Main1 extends IPCMain {

    @Override
    public void main(String sourcePath, String[] args) {
        Log.e("args_apkPath",sourcePath);
        for (int i = 0; i < args.length; i++) {
            Log.e(String.format("args[%d]", i), args[i]);
        }
    }

    @Override
    public IBinder onBind() {
        return new ITest1.Stub() {
            @Override
            public String getTest() throws RemoteException {
                return "第一个ROOT进程";
            }
        };
    }
}
