package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SolutionOpenApiVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.expo.activity.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-10 10:20:30
 */
public class AlipayOfflineProviderExpoActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2718535785532691433L;

	/** 
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/** 
	 * null
	 */
	@ApiListField("solution_update_v_o_list")
	@ApiField("solution_open_api_v_o")
	private List<SolutionOpenApiVO> solutionUpdateVOList;

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public String getActivityCode( ) {
		return this.activityCode;
	}

	public void setSolutionUpdateVOList(List<SolutionOpenApiVO> solutionUpdateVOList) {
		this.solutionUpdateVOList = solutionUpdateVOList;
	}
	public List<SolutionOpenApiVO> getSolutionUpdateVOList( ) {
		return this.solutionUpdateVOList;
	}

}
