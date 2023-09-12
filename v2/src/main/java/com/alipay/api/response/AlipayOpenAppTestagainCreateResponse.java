package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.testagain.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-20 14:39:25
 */
public class AlipayOpenAppTestagainCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2624883742667226188L;

	/** 
	 * xxxx
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * xxxx
	 */
	@ApiField("buyer_openid")
	private String buyerOpenid;

	/** 
	 * 纬度
	 */
	@ApiField("test")
	private String test;

	/** 
	 * sasasa
	 */
	@ApiField("test_openid")
	private String testOpenid;

	/** 
	 * 1313
	 */
	@ApiField("xxxxxx")
	private String xxxxxx;

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setBuyerOpenid(String buyerOpenid) {
		this.buyerOpenid = buyerOpenid;
	}
	public String getBuyerOpenid( ) {
		return this.buyerOpenid;
	}

	public void setTest(String test) {
		this.test = test;
	}
	public String getTest( ) {
		return this.test;
	}

	public void setTestOpenid(String testOpenid) {
		this.testOpenid = testOpenid;
	}
	public String getTestOpenid( ) {
		return this.testOpenid;
	}

	public void setXxxxxx(String xxxxxx) {
		this.xxxxxx = xxxxxx;
	}
	public String getXxxxxx( ) {
		return this.xxxxxx;
	}

}
