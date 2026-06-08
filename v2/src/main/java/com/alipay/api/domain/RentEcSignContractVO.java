package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁电子合同签署信息
 *
 * @author auto create
 * @since 1.0, 2026-05-18 14:11:17
 */
public class RentEcSignContractVO extends AlipayObject {

	private static final long serialVersionUID = 6736982552756767641L;

	/**
	 * 租赁电子合同模板code
	 */
	@ApiField("ec_template_code")
	private String ecTemplateCode;

	/**
	 * 已签署合同文件地址，签署成功才有
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 签署状态
	 */
	@ApiField("status")
	private String status;

	public String getEcTemplateCode() {
		return this.ecTemplateCode;
	}
	public void setEcTemplateCode(String ecTemplateCode) {
		this.ecTemplateCode = ecTemplateCode;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
