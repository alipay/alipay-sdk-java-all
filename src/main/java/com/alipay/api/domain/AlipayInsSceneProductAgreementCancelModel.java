package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户产品协议解约
 *
 * @author auto create
 * @since 1.0, 2018-11-30 21:25:58
 */
public class AlipayInsSceneProductAgreementCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8538419131469415764L;

	/**
	 * 签订协议商户支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 产品协议号
	 */
	@ApiField("product_sign_no")
	private String productSignNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getProductSignNo() {
		return this.productSignNo;
	}
	public void setProductSignNo(String productSignNo) {
		this.productSignNo = productSignNo;
	}

}
