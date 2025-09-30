package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分期阶段优惠详情
 *
 * @author auto create
 * @since 1.0, 2025-07-16 13:39:50
 */
public class RentStagePromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6817371392868247411L;

	/**
	 * 分期计划详情
	 */
	@ApiListField("installment_plan_promo_detail_info_list")
	@ApiField("rent_installment_plan_promo_detail_info_v_o")
	private List<RentInstallmentPlanPromoDetailInfoVO> installmentPlanPromoDetailInfoList;

	/**
	 * 阶段编码
	 */
	@ApiField("stage_no")
	private String stageNo;

	public List<RentInstallmentPlanPromoDetailInfoVO> getInstallmentPlanPromoDetailInfoList() {
		return this.installmentPlanPromoDetailInfoList;
	}
	public void setInstallmentPlanPromoDetailInfoList(List<RentInstallmentPlanPromoDetailInfoVO> installmentPlanPromoDetailInfoList) {
		this.installmentPlanPromoDetailInfoList = installmentPlanPromoDetailInfoList;
	}

	public String getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(String stageNo) {
		this.stageNo = stageNo;
	}

}
