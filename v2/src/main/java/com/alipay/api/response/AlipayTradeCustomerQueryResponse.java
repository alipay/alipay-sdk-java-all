package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CorporationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customer.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 13:37:58
 */
public class AlipayTradeCustomerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8697812682962386181L;

	/** 
	 * 企业信息
	 */
	@ApiField("corporation_info")
	private CorporationInfo corporationInfo;

	/** 
	 * 客户描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 客户邮箱，和客户手机号需至少传入1个
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 商户维度全局幂等键
	 */
	@ApiField("merchant_request_no")
	private String merchantRequestNo;

	/** 
	 * 客户名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 客户手机号，和客户邮箱需至少传入1个
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 用户类型，PRIVATE-个人用户；CORPORATION-企业用户
	 */
	@ApiField("type")
	private String type;

	public void setCorporationInfo(CorporationInfo corporationInfo) {
		this.corporationInfo = corporationInfo;
	}
	public CorporationInfo getCorporationInfo( ) {
		return this.corporationInfo;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setMerchantRequestNo(String merchantRequestNo) {
		this.merchantRequestNo = merchantRequestNo;
	}
	public String getMerchantRequestNo( ) {
		return this.merchantRequestNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
