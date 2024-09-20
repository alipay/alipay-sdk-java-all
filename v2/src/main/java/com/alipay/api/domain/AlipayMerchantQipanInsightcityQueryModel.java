package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘开放洞察城市查询接口
 *
 * @author auto create
 * @since 1.0, 2023-05-16 13:56:56
 */
public class AlipayMerchantQipanInsightcityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1547757464339888483L;

	/**
	 * 人群id，按人群分析时必传
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 用户关系类型，不传人群id时必传
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 数据日期，格式yyyyMMdd，非必填。由于数据每天可能有变化，可以指定数据对应的日期，指定后可以查询日期对应的数据计算结果，不填默认返回前一天的数据。
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
