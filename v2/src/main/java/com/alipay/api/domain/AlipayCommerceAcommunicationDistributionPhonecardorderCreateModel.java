package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号卡下单
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:18
 */
public class AlipayCommerceAcommunicationDistributionPhonecardorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5586528881882561146L;

	/**
	 * 协议查询返回的流水号
	 */
	@ApiField("agreement_request_id")
	private String agreementRequestId;

	/**
	 * 办理人姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 办理人身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 渠道参数，无要求可不传
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 校验码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 办理人联系电话
	 */
	@ApiField("contact_phone_number")
	private String contactPhoneNumber;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 合作方订单号，用于幂等控制
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单总费用，非支付类可不传
	 */
	@ApiField("order_total_fee")
	private String orderTotalFee;

	/**
	 * 页面ID，部分商品需要回传
	 */
	@ApiField("page_id")
	private String pageId;

	/**
	 * 号卡归属地省市编码，选号类商品必填
	 */
	@ApiField("phone_card_address")
	private PhoneCardAddressModel phoneCardAddress;

	/**
	 * 选占的手机号
	 */
	@ApiField("phone_num")
	private String phoneNum;

	/**
	 * 号卡收货地址
	 */
	@ApiField("shipping_address")
	private PhoneCardShippingAddressModel shippingAddress;

	public String getAgreementRequestId() {
		return this.agreementRequestId;
	}
	public void setAgreementRequestId(String agreementRequestId) {
		this.agreementRequestId = agreementRequestId;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getContactPhoneNumber() {
		return this.contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderTotalFee() {
		return this.orderTotalFee;
	}
	public void setOrderTotalFee(String orderTotalFee) {
		this.orderTotalFee = orderTotalFee;
	}

	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public PhoneCardAddressModel getPhoneCardAddress() {
		return this.phoneCardAddress;
	}
	public void setPhoneCardAddress(PhoneCardAddressModel phoneCardAddress) {
		this.phoneCardAddress = phoneCardAddress;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public PhoneCardShippingAddressModel getShippingAddress() {
		return this.shippingAddress;
	}
	public void setShippingAddress(PhoneCardShippingAddressModel shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
