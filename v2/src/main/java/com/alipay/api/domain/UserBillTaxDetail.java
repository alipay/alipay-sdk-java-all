package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小二账单计税明细
 *
 * @author auto create
 * @since 1.0, 2025-09-23 15:16:43
 */
public class UserBillTaxDetail extends AlipayObject {

	private static final long serialVersionUID = 4426378994581879749L;

	/**
	 * 小二2088ID，用户id
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 该小二的总税金，单位：元
	 */
	@ApiField("amount_tax")
	private String amountTax;

	/**
	 * 城建税
	 */
	@ApiField("bill_city_tax")
	private String billCityTax;

	/**
	 * 教育附加税，单位：元
	 */
	@ApiField("bill_edu_tax")
	private String billEduTax;

	/**
	 * 个人所得税，单位：元
	 */
	@ApiField("bill_iit_tax")
	private String billIitTax;

	/**
	 * 地方教育附加税，单位：元
	 */
	@ApiField("bill_local_edu_tax")
	private String billLocalEduTax;

	/**
	 * 增值税，单位：元
	 */
	@ApiField("bill_vat_tax")
	private String billVatTax;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 计税失败原因，描述计税失败的原因
	 */
	@ApiField("tax_fail_reason")
	private String taxFailReason;

	/**
	 * 计税状态；1-计税成功；2-计税失败；
	 */
	@ApiField("tax_status")
	private Long taxStatus;

	/**
	 * 小二薪酬单据编号，全局唯一
	 */
	@ApiField("user_bill_no")
	private String userBillNo;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getAmountTax() {
		return this.amountTax;
	}
	public void setAmountTax(String amountTax) {
		this.amountTax = amountTax;
	}

	public String getBillCityTax() {
		return this.billCityTax;
	}
	public void setBillCityTax(String billCityTax) {
		this.billCityTax = billCityTax;
	}

	public String getBillEduTax() {
		return this.billEduTax;
	}
	public void setBillEduTax(String billEduTax) {
		this.billEduTax = billEduTax;
	}

	public String getBillIitTax() {
		return this.billIitTax;
	}
	public void setBillIitTax(String billIitTax) {
		this.billIitTax = billIitTax;
	}

	public String getBillLocalEduTax() {
		return this.billLocalEduTax;
	}
	public void setBillLocalEduTax(String billLocalEduTax) {
		this.billLocalEduTax = billLocalEduTax;
	}

	public String getBillVatTax() {
		return this.billVatTax;
	}
	public void setBillVatTax(String billVatTax) {
		this.billVatTax = billVatTax;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTaxFailReason() {
		return this.taxFailReason;
	}
	public void setTaxFailReason(String taxFailReason) {
		this.taxFailReason = taxFailReason;
	}

	public Long getTaxStatus() {
		return this.taxStatus;
	}
	public void setTaxStatus(Long taxStatus) {
		this.taxStatus = taxStatus;
	}

	public String getUserBillNo() {
		return this.userBillNo;
	}
	public void setUserBillNo(String userBillNo) {
		this.userBillNo = userBillNo;
	}

}
