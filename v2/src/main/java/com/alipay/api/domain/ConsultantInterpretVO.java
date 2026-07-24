package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 最新 AI 解读（无有效解读时为 null）
 *
 * @author auto create
 * @since 1.0, 2026-07-21 19:27:52
 */
public class ConsultantInterpretVO extends AlipayObject {

	private static final long serialVersionUID = 3731729932153958939L;

	/**
	 * 解读正文 Markdown
	 */
	@ApiField("content_md")
	private String contentMd;

	/**
	 * 解读创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 解读完成时间（status=SUCCESS 时有值）
	 */
	@ApiField("finish_time")
	private String finishTime;

	/**
	 * 解读业务ID
	 */
	@ApiField("interp_biz_id")
	private String interpBizId;

	/**
	 * 解读状态：INIT(生成中) / SUCCESS(已发布) / FAILED(失败/已撤回/已删除)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 解读摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 解读标题
	 */
	@ApiField("title")
	private String title;

	public String getContentMd() {
		return this.contentMd;
	}
	public void setContentMd(String contentMd) {
		this.contentMd = contentMd;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getInterpBizId() {
		return this.interpBizId;
	}
	public void setInterpBizId(String interpBizId) {
		this.interpBizId = interpBizId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
