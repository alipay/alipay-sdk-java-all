package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.authorize.uni.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-08 10:22:23
 */
public class AlipayFundAuthorizeUniApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1535948884494766846L;

	/** 
	 * 授权跳转链接
	 */
	@ApiField("authorize_link")
	private String authorizeLink;

	/** 
	 * 授权跳转类型
	 */
	@ApiField("authorize_link_type")
	private String authorizeLinkType;

	/** 
	 * 在authorize_link_type=OUT_SHOR_URL时，返回授权凭证
	 */
	@ApiField("authorize_token")
	private String authorizeToken;

	/** 
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 产品业务码
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

	public void setAuthorizeToken(String authorizeToken) {
		this.authorizeToken = authorizeToken;
	}
	public String getAuthorizeToken( ) {
		return this.authorizeToken;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
