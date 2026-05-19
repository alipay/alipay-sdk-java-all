package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 千问订单信息
 *
 * @author auto create
 * @since 1.0, 2026-03-16 10:27:44
 */
public class QWOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3481892547821472884L;

	/**
	 * 支付宝uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 千问资产类型
	 */
	@ApiField("qianwen_mutex_asset_type")
	private String qianwenMutexAssetType;

	/**
	 * 千问订单目录
	 */
	@ApiField("qianwen_order_category")
	private String qianwenOrderCategory;

	/**
	 * 千问订单金额
	 */
	@ApiField("qianwen_order_pay_amount")
	private String qianwenOrderPayAmount;

	/**
	 * 千问订单类型
	 */
	@ApiField("qianwen_order_type")
	private String qianwenOrderType;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQianwenMutexAssetType() {
		return this.qianwenMutexAssetType;
	}
	public void setQianwenMutexAssetType(String qianwenMutexAssetType) {
		this.qianwenMutexAssetType = qianwenMutexAssetType;
	}

	public String getQianwenOrderCategory() {
		return this.qianwenOrderCategory;
	}
	public void setQianwenOrderCategory(String qianwenOrderCategory) {
		this.qianwenOrderCategory = qianwenOrderCategory;
	}

	public String getQianwenOrderPayAmount() {
		return this.qianwenOrderPayAmount;
	}
	public void setQianwenOrderPayAmount(String qianwenOrderPayAmount) {
		this.qianwenOrderPayAmount = qianwenOrderPayAmount;
	}

	public String getQianwenOrderType() {
		return this.qianwenOrderType;
	}
	public void setQianwenOrderType(String qianwenOrderType) {
		this.qianwenOrderType = qianwenOrderType;
	}

}
