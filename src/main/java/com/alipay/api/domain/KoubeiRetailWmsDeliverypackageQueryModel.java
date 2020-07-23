package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包裹信息查询
 *
 * @author auto create
 * @since 1.0, 2018-06-12 17:18:08
 */
public class KoubeiRetailWmsDeliverypackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2681614989475434379L;

	/**
	 * 运单号（与通知单号二选一，如果都存在，以通知单号查询）
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 通知单id（与运单号二选一）
	 */
	@ApiField("notice_order_id")
	private String noticeOrderId;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 作业id
	 */
	@ApiField("work_order_id")
	private String workOrderId;

	public String getExpressCode() {
		return this.expressCode;
	}
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

	public String getNoticeOrderId() {
		return this.noticeOrderId;
	}
	public void setNoticeOrderId(String noticeOrderId) {
		this.noticeOrderId = noticeOrderId;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}
	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

}
