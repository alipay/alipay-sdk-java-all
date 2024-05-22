package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 邮寄信息
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:03:12
 */
public class DeliverInfo extends AlipayObject {

	private static final long serialVersionUID = 3132871254891666856L;

	/**
	 * 保单寄送地址的住址
	 */
	@ApiField("recipients_address")
	private String recipientsAddress;

	/**
	 * 配送地址行政区划代码
	 */
	@ApiField("recipients_address_code")
	private String recipientsAddressCode;

	/**
	 * 收件人姓名
	 */
	@ApiField("recipients_name")
	private String recipientsName;

	/**
	 * 收件人电话
	 */
	@ApiField("recipients_phone")
	private String recipientsPhone;

	public String getRecipientsAddress() {
		return this.recipientsAddress;
	}
	public void setRecipientsAddress(String recipientsAddress) {
		this.recipientsAddress = recipientsAddress;
	}

	public String getRecipientsAddressCode() {
		return this.recipientsAddressCode;
	}
	public void setRecipientsAddressCode(String recipientsAddressCode) {
		this.recipientsAddressCode = recipientsAddressCode;
	}

	public String getRecipientsName() {
		return this.recipientsName;
	}
	public void setRecipientsName(String recipientsName) {
		this.recipientsName = recipientsName;
	}

	public String getRecipientsPhone() {
		return this.recipientsPhone;
	}
	public void setRecipientsPhone(String recipientsPhone) {
		this.recipientsPhone = recipientsPhone;
	}

}
