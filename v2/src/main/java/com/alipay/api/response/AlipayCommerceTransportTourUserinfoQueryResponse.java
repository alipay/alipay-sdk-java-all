package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 14:11:29
 */
public class AlipayCommerceTransportTourUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2642491745341648234L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型。
IDENTITY_CARD --身份证；PASSPORT -- 护照
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 手机号
	 */
	@ApiField("tele_no")
	private String teleNo;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}
	public String getTeleNo( ) {
		return this.teleNo;
	}

}
