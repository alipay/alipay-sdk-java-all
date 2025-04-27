package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取活体照片
 *
 * @author auto create
 * @since 1.0, 2023-11-01 17:24:43
 */
public class ZolozIdentificationCustomerCertifyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6528986714389316893L;

	/**
	 * 商户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 实人信息：姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 实人信息：证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 实人信息：证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * ALIVE取留存活体，CERT取公安网
	 */
	@ApiField("type")
	private String type;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
