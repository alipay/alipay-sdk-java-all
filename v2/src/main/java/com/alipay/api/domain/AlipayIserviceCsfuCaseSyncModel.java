package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服催案件信息同步
 *
 * @author auto create
 * @since 1.0, 2025-02-20 20:58:18
 */
public class AlipayIserviceCsfuCaseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6412375671929221191L;

	/**
	 * 案件编号，租户内全局唯一
	 */
	@ApiField("biz_case_no")
	private String bizCaseNo;

	/**
	 * 案件的逾期日期，例如逾期时间为2025-01-01 00:00:00，当前时刻为2025-01-03 00:00:00，则表示逾期的时间为2天
	 */
	@ApiField("case_overdue_date")
	private Date caseOverdueDate;

	/**
	 * 案件所支持的方案列表，一个案件可支持多个方案
	 */
	@ApiListField("case_plans")
	@ApiField("string")
	private List<String> casePlans;

	/**
	 * 委案结束时间
	 */
	@ApiField("commission_end_time")
	private Date commissionEndTime;

	/**
	 * 委案开始时间
	 */
	@ApiField("commission_start_time")
	private Date commissionStartTime;

	/**
	 * 案件所关联的联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 扩展信息字段有以下字段： 
1. **应催金额 (need_coll_amt)**;
2. **总欠款金额(total_due_amt)**;
3. **逾期本金(prin_ovd_amt)**;
4. **欠款产品(due_product)**;。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 业务方侧的全局唯一id，用以幂等处理
	 */
	@ApiField("external_contact_id")
	private String externalContactId;

	/**
	 * 案件所绑定客户的证件号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 案件所关联客户的联系方式，明文
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 租户实例id，必填，平台分配
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 案件所关联联系人的类型，区分个人和企业
	 */
	@ApiField("user_type")
	private String userType;

	public String getBizCaseNo() {
		return this.bizCaseNo;
	}
	public void setBizCaseNo(String bizCaseNo) {
		this.bizCaseNo = bizCaseNo;
	}

	public Date getCaseOverdueDate() {
		return this.caseOverdueDate;
	}
	public void setCaseOverdueDate(Date caseOverdueDate) {
		this.caseOverdueDate = caseOverdueDate;
	}

	public List<String> getCasePlans() {
		return this.casePlans;
	}
	public void setCasePlans(List<String> casePlans) {
		this.casePlans = casePlans;
	}

	public Date getCommissionEndTime() {
		return this.commissionEndTime;
	}
	public void setCommissionEndTime(Date commissionEndTime) {
		this.commissionEndTime = commissionEndTime;
	}

	public Date getCommissionStartTime() {
		return this.commissionStartTime;
	}
	public void setCommissionStartTime(Date commissionStartTime) {
		this.commissionStartTime = commissionStartTime;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalContactId() {
		return this.externalContactId;
	}
	public void setExternalContactId(String externalContactId) {
		this.externalContactId = externalContactId;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
