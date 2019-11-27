package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直接使用券核销
 *
 * @author auto create
 * @since 1.0, 2016-03-15 15:20:44
 */
public class AlipayAssetVoucherVoucherDirectuseModel extends AlipayObject {

	private static final long serialVersionUID = 2537382252629565427L;

	/**
	 * 业务发生时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("biz_dt")
	private String bizDt;

	/**
	 * 0156468653835689006788030091
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用户的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
用户的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 待核销券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(String bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
