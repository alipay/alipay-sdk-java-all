package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建流程时平台上传的附件及签署时用户上传的附件或身份证
 *
 * @author auto create
 * @since 1.0, 2020-02-04 14:09:38
 */
public class AttachmentDetail extends AlipayObject {

	private static final long serialVersionUID = 1795713931572335193L;

	/**
	 * 创建流程时指定的附件code，可能为空。（身份证正反面的固定code：正面：ESIGN_IDCARD，背面：ESIGN_BACK_IDCARD）
	 */
	@ApiField("code")
	private String code;

	/**
	 * 附件文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 附件下载地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
