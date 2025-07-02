package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台券资金成分交易流水
 *
 * @author auto create
 * @since 1.0, 2022-12-08 16:55:32
 */
public class OpenFundComponentDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 2732952712243853912L;

	/**
	 * 本次交易流水的金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 本次交易流水的现金价值
	 */
	@ApiField("cash")
	private Long cash;

	/**
	 * 资金成分Id
	 */
	@ApiField("component_id")
	private String componentId;

	/**
	 * 资金成分类型
	 */
	@ApiField("component_type")
	private String componentType;

	/**
	 * 出资账号。 1) 资金池出资时，为fundSchemeId 2) 基础出资类型时，可能为空
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 出资子账号。 1）资金池出资时，为fundRelationGroupId。 2）基础出资类型时，可能为空
	 */
	@ApiField("fund_sub_account")
	private String fundSubAccount;

	/**
	 * 出资类型: 基础出资类型时，可能为空
	 */
	@ApiField("fund_type")
	private String fundType;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getCash() {
		return this.cash;
	}
	public void setCash(Long cash) {
		this.cash = cash;
	}

	public String getComponentId() {
		return this.componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public String getComponentType() {
		return this.componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getFundAccount() {
		return this.fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

	public String getFundSubAccount() {
		return this.fundSubAccount;
	}
	public void setFundSubAccount(String fundSubAccount) {
		this.fundSubAccount = fundSubAccount;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

}
