package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授信还款账单同步
 *
 * @author auto create
 * @since 1.0, 2023-10-10 14:51:19
 */
public class AlipayCommerceEcCreditBillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1179913936134579879L;

	/**
	 * 账单月
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 还款日期，格式："yyyy-MM-dd"
	 */
	@ApiField("repayment_date")
	private Date repaymentDate;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Date getRepaymentDate() {
		return this.repaymentDate;
	}
	public void setRepaymentDate(Date repaymentDate) {
		this.repaymentDate = repaymentDate;
	}

}
