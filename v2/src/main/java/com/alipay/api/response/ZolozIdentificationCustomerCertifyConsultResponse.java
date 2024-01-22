package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certify.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-01 17:24:43
 */
public class ZolozIdentificationCustomerCertifyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7597628862349778715L;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("img_str")
	private String imgStr;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setImgStr(String imgStr) {
		this.imgStr = imgStr;
	}
	public String getImgStr( ) {
		return this.imgStr;
	}

}
