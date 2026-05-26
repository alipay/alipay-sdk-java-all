package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下打卡远程打卡接口
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:37:48
 */
public class AlipayOfflineProviderExpoNfccheckinSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5492564154877973681L;

	/**
	 * 活动code值
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 打卡点对应的id
	 */
	@ApiField("check_place")
	private String checkPlace;

	/**
	 * 打卡模板
	 */
	@ApiField("check_template_type")
	private String checkTemplateType;

	/**
	 * 自定义外部标识
	 */
	@ApiField("external_place_mark")
	private String externalPlaceMark;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求来源（请求方）
	 */
	@ApiField("request_src")
	private String requestSrc;

	/**
	 * 方案配置code
	 */
	@ApiField("solution_config_code")
	private String solutionConfigCode;

	/**
	 * 订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getCheckPlace() {
		return this.checkPlace;
	}
	public void setCheckPlace(String checkPlace) {
		this.checkPlace = checkPlace;
	}

	public String getCheckTemplateType() {
		return this.checkTemplateType;
	}
	public void setCheckTemplateType(String checkTemplateType) {
		this.checkTemplateType = checkTemplateType;
	}

	public String getExternalPlaceMark() {
		return this.externalPlaceMark;
	}
	public void setExternalPlaceMark(String externalPlaceMark) {
		this.externalPlaceMark = externalPlaceMark;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestSrc() {
		return this.requestSrc;
	}
	public void setRequestSrc(String requestSrc) {
		this.requestSrc = requestSrc;
	}

	public String getSolutionConfigCode() {
		return this.solutionConfigCode;
	}
	public void setSolutionConfigCode(String solutionConfigCode) {
		this.solutionConfigCode = solutionConfigCode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
