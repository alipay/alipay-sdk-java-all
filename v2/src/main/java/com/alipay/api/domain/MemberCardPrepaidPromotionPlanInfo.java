package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡的储值优惠方案信息
 *
 * @author auto create
 * @since 1.0, 2022-04-19 21:01:57
 */
public class MemberCardPrepaidPromotionPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 1657794728298444777L;

	/**
	 * 储值方案权益金部分
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 储值方案赠送优惠券信息
	 */
	@ApiField("benefit_voucher_list")
	private MemberCardVoucherBenefitInfo benefitVoucherList;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 储值方案结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 最近修改时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	/**
	 * 储值方案本金部分
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 优惠方案的ID
	 */
	@ApiField("promotion_plan_id")
	private String promotionPlanId;

	/**
	 * 充值方案总次数限制
	 */
	@ApiField("publish_total_num")
	private Long publishTotalNum;

	/**
	 * 充值方案剩余次数
	 */
	@ApiField("publish_total_remain_num")
	private String publishTotalRemainNum;

	/**
	 * 储值方案开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 储值方案的状态，ENABLED(启用), DISABLED(停用)
	 */
	@ApiField("status")
	private String status;

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public MemberCardVoucherBenefitInfo getBenefitVoucherList() {
		return this.benefitVoucherList;
	}
	public void setBenefitVoucherList(MemberCardVoucherBenefitInfo benefitVoucherList) {
		this.benefitVoucherList = benefitVoucherList;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
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

	public Long getPublishTotalNum() {
		return this.publishTotalNum;
	}
	public void setPublishTotalNum(Long publishTotalNum) {
		this.publishTotalNum = publishTotalNum;
	}

	public String getPublishTotalRemainNum() {
		return this.publishTotalRemainNum;
	}
	public void setPublishTotalRemainNum(String publishTotalRemainNum) {
		this.publishTotalRemainNum = publishTotalRemainNum;
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
