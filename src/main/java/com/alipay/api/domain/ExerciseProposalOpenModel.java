package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运动习惯分析
 *
 * @author auto create
 * @since 1.0, 2019-01-03 14:29:48
 */
public class ExerciseProposalOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5673245793798965375L;

	/**
	 * 建议文案
	 */
	@ApiField("instruction")
	private String instruction;

	/**
	 * 建议列表
	 */
	@ApiListField("proposal_list")
	@ApiField("string")
	private List<String> proposalList;

	/**
	 * 运动习惯分析更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

	public String getInstruction() {
		return this.instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public List<String> getProposalList() {
		return this.proposalList;
	}
	public void setProposalList(List<String> proposalList) {
		this.proposalList = proposalList;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
