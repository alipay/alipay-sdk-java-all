package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付-授权查询
 *
 * @author auto create
 * @since 1.0, 2023-09-20 13:53:29
 */
public class AlipayFundScenepayAuthorizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8853217795574824994L;

	/**
	 * USER_AUTHORIZATION 用户授权
MERCHANT_AUTHORIZATION 商户授权
	 */
	@ApiField("authorization_type")
	private String authorizationType;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务主体-被授权主体信息
	 */
	@ApiField("business_principal_info")
	private ScenePayParticipantInfoDTO businessPrincipalInfo;

	/**
	 * 授权主体信息
	 */
	@ApiField("principal_info")
	private ScenePayParticipantInfoDTO principalInfo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	public String getAuthorizationType() {
		return this.authorizationType;
	}
	public void setAuthorizationType(String authorizationType) {
		this.authorizationType = authorizationType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public ScenePayParticipantInfoDTO getBusinessPrincipalInfo() {
		return this.businessPrincipalInfo;
	}
	public void setBusinessPrincipalInfo(ScenePayParticipantInfoDTO businessPrincipalInfo) {
		this.businessPrincipalInfo = businessPrincipalInfo;
	}

	public ScenePayParticipantInfoDTO getPrincipalInfo() {
		return this.principalInfo;
	}
	public void setPrincipalInfo(ScenePayParticipantInfoDTO principalInfo) {
		this.principalInfo = principalInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

}
