package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.feature.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-17 15:27:51
 */
public class AlipayEbppEbppFeatureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5349747943913285665L;

	/** 
	 * 批次号即文件名
	 */
	@ApiField("batch_id")
	private String batchId;

	/** 
	 * 总笔数
	 */
	@ApiField("cnt")
	private String cnt;

	/** 
	 * 异常特征值动态输出
	 */
	@ApiField("feature_ext")
	private String featureExt;

	/** 
	 * 字符串时间
	 */
	@ApiField("session_end")
	private String sessionEnd;

	/** 
	 * 字符串日期
	 */
	@ApiField("session_start")
	private String sessionStart;

	/** 
	 * 单位为分
	 */
	@ApiField("sum_amt")
	private String sumAmt;

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchId( ) {
		return this.batchId;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getCnt( ) {
		return this.cnt;
	}

	public void setFeatureExt(String featureExt) {
		this.featureExt = featureExt;
	}
	public String getFeatureExt( ) {
		return this.featureExt;
	}

	public void setSessionEnd(String sessionEnd) {
		this.sessionEnd = sessionEnd;
	}
	public String getSessionEnd( ) {
		return this.sessionEnd;
	}

	public void setSessionStart(String sessionStart) {
		this.sessionStart = sessionStart;
	}
	public String getSessionStart( ) {
		return this.sessionStart;
	}

	public void setSumAmt(String sumAmt) {
		this.sumAmt = sumAmt;
	}
	public String getSumAmt( ) {
		return this.sumAmt;
	}

}
