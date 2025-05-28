package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小助手快捷服务详情查询结果
 *
 * @author auto create
 * @since 1.0, 2024-08-13 16:35:53
 */
public class ServiceAssistantDetailVO extends AlipayObject {

	private static final long serialVersionUID = 5762157656141535298L;

	/**
	 * 小助手业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 小助手内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 小助手发布时间，取的创建或者修改时间。
	 */
	@ApiField("gmt_published")
	private Date gmtPublished;

	/**
	 * 群组id列表，创建群组时对应的一个群组id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 小助手快捷服务名称，b侧展示用，不在c侧群内透出
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务列表
	 */
	@ApiListField("services")
	@ApiField("assistant_service_v_o")
	private List<AssistantServiceVO> services;

	/**
	 * 小助手状态 INIT( 初始化), AUDITING (审核中), DENY (审核驳回), VALID (生效), INVALID (下线)；DENY (审核驳回)是终态；VALID (生效)支持下线到状态INVALID (下线)；INVALID (下线)支持上线到VALID (生效)；INVALID (下线)支持修改。
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

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<AssistantServiceVO> getServices() {
		return this.services;
	}
	public void setServices(List<AssistantServiceVO> services) {
		this.services = services;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
