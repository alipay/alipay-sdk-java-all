package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚积宝传支付宝券信息
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:26:05
 */
public class ChinaMobileVoucher extends AlipayObject {

	private static final long serialVersionUID = 7431256331596865588L;

	/**
	 * 支付宝券操作消息中的操作时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 支付宝推送给聚积宝的券使用信息中的券操作状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 聚积宝收到的支付宝核销券信息的Id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
