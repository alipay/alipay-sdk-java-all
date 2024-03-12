package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同文件model
 *
 * @author auto create
 * @since 1.0, 2021-11-23 17:57:02
 */
public class ContractAttach extends AlipayObject {

	private static final long serialVersionUID = 7835276219216868144L;

	/**
	 * 合同附件业务状态 申请用印时传递 已定稿 CREATED 已创建 CONFIRMED 已定稿 DELETE 已删除
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 文件地址(调用合同中心提供的文件上传时返回的filekey)
	 */
	@ApiField("file_location")
	private String fileLocation;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型 DOC 正文 ATTACH 附件
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件路径（HTTP下载链接）
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 是否为http方式下载文件
	 */
	@ApiField("type_is_http")
	private Boolean typeIsHttp;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getFileLocation() {
		return this.fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
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

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Boolean getTypeIsHttp() {
		return this.typeIsHttp;
	}
	public void setTypeIsHttp(Boolean typeIsHttp) {
		this.typeIsHttp = typeIsHttp;
	}

}
