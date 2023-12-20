package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户活动状态修改
 *
 * @author auto create
 * @since 1.0, 2023-12-12 20:35:49
 */
public class AlipayCommerceWaterUsertaskModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1327721374836762285L;

	/**
	 * 修改状态类型：
NORMAL-正常还桶；
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 桶异常必填，描述桶异常的原因
	 */
	@ApiField("goods_exception_desc")
	private String goodsExceptionDesc;

	/**
	 * 除去正常还桶类型外必填，需要用户支付的金额（单位元），应小于签约芝麻时的最大金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 商家创建活动生成的活动id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 用户参与任务时，生成的id
	 */
	@ApiField("user_task_id")
	private String userTaskId;

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getGoodsExceptionDesc() {
		return this.goodsExceptionDesc;
	}
	public void setGoodsExceptionDesc(String goodsExceptionDesc) {
		this.goodsExceptionDesc = goodsExceptionDesc;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUserTaskId() {
		return this.userTaskId;
	}
	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}

}
