package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取员工邀请链接
 *
 * @author auto create
 * @since 1.0, 2024-07-09 11:19:52
 */
public class AlipayCommerceEcEmployeeInviteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1338283641219545431L;

	/**
	 * 是否生成签约吱口令，不传默认为N
	 */
	@ApiField("create_share_code")
	private String createShareCode;

	/**
	 * 企业码员工ID，签约适用对象为指定员工时填写
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 用于展示不同的页面文案，使用标准页面文案是无需传值
	 */
	@ApiField("page_content_code")
	private String pageContentCode;

	/**
	 * 代扣签约串。需要签约代扣协议时，必传，返回的签约链接会拼接上代扣签约串。
	 */
	@ApiField("withholding_sign_str")
	private String withholdingSignStr;

	public String getCreateShareCode() {
		return this.createShareCode;
	}
	public void setCreateShareCode(String createShareCode) {
		this.createShareCode = createShareCode;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPageContentCode() {
		return this.pageContentCode;
	}
	public void setPageContentCode(String pageContentCode) {
		this.pageContentCode = pageContentCode;
	}

	public String getWithholdingSignStr() {
		return this.withholdingSignStr;
	}
	public void setWithholdingSignStr(String withholdingSignStr) {
		this.withholdingSignStr = withholdingSignStr;
	}

}
