package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SolutionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.expo.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-10 10:20:43
 */
public class AlipayOfflineProviderExpoActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5419576552244533279L;

	/** 
	 * 活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/** 
	 * null
	 */
	@ApiListField("solution_v_o_list")
	@ApiField("solution_v_o")
	private List<SolutionVO> solutionVOList;

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public String getActivityCode( ) {
		return this.activityCode;
	}

	public void setSolutionVOList(List<SolutionVO> solutionVOList) {
		this.solutionVOList = solutionVOList;
	}
	public List<SolutionVO> getSolutionVOList( ) {
		return this.solutionVOList;
	}

}
