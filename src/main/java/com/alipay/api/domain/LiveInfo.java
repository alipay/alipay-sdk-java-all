package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直播信息
 *
 * @author auto create
 * @since 1.0, 2021-07-30 09:13:59
 */
public class LiveInfo extends AlipayObject {

	private static final long serialVersionUID = 4198942435654513937L;

	/**
	 * 直播内容信息列表
	 */
	@ApiListField("content_info_list")
	@ApiField("live_content_info")
	private List<LiveContentInfo> contentInfoList;

	/**
	 * 直播结束时间
	 */
	@ApiField("live_end_time")
	private Date liveEndTime;

	/**
	 * 直播ID
	 */
	@ApiField("live_id")
	private String liveId;

	/**
	 * 直播开始时间
	 */
	@ApiField("live_start_time")
	private Date liveStartTime;

	/**
	 * 直播摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 直播标题
	 */
	@ApiField("title")
	private String title;

	public List<LiveContentInfo> getContentInfoList() {
		return this.contentInfoList;
	}
	public void setContentInfoList(List<LiveContentInfo> contentInfoList) {
		this.contentInfoList = contentInfoList;
	}

	public Date getLiveEndTime() {
		return this.liveEndTime;
	}
	public void setLiveEndTime(Date liveEndTime) {
		this.liveEndTime = liveEndTime;
	}

	public String getLiveId() {
		return this.liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public Date getLiveStartTime() {
		return this.liveStartTime;
	}
	public void setLiveStartTime(Date liveStartTime) {
		this.liveStartTime = liveStartTime;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
