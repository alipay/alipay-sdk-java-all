package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁商品报价提交
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:06:49
 */
public class AlipayCommerceLeaseEnrollSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2846499166297981362L;

	/**
	 * 租赁计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 租赁商品sku提报信息列表
	 */
	@ApiListField("sku_submit_list")
	@ApiField("lease_sku_submit_d_t_o")
	private List<LeaseSkuSubmitDTO> skuSubmitList;

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public List<LeaseSkuSubmitDTO> getSkuSubmitList() {
		return this.skuSubmitList;
	}
	public void setSkuSubmitList(List<LeaseSkuSubmitDTO> skuSubmitList) {
		this.skuSubmitList = skuSubmitList;
	}

}
