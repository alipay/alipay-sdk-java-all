package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购主单完结
 *
 * @author auto create
 * @since 1.0, 2024-03-06 10:27:16
 */
public class AlipayCommerceAcommunicationCreditphoneOrderFinishModel extends AlipayObject {

	private static final long serialVersionUID = 6693181311717664653L;

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
	 * 完结请求号
	 */
	@ApiField("finish_request_no")
	private String finishRequestNo;

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

	public String getFinishRequestNo() {
		return this.finishRequestNo;
	}
	public void setFinishRequestNo(String finishRequestNo) {
		this.finishRequestNo = finishRequestNo;
	}

}
