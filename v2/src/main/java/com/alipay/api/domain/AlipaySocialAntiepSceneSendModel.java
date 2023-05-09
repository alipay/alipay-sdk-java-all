package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区互娱平台场景上报行为
 *
 * @author auto create
 * @since 1.0, 2023-02-07 11:55:43
 */
public class AlipaySocialAntiepSceneSendModel extends AlipayObject {

	private static final long serialVersionUID = 6435794229754445157L;

	/**
	 * 行为业务参数，用于业务流处理时所需参数转换，map<String,String> 的 json格式
	 */
	@ApiField("action_biz_info")
	private String actionBizInfo;

	/**
	 * 行为幂等id，用于防止重复提交
	 */
	@ApiField("action_biz_no")
	private String actionBizNo;

	/**
	 * 上报行为的code码，用于服务端取出对应的场景信息并处理对应的后续行为
	 */
	@ApiField("action_code")
	private String actionCode;

	/**
	 * 行为发生的时间戳，单位是ms
	 */
	@ApiField("action_time")
	private Long actionTime;

	/**
	 * 请求类型，需传OPENAPI
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 场景类型,新增需找开发者协定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionBizInfo() {
		return this.actionBizInfo;
	}
	public void setActionBizInfo(String actionBizInfo) {
		this.actionBizInfo = actionBizInfo;
	}

	public String getActionBizNo() {
		return this.actionBizNo;
	}
	public void setActionBizNo(String actionBizNo) {
		this.actionBizNo = actionBizNo;
	}

	public String getActionCode() {
		return this.actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public Long getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(Long actionTime) {
		this.actionTime = actionTime;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
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
