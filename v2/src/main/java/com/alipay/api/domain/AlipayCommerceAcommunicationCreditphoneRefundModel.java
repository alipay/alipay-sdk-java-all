package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购子单退款接口
 *
 * @author auto create
 * @since 1.0, 2024-02-01 15:23:50
 */
public class AlipayCommerceAcommunicationCreditphoneRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6556154855887962822L;

	/**
	 * 当期支付宝订单号
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝主单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 是否是提前结清单据
	 */
	@ApiField("in_advance_order")
	private Boolean inAdvanceOrder;

	/**
	 * 退款请求号
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	public String getAlipayBizNo() {
		return this.alipayBizNo;
	}
	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Boolean getInAdvanceOrder() {
		return this.inAdvanceOrder;
	}
	public void setInAdvanceOrder(Boolean inAdvanceOrder) {
		this.inAdvanceOrder = inAdvanceOrder;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

}
