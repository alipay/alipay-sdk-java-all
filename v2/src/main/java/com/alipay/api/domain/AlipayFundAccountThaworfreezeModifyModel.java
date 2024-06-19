package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝余额支付开关服务
 *
 * @author auto create
 * @since 1.0, 2023-05-22 21:09:15
 */
public class AlipayFundAccountThaworfreezeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8293161615713588987L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 营业执照
	 */
	@ApiField("business_lice")
	private String businessLice;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型：thaw（开启)、freeze（冻结)
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 淘宝协议id
	 */
	@ApiField("taobao_agreement_id")
	private String taobaoAgreementId;

	/**
	 * 淘宝协议签署时间
	 */
	@ApiField("taobao_sign_time")
	private String taobaoSignTime;

	/**
	 * 淘宝uid
	 */
	@ApiField("taobao_user_id")
	private String taobaoUserId;

	/**
	 * 淘宝用户类型
	 */
	@ApiField("taobao_user_type")
	private String taobaoUserType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBusinessLice() {
		return this.businessLice;
	}
	public void setBusinessLice(String businessLice) {
		this.businessLice = businessLice;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTaobaoAgreementId() {
		return this.taobaoAgreementId;
	}
	public void setTaobaoAgreementId(String taobaoAgreementId) {
		this.taobaoAgreementId = taobaoAgreementId;
	}

	public String getTaobaoSignTime() {
		return this.taobaoSignTime;
	}
	public void setTaobaoSignTime(String taobaoSignTime) {
		this.taobaoSignTime = taobaoSignTime;
	}

	public String getTaobaoUserId() {
		return this.taobaoUserId;
	}
	public void setTaobaoUserId(String taobaoUserId) {
		this.taobaoUserId = taobaoUserId;
	}

	public String getTaobaoUserType() {
		return this.taobaoUserType;
	}
	public void setTaobaoUserType(String taobaoUserType) {
		this.taobaoUserType = taobaoUserType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
