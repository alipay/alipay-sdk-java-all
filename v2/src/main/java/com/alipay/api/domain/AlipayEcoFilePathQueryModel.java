package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取文件直传地址（E签宝）
 *
 * @author auto create
 * @since 1.0, 2019-12-26 21:39:20
 */
public class AlipayEcoFilePathQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7498166213986178322L;

	/**
	 * 先计算文件md5值，在对该md5值进行base64编码
	 */
	@ApiField("content_md_5")
	private String contentMd5;

	/**
	 * 目标文件的MIME类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 文件名称。
注意：必须带上文件扩展名，不然会导致后续发起流程校验不通过。示例：合同.pdf。
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件大小，单位byte。最大允许上传30Mb
	 */
	@ApiField("file_size")
	private Long fileSize;

	public String getContentMd5() {
		return this.contentMd5;
	}
	public void setContentMd5(String contentMd5) {
		this.contentMd5 = contentMd5;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
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

}
