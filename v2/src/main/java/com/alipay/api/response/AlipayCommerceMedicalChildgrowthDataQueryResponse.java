package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConsultantChildInfoVO;
import com.alipay.api.domain.ConsultantGrowthRecordVO;
import com.alipay.api.domain.ConsultantInterpretVO;
import com.alipay.api.domain.ConsultantStandardDataVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.childgrowth.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-21 19:27:52
 */
public class AlipayCommerceMedicalChildgrowthDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7447348293345374159L;

	/** 
	 * ConsultantChildInfoVO	儿童基本信息（档案为空时为 null）
	 */
	@ApiField("child_info")
	private ConsultantChildInfoVO childInfo;

	/** 
	 * 扩展信息 JSON，预留字段，默认 "{}"
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * null
	 */
	@ApiListField("growth_records")
	@ApiField("consultant_growth_record_v_o")
	private List<ConsultantGrowthRecordVO> growthRecords;

	/** 
	 * 最新 AI 解读（无有效解读时为 null）
	 */
	@ApiField("latest_interpret")
	private ConsultantInterpretVO latestInterpret;

	/** 
	 * 国标曲线数据：百分位（P3/P25/P50/P75/P90，0-18岁按月龄合并）+ BMI 特殊界值（7-18岁消瘦/肥胖）+ BMI 界值（THRESHOLD）
	 */
	@ApiField("national_standard")
	private ConsultantStandardDataVO nationalStandard;

	public void setChildInfo(ConsultantChildInfoVO childInfo) {
		this.childInfo = childInfo;
	}
	public ConsultantChildInfoVO getChildInfo( ) {
		return this.childInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setGrowthRecords(List<ConsultantGrowthRecordVO> growthRecords) {
		this.growthRecords = growthRecords;
	}
	public List<ConsultantGrowthRecordVO> getGrowthRecords( ) {
		return this.growthRecords;
	}

	public void setLatestInterpret(ConsultantInterpretVO latestInterpret) {
		this.latestInterpret = latestInterpret;
	}
	public ConsultantInterpretVO getLatestInterpret( ) {
		return this.latestInterpret;
	}

	public void setNationalStandard(ConsultantStandardDataVO nationalStandard) {
		this.nationalStandard = nationalStandard;
	}
	public ConsultantStandardDataVO getNationalStandard( ) {
		return this.nationalStandard;
	}

}
