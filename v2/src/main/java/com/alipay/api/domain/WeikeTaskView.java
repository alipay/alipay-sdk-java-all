package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁微客任务视图
 *
 * @author auto create
 * @since 1.0, 2017-04-25 14:22:41
 */
public class WeikeTaskView extends AlipayObject {

	private static final long serialVersionUID = 4336877173548934312L;

	/**
	 * 任务视图描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 蚂蚁微客对当前任务视图编号
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 任务视图图片链接
	 */
	@ApiField("img")
	private String img;

	/**
	 * 任务视图名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 任务视图对应的任务薪资
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 当前任务视图剩余任务数
	 */
	@ApiField("task_count")
	private Long taskCount;

	/**
	 * 点击任务视图后唤起微客对应页面的链接
	 */
	@ApiField("url")
	private String url;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getImg() {
		return this.img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return this.salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Long getTaskCount() {
		return this.taskCount;
	}
	public void setTaskCount(Long taskCount) {
		this.taskCount = taskCount;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
