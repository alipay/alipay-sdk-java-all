package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量核销请求
 *
 * @author auto create
 * @since 1.0, 2024-11-15 15:53:19
 */
public class MerchantCertificateUseInfo extends AlipayObject {

	private static final long serialVersionUID = 1129347148644329747L;

	/**
	 * 订购单编号
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 核销订单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务请求单号，用作幂等控制。 超时重试等幂等请求场景保持该值不变，且确保其它所有请求参数不变，再次请求返回上次执行结果。其它场景请更换该值，确保每次不同的请求该值不相同。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
