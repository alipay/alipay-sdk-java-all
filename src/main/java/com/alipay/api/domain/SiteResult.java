package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 选址结果
 *
 * @author auto create
 * @since 1.0, 2020-04-17 11:30:53
 */
public class SiteResult extends AlipayObject {

	private static final long serialVersionUID = 6766622161471832758L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果
	 */
	@ApiListField("data")
	@ApiField("site_item")
	private List<SiteItem> data;

	/**
	 * 返回消息提示
	 */
	@ApiField("message")
	private String message;

	/**
	 * 任务结果列表
	 */
	@ApiListField("task_list")
	@ApiField("site_plan_item")
	private List<SitePlanItem> taskList;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<SiteItem> getData() {
		return this.data;
	}
	public void setData(List<SiteItem> data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public List<SitePlanItem> getTaskList() {
		return this.taskList;
	}
	public void setTaskList(List<SitePlanItem> taskList) {
		this.taskList = taskList;
	}

}
