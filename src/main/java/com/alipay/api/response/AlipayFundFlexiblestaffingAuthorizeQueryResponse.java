package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.authorize.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-09 14:06:39
 */
public class AlipayFundFlexiblestaffingAuthorizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1172631312892551579L;

	/** 
	 * 授权时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("authorize_time")
	private String authorizeTime;

	/** 
	 * 授服务的企业名称
	 */
	@ApiField("authorized_party_name")
	private String authorizedPartyName;

	/** 
	 * 灵工授权业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 外部业务号，取值为授权初始化接口中提供的out_biz_no单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 授权主体的支付宝账户ID
	 */
	@ApiField("principal_id")
	private String principalId;

	/** 
	 * 灵工授权产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 灵工授权状态，有限枚举。1.VALID
	 */
	@ApiField("status")
	private String status;

	public void setAuthorizeTime(String authorizeTime) {
		this.authorizeTime = authorizeTime;
	}
	public String getAuthorizeTime( ) {
		return this.authorizeTime;
	}

	public void setAuthorizedPartyName(String authorizedPartyName) {
		this.authorizedPartyName = authorizedPartyName;
	}
	public String getAuthorizedPartyName( ) {
		return this.authorizedPartyName;
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

	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}
	public String getPrincipalId( ) {
		return this.principalId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
