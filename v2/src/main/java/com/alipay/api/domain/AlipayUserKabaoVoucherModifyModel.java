package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改卡包优惠券信息
 *
 * @author auto create
 * @since 1.0, 2023-11-23 15:59:25
 */
public class AlipayUserKabaoVoucherModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6478569953869119824L;

	/**
	 * 兑换券价值信息
	 */
	@ApiField("exchange_voucher_value_info")
	private ExchangeVoucherValueInfo exchangeVoucherValueInfo;

	/**
	 * 支付宝卡包优惠券的实例唯一id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 优惠券状态。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public ExchangeVoucherValueInfo getExchangeVoucherValueInfo() {
		return this.exchangeVoucherValueInfo;
	}
	public void setExchangeVoucherValueInfo(ExchangeVoucherValueInfo exchangeVoucherValueInfo) {
		this.exchangeVoucherValueInfo = exchangeVoucherValueInfo;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
