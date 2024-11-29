package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.pocketmoney.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-27 11:17:17
 */
public class AlipayPayAppPocketmoneyAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4871347859745328572L;

	/** 
	 * 授权结果，枚举值（ok：授权成功，exist：已经存在）
	 */
	@ApiField("auth_result")
	private String authResult;

	/** 
	 * 零花钱ID
	 */
	@ApiField("change_code_id")
	private String changeCodeId;

	/** 
	 * 厂商家长ID
	 */
	@ApiField("vendor_parent_id")
	private String vendorParentId;

	public void setAuthResult(String authResult) {
		this.authResult = authResult;
	}
	public String getAuthResult( ) {
		return this.authResult;
	}

	public void setChangeCodeId(String changeCodeId) {
		this.changeCodeId = changeCodeId;
	}
	public String getChangeCodeId( ) {
		return this.changeCodeId;
	}

	public void setVendorParentId(String vendorParentId) {
		this.vendorParentId = vendorParentId;
	}
	public String getVendorParentId( ) {
		return this.vendorParentId;
	}

}
