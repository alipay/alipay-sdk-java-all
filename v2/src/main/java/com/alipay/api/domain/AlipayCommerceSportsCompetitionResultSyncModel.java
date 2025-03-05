package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参赛者比赛结果同步
 *
 * @author auto create
 * @since 1.0, 2023-09-24 16:02:17
 */
public class AlipayCommerceSportsCompetitionResultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5118555599662683436L;

	/**
	 * 参赛者号码布
	 */
	@ApiField("bib")
	private String bib;

	/**
	 * 赛事编号
	 */
	@ApiField("competition_code")
	private String competitionCode;

	/**
	 * 参赛者
	 */
	@ApiField("competitor_code")
	private String competitorCode;

	/**
	 * 参赛者类型
	 */
	@ApiField("competitor_type")
	private String competitorType;

	/**
	 * 参赛的运动员
	 */
	@ApiField("composition_athletes")
	private String compositionAthletes;

	/**
	 * 版本
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 与第一名相差
	 */
	@ApiField("diff")
	private String diff;

	/**
	 * 是否有违规
	 */
	@ApiField("irm")
	private String irm;

	/**
	 * 被罚次数
	 */
	@ApiField("pty")
	private String pty;

	/**
	 * 晋级标志
	 */
	@ApiField("qualification_mark")
	private String qualificationMark;

	/**
	 * 排名
	 */
	@ApiField("rank")
	private String rank;

	/**
	 * 记录
	 */
	@ApiField("record_indicators")
	private String recordIndicators;

	/**
	 * 比赛结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 比赛成绩状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	/**
	 * 比赛结果类型
	 */
	@ApiField("result_type")
	private String resultType;

	/**
	 * 比赛结果排序
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * 1
	 */
	@ApiField("start_sort_order")
	private Long startSortOrder;

	/**
	 * 比赛项目赛程编号
	 */
	@ApiField("unit_code")
	private String unitCode;

	/**
	 * 胜W输L平T
	 */
	@ApiField("wlt")
	private String wlt;

	public String getBib() {
		return this.bib;
	}
	public void setBib(String bib) {
		this.bib = bib;
	}

	public String getCompetitionCode() {
		return this.competitionCode;
	}
	public void setCompetitionCode(String competitionCode) {
		this.competitionCode = competitionCode;
	}

	public String getCompetitorCode() {
		return this.competitorCode;
	}
	public void setCompetitorCode(String competitorCode) {
		this.competitorCode = competitorCode;
	}

	public String getCompetitorType() {
		return this.competitorType;
	}
	public void setCompetitorType(String competitorType) {
		this.competitorType = competitorType;
	}

	public String getCompositionAthletes() {
		return this.compositionAthletes;
	}
	public void setCompositionAthletes(String compositionAthletes) {
		this.compositionAthletes = compositionAthletes;
	}

	public Long getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getDiff() {
		return this.diff;
	}
	public void setDiff(String diff) {
		this.diff = diff;
	}

	public String getIrm() {
		return this.irm;
	}
	public void setIrm(String irm) {
		this.irm = irm;
	}

	public String getPty() {
		return this.pty;
	}
	public void setPty(String pty) {
		this.pty = pty;
	}

	public String getQualificationMark() {
		return this.qualificationMark;
	}
	public void setQualificationMark(String qualificationMark) {
		this.qualificationMark = qualificationMark;
	}

	public String getRank() {
		return this.rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRecordIndicators() {
		return this.recordIndicators;
	}
	public void setRecordIndicators(String recordIndicators) {
		this.recordIndicators = recordIndicators;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getResultStatus() {
		return this.resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public String getResultType() {
		return this.resultType;
	}
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getStartSortOrder() {
		return this.startSortOrder;
	}
	public void setStartSortOrder(Long startSortOrder) {
		this.startSortOrder = startSortOrder;
	}

	public String getUnitCode() {
		return this.unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getWlt() {
		return this.wlt;
	}
	public void setWlt(String wlt) {
		this.wlt = wlt;
	}

}
