package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.acard.task.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-05 15:27:28
 */
public class AlipayCommercePropertyAcardTaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7794117541488239276L;

	/** 
	 * 制卡请求受理后的制卡任务唯一ID，与outBizId一一对应
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 制卡请求受理后的制卡任务唯一ID，与out_biz_id一一对应
	 */
	@ApiField("task_id")
	private String taskId;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
