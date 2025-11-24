package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁配送详情
 *
 * @author auto create
 * @since 1.0, 2024-07-05 12:04:51
 */
public class RentDeliveryDetail extends AlipayObject {

	private static final long serialVersionUID = 5175541647394252748L;

	/**
	 * 物流类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 收件人地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * <a href="https://openstd.samr.gov.cn/bzgk/gb/newGbInfo?hcno=C9C488FD717AFDCD52157F41C3302C6D">中华人民共和国行政区划代码</a>
	 */
	@ApiField("receiver_division_code")
	private String receiverDivisionCode;

	/**
	 * 收件人手机号
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收件人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverDivisionCode() {
		return this.receiverDivisionCode;
	}
	public void setReceiverDivisionCode(String receiverDivisionCode) {
		this.receiverDivisionCode = receiverDivisionCode;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

}
