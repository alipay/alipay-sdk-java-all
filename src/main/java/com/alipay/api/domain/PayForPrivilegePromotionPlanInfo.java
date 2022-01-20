package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 充享惠方案信息
 *
 * @author auto create
 * @since 1.0, 2020-02-20 14:02:59
 */
public class PayForPrivilegePromotionPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 2749198689327516162L;

	/**
	 * 充享惠方案权益金部分，最小为0
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 充享惠方案的结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 最近修改时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	/**
	 * 商户创建充享惠方案时指定的外部唯一编号，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 充享惠方案有偿券部分
	 */
	@ApiListField("paid_voucher_list")
	@ApiField("pay_for_privilege_paid_voucher_config")
	private List<PayForPrivilegePaidVoucherConfig> paidVoucherList;

	/**
	 * 充享惠方案本金部分，单位元，必须大于0
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 充享惠方案ID
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

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PayForPrivilegePaidVoucherConfig> getPaidVoucherList() {
		return this.paidVoucherList;
	}
	public void setPaidVoucherList(List<PayForPrivilegePaidVoucherConfig> paidVoucherList) {
		this.paidVoucherList = paidVoucherList;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
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
