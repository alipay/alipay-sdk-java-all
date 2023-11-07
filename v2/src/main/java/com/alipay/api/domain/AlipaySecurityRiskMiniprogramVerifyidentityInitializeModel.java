package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云身份核验服务初始化接口
 *
 * @author auto create
 * @since 1.0, 2023-09-13 14:54:07
 */
public class AlipaySecurityRiskMiniprogramVerifyidentityInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6591819553442315688L;

	/**
	 * 用户姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 接入业务方业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 核验服务名称，目前仅支持人脸，后续支持多因子核身产品
	 */
	@ApiListField("product_code")
	@ApiField("string")
	private List<String> productCode;

	/**
	 * 身份核验场景CODE，为接入场景的英文名称，比如登陆login, 风险校验riskVerify, 支付payment等，需保证同一商户下多种接入场景code的唯一性
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景参数：
1. renderGroup为渲染形态，有native或h5；
2. envData为设备信息，通过客户端采集；
3. 认证信息授权authFlag，R为仅人脸认证结果，A为认证结果和人脸图像；
4. 核身回调方式callBackActionCode：Native_CB_Native
	 */
	@ApiField("scene_params")
	private SceneParams sceneParams;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getProductCode() {
		return this.productCode;
	}
	public void setProductCode(List<String> productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public SceneParams getSceneParams() {
		return this.sceneParams;
	}
	public void setSceneParams(SceneParams sceneParams) {
		this.sceneParams = sceneParams;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
