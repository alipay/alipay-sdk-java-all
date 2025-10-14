package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电智能选址计算任务详情
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:13:03
 */
public class SiteSelectionTask extends AlipayObject {

	private static final long serialVersionUID = 2721291536624321532L;

	/**
	 * 任务创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 数据下载链接地址；当状态为SUCCESS时，url为空表示无数据返回
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 任务完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 任务状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 计算任务编码
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 数据计算任务模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
