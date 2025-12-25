package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignTaskFileResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:52:35
 */
public class AlipaySecurityProdSignatureTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6255965647548653582L;

	/** 
	 * 订单业务流水号，与alipay.security.prod.signature.task.apply接口入参biz_id对应。
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

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

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

	public void setTaskList(List<SignTaskFileResult> taskList) {
		this.taskList = taskList;
	}
	public List<SignTaskFileResult> getTaskList( ) {
		return this.taskList;
	}

}
