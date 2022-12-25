package com.alipay.api.internal.util.file;

import java.io.*;
import java.nio.charset.Charset;

public class FileUtils {

    /**
     * Reads the contents of a file into a String using the default encoding for the VM. The file is always closed.
     *
     * @param file the file to read, must not be {@code null}
     * @return the file contents, never {@code null}
     * @throws IOException in case of an I/O error
     * @since 1.3.1
     * @deprecated 2.5 use {@link #readFileToString(File, Charset)} instead
     */
    @Deprecated
    public static String readFileToString(final File file) throws IOException {
        return readFileToString(file, Charset.defaultCharset());
    }

    /**
     * Reads the contents of a file into a String. The file is always closed.
     *
     * @param file     the file to read, must not be {@code null}
     * @param encoding the encoding to use, {@code null} means platform default
     * @return the file contents, never {@code null}
     * @throws IOException in case of an I/O error
     * @since 2.3
     */
    public static String readFileToString(final File file, final Charset encoding) throws IOException {
        InputStream in = null;
        try {
            in = openInputStream(file);
            return IOUtils.toString(in, Charsets.toCharset(encoding));
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    /**
     * Opens a {@link FileInputStream} for the specified file, providing better error messages than simply calling <code>new
     * FileInputStream(file)</code>.
     * <p>
     * At the end of the method either the stream will be successfully opened, or an exception will have been thrown.
     * <p>
     * An exception is thrown if the file does not exist. An exception is thrown if the file object exists but is a directory. An exception
     * is thrown if the file exists but cannot be read.
     *
     * @param file the file to open for input, must not be {@code null}
     * @return a new {@link FileInputStream} for the specified file
     * @throws FileNotFoundException if the file does not exist
     * @throws IOException           if the file object is a directory
     * @throws IOException           if the file cannot be read
     * @since 1.3
     */
    public static FileInputStream openInputStream(final File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (file.canRead() == false) {
                throw new IOException("File '" + file + "' cannot be read");
            }
        } else {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        return new FileInputStream(file);
    }
}
