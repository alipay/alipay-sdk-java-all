package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certifyzhub.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:14
 */
public class ZolozIdentificationCustomerCertifyzhubInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2168139569131632695L;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 人脸服务端返回码
	 */
	@ApiField("zim_code")
	private String zimCode;

	/** 
	 * 唯一标识一次人脸服务的id
	 */
	@ApiField("zim_id")
	private String zimId;

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

	public void setZimCode(String zimCode) {
		this.zimCode = zimCode;
	}
	public String getZimCode( ) {
		return this.zimCode;
	}

	public void setZimId(String zimId) {
		this.zimId = zimId;
	}
	public String getZimId( ) {
		return this.zimId;
	}

	public void setZimMsg(String zimMsg) {
		this.zimMsg = zimMsg;
	}
	public String getZimMsg( ) {
		return this.zimMsg;
	}

}
