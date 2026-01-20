package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-19 15:22:37
 */
public class GuidanceUseDrugItem extends AlipayObject {

	private static final long serialVersionUID = 8393987128391171236L;

	/**
	 * 药品名称
	 */
	@ApiField("drug_name")
	private String drugName;

	/**
	 * 药品数量
	 */
	@ApiField("drug_num")
	private String drugNum;

	/**
	 * 药品规格，常见单位有mg、g、IU、毫克（mg）、毫升（ml），单位拼接成字符串使用
	 */
	@ApiField("drug_specifications")
	private String drugSpecifications;

	/**
	 * 用药医嘱
	 */
	@ApiField("notice_info")
	private String noticeInfo;

	/**
	 * 超说明书用药说明
	 */
	@ApiField("over_instruction_str")
	private String overInstructionStr;

	/**
	 * 用法用量，如mg、ml、次/天等，单位拼接后使用
	 */
	@ApiField("usage")
	private String usage;

	public String getDrugName() {
		return this.drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugNum() {
		return this.drugNum;
	}
	public void setDrugNum(String drugNum) {
		this.drugNum = drugNum;
	}

	public String getDrugSpecifications() {
		return this.drugSpecifications;
	}
	public void setDrugSpecifications(String drugSpecifications) {
		this.drugSpecifications = drugSpecifications;
	}

	public String getNoticeInfo() {
		return this.noticeInfo;
	}
	public void setNoticeInfo(String noticeInfo) {
		this.noticeInfo = noticeInfo;
	}

	public String getOverInstructionStr() {
		return this.overInstructionStr;
	}
	public void setOverInstructionStr(String overInstructionStr) {
		this.overInstructionStr = overInstructionStr;
	}

	public String getUsage() {
		return this.usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}

}
