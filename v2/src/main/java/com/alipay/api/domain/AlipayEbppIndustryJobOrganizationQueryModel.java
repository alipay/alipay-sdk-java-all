package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝就业机构岗位查询
 *
 * @author auto create
 * @since 1.0, 2025-12-10 20:47:42
 */
public class AlipayEbppIndustryJobOrganizationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1586622137436547466L;

	/**
	 * 学历要求
	 */
	@ApiField("academic_require")
	private String academicRequire;

	/**
	 * 身份证号码
	 */
	@ApiField("cert_num")
	private String certNum;

	/**
	 * 城市行政区划编码
</br>
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/ed5yn3asbtes7ni4" target="_blank">全量城市行政区划编码（2022Q2版本）
</a></br>
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/yi0uix3f0babcfzi" target="_blank">全量区县行政区划编码（2022Q2版本）
</a>
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 设备号内容
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备号类型
	 */
	@ApiField("device_id_type")
	private String deviceIdType;

	/**
	 * 经纬度（经度,纬度）,逗号分隔
	 */
	@ApiField("geo")
	private String geo;

	/**
	 * null
	 */
	@ApiListField("job_types")
	@ApiField("string")
	private List<String> jobTypes;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页记录条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 薪资上限（单位：元）
	 */
	@ApiField("salary_max")
	private String salaryMax;

	/**
	 * 薪资下限（单位：元）
	 */
	@ApiField("salary_min")
	private String salaryMin;

	/**
	 * 搜索词，当前搜索岗位类型名称、岗位名称、雇主名称、岗位特性
	 */
	@ApiField("search_word")
	private String searchWord;

	/**
	 * 岗位排序规则，附近-按照用户经纬度进行排序，最新-按照岗位更新时间进行排序，默认根据更新时间进行排序
	 */
	@ApiField("sort_type")
	private String sortType;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 工作模式
	 */
	@ApiField("work_nature")
	private String workNature;

	/**
	 * 工作年限要求
	 */
	@ApiField("working_years")
	private String workingYears;

	public String getAcademicRequire() {
		return this.academicRequire;
	}
	public void setAcademicRequire(String academicRequire) {
		this.academicRequire = academicRequire;
	}

	public String getCertNum() {
		return this.certNum;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceIdType() {
		return this.deviceIdType;
	}
	public void setDeviceIdType(String deviceIdType) {
		this.deviceIdType = deviceIdType;
	}

	public String getGeo() {
		return this.geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}

	public List<String> getJobTypes() {
		return this.jobTypes;
	}
	public void setJobTypes(List<String> jobTypes) {
		this.jobTypes = jobTypes;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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

	public String getSearchWord() {
		return this.searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getSortType() {
		return this.sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWorkNature() {
		return this.workNature;
	}
	public void setWorkNature(String workNature) {
		this.workNature = workNature;
	}

	public String getWorkingYears() {
		return this.workingYears;
	}
	public void setWorkingYears(String workingYears) {
		this.workingYears = workingYears;
	}

}
