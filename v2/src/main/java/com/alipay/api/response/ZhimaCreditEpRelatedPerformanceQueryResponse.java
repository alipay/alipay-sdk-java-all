package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PenCaseInfo;
import com.alipay.api.domain.PunishBreakInfo;
import com.alipay.api.domain.PunishedInfo;
import com.alipay.api.domain.RelatedPerformanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.related.performance.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-15 18:15:17
 */
public class ZhimaCreditEpRelatedPerformanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2819359629122387316L;

	/** 
	 * 行政处罚(市监)信息列表
	 */
	@ApiListField("case_info_list")
	@ApiField("pen_case_info")
	private List<PenCaseInfo> caseInfoList;

	/** 
	 * 核验状态
	 */
	@ApiField("is_verified")
	private String isVerified;

	/** 
	 * 失信被执行人信息列表
	 */
	@ApiListField("punish_break_list")
	@ApiField("punish_break_info")
	private List<PunishBreakInfo> punishBreakList;

	/** 
	 * 被执行人信息列表
	 */
	@ApiListField("punished_list")
	@ApiField("punished_info")
	private List<PunishedInfo> punishedList;

	/** 
	 * 作为法定代表人的企业信息列表
	 */
	@ApiListField("ry_pos_fr_list")
	@ApiField("related_performance_info")
	private List<RelatedPerformanceInfo> ryPosFrList;

	/** 
	 * 作为主要管理人员的企业信息列表
	 */
	@ApiListField("ry_pos_per_list")
	@ApiField("related_performance_info")
	private List<RelatedPerformanceInfo> ryPosPerList;

	/** 
	 * 作为股东的企业信息列表
	 */
	@ApiListField("ry_pos_sha_list")
	@ApiField("related_performance_info")
	private List<RelatedPerformanceInfo> ryPosShaList;

	public void setCaseInfoList(List<PenCaseInfo> caseInfoList) {
		this.caseInfoList = caseInfoList;
	}
	public List<PenCaseInfo> getCaseInfoList( ) {
		return this.caseInfoList;
	}

	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}
	public String getIsVerified( ) {
		return this.isVerified;
	}

	public void setPunishBreakList(List<PunishBreakInfo> punishBreakList) {
		this.punishBreakList = punishBreakList;
	}
	public List<PunishBreakInfo> getPunishBreakList( ) {
		return this.punishBreakList;
	}

	public void setPunishedList(List<PunishedInfo> punishedList) {
		this.punishedList = punishedList;
	}
	public List<PunishedInfo> getPunishedList( ) {
		return this.punishedList;
	}

	public void setRyPosFrList(List<RelatedPerformanceInfo> ryPosFrList) {
		this.ryPosFrList = ryPosFrList;
	}
	public List<RelatedPerformanceInfo> getRyPosFrList( ) {
		return this.ryPosFrList;
	}

	public void setRyPosPerList(List<RelatedPerformanceInfo> ryPosPerList) {
		this.ryPosPerList = ryPosPerList;
	}
	public List<RelatedPerformanceInfo> getRyPosPerList( ) {
		return this.ryPosPerList;
	}

	public void setRyPosShaList(List<RelatedPerformanceInfo> ryPosShaList) {
		this.ryPosShaList = ryPosShaList;
	}
	public List<RelatedPerformanceInfo> getRyPosShaList( ) {
		return this.ryPosShaList;
	}

}
