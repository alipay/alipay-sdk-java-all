package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用支付分期详情
 *
 * @author auto create
 * @since 1.0, 2019-07-12 15:54:39
 */
public class CreditPayInstallmentDetailVO extends AlipayObject {

	private static final long serialVersionUID = 6837795623111592386L;

	/**
	 * 费用详情列表，部分分期方案可能不存在费用
	 */
	@ApiListField("charge_pricing_list")
	@ApiField("credit_pay_charge_pricing_v_o")
	private List<CreditPayChargePricingVO> chargePricingList;

	/**
	 * 条款列表，条款信息不是必定存在的
	 */
	@ApiListField("clauses")
	@ApiField("credit_pay_clause_v_o")
	private List<CreditPayClauseVO> clauses;

	/**
	 * 优惠信息，部分分期方案可能不存在营销信息
	 */
	@ApiField("discount_info")
	private CreditPayDiscountVO discountInfo;

	/**
	 * 分期间隔
	 */
	@ApiField("instal_itrv")
	private String instalItrv;

	/**
	 * 分期间隔类型，年月日(YMD)
	 */
	@ApiField("instal_type")
	private String instalType;

	/**
	 * 分期ID
	 */
	@ApiField("installment_id")
	private String installmentId;

	/**
	 * 利息详情，部分分期方案可能不存在利息
	 */
	@ApiField("int_pricing")
	private CreditPayIntPricingVO intPricing;

	/**
	 * 渲染模式，INTREST-利息版，INT_RATE-利率版
	 */
	@ApiField("render_strategy")
	private String renderStrategy;

	/**
	 * 还款信息
	 */
	@ApiField("repay_info")
	private CreditPayRepayVO repayInfo;

	/**
	 * 分期产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 分期签名，用于标识一组分期方案中唯一的期限信息,组成方式为sale_pd_code^repay_mode^term^term_unit
	 */
	@ApiField("scheme_sign")
	private String schemeSign;

	/**
	 * 期限信息
	 */
	@ApiField("term_info")
	private CreditPayTermVO termInfo;

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

	public CreditPayDiscountVO getDiscountInfo() {
		return this.discountInfo;
	}
	public void setDiscountInfo(CreditPayDiscountVO discountInfo) {
		this.discountInfo = discountInfo;
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

	public String getInstallmentId() {
		return this.installmentId;
	}
	public void setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
	}

	public CreditPayIntPricingVO getIntPricing() {
		return this.intPricing;
	}
	public void setIntPricing(CreditPayIntPricingVO intPricing) {
		this.intPricing = intPricing;
	}

	public String getRenderStrategy() {
		return this.renderStrategy;
	}
	public void setRenderStrategy(String renderStrategy) {
		this.renderStrategy = renderStrategy;
	}

	public CreditPayRepayVO getRepayInfo() {
		return this.repayInfo;
	}
	public void setRepayInfo(CreditPayRepayVO repayInfo) {
		this.repayInfo = repayInfo;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public String getSchemeSign() {
		return this.schemeSign;
	}
	public void setSchemeSign(String schemeSign) {
		this.schemeSign = schemeSign;
	}

	public CreditPayTermVO getTermInfo() {
		return this.termInfo;
	}
	public void setTermInfo(CreditPayTermVO termInfo) {
		this.termInfo = termInfo;
	}

}
