package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签约任务列表
 *
 * @author auto create
 * @since 1.0, 2017-10-18 16:58:35
 */
public class SiginTaskResult extends AlipayObject {

	private static final long serialVersionUID = 1131259649661994599L;

	/**
	 * 订单业务流水号，与初始化接口入参biz_id对应。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态，取值枚举如下：
a. INIT : 初始化态，用户还未进入签约。
b. FAIL ：签约失败。
c. SUCCESS ：签约成功
d. PROCESS ：签约进行中
e. EXPIRED ：当前签约任务已过期，用户无法继续操作。
f. CANCEL ：签约任务被撤销
	 */
	@ApiField("status")
	private String status;

	/**
	 * 签约任务查询结果
	 */
	@ApiListField("task_list")
	@ApiField("sign_task_file_result")
	private List<SignTaskFileResult> taskList;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<SignTaskFileResult> getTaskList() {
		return this.taskList;
	}
	public void setTaskList(List<SignTaskFileResult> taskList) {
		this.taskList = taskList;
	}

}
