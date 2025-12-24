package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构红包权益删除接口
 *
 * @author auto create
 * @since 1.0, 2022-12-20 12:13:02
 */
public class AlipayEbppInstserviceVoucherDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3123656713929269175L;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 业务订单号，幂等使用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 备注的内容
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券(红包)id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
