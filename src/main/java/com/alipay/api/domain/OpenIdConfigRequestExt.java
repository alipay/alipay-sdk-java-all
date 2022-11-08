package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灰度配置OPENID
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:37:16
 */
public class OpenIdConfigRequestExt extends AlipayObject {

	private static final long serialVersionUID = 8819125512449317372L;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 计算类型
	 */
	@ApiField("cal_type")
	private String calType;

	/**
	 * 执行模式
	 */
	@ApiField("execute_mode")
	private String executeMode;

	/**
	 * 灰度模式
	 */
	@ApiField("gray_mode")
	private String grayMode;

	/**
	 * 灰度比例
	 */
	@ApiField("gray_ratio")
	private String grayRatio;

	/**
	 * 灰度用户
	 */
	@ApiListField("gray_users")
	@ApiField("string")
	private List<String> grayUsers;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCalType() {
		return this.calType;
	}
	public void setCalType(String calType) {
		this.calType = calType;
	}

	public String getExecuteMode() {
		return this.executeMode;
	}
	public void setExecuteMode(String executeMode) {
		this.executeMode = executeMode;
	}

	public String getGrayMode() {
		return this.grayMode;
	}
	public void setGrayMode(String grayMode) {
		this.grayMode = grayMode;
	}

	public String getGrayRatio() {
		return this.grayRatio;
	}
	public void setGrayRatio(String grayRatio) {
		this.grayRatio = grayRatio;
	}

	public List<String> getGrayUsers() {
		return this.grayUsers;
	}
	public void setGrayUsers(List<String> grayUsers) {
		this.grayUsers = grayUsers;
	}

}
