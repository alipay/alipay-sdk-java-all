package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝就业求职意向详情
 *
 * @author auto create
 * @since 1.0, 2024-06-20 14:22:40
 */
public class JobIntentionDetail extends AlipayObject {

	private static final long serialVersionUID = 8195267476625956417L;

	/**
	 * 城市行政区划编码，参考<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/ed5yn3asbtes7ni4" target="_blank">全量城市行政区划编码（2020Q1版本）<a/>
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 岗位类型 用于岗位筛选、岗位匹配等场景，具体枚举值清单如下（传第三级岗位类型Code）：<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/nmowzfqvl8itkado" target="_blank">岗位类型清单</a>
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 薪资最大值
	 */
	@ApiField("salary_max")
	private String salaryMax;

	/**
	 * 薪资最小值
	 */
	@ApiField("salary_min")
	private String salaryMin;

	/**
	 * 工作性质
	 */
	@ApiField("work_nature")
	private String workNature;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getJobType() {
		return this.jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getSalaryMax() {
		return this.salaryMax;
	}
	public void setSalaryMax(String salaryMax) {
		this.salaryMax = salaryMax;
	}

	public String getSalaryMin() {
		return this.salaryMin;
	}
	public void setSalaryMin(String salaryMin) {
		this.salaryMin = salaryMin;
	}

	public String getWorkNature() {
		return this.workNature;
	}
	public void setWorkNature(String workNature) {
		this.workNature = workNature;
	}

}
