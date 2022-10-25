package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔报案进度
 *
 * @author auto create
 * @since 1.0, 2020-05-06 10:41:28
 */
public class InsClaimReportProgress extends AlipayObject {

	private static final long serialVersionUID = 2155966956468694147L;

	/**
	 * 案件更新内容
	 */
	@ApiField("progress_update_content")
	private String progressUpdateContent;

	/**
	 * 案件更新进度时间
	 */
	@ApiField("progress_update_time")
	private Date progressUpdateTime;

	/**
	 * 进度状态
	 */
	@ApiField("status")
	private String status;

	public String getProgressUpdateContent() {
		return this.progressUpdateContent;
	}
	public void setProgressUpdateContent(String progressUpdateContent) {
		this.progressUpdateContent = progressUpdateContent;
	}

	public Date getProgressUpdateTime() {
		return this.progressUpdateTime;
	}
	public void setProgressUpdateTime(Date progressUpdateTime) {
		this.progressUpdateTime = progressUpdateTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
