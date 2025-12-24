package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 授权申请扩展参数
 *
 * @author auto create
 * @since 1.0, 2025-08-12 15:10:01
 */
public class AuthBizParam extends AlipayObject {

	private static final long serialVersionUID = 1282268844525725648L;

	/**
	 * 出资限制模型列表
	 */
	@ApiListField("fund_limit_list")
	@ApiField("fund_limit")
	private List<FundLimit> fundLimitList;

	/**
	 * 特殊的授权场景下，支持外部指定被授权方名称
	 */
	@ApiField("partner_auth_show_name")
	private String partnerAuthShowName;

	public List<FundLimit> getFundLimitList() {
		return this.fundLimitList;
	}
	public void setFundLimitList(List<FundLimit> fundLimitList) {
		this.fundLimitList = fundLimitList;
	}

	public String getPartnerAuthShowName() {
		return this.partnerAuthShowName;
	}
	public void setPartnerAuthShowName(String partnerAuthShowName) {
		this.partnerAuthShowName = partnerAuthShowName;
	}

}
