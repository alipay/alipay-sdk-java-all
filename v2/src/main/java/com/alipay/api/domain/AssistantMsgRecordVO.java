package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小助手定向消息发送记录模型
 *
 * @author auto create
 * @since 1.0, 2024-06-11 12:10:28
 */
public class AssistantMsgRecordVO extends AlipayObject {

	private static final long serialVersionUID = 6288558687176621121L;

	/**
	 * 小助手类型，目前只支持 activity_recommend (自定义活动)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 小助手内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 消息发布时间
	 */
	@ApiField("gmt_published")
	private Date gmtPublished;

	/**
	 * 消息名称，b侧展示用，不在c侧群内透出
	 */
	@ApiField("name")
	private String name;

	/**
	 * 小助手消息状态

INIT (初始化),
AUDITING (审核中),
DENY (审核驳回),
PENDING (待生效),
VALID (生效),
INVALID (失效),
DELETED (删除);
	 */
	@ApiField("status")
	private String status;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public Date getGmtPublished() {
		return this.gmtPublished;
	}
	public void setGmtPublished(Date gmtPublished) {
		this.gmtPublished = gmtPublished;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
