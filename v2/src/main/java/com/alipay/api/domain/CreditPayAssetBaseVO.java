package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付资产基础视图
 *
 * @author auto create
 * @since 1.0, 2022-10-19 13:52:22
 */
public class CreditPayAssetBaseVO extends AlipayObject {

	private static final long serialVersionUID = 4834873375461559963L;

	/**
	 * 可用额度，部分场景可能会被过滤不透出
	 */
	@ApiField("available_amt")
	private CreditPayMoneyVO availableAmt;

	/**
	 * 是否足额（可贷额度cover申请金额），true-足额，false-不足额
	 */
	@ApiField("credit_enough")
	private Boolean creditEnough;

	/**
	 * 资产是否可用
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 客户是否有网商二类户
	 */
	@ApiField("has_current_account")
	private Boolean hasCurrentAccount;

	/**
	 * 资产名称-贷款支付，赊呗
	 */
	@ApiField("name")
	private String name;

	/**
	 * 提前还款文案
	 */
	@ApiField("pre_repay_desc")
	private String preRepayDesc;

	/**
	 * 拒绝信息，只有在enable为false的时候才有值
	 */
	@ApiField("refuse_info")
	private CreditPayRefuseVO refuseInfo;

	/**
	 * 还款日文案
	 */
	@ApiField("repay_day_desc")
	private String repayDayDesc;

	/**
	 * 方案输出日期
	 */
	@ApiField("scheme_date")
	private Date schemeDate;

	/**
	 * 方案id
	 */
	@ApiField("scheme_id")
	private String schemeId;

	/**
	 * 授信额度，部分场景可能会被过滤不透出
	 */
	@ApiField("total_amt")
	private CreditPayMoneyVO totalAmt;

	/**
	 * 资产类型，LOAN_INSTALLMENT-贷款分期，BILL-账单
	 */
	@ApiField("type")
	private String type;

	public CreditPayMoneyVO getAvailableAmt() {
		return this.availableAmt;
	}
	public void setAvailableAmt(CreditPayMoneyVO availableAmt) {
		this.availableAmt = availableAmt;
	}

	public Boolean getCreditEnough() {
		return this.creditEnough;
	}
	public void setCreditEnough(Boolean creditEnough) {
		this.creditEnough = creditEnough;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Boolean getHasCurrentAccount() {
		return this.hasCurrentAccount;
	}
	public void setHasCurrentAccount(Boolean hasCurrentAccount) {
		this.hasCurrentAccount = hasCurrentAccount;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPreRepayDesc() {
		return this.preRepayDesc;
	}
	public void setPreRepayDesc(String preRepayDesc) {
		this.preRepayDesc = preRepayDesc;
	}

	public CreditPayRefuseVO getRefuseInfo() {
		return this.refuseInfo;
	}
	public void setRefuseInfo(CreditPayRefuseVO refuseInfo) {
		this.refuseInfo = refuseInfo;
	}

	public String getRepayDayDesc() {
		return this.repayDayDesc;
	}
	public void setRepayDayDesc(String repayDayDesc) {
		this.repayDayDesc = repayDayDesc;
	}

	public Date getSchemeDate() {
		return this.schemeDate;
	}
	public void setSchemeDate(Date schemeDate) {
		this.schemeDate = schemeDate;
	}

	public String getSchemeId() {
		return this.schemeId;
	}
	public void setSchemeId(String schemeId) {
		this.schemeId = schemeId;
	}

	public CreditPayMoneyVO getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(CreditPayMoneyVO totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
