package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 授权申请扩展参数
 *
 * @author auto create
 * @since 1.0, 2023-03-07 17:54:01
 */
public class AuthBizParam extends AlipayObject {

	private static final long serialVersionUID = 3516699399845447992L;

	/**
	 * 出资限制模型列表
	 */
	@ApiListField("fund_limit_list")
	@ApiField("fund_limit")
	private List<FundLimit> fundLimitList;

	public List<FundLimit> getFundLimitList() {
		return this.fundLimitList;
	}
	public void setFundLimitList(List<FundLimit> fundLimitList) {
		this.fundLimitList = fundLimitList;
	}

}
