package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 录像信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:01
 */
public class RecordInfo extends AlipayObject {

	private static final long serialVersionUID = 5172824458742549562L;

	/**
	 * 会议时长（单位：秒）
	 */
	@ApiField("conf_duration")
	private Long confDuration;

	/**
	 * 视频实际时长（单位：秒）
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 文件大小 单位（字节）
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 录像ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 录播标题
	 */
	@ApiField("record_title")
	private String recordTitle;

	/**
	 * 录播播放地址
	 */
	@ApiField("url")
	private String url;

	public Long getConfDuration() {
		return this.confDuration;
	}
	public void setConfDuration(Long confDuration) {
		this.confDuration = confDuration;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRecordTitle() {
		return this.recordTitle;
	}
	public void setRecordTitle(String recordTitle) {
		this.recordTitle = recordTitle;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
