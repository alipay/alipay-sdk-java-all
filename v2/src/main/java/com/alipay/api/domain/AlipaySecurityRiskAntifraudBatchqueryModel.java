package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反舞弊风险批量查询
 *
 * @author auto create
 * @since 1.0, 2020-02-01 11:36:19
 */
public class AlipaySecurityRiskAntifraudBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5894422576889349413L;

	/**
	 * company_list+传入的一批待检查的企业名单+用户传入+还可以传入{"creditCode":"企业信用代码"}或者{"regNo":"企业工商注册号"}
	 */
	@ApiListField("company_list")
	@ApiField("string")
	private List<String> companyList;

	/**
	 * partner_name+唯一+作为标识调用者身份的字段+用户填入
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * staff_list+传入的一批待检查员工信息+用户传入+手机号/身份证姓名二选一+还可以传入{"name":"姓名","phone":"手机号码"}
	 */
	@ApiListField("staff_list")
	@ApiField("string")
	private List<String> staffList;

	public List<String> getCompanyList() {
		return this.companyList;
	}
	public void setCompanyList(List<String> companyList) {
		this.companyList = companyList;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public List<String> getStaffList() {
		return this.staffList;
	}
	public void setStaffList(List<String> staffList) {
		this.staffList = staffList;
	}

}
