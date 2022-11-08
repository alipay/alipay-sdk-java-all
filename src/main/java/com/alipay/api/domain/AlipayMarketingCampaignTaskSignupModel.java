package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销任务报名
 *
 * @author auto create
 * @since 1.0, 2022-07-12 10:08:27
 */
public class AlipayMarketingCampaignTaskSignupModel extends AlipayObject {

	private static final long serialVersionUID = 4284677247347214145L;

	/**
	 * 参数名：外部业务单号
应用场景：与支付宝的一个业务单号进行绑定，后续可以通过该业务单号进行查询
如何获取：接口使用方自行生成，为了数据查询的准确性，应该确保该单号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务中心id
	 */
	@ApiField("task_cen_id")
	private String taskCenId;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTaskCenId() {
		return this.taskCenId;
	}
	public void setTaskCenId(String taskCenId) {
		this.taskCenId = taskCenId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
