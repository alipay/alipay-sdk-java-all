package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV推荐码生成请求入参
 *
 * @author auto create
 * @since 1.0, 2024-11-05 16:25:57
 */
public class IndrReferralCodeRequestParamDTO extends AlipayObject {

	private static final long serialVersionUID = 2385537326578861886L;

	/**
	 * 如果本次推荐需要定向推荐至某个商户，则此处填入商户id
	 */
	@ApiField("beneficiary_id")
	private String beneficiaryId;

	/**
	 * 本次推荐关联订单需要被发送凭证pdf的公用邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * HOME_PAGE:跳转至主页
BENEFICIARY_PAGE：跳转至账号选择页
	 */
	@ApiField("link_target")
	private String linkTarget;

	public String getBeneficiaryId() {
		return this.beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkTarget() {
		return this.linkTarget;
	}
	public void setLinkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
	}

}
