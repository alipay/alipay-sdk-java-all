package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-20 11:27:35
 */
public class RoyaltyPublishDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 8173351682981165323L;

	/**
	 * null
	 */
	@ApiListField("royalty_info")
	@ApiField("royalty_info_request")
	private List<RoyaltyInfoRequest> royaltyInfo;

	/**
	 * 分账阶段，用于对应分期计划的阶段，正常分期为1，后续需要续租，则依次递增；
	 */
	@ApiField("stage_no")
	private String stageNo;

	public List<RoyaltyInfoRequest> getRoyaltyInfo() {
		return this.royaltyInfo;
	}
	public void setRoyaltyInfo(List<RoyaltyInfoRequest> royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
	}

	public String getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(String stageNo) {
		this.stageNo = stageNo;
	}

}
