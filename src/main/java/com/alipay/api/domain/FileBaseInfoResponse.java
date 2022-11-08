package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云存储文件基本信息
 *
 * @author auto create
 * @since 1.0, 2022-09-14 14:31:35
 */
public class FileBaseInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 2858681919967897632L;

	/**
	 * 文件绝对路径
	 */
	@ApiField("absolute_path")
	private String absolutePath;

	/**
	 * 是否生效,true:是，false:否
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件或目录名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型,目录:Directory,文件:File
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件父目录路径
	 */
	@ApiField("path")
	private String path;

	public String getAbsolutePath() {
		return this.absolutePath;
	}
	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
