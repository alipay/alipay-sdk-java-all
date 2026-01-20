package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV结算主体的账单计税信息同步
 *
 * @author auto create
 * @since 1.0, 2025-09-23 15:16:43
 */
public class AlipayIserviceBillTaxConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1497121575118323447L;

	/**
	 * 账单结束时间，格式：yyyyMMdd
	 */
	@ApiField("bill_end")
	private String billEnd;

	/**
	 * 账单开始时间，格式：yyyyMMdd
	 */
	@ApiField("bill_start")
	private String billStart;

	/**
	 * 账单号，计税时传的tenant_bill_no字段
	 */
	@ApiField("tenant_bill_no")
	private String tenantBillNo;

	/**
	 * 账单计税明细
	 */
	@ApiListField("user_bill_tax_details")
	@ApiField("user_bill_tax_detail")
	private List<UserBillTaxDetail> userBillTaxDetails;

	public String getBillEnd() {
		return this.billEnd;
	}
	public void setBillEnd(String billEnd) {
		this.billEnd = billEnd;
	}

	public String getBillStart() {
		return this.billStart;
	}
	public void setBillStart(String billStart) {
		this.billStart = billStart;
	}

	public String getTenantBillNo() {
		return this.tenantBillNo;
	}
	public void setTenantBillNo(String tenantBillNo) {
		this.tenantBillNo = tenantBillNo;
	}

	public List<UserBillTaxDetail> getUserBillTaxDetails() {
		return this.userBillTaxDetails;
	}
	public void setUserBillTaxDetails(List<UserBillTaxDetail> userBillTaxDetails) {
		this.userBillTaxDetails = userBillTaxDetails;
	}

}
