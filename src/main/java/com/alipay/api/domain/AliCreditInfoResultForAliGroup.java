package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供集团内调用的信用信息查询
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class AliCreditInfoResultForAliGroup extends AlipayObject {

	private static final long serialVersionUID = 1178891853872797674L;

	/**
	 * 信用等级
	 */
	@ApiField("credit_group")
	private String creditGroup;

	/**
	 * 信用分
	 */
	@ApiField("credit_score")
	private Long creditScore;

	/**
	 * 是否实名认证
	 */
	@ApiField("is_certify")
	private Long isCertify;

	public String getCreditGroup() {
		return this.creditGroup;
	}
	public void setCreditGroup(String creditGroup) {
		this.creditGroup = creditGroup;
	}

	public Long getCreditScore() {
		return this.creditScore;
	}
	public void setCreditScore(Long creditScore) {
		this.creditScore = creditScore;
	}

	public Long getIsCertify() {
		return this.isCertify;
	}
	public void setIsCertify(Long isCertify) {
		this.isCertify = isCertify;
	}

}
