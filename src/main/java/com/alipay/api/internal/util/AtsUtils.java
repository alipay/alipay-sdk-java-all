package com.alipay.api.internal.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.alipay.api.AlipayApiException;

/**
 * 异步API下载工具类。
 * 
 * @author carver.gu
 * @since 1.0, Dec 1, 2010
 */
public abstract class AtsUtils {

	private static final String CTYPE_OCTET = "application/octet-stream";
	private static final Pattern REGEX_FILE_NAME = Pattern.compile("attachment;filename=\"([\\w\\-]+)\"");

	private AtsUtils() {
	}

    /**
     * 解压gzip文件到指定的目录，目前只能解压gzip包里面只包含一个文件的压缩包。
     * 
     * @param gzip 需要解压的gzip文件
     * @param toDir 需要解压到的目录
     * @return 解压后的文件
     * @throws IOException
     */
	public static File ungzip(File gzip, File toDir) throws IOException {
		toDir.mkdirs();
		File out = new File(toDir, gzip.getName());
		GZIPInputStream gin = null;
		FileOutputStream fout = null;
		try {
			FileInputStream fin = new FileInputStream(gzip);
			gin = new GZIPInputStream(fin);
			fout = new FileOutputStream(out);
			copy(gin, fout);
			gin.close();
			fout.close();
		} finally {
			closeQuietly(gin);
			closeQuietly(fout);
		}
		return out;
	}

    /**
     * 解压zip文件到指定的目录。
     * 
     * @param zip 需要解压的zip文件
     * @param toDir 需要解压到的目录
     * @return 解压后的文件列表（不包含文件夹）
     */
	public static List<File> unzip(File zip, File toDir) throws IOException {
		ZipFile zf = null;
		List<File> files = null;
		try {
			zf = new ZipFile(zip);
			files = new ArrayList<File>();
			Enumeration<?> entries = zf.entries();
			while (entries.hasMoreElements()) {
				ZipEntry entry = (ZipEntry) entries.nextElement();
				if (entry.isDirectory()) {
					new File(toDir, entry.getName()).mkdirs();
					continue;
				}

				InputStream input = null;
				OutputStream output = null;
				try {
					File f = new File(toDir, entry.getName());
					input = zf.getInputStream(entry);
					output = new FileOutputStream(f);
					copy(input, output);
					files.add(f);
				} finally {
					closeQuietly(output);
					closeQuietly(input);
				}
			}
		} finally {
			if (zf != null) {
				zf.close();
			}
		}
		return files;
	}

    /**
     * 通过HTTP GET方式下载文件到指定的目录。
     * 
     * @param url 需要下载的URL
     * @param toDir 需要下载到的目录
     * @return 下载后的文件
     */
	public static File download(String url, File toDir) throws AlipayApiException {
		toDir.mkdirs();
		HttpURLConnection conn = null;
		OutputStream output = null;
		File file = null;
		try {
			conn = getConnection(new URL(url));
			String ctype = conn.getContentType();
			if (CTYPE_OCTET.equals(ctype)) {
				String fileName = getFileName(conn);
				file = new File(toDir, fileName);
				output = new FileOutputStream(file);
				copy(conn.getInputStream(), output);
			} else {
				String rsp = WebUtils.getResponseAsString(conn);
                throw new AlipayApiException(rsp);
			}
		} catch (IOException e) {
            throw new AlipayApiException(e.getMessage());
		} finally {
			closeQuietly(output);
			if (conn != null) {
				conn.disconnect();
			}
		}
		return file;
	}

    /**
     * 检查指定文件的md5sum和指定的检验码是否一致。
     * 
     * @param file 需要检验的文件
     * @param checkCode 已知的md5sum检验码
     * @return true/false
     */
	public static boolean checkMd5sum(File file, String checkCode) throws IOException {
		DigestInputStream dInput = null;
		try {
			FileInputStream fInput = new FileInputStream(file);
			dInput = new DigestInputStream(fInput, getMd5Instance());
			byte[] buf = new byte[8192];
			while (dInput.read(buf) > 0) {
			}
			byte[] bytes = dInput.getMessageDigest().digest();
			return bytes2hex(bytes).equals(checkCode);
		} finally {
			closeQuietly(dInput);
		}
	}

    /**
     * 把字节数组转换成十六进制的字符串。
     */
	private static String bytes2hex(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(bytes[i] & 0XFF);
			if (hex.length() == 1) {
				sb.append("0").append(hex);
			} else {
				sb.append(hex);
			}
		}
		return sb.toString();
	}

	private static MessageDigest getMd5Instance() {
		try {
			return MessageDigest.getInstance("md5");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static String getFileName(HttpURLConnection conn) {
		String fileName = conn.getHeaderField("Content-Disposition");
		Matcher matcher = REGEX_FILE_NAME.matcher(fileName);
		if (matcher.find()) {
			return matcher.group(1);
		} else {
			return null;
		}
	}

	private static HttpURLConnection getConnection(URL url) throws IOException {
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestProperty("Accept", "application/zip;text/html");
		return conn;
	}

	private static int copy(InputStream input, OutputStream output) throws IOException {
		long count = copyStream(input, output);
		if (count > Integer.MAX_VALUE) {
			return -1;
		}
		return (int) count;
	}

	private static long copyStream(InputStream input, OutputStream output) throws IOException {
		byte[] buffer = new byte[1024];
		long count = 0;
		int n = 0;
		while (-1 != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
			count += n;
		}
		return count;
	}

	private static void closeQuietly(OutputStream output) {
		try {
			if (output != null) {
				output.close();
			}
		} catch (IOException ioe) {
			// ignore
		}
	}

	private static void closeQuietly(InputStream input) {
		try {
			if (input != null) {
				input.close();
			}
		} catch (IOException ioe) {
			// ignore
		}
	}

}
