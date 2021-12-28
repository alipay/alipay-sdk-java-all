package com.alipay.api;

import com.alipay.api.internal.util.AlipayUtils;

import java.io.*;

/**
 * 文件元数据。
 *
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public class FileItem {

    private String fileName;
    private String mimeType;
    private byte[] content;
    private File file;

    /**
     * 基于本地文件的构造器。
     *
     * @param file 本地文件
     */
    public FileItem(File file) {
        this.file = file;
    }

    /**
     * 基于文件绝对路径的构造器。
     *
     * @param filePath 文件绝对路径
     */
    public FileItem(String filePath) {
        this(new File(filePath));
    }

    /**
     * 基于文件名和字节流的构造器。
     *
     * @param fileName 文件名
     * @param content  文件字节流
     */
    public FileItem(String fileName, byte[] content) {
        this.fileName = fileName;
        this.content = content;
    }

    /**
     * 基于文件名、字节流和媒体类型的构造器。
     *
     * @param fileName 文件名
     * @param content  文件字节流
     * @param mimeType 媒体类型
     */
    public FileItem(String fileName, byte[] content, String mimeType) {
        this(fileName, content);
        this.mimeType = mimeType;
    }

    public String getFileName() {
        if (this.fileName == null && this.file != null && this.file.exists()) {
            this.fileName = file.getName();
        }
        return this.fileName;
    }

    public String getMimeType() throws IOException {
        if (this.mimeType == null) {
            this.mimeType = AlipayUtils.getMimeType(getFileHeader());
        }
        return this.mimeType;
    }

    public byte[] getFileHeader() throws IOException {
        if (this.content == null && this.file != null && this.file.exists()) {
            InputStream in = null;
            try {
                in = new FileInputStream(this.file);
                byte[] bufferByte = new byte[16];
                if ((in.read(bufferByte)) != -1) {
                    return bufferByte;
                }
            } finally {
                if (in != null) {
                    in.close();
                }
            }
            return null;
        } else {
            return this.content;
        }
    }

    public byte[] getContent() throws IOException {
        if (this.content == null && this.file != null && this.file.exists()) {
            InputStream in = null;
            ByteArrayOutputStream out = null;

            try {
                in = new FileInputStream(this.file);
                out = new ByteArrayOutputStream();
                int ch;
                while ((ch = in.read()) != -1) {
                    out.write(ch);
                }
                this.content = out.toByteArray();
            } finally {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            }
        }
        return this.content;
    }

    public void writeFileContent(OutputStream out) throws IOException {
        if (out == null) return;
        if (this.content != null) {
            out.write(this.content);
        } else if (this.file != null && this.file.exists()) {
            InputStream in = null;

            try {
                in = new FileInputStream(this.file);
                int bytes;
                byte[] bufferByte = new byte[1024 * 1024];
                while ((bytes = in.read(bufferByte)) != -1) {
                    out.write(bufferByte, 0, bytes);
                }
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        } else {
            throw new IOException("文件字节流或文件为空");
        }
    }

    public long fileContentLength() {
        if (this.content != null) {
            return this.content.length;
        } else if (this.file != null && this.file.exists()) {
            return this.file.length();
        } else {
            return 0;
        }
    }

}
