package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息通知事件传参
 *
 * @author auto create
 * @since 1.0, 2023-06-09 19:31:17
 */
public class NotifyEventParam extends AlipayObject {

	private static final long serialVersionUID = 1876422412287489654L;

	/**
	 * 事件类型对应配置
	 */
	@ApiField("event_config")
	private String eventConfig;

	/**
	 * 代表要发送的消息事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 跳转用户页面
	 */
	@ApiField("page")
	private String page;

	/**
	 * 用户打卡的时间毫秒数
	 */
	@ApiField("punch_time")
	private String punchTime;

	/**
	 * 需要跳转的appid
	 */
	@ApiField("target_app_id")
	private String targetAppId;

	/**
	 * 工作时长，精确到分钟。如工作10个小时，则传600。
	 */
	@ApiField("work_time")
	private String workTime;

	public String getEventConfig() {
		return this.eventConfig;
	}
	public void setEventConfig(String eventConfig) {
		this.eventConfig = eventConfig;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getPunchTime() {
		return this.punchTime;
	}
	public void setPunchTime(String punchTime) {
		this.punchTime = punchTime;
	}

	public String getTargetAppId() {
		return this.targetAppId;
	}
	public void setTargetAppId(String targetAppId) {
		this.targetAppId = targetAppId;
	}

	public String getWorkTime() {
		return this.workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

}
