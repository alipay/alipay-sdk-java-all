package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部业务平台会员ID，作为智能科技会员的外部关联ID
 *
 * @author auto create
 * @since 1.0, 2021-11-10 17:36:25
 */
public class ReferenceId extends AlipayObject {

	private static final long serialVersionUID = 4823663318619172124L;

	/**
	 * 关联ID，外部业务平台会员ID
	 */
	@ApiField("reference_id")
	private String referenceId;

	/**
	 * 关联ID类型，关联ID类型；ALI_ID 阿里巴巴ID；ICBU_ACCT_ID ICBU ID；IP_ID 网商会员ID；IP_ROLE_ID 网商会员角色ID；ALIPAY_ID 支付宝会员ID；ALIPAY_LOGON_ID 支付宝会员登陆外标；WF_ID worldfirst会员ID
	 */
	@ApiField("reference_id_type")
	private String referenceIdType;

	public String getReferenceId() {
		return this.referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getReferenceIdType() {
		return this.referenceIdType;
	}
	public void setReferenceIdType(String referenceIdType) {
		this.referenceIdType = referenceIdType;
	}

}
