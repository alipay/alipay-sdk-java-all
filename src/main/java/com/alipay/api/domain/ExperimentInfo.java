package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 实验信息
 *
 * @author auto create
 * @since 1.0, 2022-09-06 20:01:18
 */
public class ExperimentInfo extends AlipayObject {

	private static final long serialVersionUID = 3887599162857912721L;

	/**
	 * 算法组按日的明细数据
	 */
	@ApiListField("algo_group_detail_data")
	@ApiField("date_data")
	private List<DateData> algoGroupDetailData;

	/**
	 * 对照组按日的明细数据
	 */
	@ApiListField("control_group_detail_data")
	@ApiField("date_data")
	private List<DateData> controlGroupDetailData;

	/**
	 * 结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 实验Id
	 */
	@ApiField("experiment_id")
	private String experimentId;

	/**
	 * 实验流量百分比
	 */
	@ApiField("flow")
	private String flow;

	/**
	 * 开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	public List<DateData> getAlgoGroupDetailData() {
		return this.algoGroupDetailData;
	}
	public void setAlgoGroupDetailData(List<DateData> algoGroupDetailData) {
		this.algoGroupDetailData = algoGroupDetailData;
	}

	public List<DateData> getControlGroupDetailData() {
		return this.controlGroupDetailData;
	}
	public void setControlGroupDetailData(List<DateData> controlGroupDetailData) {
		this.controlGroupDetailData = controlGroupDetailData;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getExperimentId() {
		return this.experimentId;
	}
	public void setExperimentId(String experimentId) {
		this.experimentId = experimentId;
	}

	public String getFlow() {
		return this.flow;
	}
	public void setFlow(String flow) {
		this.flow = flow;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
