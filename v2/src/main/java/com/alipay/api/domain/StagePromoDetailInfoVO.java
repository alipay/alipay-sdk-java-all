package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分期阶段优惠详情
 *
 * @author auto create
 * @since 1.0, 2024-09-29 21:27:45
 */
public class StagePromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2385935881723563811L;

	/**
	 * 分期计划详情
	 */
	@ApiListField("installment_plan_promo_detail_info_list")
	@ApiField("installment_plan_promo_detail_info_v_o")
	private List<InstallmentPlanPromoDetailInfoVO> installmentPlanPromoDetailInfoList;

	/**
	 * 阶段编码
	 */
	@ApiField("stage_no")
	private String stageNo;

	public List<InstallmentPlanPromoDetailInfoVO> getInstallmentPlanPromoDetailInfoList() {
		return this.installmentPlanPromoDetailInfoList;
	}
	public void setInstallmentPlanPromoDetailInfoList(List<InstallmentPlanPromoDetailInfoVO> installmentPlanPromoDetailInfoList) {
		this.installmentPlanPromoDetailInfoList = installmentPlanPromoDetailInfoList;
	}

	public String getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(String stageNo) {
		this.stageNo = stageNo;
	}

}
