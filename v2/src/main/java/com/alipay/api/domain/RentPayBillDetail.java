package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积金提取余额直付租房账单详情
 *
 * @author auto create
 * @since 1.0, 2024-08-26 16:26:26
 */
public class RentPayBillDetail extends AlipayObject {

	private static final long serialVersionUID = 2685224975548852777L;

	/**
	 * 租房账单时间
	 */
	@ApiField("bill_time")
	private Date billTime;

	/**
	 * 租房账单中的押金费用，单位：元
	 */
	@ApiField("deposit_fee")
	private String depositFee;

	/**
	 * 其他费用，单位: 元
	 */
	@ApiField("other_fee")
	private String otherFee;

	/**
	 * 当前账期的租金费用，单位：元
	 */
	@ApiField("rent_fee")
	private String rentFee;

	/**
	 * 租房平台房源租赁账单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 租房总金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Date getBillTime() {
		return this.billTime;
	}
	public void setBillTime(Date billTime) {
		this.billTime = billTime;
	}

	public String getDepositFee() {
		return this.depositFee;
	}
	public void setDepositFee(String depositFee) {
		this.depositFee = depositFee;
	}

	public String getOtherFee() {
		return this.otherFee;
	}
	public void setOtherFee(String otherFee) {
		this.otherFee = otherFee;
	}

	public String getRentFee() {
		return this.rentFee;
	}
	public void setRentFee(String rentFee) {
		this.rentFee = rentFee;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
