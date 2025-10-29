package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询录音音频信息
 *
 * @author auto create
 * @since 1.0, 2025-04-14 10:59:04
 */
public class AudioInfo extends AlipayObject {

	private static final long serialVersionUID = 8641382816872697635L;

	/**
	 * 录音结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 录音文件
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 录音文件url
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
