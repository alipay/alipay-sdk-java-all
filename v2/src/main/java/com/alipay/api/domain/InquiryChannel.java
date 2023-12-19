package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生在线问诊渠道（问诊方式，价格，服务链接）
 *
 * @author auto create
 * @since 1.0, 2022-12-27 11:50:49
 */
public class InquiryChannel extends AlipayObject {

	private static final long serialVersionUID = 3817892551882785563L;

	/**
	 * 问诊方式：IMAGE_INQUIRY(图文问诊)/PHONE_INQUIRY(电话问诊)/VEDIO_INQUIRY(视频问诊)
	 */
	@ApiField("inquiry_mode")
	private String inquiryMode;

	/**
	 * 问诊价格（中间必须有小数点，后面两位小数）
	 */
	@ApiField("inquiry_price")
	private String inquiryPrice;

	/**
	 * 问诊类型
	 */
	@ApiField("inquiry_type")
	private String inquiryType;

	/**
	 * 问诊方式对应服务链接
	 */
	@ApiField("inquiry_url")
	private String inquiryUrl;

	public String getInquiryMode() {
		return this.inquiryMode;
	}
	public void setInquiryMode(String inquiryMode) {
		this.inquiryMode = inquiryMode;
	}

	public String getInquiryPrice() {
		return this.inquiryPrice;
	}
	public void setInquiryPrice(String inquiryPrice) {
		this.inquiryPrice = inquiryPrice;
	}

	public String getInquiryType() {
		return this.inquiryType;
	}
	public void setInquiryType(String inquiryType) {
		this.inquiryType = inquiryType;
	}

	public String getInquiryUrl() {
		return this.inquiryUrl;
	}
	public void setInquiryUrl(String inquiryUrl) {
		this.inquiryUrl = inquiryUrl;
	}

}
