package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关联基金结果
 *
 * @author auto create
 * @since 1.0, 2022-02-25 22:03:44
 */
public class LinkFundResponse extends AlipayObject {

	private static final long serialVersionUID = 7777126516823541347L;

	/**
	 * 基金类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 关联的基金列表
	 */
	@ApiListField("link_funds")
	@ApiField("link_fund_result")
	private List<LinkFundResult> linkFunds;

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public List<LinkFundResult> getLinkFunds() {
		return this.linkFunds;
	}
	public void setLinkFunds(List<LinkFundResult> linkFunds) {
		this.linkFunds = linkFunds;
	}

}
