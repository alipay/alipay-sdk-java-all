package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云身份核验服务初始化接口
 *
 * @author auto create
 * @since 1.0, 2023-06-30 10:21:24
 */
public class AlipaySecurityRiskMiniprogramVerifyidentityInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 3633112261934235771L;

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
	 * 核验服务名称，同时请求多种服务用数组组合，人脸：MIC_FACEVERIFY_LV2_ACCOUNT
	 */
	@ApiListField("product_code")
	@ApiField("string")
	private List<String> productCode;

	/**
	 * 身份核验场景CODE，场景节点，如login, riskVerify, payment, changePassword.
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
