package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业征信基于身份的协议授权
 *
 * @author auto create
 * @since 1.0, 2017-10-16 14:17:46
 */
public class AlipayUserAuthZhimaorgIdentityApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6373155165745955297L;

	/**
	 * 营业执照号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * NATIONAL_LEGAL:营业执照号码
NATIONAL_LEGAL_MERGE:三证合一号码
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 企业名称
	 */
	@ApiField("name")
	private String name;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
