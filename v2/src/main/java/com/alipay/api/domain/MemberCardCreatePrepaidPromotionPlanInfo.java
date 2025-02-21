package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡创建储值优惠方案
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardCreatePrepaidPromotionPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 7447719488972463182L;

	/**
	 * 充值方案权益金部分，单位是元，且必须是整数，最小为0，权益金不超过5000元
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 储值方案对应赠送券信息
	 */
	@ApiListField("benefit_voucher_list")
	@ApiField("member_card_voucher_benefit_info")
	private List<MemberCardVoucherBenefitInfo> benefitVoucherList;

	/**
	 * 方案的失效时间，如果不传，则为默认值：2037-12-31 23:59:59
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 充值本金部分，单位是元，且必须是整数，必须大于0，本金不超过5000元
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 新增的话不需要传；如果是修改需要传入
	 */
	@ApiField("promotion_plan_id")
	private String promotionPlanId;

	/**
	 * 充值方案总次数限制
	 */
	@ApiField("publish_total_num")
	private Long publishTotalNum;

	/**
	 * 方案开始生效时间, 如果不传默认当前时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 正常不需要传，忽略
	 */
	@ApiField("status")
	private String status;

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public List<MemberCardVoucherBenefitInfo> getBenefitVoucherList() {
		return this.benefitVoucherList;
	}
	public void setBenefitVoucherList(List<MemberCardVoucherBenefitInfo> benefitVoucherList) {
		this.benefitVoucherList = benefitVoucherList;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
