package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户买水进度上报
 *
 * @author auto create
 * @since 1.0, 2023-08-04 16:47:54
 */
public class AlipayCommerceWaterUsertaskSendModel extends AlipayObject {

	private static final long serialVersionUID = 1219645157813138796L;

	/**
	 * 用户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，商家外部单号，同时用于幂等，同一个任务id，一个外部单号只能上报一次
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 上报所属门店名称
	 */
	@ApiField("send_shop_name")
	private String sendShopName;

	/**
	 * 商户创建任务后生成的任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户参与任务生成的用户任务id
	 */
	@ApiField("user_task_id")
	private String userTaskId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSendShopName() {
		return this.sendShopName;
	}
	public void setSendShopName(String sendShopName) {
		this.sendShopName = sendShopName;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserTaskId() {
		return this.userTaskId;
	}
	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}

}
