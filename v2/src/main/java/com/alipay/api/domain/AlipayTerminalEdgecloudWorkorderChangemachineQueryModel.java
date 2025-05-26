package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 维保换机工单查询
 *
 * @author auto create
 * @since 1.0, 2024-12-24 10:05:37
 */
public class AlipayTerminalEdgecloudWorkorderChangemachineQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4344876965737626181L;

	/**
	 * 设备系列列表，用于查询指定的设备系列
	 */
	@ApiListField("device_category_names")
	@ApiField("string")
	private List<String> deviceCategoryNames;

	/**
	 * 用于筛选工单完结时间的起始时间点，例如：如完结时间在A-B这个范围内，A就是当前参数。
	 */
	@ApiField("finish_time_from_date")
	private Date finishTimeFromDate;

	/**
	 * 用于筛选工单完结时间的起始时间点，例如：完结时间在A-B这个范围内，B就是当前参数。
	 */
	@ApiField("finish_time_to_date")
	private Date finishTimeToDate;

	public List<String> getDeviceCategoryNames() {
		return this.deviceCategoryNames;
	}
	public void setDeviceCategoryNames(List<String> deviceCategoryNames) {
		this.deviceCategoryNames = deviceCategoryNames;
	}

	public Date getFinishTimeFromDate() {
		return this.finishTimeFromDate;
	}
	public void setFinishTimeFromDate(Date finishTimeFromDate) {
		this.finishTimeFromDate = finishTimeFromDate;
	}

	public Date getFinishTimeToDate() {
		return this.finishTimeToDate;
	}
	public void setFinishTimeToDate(Date finishTimeToDate) {
		this.finishTimeToDate = finishTimeToDate;
	}

}
