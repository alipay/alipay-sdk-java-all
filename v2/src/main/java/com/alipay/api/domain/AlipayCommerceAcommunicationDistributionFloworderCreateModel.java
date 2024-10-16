package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量分销创单接口
 *
 * @author auto create
 * @since 1.0, 2024-07-11 14:16:22
 */
public class AlipayCommerceAcommunicationDistributionFloworderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7663526322574748858L;

	/**
	 * 机构订单id
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/**
	 * 分销商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付类型
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 订购价格，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 协议id
	 */
	@ApiField("protocol_sequence_id")
	private String protocolSequenceId;

	/**
	 * 短信验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	public String getInstOrderId() {
		return this.instOrderId;
	}
	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProtocolSequenceId() {
		return this.protocolSequenceId;
	}
	public void setProtocolSequenceId(String protocolSequenceId) {
		this.protocolSequenceId = protocolSequenceId;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

}
