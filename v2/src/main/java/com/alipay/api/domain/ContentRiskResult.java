package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审核内容风险结果
 *
 * @author auto create
 * @since 1.0, 2022-04-13 14:02:25
 */
public class ContentRiskResult extends AlipayObject {

	private static final long serialVersionUID = 5388181558299239632L;

	/**
	 * 风险详细信息
	 */
	@ApiListField("content_risk_details")
	@ApiField("content_risk_detail")
	private List<ContentRiskDetail> contentRiskDetails;

	/**
	 * 以文件为主维度的风险信息聚合结果
	 */
	@ApiListField("contents")
	@ApiField("content_risks")
	private List<ContentRisks> contents;

	/**
	 * 审核状态：枚举值，唯一 。
ROBOT_PASS：机审通过 
ROBOT_REVIEW_REJECT：机审驳回 
ROBOT_FAIL：机审失败
	 */
	@ApiField("result")
	private String result;

	/**
	 * 审核规则数
	 */
	@ApiField("rl_cnt")
	private String rlCnt;

	public List<ContentRiskDetail> getContentRiskDetails() {
		return this.contentRiskDetails;
	}
	public void setContentRiskDetails(List<ContentRiskDetail> contentRiskDetails) {
		this.contentRiskDetails = contentRiskDetails;
	}

	public List<ContentRisks> getContents() {
		return this.contents;
	}
	public void setContents(List<ContentRisks> contents) {
		this.contents = contents;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getRlCnt() {
		return this.rlCnt;
	}
	public void setRlCnt(String rlCnt) {
		this.rlCnt = rlCnt;
	}

}
