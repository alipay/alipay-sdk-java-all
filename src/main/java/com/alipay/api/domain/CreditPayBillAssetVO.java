package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单资产视图
 *
 * @author auto create
 * @since 1.0, 2019-07-12 15:54:34
 */
public class CreditPayBillAssetVO extends AlipayObject {

	private static final long serialVersionUID = 5546772719528779781L;

	/**
	 * 是否允许部分提前还款
	 */
	@ApiField("allow_part_prepayment")
	private Boolean allowPartPrepayment;

	/**
	 * 是否允许提前还款
	 */
	@ApiField("allow_prepayment")
	private Boolean allowPrepayment;

	/**
	 * 资产基础信息
	 */
	@ApiField("base_info")
	private CreditPayAssetBaseVO baseInfo;

	/**
	 * 账单出账日期
	 */
	@ApiField("bill_account_day")
	private String billAccountDay;

	/**
	 * 出账日单位，周/月（W/M）
	 */
	@ApiField("bill_account_day_unit")
	private String billAccountDayUnit;

	/**
	 * 账单产品码
	 */
	@ApiField("bill_pd_code")
	private String billPdCode;

	/**
	 * 费用定价列表，账单可能不收费，所以有可能为空
	 */
	@ApiListField("charge_pricing_list")
	@ApiField("credit_pay_charge_pricing_v_o")
	private List<CreditPayChargePricingVO> chargePricingList;

	/**
	 * 条款信息，有些场景无需透出条款，所以可能为空
	 */
	@ApiListField("clauses")
	@ApiField("credit_pay_clause_v_o")
	private List<CreditPayClauseVO> clauses;

	/**
	 * 营销信息，如果不存在营销和一些营销性质的文案，可能为空
	 */
	@ApiField("discount_info")
	private CreditPayDiscountVO discountInfo;

	/**
	 * 利息定价视图，账单可能不收利息，所以有可能为空
	 */
	@ApiField("int_pricing")
	private CreditPayIntPricingVO intPricing;

	/**
	 * 还款信息，账单可能不存在还款信息
	 */
	@ApiField("repay_info")
	private CreditPayRepayVO repayInfo;

	/**
	 * 期限信息，账单产品可能不存在期限信息
	 */
	@ApiField("term_info")
	private CreditPayTermVO termInfo;

	public Boolean getAllowPartPrepayment() {
		return this.allowPartPrepayment;
	}
	public void setAllowPartPrepayment(Boolean allowPartPrepayment) {
		this.allowPartPrepayment = allowPartPrepayment;
	}

	public Boolean getAllowPrepayment() {
		return this.allowPrepayment;
	}
	public void setAllowPrepayment(Boolean allowPrepayment) {
		this.allowPrepayment = allowPrepayment;
	}

	public CreditPayAssetBaseVO getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(CreditPayAssetBaseVO baseInfo) {
		this.baseInfo = baseInfo;
	}

	public String getBillAccountDay() {
		return this.billAccountDay;
	}
	public void setBillAccountDay(String billAccountDay) {
		this.billAccountDay = billAccountDay;
	}

	public String getBillAccountDayUnit() {
		return this.billAccountDayUnit;
	}
	public void setBillAccountDayUnit(String billAccountDayUnit) {
		this.billAccountDayUnit = billAccountDayUnit;
	}

	public String getBillPdCode() {
		return this.billPdCode;
	}
	public void setBillPdCode(String billPdCode) {
		this.billPdCode = billPdCode;
	}

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

	public CreditPayIntPricingVO getIntPricing() {
		return this.intPricing;
	}
	public void setIntPricing(CreditPayIntPricingVO intPricing) {
		this.intPricing = intPricing;
	}

	public CreditPayRepayVO getRepayInfo() {
		return this.repayInfo;
	}
	public void setRepayInfo(CreditPayRepayVO repayInfo) {
		this.repayInfo = repayInfo;
	}

	public CreditPayTermVO getTermInfo() {
		return this.termInfo;
	}
	public void setTermInfo(CreditPayTermVO termInfo) {
		this.termInfo = termInfo;
	}

}
