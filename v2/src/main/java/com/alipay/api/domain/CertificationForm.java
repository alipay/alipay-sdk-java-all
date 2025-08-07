package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账抽佣的凭证类型
 *
 * @author auto create
 * @since 1.0, 2023-01-05 16:01:53
 */
public class CertificationForm extends AlipayObject {

	private static final long serialVersionUID = 4751138294758492124L;

	/**
	 * 该字段用来表示抽佣的凭证单号，需要配套传certification_type，以确定具体单号代表的业务语义。
	 */
	@ApiField("certification_no")
	private String certificationNo;

	/**
	 * 凭证类型，用来确定certification_no代表的具体业务语义
	 */
	@ApiField("certification_type")
	private String certificationType;

	public String getCertificationNo() {
		return this.certificationNo;
	}
	public void setCertificationNo(String certificationNo) {
		this.certificationNo = certificationNo;
	}

	public String getCertificationType() {
		return this.certificationType;
	}
	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType;
	}

}
