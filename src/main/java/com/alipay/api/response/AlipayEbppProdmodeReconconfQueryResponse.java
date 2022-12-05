package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.reconconf.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-15 10:00:15
 */
public class AlipayEbppProdmodeReconconfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5353952422778282434L;

	/** 
	 * 对账基准（以支付宝为准/以机构为准）
	 */
	@ApiField("check_depend")
	private String checkDepend;

	/** 
	 * 对账粒度（以主机构为粒度对账/以子机构为粒度对账）
	 */
	@ApiField("check_grade")
	private String checkGrade;

	/** 
	 * 清算粒度（以主机构为粒度清算/以子机构为粒度清算）
	 */
	@ApiField("clear_grade")
	private String clearGrade;

	/** 
	 * 日切时间:小时
	 */
	@ApiField("cut_hour")
	private String cutHour;

	/** 
	 * 日切时间:分钟
	 */
	@ApiField("cut_min")
	private String cutMin;

	/** 
	 * 日切时间:秒
	 */
	@ApiField("cut_sec")
	private String cutSec;

	/** 
	 * 是否有对账配置内容
	 */
	@ApiField("has_recon_conf")
	private String hasReconConf;

	/** 
	 * 无对账内容配置原因
	 */
	@ApiField("no_conf_reason")
	private String noConfReason;

	/** 
	 * 生成文件时间（以支付时间为准/以销账时间为准）
	 */
	@ApiField("recon_time")
	private String reconTime;

	/** 
	 * T+N退款规则（以机构为准）
	 */
	@ApiField("refund_rule")
	private String refundRule;

	public void setCheckDepend(String checkDepend) {
		this.checkDepend = checkDepend;
	}
	public String getCheckDepend( ) {
		return this.checkDepend;
	}

	public void setCheckGrade(String checkGrade) {
		this.checkGrade = checkGrade;
	}
	public String getCheckGrade( ) {
		return this.checkGrade;
	}

	public void setClearGrade(String clearGrade) {
		this.clearGrade = clearGrade;
	}
	public String getClearGrade( ) {
		return this.clearGrade;
	}

	public void setCutHour(String cutHour) {
		this.cutHour = cutHour;
	}
	public String getCutHour( ) {
		return this.cutHour;
	}

	public void setCutMin(String cutMin) {
		this.cutMin = cutMin;
	}
	public String getCutMin( ) {
		return this.cutMin;
	}

	public void setCutSec(String cutSec) {
		this.cutSec = cutSec;
	}
	public String getCutSec( ) {
		return this.cutSec;
	}

	public void setHasReconConf(String hasReconConf) {
		this.hasReconConf = hasReconConf;
	}
	public String getHasReconConf( ) {
		return this.hasReconConf;
	}

	public void setNoConfReason(String noConfReason) {
		this.noConfReason = noConfReason;
	}
	public String getNoConfReason( ) {
		return this.noConfReason;
	}

	public void setReconTime(String reconTime) {
		this.reconTime = reconTime;
	}
	public String getReconTime( ) {
		return this.reconTime;
	}

	public void setRefundRule(String refundRule) {
		this.refundRule = refundRule;
	}
	public String getRefundRule( ) {
		return this.refundRule;
	}

}
