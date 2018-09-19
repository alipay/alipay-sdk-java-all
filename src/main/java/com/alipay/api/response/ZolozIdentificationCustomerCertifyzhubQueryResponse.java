package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certifyzhub.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-16 10:03:19
 */
public class ZolozIdentificationCustomerCertifyzhubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8848456357477213511L;

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

	/** 
	 * 人脸服务端返回码
	 */
	@ApiField("zim_code")
	private String zimCode;

	/** 
	 * 人脸服务端返回信息
	 */
	@ApiField("zim_msg")
	private String zimMsg;

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

	public void setZimCode(String zimCode) {
		this.zimCode = zimCode;
	}
	public String getZimCode( ) {
		return this.zimCode;
	}

	public void setZimMsg(String zimMsg) {
		this.zimMsg = zimMsg;
	}
	public String getZimMsg( ) {
		return this.zimMsg;
	}

}
