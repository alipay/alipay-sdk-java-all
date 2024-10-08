package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单信息
 *
 * @author auto create
 * @since 1.0, 2021-04-08 18:59:39
 */
public class BillInfo extends AlipayObject {

	private static final long serialVersionUID = 4373964161444162332L;

	/**
	 * 收款时间或者退款时间
	 */
	@ApiField("gmt_recv_pay")
	private String gmtRecvPay;

	/**
	 * 交易收款金额
	 */
	@ApiField("recv_pay_amt")
	private String recvPayAmt;

	/**
	 * 收支单据号
	 */
	@ApiField("rp_record_id")
	private String rpRecordId;

	/**
	 * 收支类型，1：交易收款；2：交易退款
	 */
	@ApiField("rp_record_type")
	private Long rpRecordType;

	public String getGmtRecvPay() {
		return this.gmtRecvPay;
	}
	public void setGmtRecvPay(String gmtRecvPay) {
		this.gmtRecvPay = gmtRecvPay;
	}

	public String getRecvPayAmt() {
		return this.recvPayAmt;
	}
	public void setRecvPayAmt(String recvPayAmt) {
		this.recvPayAmt = recvPayAmt;
	}

	public String getRpRecordId() {
		return this.rpRecordId;
	}
	public void setRpRecordId(String rpRecordId) {
		this.rpRecordId = rpRecordId;
	}

	public Long getRpRecordType() {
		return this.rpRecordType;
	}
	public void setRpRecordType(Long rpRecordType) {
		this.rpRecordType = rpRecordType;
	}

}
