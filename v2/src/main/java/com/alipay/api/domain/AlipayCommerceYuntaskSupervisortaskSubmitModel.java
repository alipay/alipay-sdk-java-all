package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 督导员提交巡店任务
 *
 * @author auto create
 * @since 1.0, 2024-09-13 15:08:06
 */
public class AlipayCommerceYuntaskSupervisortaskSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4557785872738463225L;

	/**
	 * 手机号
	 */
	@ApiField("phone_num")
	private String phoneNum;

	/**
	 * 巡店图片url
	 */
	@ApiListField("pic_url")
	@ApiField("string")
	private List<String> picUrl;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 督导员id
	 */
	@ApiField("supervisor_id")
	private String supervisorId;

	/**
	 * 任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	public String getPhoneNum() {
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public List<String> getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(List<String> picUrl) {
		this.picUrl = picUrl;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSupervisorId() {
		return this.supervisorId;
	}
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

}
