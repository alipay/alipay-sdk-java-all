package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退还用户积分
 *
 * @author auto create
 * @since 1.0, 2024-12-31 10:20:18
 */
public class AlipayOpenNppdUserpointRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1456376881554518627L;

	/**
	 * 原始扣积分的请求ID
	 */
	@ApiField("deducted_request_id")
	private String deductedRequestId;

	/**
	 * 商品列表
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * linkedmall订单号
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 企业分配给阿里云的Code
	 */
	@ApiField("merchant_code")
	private String merchantCode;

	/**
	 * 企业提供的参数
	 */
	@ApiField("merchant_exts")
	private String merchantExts;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 企业侧的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeductedRequestId() {
		return this.deductedRequestId;
	}
	public void setDeductedRequestId(String deductedRequestId) {
		this.deductedRequestId = deductedRequestId;
	}

	public String getItemList() {
		return this.itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getMerchantCode() {
		return this.merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getMerchantExts() {
		return this.merchantExts;
	}
	public void setMerchantExts(String merchantExts) {
		this.merchantExts = merchantExts;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
