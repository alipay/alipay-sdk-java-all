package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新任务
 *
 * @author auto create
 * @since 1.0, 2023-08-23 12:46:31
 */
public class AlipayCommerceWaterTaskModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1443537138691748398L;

	/**
	 * 奖品信息
	 */
	@ApiField("prize_content")
	private PrizeContent prizeContent;

	/**
	 * 任务有效期结束
	 */
	@ApiField("task_end")
	private String taskEnd;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public PrizeContent getPrizeContent() {
		return this.prizeContent;
	}
	public void setPrizeContent(PrizeContent prizeContent) {
		this.prizeContent = prizeContent;
	}

	public String getTaskEnd() {
		return this.taskEnd;
	}
	public void setTaskEnd(String taskEnd) {
		this.taskEnd = taskEnd;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
