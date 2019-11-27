package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业征信基于身份的协议授权
 *
 * @author auto create
 * @since 1.0, 2017-11-08 11:22:28
 */
public class AlipayUserAuthZhimaorgIdentityApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4624854796672218937L;

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
	 * 芝麻平台服务商模式下的二级商户标识，如果是直连商户调用该接口，不需要设置
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

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

	public String getLinkedMerchantId() {
		return this.linkedMerchantId;
	}
	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
