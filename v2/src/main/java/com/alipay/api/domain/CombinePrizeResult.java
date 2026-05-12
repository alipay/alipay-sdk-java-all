package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 组合券包的发放结果
 *
 * @author auto create
 * @since 1.0, 2026-03-02 14:27:29
 */
public class CombinePrizeResult extends AlipayObject {

	private static final long serialVersionUID = 3182149661454661128L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 订单ID
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/**
	 * 红包整体发放结果，单张红包全部成功为SUCCESS，部分成功部分失败为PART_SUCCESS_PART_FAILED，这种情况需要联系BD确认
	 */
	@ApiField("combine_prize_status")
	private String combinePrizeStatus;

	/**
	 * reduce:满立减(满5元减3元)
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 单张红包发放结果
	 */
	@ApiListField("sub_prize_result_list")
	@ApiField("sub_prize_result")
	private List<SubPrizeResult> subPrizeResultList;

	/**
	 * 红包总面额，单位为分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityOrderId() {
		return this.activityOrderId;
	}
	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}

	public String getCombinePrizeStatus() {
		return this.combinePrizeStatus;
	}
	public void setCombinePrizeStatus(String combinePrizeStatus) {
		this.combinePrizeStatus = combinePrizeStatus;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<SubPrizeResult> getSubPrizeResultList() {
		return this.subPrizeResultList;
	}
	public void setSubPrizeResultList(List<SubPrizeResult> subPrizeResultList) {
		this.subPrizeResultList = subPrizeResultList;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}
