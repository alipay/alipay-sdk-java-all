package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家券码发放回调
 *
 * @author auto create
 * @since 1.0, 2024-05-15 16:15:09
 */
public class AlipayMarketingCertificateCertificatetionSendcallbackModel extends AlipayObject {

	private static final long serialVersionUID = 4597535129964158468L;

	/**
	 * 用户OpenID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 购买商品的订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家发放凭证的结果，支付宝会依此字段决策是否处理结果。
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 商家发放券码结果列表
	 */
	@ApiListField("send_code_result_list")
	@ApiField("send_code_result")
	private List<SendCodeResult> sendCodeResultList;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public List<SendCodeResult> getSendCodeResultList() {
		return this.sendCodeResultList;
	}
	public void setSendCodeResultList(List<SendCodeResult> sendCodeResultList) {
		this.sendCodeResultList = sendCodeResultList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
