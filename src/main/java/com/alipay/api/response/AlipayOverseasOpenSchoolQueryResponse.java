package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVResult;
import com.alipay.api.domain.TuitionISVSchoolDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.school.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-30 16:47:04
 */
public class AlipayOverseasOpenSchoolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2223765928459767382L;

	/** 
	 * 留学汇款对isv返回结果
	 */
	@ApiField("result")
	private TuitionISVResult result;

	/** 
	 * 学校
	 */
	@ApiField("school_list")
	private TuitionISVSchoolDTO schoolList;

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
	}

	public void setSchoolList(TuitionISVSchoolDTO schoolList) {
		this.schoolList = schoolList;
	}
	public TuitionISVSchoolDTO getSchoolList( ) {
		return this.schoolList;
	}

}
