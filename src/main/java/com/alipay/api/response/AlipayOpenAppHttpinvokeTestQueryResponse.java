package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.httpinvoke.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppHttpinvokeTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3188261438541814775L;

	/** 
	 * 1
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 1
	 */
	@ApiField("exclusive_score")
	private String exclusiveScore;

	/** 
	 * 1
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 1
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 1
	 */
	@ApiField("uuid")
	private String uuid;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setExclusiveScore(String exclusiveScore) {
		this.exclusiveScore = exclusiveScore;
	}
	public String getExclusiveScore( ) {
		return this.exclusiveScore;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUuid( ) {
		return this.uuid;
	}

}
