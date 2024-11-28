package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:02:08
 */
public class AlipayOpenMiniIcpStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7891587274428233443L;

	/** 
	 * 如果备案状态为驳回时，比如SECURITY_AUDIT_REJECT
SUPERVISION_AUDIT_REJECT，展示的是驳回的原因；如果不是驳回状态则展示其他状态的提示信息
	 */
	@ApiField("icp_result_desc")
	private String icpResultDesc;

	/** 
	 * 小程序备案结果状态
	 */
	@ApiField("icp_status")
	private String icpStatus;

	public void setIcpResultDesc(String icpResultDesc) {
		this.icpResultDesc = icpResultDesc;
	}
	public String getIcpResultDesc( ) {
		return this.icpResultDesc;
	}

	public void setIcpStatus(String icpStatus) {
		this.icpStatus = icpStatus;
	}
	public String getIcpStatus( ) {
		return this.icpStatus;
	}

}
