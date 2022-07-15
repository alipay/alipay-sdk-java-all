package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户小程序业务数据入参
 *
 * @author auto create
 * @since 1.0, 2019-12-03 20:05:25
 */
public class UserAppBizDataInfo extends AlipayObject {

	private static final long serialVersionUID = 1673978546264799316L;

	/**
	 * 信息分类，详见功能包说明，动态变更的
	 */
	@ApiField("category")
	private String category;

	/**
	 * 业务描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 业务结束时间，毫秒时间戳
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 业务扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户业务流水id，应该是商户侧数据的唯一键
	 */
	@ApiField("id")
	private String id;

	/**
	 * 业务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 业务开始时间，毫秒时间戳
	 */
	@ApiField("start_time")
	private Long startTime;

	/**
	 * 业务状态，详见功能包说明，不同信息分类，对应的状态不同
	 */
	@ApiField("status")
	private String status;

	/**
	 * 业务跳转相对地址，接口方会将该相对地址拼接到商户小程序地址后面，最终展示给用户的地址：alipays://platformapi/startApp?appId=88888888888&page=test
	 */
	@ApiField("url")
	private String url;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
