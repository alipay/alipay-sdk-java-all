package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterprise.merchantrelation.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:31:51
 */
public class AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2524699713769887714L;

	/** 
	 * 门店收单pid
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 门店直间连类型
	 */
	@ApiField("role_type")
	private String roleType;

	/** 
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleType( ) {
		return this.roleType;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
