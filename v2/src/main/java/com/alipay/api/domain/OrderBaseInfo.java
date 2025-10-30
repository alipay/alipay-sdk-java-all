package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销记录对应凭证，关联的订单基本信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:20:59
 */
public class OrderBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2625927459426132293L;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 商户在创单阶段传入的订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 交易组件订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单创建时刻的场域来源
	 */
	@ApiField("scene_name")
	private String sceneName;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

}
