package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户任务详情返回
 *
 * @author auto create
 * @since 1.0, 2023-08-16 17:13:25
 */
public class UserTaskDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 7279543129484763621L;

	/**
	 * 信用单号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 最近参与任务时间
	 */
	@ApiField("last_date")
	private String lastDate;

	/**
	 * 商家外部单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 消费总笔数
	 */
	@ApiField("pay_count")
	private Long payCount;

	/**
	 * 商品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 上报门店名称
	 */
	@ApiField("send_shop_name")
	private String sendShopName;

	/**
	 * 首次参与任务时间
	 */
	@ApiField("sign_date")
	private String signDate;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 用户uid
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 用户uid
	 */
	@ApiField("uid_open_id")
	private String uidOpenId;

	/**
	 * 用户任务id
	 */
	@ApiField("user_task_id")
	private String userTaskId;

	/**
	 * 用户任务扣款状态
	 */
	@ApiField("user_task_pay_status")
	private String userTaskPayStatus;

	/**
	 * 用户任务状态
	 */
	@ApiField("user_task_status")
	private String userTaskStatus;

	public String getCreditNo() {
		return this.creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public String getLastDate() {
		return this.lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getPayCount() {
		return this.payCount;
	}
	public void setPayCount(Long payCount) {
		this.payCount = payCount;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getSendShopName() {
		return this.sendShopName;
	}
	public void setSendShopName(String sendShopName) {
		this.sendShopName = sendShopName;
	}

	public String getSignDate() {
		return this.signDate;
	}
	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUidOpenId() {
		return this.uidOpenId;
	}
	public void setUidOpenId(String uidOpenId) {
		this.uidOpenId = uidOpenId;
	}

	public String getUserTaskId() {
		return this.userTaskId;
	}
	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}

	public String getUserTaskPayStatus() {
		return this.userTaskPayStatus;
	}
	public void setUserTaskPayStatus(String userTaskPayStatus) {
		this.userTaskPayStatus = userTaskPayStatus;
	}

	public String getUserTaskStatus() {
		return this.userTaskStatus;
	}
	public void setUserTaskStatus(String userTaskStatus) {
		this.userTaskStatus = userTaskStatus;
	}

}
