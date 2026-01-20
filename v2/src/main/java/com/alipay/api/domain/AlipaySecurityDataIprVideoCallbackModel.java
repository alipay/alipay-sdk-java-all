package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识产权保护平台采购三方原片数据回调
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:59:38
 */
public class AlipaySecurityDataIprVideoCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 6148446441864556747L;

	/**
	 * 标识外部数据来源渠道，不同渠道对接前请先与接口人确认，每个渠道唯一。错误使用会导致数据保存失败，对接前请务必确认。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 任务ID，调用阜博系统创建任务返回的task_id数据，缺少此数据参数校验会不通过。
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 需要同步的剧集列表信息
	 */
	@ApiListField("video_list")
	@ApiField("video_data")
	private List<VideoData> videoList;

	/**
	 * 作品连载状态包含：processing(更新中)/completed(已完结)
	 */
	@ApiField("video_status")
	private String videoStatus;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<VideoData> getVideoList() {
		return this.videoList;
	}
	public void setVideoList(List<VideoData> videoList) {
		this.videoList = videoList;
	}

	public String getVideoStatus() {
		return this.videoStatus;
	}
	public void setVideoStatus(String videoStatus) {
		this.videoStatus = videoStatus;
	}

}
