package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动各阶段订单模型
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:48:28
 */
public class ActivityOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 8477593655544297735L;

	/**
	 * 工单中的审核信息
	 */
	@ApiListField("activity_audit_list")
	@ApiField("activity_audit_d_t_o")
	private List<ActivityAuditDTO> activityAuditList;

	/**
	 * INIT:初始化;AUDITING:审核中;REJECT:审核驳回;PASS:审核通过;CANCEL:审核撤销;FAIL:审核失败
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * INIT:初始化;DOING:处理中;SUCCESS:成功;FAIL:失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * CAMPAIGN_CREATE_ORDER:创建工单;CAMPAIGN_ENABLE_ORDER:生效工单;CAMPAIGN_START_ORDER:启动工单;CAMPAIGN_CLOSE_ORDER:关闭工单;CAMPAIGN_FINISH_ORDER:结束工单;CAMPAIGN_DELETE_ORDER:删除工单;CAMPAIGN_MODIFY_ORDER:修改工单
	 */
	@ApiField("order_type")
	private String orderType;

	public List<ActivityAuditDTO> getActivityAuditList() {
		return this.activityAuditList;
	}
	public void setActivityAuditList(List<ActivityAuditDTO> activityAuditList) {
		this.activityAuditList = activityAuditList;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
