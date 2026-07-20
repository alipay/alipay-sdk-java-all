package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人工坐席通话录音
 *
 * @author auto create
 * @since 1.0, 2026-05-26 10:49:29
 */
public class DtAudioInfo extends AlipayObject {

	private static final long serialVersionUID = 2484744452882316755L;

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
	 * 录音开始时间
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
