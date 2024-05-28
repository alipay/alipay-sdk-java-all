package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.usertaskdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 01:02:04
 */
public class AlipayCommerceWaterUsertaskdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6389433475466523718L;

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

	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getCreditNo( ) {
		return this.creditNo;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public String getLastDate( ) {
		return this.lastDate;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPayCount(Long payCount) {
		this.payCount = payCount;
	}
	public Long getPayCount( ) {
		return this.payCount;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}
	public String getPrizeName( ) {
		return this.prizeName;
	}

	public void setSendShopName(String sendShopName) {
		this.sendShopName = sendShopName;
	}
	public String getSendShopName( ) {
		return this.sendShopName;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}
	public String getSignDate( ) {
		return this.signDate;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

	public void setUidOpenId(String uidOpenId) {
		this.uidOpenId = uidOpenId;
	}
	public String getUidOpenId( ) {
		return this.uidOpenId;
	}

	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}
	public String getUserTaskId( ) {
		return this.userTaskId;
	}

	public void setUserTaskPayStatus(String userTaskPayStatus) {
		this.userTaskPayStatus = userTaskPayStatus;
	}
	public String getUserTaskPayStatus( ) {
		return this.userTaskPayStatus;
	}

	public void setUserTaskStatus(String userTaskStatus) {
		this.userTaskStatus = userTaskStatus;
	}
	public String getUserTaskStatus( ) {
		return this.userTaskStatus;
	}

}
