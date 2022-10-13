package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.fund.institutionschoolinf.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-09 15:03:33
 */
public class AlipayOverseasFundInstitutionschoolinfCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6238797247378441117L;

	/** 
	 * ISV入驻签约PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/** 
	 * isv原始请求编号，同创建接口的 isv_request_no字段
	 */
	@ApiField("isv_request_no")
	private String isvRequestNo;

	/** 
	 * 透传保留字段，json map格式
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * 学校PID
	 */
	@ApiField("school_pid")
	private String schoolPid;

	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}
	public String getIsvPid( ) {
		return this.isvPid;
	}

	public void setIsvRequestNo(String isvRequestNo) {
		this.isvRequestNo = isvRequestNo;
	}
	public String getIsvRequestNo( ) {
		return this.isvRequestNo;
	}

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}
	public String getSchoolPid( ) {
		return this.schoolPid;
	}

}
