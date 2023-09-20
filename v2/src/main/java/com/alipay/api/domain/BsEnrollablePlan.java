package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 联营-报名-可报名计划模型
 *
 * @author auto create
 * @since 1.0, 2023-04-18 15:56:30
 */
public class BsEnrollablePlan extends AlipayObject {

	private static final long serialVersionUID = 8238565227521956444L;

	/**
	 * 联营计划信息
	 */
	@ApiField("plan_detail")
	private BsBrandPlanDetail planDetail;

	/**
	 * 计划下的权益信息
	 */
	@ApiListField("supply_info_list")
	@ApiField("bs_supply_info")
	private List<BsSupplyInfo> supplyInfoList;

	public BsBrandPlanDetail getPlanDetail() {
		return this.planDetail;
	}
	public void setPlanDetail(BsBrandPlanDetail planDetail) {
		this.planDetail = planDetail;
	}

	public List<BsSupplyInfo> getSupplyInfoList() {
		return this.supplyInfoList;
	}
	public void setSupplyInfoList(List<BsSupplyInfo> supplyInfoList) {
		this.supplyInfoList = supplyInfoList;
	}

}
