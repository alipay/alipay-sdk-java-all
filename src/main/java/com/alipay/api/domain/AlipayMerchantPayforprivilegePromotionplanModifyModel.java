package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改储值方案
 *
 * @author auto create
 * @since 1.0, 2020-04-08 11:34:59
 */
public class AlipayMerchantPayforprivilegePromotionplanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1497235717761326693L;

	/**
	 * 充享惠方案的结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 充享惠方案ID，通过创建接口创建的ID
	 */
	@ApiField("promotion_plan_id")
	private String promotionPlanId;

	/**
	 * 充享惠方案开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 充享惠方案的状态，ENABLED(启用), DISABLED(停用)
	 */
	@ApiField("status")
	private String status;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPromotionPlanId() {
		return this.promotionPlanId;
	}
	public void setPromotionPlanId(String promotionPlanId) {
		this.promotionPlanId = promotionPlanId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
