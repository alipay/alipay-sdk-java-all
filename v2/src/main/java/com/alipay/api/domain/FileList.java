package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-26 18:07:44
 */
public class FileList extends AlipayObject {

	private static final long serialVersionUID = 6713783718184882657L;

	/**
	 * 文件基于SHA_256计算出的哈希值
	 */
	@ApiField("file_hash")
	private String fileHash;

	/**
	 * 文件的md5值
	 */
	@ApiField("file_md_5")
	private String fileMd5;

	/**
	 * 需要存证文件的名字
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件大小（字节）
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	public String getFileHash() {
		return this.fileHash;
	}
	public void setFileHash(String fileHash) {
		this.fileHash = fileHash;
	}

	public String getFileMd5() {
		return this.fileMd5;
	}
	public void setFileMd5(String fileMd5) {
		this.fileMd5 = fileMd5;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
