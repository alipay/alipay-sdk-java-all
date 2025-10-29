package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.authorize.uni.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 13:37:38
 */
public class AlipayFundAuthorizeUniModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5519698421239588346L;

	/** 
	 * 授权资产切换跳转链接
	 */
	@ApiField("authorize_link")
	private String authorizeLink;

	/** 
	 * 授权跳转类型
	 */
	@ApiField("authorize_link_type")
	private String authorizeLinkType;

	/** 
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public void setAuthorizeLink(String authorizeLink) {
		this.authorizeLink = authorizeLink;
	}
	public String getAuthorizeLink( ) {
		return this.authorizeLink;
	}

	public void setAuthorizeLinkType(String authorizeLinkType) {
		this.authorizeLinkType = authorizeLinkType;
	}
	public String getAuthorizeLinkType( ) {
		return this.authorizeLinkType;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
