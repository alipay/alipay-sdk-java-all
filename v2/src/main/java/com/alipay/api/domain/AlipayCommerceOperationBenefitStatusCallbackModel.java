package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户权益领取消息通知
 *
 * @author auto create
 * @since 1.0, 2023-06-16 15:04:17
 */
public class AlipayCommerceOperationBenefitStatusCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 2553523232441628754L;

	/**
	 * 权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益实例id
	 */
	@ApiField("benefit_instance_id")
	private String benefitInstanceId;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 券核销订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 计划拥有者id
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 活动联营计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 权益状态，RECEIVED、USED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitInstanceId() {
		return this.benefitInstanceId;
	}
	public void setBenefitInstanceId(String benefitInstanceId) {
		this.benefitInstanceId = benefitInstanceId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
