package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 神奇草原守护上报
 *
 * @author auto create
 * @since 1.0, 2026-09-21 15:27:53
 */
public class AlipaySocialAntforestGrasslandUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5821375613413374467L;

	/**
	 * 行为ID
	 */
	@ApiField("action")
	private String action;

	/**
	 * 行为数值*100为面积1平米（单位：平米）
	 */
	@ApiField("action_value")
	private Long actionValue;

	/**
	 * 业务唯一值ID
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务时间戳（毫秒）
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 访问来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public Long getActionValue() {
		return this.actionValue;
	}
	public void setActionValue(Long actionValue) {
		this.actionValue = actionValue;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
