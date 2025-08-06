package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付-授权申请
 *
 * @author auto create
 * @since 1.0, 2024-04-02 14:32:15
 */
public class AlipayFundScenepayAuthorizeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5564937876647244117L;

	/**
	 * 授权类型
商户授权：MERCHANT_AUTHORIZATION
用户授权：USER_AUTHORIZATION
具体传参请与对接同学确认获取
	 */
	@ApiField("authorization_type")
	private String authorizationType;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务/被授权方主体
	 */
	@ApiField("business_principal_info")
	private ScenePayParticipantInfoDTO businessPrincipalInfo;

	/**
	 * 代扣信息
	 */
	@ApiField("general_withhold_info")
	private GeneralWithholdInfoDTO generalWithholdInfo;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 授权主体
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

	public GeneralWithholdInfoDTO getGeneralWithholdInfo() {
		return this.generalWithholdInfo;
	}
	public void setGeneralWithholdInfo(GeneralWithholdInfoDTO generalWithholdInfo) {
		this.generalWithholdInfo = generalWithholdInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
