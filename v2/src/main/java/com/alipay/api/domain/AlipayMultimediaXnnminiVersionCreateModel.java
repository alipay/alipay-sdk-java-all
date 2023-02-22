package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xnn小程序创建版本
 *
 * @author auto create
 * @since 1.0, 2022-11-03 21:36:50
 */
public class AlipayMultimediaXnnminiVersionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4756245992467167398L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 版本描述
	 */
	@ApiField("des")
	private String des;

	/**
	 * 模型绑定应用id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 模型版本号
	 */
	@ApiField("model_version")
	private String modelVersion;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 模型创建用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getModelVersion() {
		return this.modelVersion;
	}
	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
