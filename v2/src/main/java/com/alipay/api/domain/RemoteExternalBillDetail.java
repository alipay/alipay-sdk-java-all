package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部账单详情
 *
 * @author auto create
 * @since 1.0, 2026-06-25 14:11:27
 */
public class RemoteExternalBillDetail extends AlipayObject {

	private static final long serialVersionUID = 5899365356525412749L;

	/**
	 * 账期描述
	 */
	@ApiField("bill_date_desc")
	private String billDateDesc;

	/**
	 * 账期结束时间
	 */
	@ApiField("bill_date_end")
	private Date billDateEnd;

	/**
	 * 账期起始时间
	 */
	@ApiField("bill_date_start")
	private Date billDateStart;

	/**
	 * 账单滞纳金产生时间
	 */
	@ApiField("fine_date")
	private Date fineDate;

	/**
	 * 20200927111102020200122000000000
	 */
	@ApiField("id")
	private String id;

	/**
	 * 账单备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 出账日期
	 */
	@ApiField("release_date")
	private Date releaseDate;

	/**
	 * 账单排序
	 */
	@ApiField("sequence")
	private Long sequence;

	/**
	 * 账单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 账单总金额,单位 元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBillDateDesc() {
		return this.billDateDesc;
	}
	public void setBillDateDesc(String billDateDesc) {
		this.billDateDesc = billDateDesc;
	}

	public Date getBillDateEnd() {
		return this.billDateEnd;
	}
	public void setBillDateEnd(Date billDateEnd) {
		this.billDateEnd = billDateEnd;
	}

	public Date getBillDateStart() {
		return this.billDateStart;
	}
	public void setBillDateStart(Date billDateStart) {
		this.billDateStart = billDateStart;
	}

	public Date getFineDate() {
		return this.fineDate;
	}
	public void setFineDate(Date fineDate) {
		this.fineDate = fineDate;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Long getSequence() {
		return this.sequence;
	}
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
