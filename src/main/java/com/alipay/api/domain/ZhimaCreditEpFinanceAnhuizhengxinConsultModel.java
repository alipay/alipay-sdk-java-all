package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安徽征信蚁盾芝麻联合风控咨询入口
 *
 * @author auto create
 * @since 1.0, 2019-10-08 10:55:50
 */
public class ZhimaCreditEpFinanceAnhuizhengxinConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3487224861215467499L;

	/**
	 * 事件请求id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 法定代表人证件号码
	 */
	@ApiField("lp_cert_no")
	private String lpCertNo;

	/**
	 * 法定代表人证件类型
	 */
	@ApiField("lp_cert_type")
	private String lpCertType;

	/**
	 * 法定代表人姓名
	 */
	@ApiField("lp_np_name")
	private String lpNpName;

	/**
	 * 优先填写统一社会信用代码，若缺失，依次填入：工商注册号或组织机构代码
	 */
	@ApiField("org_cert_no")
	private String orgCertNo;

	/**
	 * 枚举值，{"uc_code": 统一社会信用代码，"reg_no":工商注册号, "org_code":组织机构代码}
	 */
	@ApiField("org_cert_type")
	private String orgCertType;

	/**
	 * 企业名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 企业类型(税务分类)
	 */
	@ApiField("org_type")
	private String orgType;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLpCertNo() {
		return this.lpCertNo;
	}
	public void setLpCertNo(String lpCertNo) {
		this.lpCertNo = lpCertNo;
	}

	public String getLpCertType() {
		return this.lpCertType;
	}
	public void setLpCertType(String lpCertType) {
		this.lpCertType = lpCertType;
	}

	public String getLpNpName() {
		return this.lpNpName;
	}
	public void setLpNpName(String lpNpName) {
		this.lpNpName = lpNpName;
	}

	public String getOrgCertNo() {
		return this.orgCertNo;
	}
	public void setOrgCertNo(String orgCertNo) {
		this.orgCertNo = orgCertNo;
	}

	public String getOrgCertType() {
		return this.orgCertType;
	}
	public void setOrgCertType(String orgCertType) {
		this.orgCertType = orgCertType;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgType() {
		return this.orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

}
