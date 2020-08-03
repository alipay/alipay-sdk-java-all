package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定金信息
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:05
 */
public class AlipayEcoRenthouseBookInfo extends AlipayObject {

	private static final long serialVersionUID = 2392433284958413591L;

	/**
	 * 定金金额
	 */
	@ApiField("book_amount")
	private String bookAmount;

	/**
	 * 约定月租金额
	 */
	@ApiField("book_sale_amount")
	private String bookSaleAmount;

	/**
	 * 约定最晚签约日格式 YYYY-MM-dd
	 */
	@ApiField("latest_signing_date")
	private String latestSigningDate;

	/**
	 * 约定租约开始时间格式 YYYY-MM-dd
	 */
	@ApiField("lease_begin_date")
	private String leaseBeginDate;

	/**
	 * 约定租约开始结束格式 YYYY-MM-dd
	 */
	@ApiField("lease_end_date")
	private String leaseEndDate;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	public String getBookAmount() {
		return this.bookAmount;
	}
	public void setBookAmount(String bookAmount) {
		this.bookAmount = bookAmount;
	}

	public String getBookSaleAmount() {
		return this.bookSaleAmount;
	}
	public void setBookSaleAmount(String bookSaleAmount) {
		this.bookSaleAmount = bookSaleAmount;
	}

	public String getLatestSigningDate() {
		return this.latestSigningDate;
	}
	public void setLatestSigningDate(String latestSigningDate) {
		this.latestSigningDate = latestSigningDate;
	}

	public String getLeaseBeginDate() {
		return this.leaseBeginDate;
	}
	public void setLeaseBeginDate(String leaseBeginDate) {
		this.leaseBeginDate = leaseBeginDate;
	}

	public String getLeaseEndDate() {
		return this.leaseEndDate;
	}
	public void setLeaseEndDate(String leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
