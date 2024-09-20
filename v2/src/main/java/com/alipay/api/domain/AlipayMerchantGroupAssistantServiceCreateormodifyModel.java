package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建或者修改小助手快捷服务
 *
 * @author auto create
 * @since 1.0, 2024-08-13 16:30:46
 */
public class AlipayMerchantGroupAssistantServiceCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 2711767741236263282L;

	/**
	 * 小助手内容id，创建快捷服务时返回的数据唯一id
	 */
	@ApiField("content_id")
	private String contentId;

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

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
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

}
