package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.ticket.template.offline response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMerchantTicketTemplateOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 3374757961426557776L;

	/** 
	 * 外部流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 商户信息
	 */
	@ApiField("merchant_info")
	private String merchantInfo;

	/** 
	 * 调用方值
	 */
	@ApiField("request_from")
	private String requestFrom;

	/** 
	 * 商户券模板编号
	 */
	@ApiField("template_no")
	private String templateNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setMerchantInfo(String merchantInfo) {
		this.merchantInfo = merchantInfo;
	}
	public String getMerchantInfo( ) {
		return this.merchantInfo;
	}

	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}
	public String getRequestFrom( ) {
		return this.requestFrom;
	}

	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}
	public String getTemplateNo( ) {
		return this.templateNo;
	}

}
