package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建预订单
 *
 * @author auto create
 * @since 1.0, 2023-05-11 14:06:18
 */
public class AlipayOverseasOpenIndrpreorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3179611163334619193L;

	/**
	 * 付款人支付宝登录id号
	 */
	@ApiField("alipay_login_id")
	private String alipayLoginId;

	/**
	 * 买家（学生）信息
	 */
	@ApiField("buyer_info")
	private IndrISVUserDTO buyerInfo;

	/**
	 * 付款人信息
	 */
	@ApiField("payer_info")
	private IndrISVUserDTO payerInfo;

	/**
	 * 缴费信息
	 */
	@ApiField("payment_info")
	private IndrISVPaymentInfoDTO paymentInfo;

	/**
	 * 订单号为空表示新建，传值表示更新
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/**
	 * 请求id, 做幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景定制化信息
	 */
	@ApiField("scene_custom_param")
	private String sceneCustomParam;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getAlipayLoginId() {
		return this.alipayLoginId;
	}
	public void setAlipayLoginId(String alipayLoginId) {
		this.alipayLoginId = alipayLoginId;
	}

	public IndrISVUserDTO getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(IndrISVUserDTO buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public IndrISVUserDTO getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(IndrISVUserDTO payerInfo) {
		this.payerInfo = payerInfo;
	}

	public IndrISVPaymentInfoDTO getPaymentInfo() {
		return this.paymentInfo;
	}
	public void setPaymentInfo(IndrISVPaymentInfoDTO paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCustomParam() {
		return this.sceneCustomParam;
	}
	public void setSceneCustomParam(String sceneCustomParam) {
		this.sceneCustomParam = sceneCustomParam;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
