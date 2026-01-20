package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:41
 */
public class AlipayCommerceRetailBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6793782573456319655L;

	/** 
	 * null
	 */
	@ApiListField("activity_id_list")
	@ApiField("string")
	private List<String> activityIdList;

	/** 
	 * 活动数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setActivityIdList(List<String> activityIdList) {
		this.activityIdList = activityIdList;
	}
	public List<String> getActivityIdList( ) {
		return this.activityIdList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
