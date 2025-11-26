package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件
 *
 * @author auto create
 * @since 1.0, 2023-08-18 11:13:45
 */
public class AecpFileDTO extends AlipayObject {

	private static final long serialVersionUID = 1262186257723367161L;

	/**
	 * 附件大小
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 资源Id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 附件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 预览URL
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 上传时间
	 */
	@ApiField("upload_time")
	private Date uploadTime;

	/**
	 * 上传人
	 */
	@ApiField("uploader")
	private AliEmployeeDTO uploader;

	/**
	 * url
	 */
	@ApiField("url")
	private String url;

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public AliEmployeeDTO getUploader() {
		return this.uploader;
	}
	public void setUploader(AliEmployeeDTO uploader) {
		this.uploader = uploader;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
