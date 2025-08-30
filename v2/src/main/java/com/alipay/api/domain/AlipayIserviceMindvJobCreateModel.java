package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小蚁触角_任务创建
 *
 * @author auto create
 * @since 1.0, 2018-09-19 16:55:29
 */
public class AlipayIserviceMindvJobCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8584942199758284146L;

	/**
	 * 任务创建后发布的域名信息，枚举值:
ALIPAY(1, "surveys.alipay.com"),
ALIBABA_INC(2, "surveys.alibaba-inc.com"),
HEMAOS(3, "surveys.hemaos.com");
	 */
	@ApiField("job_domain")
	private String jobDomain;

	/**
	 * 创建人工号
	 */
	@ApiField("staff_no")
	private String staffNo;

	/**
	 * 问卷/试卷标题信息
	 */
	@ApiField("title")
	private String title;

	/**
	 * 问卷/试卷类型区别. 枚举值: QUESTION-问卷, EXAM-试卷
	 */
	@ApiField("type")
	private String type;

	public String getJobDomain() {
		return this.jobDomain;
	}
	public void setJobDomain(String jobDomain) {
		this.jobDomain = jobDomain;
	}

	public String getStaffNo() {
		return this.staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
