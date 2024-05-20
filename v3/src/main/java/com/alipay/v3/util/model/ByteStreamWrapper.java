/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.alipay.v3.util.model;

/**
 * @author jishupei.jsp
 * @version : ByteStreamWrapper, v0.1 2024年01月17日 3:03 下午 jishupei.jsp Exp $
 */
public class ByteStreamWrapper {
    private String fileName;
    private byte[] content;
    private String mimeType;

    /**
     * 基于文件名和字节流的构造器。
     *
     * @param fileName 文件名
     * @param content  字节流
     */
    public ByteStreamWrapper(String fileName, byte[] content) {
        this.fileName = fileName;
        this.content = content;
    }

    /**
     * 基于文件名、字节流和媒体类型的构造器。
     *
     * @param fileName 文件名
     * @param content  字节流
     * @param mimeType 媒体类型
     */
    public ByteStreamWrapper(String fileName, byte[] content, String mimeType) {
        this(fileName, content);
        this.mimeType = mimeType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getMimeType() {
        if (this.mimeType == null) {
            return getRealMimeType(content);
        }
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * 获取文件的真实媒体类型。目前只支持JPG, GIF, PNG, BMP四种图片文件。
     *
     * @param bytes 文件字节流
     * @return 媒体类型(MEME - TYPE)
     */
    private String getRealMimeType(byte[] bytes) {
        String suffix = getFileSuffix(bytes);
        if ("JPG".equals(suffix)) {
            return "image/jpeg";
        } else if ("GIF".equals(suffix)) {
            return "image/gif";
        } else if ("PNG".equals(suffix)) {
            return "image/png";
        } else if ("BMP".equals(suffix)) {
            return "image/bmp";
        } else {
            return "application/octet-stream";
        }
    }

    /**
     * 获取文件的真实后缀名。目前只支持JPG, GIF, PNG, BMP四种图片文件。
     *
     * @param bytes 文件字节流
     * @return JPG, GIF, PNG or null
     */
    private String getFileSuffix(byte[] bytes) {
        if (bytes == null || bytes.length < 10) {
            return null;
        }

        if (bytes[0] == 'G' && bytes[1] == 'I' && bytes[2] == 'F') {
            return "GIF";
        } else if (bytes[1] == 'P' && bytes[2] == 'N' && bytes[3] == 'G') {
            return "PNG";
        } else if (bytes[6] == 'J' && bytes[7] == 'F' && bytes[8] == 'I' && bytes[9] == 'F') {
            return "JPG";
        } else if (bytes[0] == 'B' && bytes[1] == 'M') {
            return "BMP";
        } else {
            return null;
        }
    }
}
