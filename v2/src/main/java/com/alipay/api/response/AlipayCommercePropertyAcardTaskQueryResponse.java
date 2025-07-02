package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardApplyTaskInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.acard.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 17:22:30
 */
public class AlipayCommercePropertyAcardTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3692973267481774193L;

	/** 
	 * 制卡任务详情
	 */
	@ApiField("card_apply_task_detail")
	private CardApplyTaskInfo cardApplyTaskDetail;

	/** 
	 * 外部唯一业务编号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/** 
	 * 制卡任务状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 制卡任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public void setCardApplyTaskDetail(CardApplyTaskInfo cardApplyTaskDetail) {
		this.cardApplyTaskDetail = cardApplyTaskDetail;
	}
	public CardApplyTaskInfo getCardApplyTaskDetail( ) {
		return this.cardApplyTaskDetail;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
