package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.position.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:53:50
 */
public class ZhimaCustomerJobworthPositionAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6529346523611429322L;

	/** 
	 * 岗位信息ID
	 */
	@ApiField("position_id")
	private String positionId;

	/** 
	 * 业务错误
	 */
	@ApiField("sub_code")
	private String subCode;

	/** 
	 * 业务错误信息
	 */
	@ApiField("sub_msg")
	private String subMsg;

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getPositionId( ) {
		return this.positionId;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}
	public String getSubMsg( ) {
		return this.subMsg;
	}

}
