package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 星云薪酬结算数据上传接口
 *
 * @author auto create
 * @since 1.0, 2023-10-26 11:16:19
 */
public class AlipayIserviceIssalaryDataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3218271265562215368L;

	/**
	 * 结算数据日期入参
	 */
	@ApiField("data_day")
	private String dataDay;

	/**
	 * 结算指标详情数据，单位分
	 */
	@ApiListField("salary_data")
	@ApiField("salary_data_detail")
	private List<SalaryDataDetail> salaryData;

	public String getDataDay() {
		return this.dataDay;
	}
	public void setDataDay(String dataDay) {
		this.dataDay = dataDay;
	}

	public List<SalaryDataDetail> getSalaryData() {
		return this.salaryData;
	}
	public void setSalaryData(List<SalaryDataDetail> salaryData) {
		this.salaryData = salaryData;
	}

}
