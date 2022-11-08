package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.file.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 17:46:37
 */
public class AlipayOpenMiniCloudFileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5314275429549946494L;

	/** 
	 * 文件绝对路径
	 */
	@ApiField("absolute_path")
	private String absolutePath;

	/** 
	 * 云环境ID
	 */
	@ApiField("cloud_id")
	private String cloudId;

	/** 
	 * 文件创建者
	 */
	@ApiField("creator")
	private String creator;

	/** 
	 * 文件访问地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

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

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}
	public String getAbsolutePath( ) {
		return this.absolutePath;
	}

	public void setCloudId(String cloudId) {
		this.cloudId = cloudId;
	}
	public String getCloudId( ) {
		return this.cloudId;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator( ) {
		return this.creator;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	public Boolean getEnable( ) {
		return this.enable;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName( ) {
		return this.fileName;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType( ) {
		return this.fileType;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getPath( ) {
		return this.path;
	}

}
