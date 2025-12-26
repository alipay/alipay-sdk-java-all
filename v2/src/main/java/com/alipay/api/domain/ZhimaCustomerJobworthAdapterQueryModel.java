package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证信息匹配度查询
 *
 * @author auto create
 * @since 1.0, 2022-11-15 14:47:14
 */
public class ZhimaCustomerJobworthAdapterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4621192447347566223L;

	/**
	 * 匹配的参数"edu_level":"",//学历等级；"skill_certificate":""//证书和等级，证书和等级之间使用英文逗号隔开，等级可以为null eg:维修电工,四级/中级技能；"age":"",//两个数字 使用英文逗号隔开，-1代表没要求。eg:18,35表示18岁到35岁，-1,40表示40岁以下；"gender":"",//男｜女  要求这2个汉字二选一；"city":"",//cityCode 要求使用的高德cityCode；"recommend":""//推荐次数
	 */
	@ApiField("adapter")
	private JobworthAdapter adapter;

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
	 * 匹配的职位的中文名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

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

	public JobworthAdapter getAdapter() {
		return this.adapter;
	}
	public void setAdapter(JobworthAdapter adapter) {
		this.adapter = adapter;
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

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
