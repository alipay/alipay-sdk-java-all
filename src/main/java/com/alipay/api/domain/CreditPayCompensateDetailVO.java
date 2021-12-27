package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 担保代偿详情
 *
 * @author auto create
 * @since 1.0, 2020-09-29 19:54:45
 */
public class CreditPayCompensateDetailVO extends AlipayObject {

	private static final long serialVersionUID = 6321433917831131461L;

	/**
	 * 费用列表
	 */
	@ApiListField("charge_pricing_list")
	@ApiField("credit_pay_charge_pricing_v_o")
	private List<CreditPayChargePricingVO> chargePricingList;

	/**
	 * 条款视图列表
	 */
	@ApiListField("clauses")
	@ApiField("credit_pay_clause_v_o")
	private List<CreditPayClauseVO> clauses;

	/**
	 * 分期间隔
	 */
	@ApiField("instal_itrv")
	private String instalItrv;

	/**
	 * 分期类型(D-日，M-月，Y-年)
	 */
	@ApiField("instal_type")
	private String instalType;

	/**
	 * 利息定价
	 */
	@ApiField("int_pricing")
	private CreditPayIntPricingVO intPricing;

	public List<CreditPayChargePricingVO> getChargePricingList() {
		return this.chargePricingList;
	}
	public void setChargePricingList(List<CreditPayChargePricingVO> chargePricingList) {
		this.chargePricingList = chargePricingList;
	}

	public List<CreditPayClauseVO> getClauses() {
		return this.clauses;
	}
	public void setClauses(List<CreditPayClauseVO> clauses) {
		this.clauses = clauses;
	}

	public String getInstalItrv() {
		return this.instalItrv;
	}
	public void setInstalItrv(String instalItrv) {
		this.instalItrv = instalItrv;
	}

	public String getInstalType() {
		return this.instalType;
	}
	public void setInstalType(String instalType) {
		this.instalType = instalType;
	}

	public CreditPayIntPricingVO getIntPricing() {
		return this.intPricing;
	}
	public void setIntPricing(CreditPayIntPricingVO intPricing) {
		this.intPricing = intPricing;
	}

}
