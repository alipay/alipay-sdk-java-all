package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.level.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:31:14
 */
public class ZhimaCreditPeLevelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1387665573745943738L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用户的芝麻分分级编码。分值范围[A,B,C,D,E]。如果用户数据不足，无法评分时，返回字符串"N/A"。
	 */
	@ApiField("level_code")
	private String levelCode;

	/** 
	 * 用户的芝麻分分级描述。分值范围[信用极好，信用优秀，信用良好，信用中等，信用较差]。如果用户数据不足，无法评分时，返回字符串"N/A"。
	 */
	@ApiField("level_name")
	private String levelName;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getLevelCode( ) {
		return this.levelCode;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	public String getLevelName( ) {
		return this.levelName;
	}

}
