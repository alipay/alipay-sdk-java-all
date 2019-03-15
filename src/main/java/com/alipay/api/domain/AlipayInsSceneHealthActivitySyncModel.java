package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构同步健康检测产品信息
 *
 * @author auto create
 * @since 1.0, 2019-02-26 17:19:27
 */
public class AlipayInsSceneHealthActivitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 5323978292123418831L;

	/**
	 * 活动编号参数，比如01
	 */
	@ApiField("activity_no")
	private String activityNo;

	/**
	 * 申请编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 业务数据，比如邮寄信息，结果信息等
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 订单编号唯一幂等校验
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 状态参数，比如0，初始状态，1完成状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityNo() {
		return this.activityNo;
	}
	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
