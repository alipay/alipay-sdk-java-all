package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 员工因公付代扣解约
 *
 * @author auto create
 * @since 1.0, 2026-10-19 21:07:56
 */
public class AlipayCommerceEcEmployeePaydeductauthUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 6484848393581656767L;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * null
	 */
	@ApiListField("receiver_pids")
	@ApiField("string")
	private List<String> receiverPids;

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

	public List<String> getReceiverPids() {
		return this.receiverPids;
	}
	public void setReceiverPids(List<String> receiverPids) {
		this.receiverPids = receiverPids;
	}

}
