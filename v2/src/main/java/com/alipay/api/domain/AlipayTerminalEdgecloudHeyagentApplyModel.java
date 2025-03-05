package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云渲染服务申请
 *
 * @author auto create
 * @since 1.0, 2024-10-24 16:48:59
 */
public class AlipayTerminalEdgecloudHeyagentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7296454777165432551L;

	/**
	 * 云渲染启动的小程序ID
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 业务场景编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 云渲染启动模式
	 */
	@ApiField("boot_type")
	private String bootType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("uid")
	private String uid;

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBootType() {
		return this.bootType;
	}
	public void setBootType(String bootType) {
		this.bootType = bootType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
