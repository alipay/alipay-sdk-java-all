package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询任务id下所有的用户任务列表
 *
 * @author auto create
 * @since 1.0, 2024-02-27 09:53:38
 */
public class AlipayCommerceWaterUsertaskdetailBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2574378893953282881L;

	/**
	 * 参与任务时间结束
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 商家外部单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 进度上报门店名称
	 */
	@ApiField("send_shop_name")
	private String sendShopName;

	/**
	 * 参与任务时间开始
	 */
	@ApiField("start_date")
	private String startDate;

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
	 * 用户任务扣款状态
	 */
	@ApiField("user_task_pay_status")
	private String userTaskPayStatus;

	/**
	 * 用户任务状态
	 */
	@ApiField("user_task_status")
	private String userTaskStatus;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSendShopName() {
		return this.sendShopName;
	}
	public void setSendShopName(String sendShopName) {
		this.sendShopName = sendShopName;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
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
