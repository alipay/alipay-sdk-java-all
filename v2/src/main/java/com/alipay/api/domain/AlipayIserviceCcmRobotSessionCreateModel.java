package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人会话创建
 *
 * @author auto create
 * @since 1.0, 2024-01-18 15:49:52
 */
public class AlipayIserviceCcmRobotSessionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2168562251857413224L;

	/**
	 * 会话扩展信息，如省市区等
	 */
	@ApiField("biz_info")
	private BizInfo bizInfo;

	/**
	 * 机器人code
	 */
	@ApiField("robot_code")
	private String robotCode;

	/**
	 * 聊天窗场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 大模型问答时是否以消息流的方式推送
	 */
	@ApiField("stream_output")
	private Boolean streamOutput;

	/**
	 * 访客ID，由调用方提供，比如：微信用户id等
	 */
	@ApiField("visitor_id")
	private String visitorId;

	/**
	 * ip
	 */
	@ApiField("visitor_ip")
	private String visitorIp;

	public BizInfo getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(BizInfo bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getRobotCode() {
		return this.robotCode;
	}
	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Boolean getStreamOutput() {
		return this.streamOutput;
	}
	public void setStreamOutput(Boolean streamOutput) {
		this.streamOutput = streamOutput;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorIp() {
		return this.visitorIp;
	}
	public void setVisitorIp(String visitorIp) {
		this.visitorIp = visitorIp;
	}

}
