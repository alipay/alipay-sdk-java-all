package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证信息查询
 *
 * @author auto create
 * @since 1.0, 2021-09-10 16:31:56
 */
public class ZhimaCustomerJobworthInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2768564187269612728L;

	/**
	 * 若用户没有开通工作证或者芝麻，成功开通后回跳的链接
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 行业描述ID
	 */
	@ApiField("industry_id")
	private String industryId;

	/**
	 * 对外使用的jobid
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getIndustryId() {
		return this.industryId;
	}
	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
