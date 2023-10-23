package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取员工邀请链接
 *
 * @author auto create
 * @since 1.0, 2023-09-21 13:24:55
 */
public class AlipayCommerceEcEmployeeInviteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3558683682899917929L;

	/**
	 * 是否生成签约吱口令，不传默认为N
	 */
	@ApiField("create_share_code")
	private String createShareCode;

	/**
	 * 企业码员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 页面内容code
	 */
	@ApiField("page_content_code")
	private String pageContentCode;

	/**
	 * 代扣签约串
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
