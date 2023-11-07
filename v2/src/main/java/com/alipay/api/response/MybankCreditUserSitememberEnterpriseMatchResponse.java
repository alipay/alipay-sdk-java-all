package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.sitemember.enterprise.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:30:31
 */
public class MybankCreditUserSitememberEnterpriseMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 5596115519779688865L;

	/** 
	 * 本接口会通过传入的alipay_login_id查询企业支付宝会员信息，然后与传入的企业信息做比对，同时满足下面2个条件时返回true，反之则为false：
1. 公司名称一致；
2. 支付宝会员中的证件号存在于传入的工商注册号和社会信用代码里的一个
	 */
	@ApiField("match")
	private Boolean match;

	/** 
	 * MEMBER_NOT_EXIST 会员不存在
MEMBER_CERT_GRADE_NOT_CORRECT 会员认证等级不正确
COMPANY_NAME_DIFF 公司名称不同
COMPANY_CERTNO_DIFF 公司证件号不同
	 */
	@ApiField("not_match_code")
	private String notMatchCode;

	public void setMatch(Boolean match) {
		this.match = match;
	}
	public Boolean getMatch( ) {
		return this.match;
	}

	public void setNotMatchCode(String notMatchCode) {
		this.notMatchCode = notMatchCode;
	}
	public String getNotMatchCode( ) {
		return this.notMatchCode;
	}

}
