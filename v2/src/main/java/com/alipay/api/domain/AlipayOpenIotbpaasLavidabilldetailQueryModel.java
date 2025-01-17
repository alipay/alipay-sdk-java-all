package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Lavida小键盘账单交易详情查询
 *
 * @author auto create
 * @since 1.0, 2022-10-17 11:12:07
 */
public class AlipayOpenIotbpaasLavidabilldetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4363949718789118633L;

	/**
	 * 收款时间或者退款时间，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("gmt_recv_pay")
	private String gmtRecvPay;

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
