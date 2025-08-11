package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人问答接口中返回的【事项】类数据的详情
 *
 * @author auto create
 * @since 1.0, 2024-08-26 20:57:16
 */
public class AnswerItemDetail extends AlipayObject {

	private static final long serialVersionUID = 5245828232773636411L;

	/**
	 * 事项的受理条件
	 */
	@ApiField("accept_conditions")
	private String acceptConditions;

	/**
	 * 推荐事项的办理指南
	 */
	@ApiField("check_list")
	private String checkList;

	/**
	 * 推荐事项的id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 链接地址
	 */
	@ApiField("link")
	private String link;

	/**
	 * 推荐事项的办理地址
	 */
	@ApiField("location")
	private String location;

	/**
	 * 推荐事项的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 机构用户上传到知识库时定义的事项编码。
	 */
	@ApiField("service_item_id")
	private String serviceItemId;

	public String getAcceptConditions() {
		return this.acceptConditions;
	}
	public void setAcceptConditions(String acceptConditions) {
		this.acceptConditions = acceptConditions;
	}

	public String getCheckList() {
		return this.checkList;
	}
	public void setCheckList(String checkList) {
		this.checkList = checkList;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getServiceItemId() {
		return this.serviceItemId;
	}
	public void setServiceItemId(String serviceItemId) {
		this.serviceItemId = serviceItemId;
	}

}
