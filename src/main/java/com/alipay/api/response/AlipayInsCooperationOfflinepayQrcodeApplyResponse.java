package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.offlinepay.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsCooperationOfflinepayQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2441328177681499741L;

	/** 
	 * 本次申请支付二维码对应的蚂蚁保险平台业务单据号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 支付二维码图片链接URL，通过本URL可展示支付二维码到保险公司展业系统。
	 */
	@ApiField("code_url")
	private String codeUrl;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}
	public String getCodeUrl( ) {
		return this.codeUrl;
	}

}
