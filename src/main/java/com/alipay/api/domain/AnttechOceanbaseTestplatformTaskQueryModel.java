package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取ob开源官网提测平台待执行任务接口
 *
 * @author auto create
 * @since 1.0, 2022-06-13 19:50:42
 */
public class AnttechOceanbaseTestplatformTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8299628521347243239L;

	/**
	 * 筛选结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 参赛选手的名字
	 */
	@ApiField("palyer")
	private String palyer;

	/**
	 * 允许超时任务的重试次数
	 */
	@ApiField("run_task_retry")
	private Long runTaskRetry;

	/**
	 * 获取任务时先获取超时任务，这里传入的是超时的分钟数。默认30分钟。
	 */
	@ApiField("run_task_time_out_minutes")
	private Long runTaskTimeOutMinutes;

	/**
	 * 获取任务的筛选条件
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 二级提测题目
	 */
	@ApiField("test_cases")
	private String testCases;

	/**
	 * 测试结果描述、备注信息
	 */
	@ApiField("test_info")
	private String testInfo;

	/**
	 * 一级提测题目
	 */
	@ApiField("test_suite")
	private String testSuite;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPalyer() {
		return this.palyer;
	}
	public void setPalyer(String palyer) {
		this.palyer = palyer;
	}

	public Long getRunTaskRetry() {
		return this.runTaskRetry;
	}
	public void setRunTaskRetry(Long runTaskRetry) {
		this.runTaskRetry = runTaskRetry;
	}

	public Long getRunTaskTimeOutMinutes() {
		return this.runTaskTimeOutMinutes;
	}
	public void setRunTaskTimeOutMinutes(Long runTaskTimeOutMinutes) {
		this.runTaskTimeOutMinutes = runTaskTimeOutMinutes;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTestCases() {
		return this.testCases;
	}
	public void setTestCases(String testCases) {
		this.testCases = testCases;
	}

	public String getTestInfo() {
		return this.testInfo;
	}
	public void setTestInfo(String testInfo) {
		this.testInfo = testInfo;
	}

	public String getTestSuite() {
		return this.testSuite;
	}
	public void setTestSuite(String testSuite) {
		this.testSuite = testSuite;
	}

}
