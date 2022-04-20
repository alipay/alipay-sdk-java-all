package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导购员查询任务详情
 *
 * @author auto create
 * @since 1.0, 2022-03-24 20:42:50
 */
public class AlipayCommerceYuntaskHunterGetModel extends AlipayObject {

	private static final long serialVersionUID = 7495623841547975249L;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 商家id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务模板id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
