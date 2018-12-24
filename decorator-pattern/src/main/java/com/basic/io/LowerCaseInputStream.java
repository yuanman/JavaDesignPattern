package com.basic.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * locate com.basic.io
 * Created by MasterTj on 2018/12/24.
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return read==-1 ? -1 : Character.toLowerCase((char)read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        for (int i = off; i < off+read; i++) {
            b[i]= (byte) Character.toLowerCase((char)b[i]);
        }
        return read;
    }
}
