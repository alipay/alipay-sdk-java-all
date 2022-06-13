package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubTaskInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.isv.signauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-17 17:27:47
 */
public class AlipayOpenSpIsvSignauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6246946952138689624L;

	/** 
	 * 签约授权一体化订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 签约授权一体化订单状态
INIT:初始化
UNCONFIRM:待确认
FAILURE:失败
FINISH:成功
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 签约授权一体化订单子任务单信息
	 */
	@ApiListField("task_infos")
	@ApiField("sub_task_info")
	private List<SubTaskInfo> taskInfos;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaskInfos(List<SubTaskInfo> taskInfos) {
		this.taskInfos = taskInfos;
	}
	public List<SubTaskInfo> getTaskInfos( ) {
		return this.taskInfos;
	}

}
