package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工卡信息
 *
 * @author auto create
 * @since 1.0, 2023-09-07 19:31:03
 */
public class EmployeeCardInfoResDTO extends AlipayObject {

	private static final long serialVersionUID = 5682556596792895569L;

	/**
	 * 零工卡号
	 */
	@ApiField("employee_card_no")
	private String employeeCardNo;

	/**
	 * 零工钱包信息
	 */
	@ApiField("employee_card_wallet_info")
	private EmployeeCardWalletInfoResDTO employeeCardWalletInfo;

	public String getEmployeeCardNo() {
		return this.employeeCardNo;
	}
	public void setEmployeeCardNo(String employeeCardNo) {
		this.employeeCardNo = employeeCardNo;
	}

	public EmployeeCardWalletInfoResDTO getEmployeeCardWalletInfo() {
		return this.employeeCardWalletInfo;
	}
	public void setEmployeeCardWalletInfo(EmployeeCardWalletInfoResDTO employeeCardWalletInfo) {
		this.employeeCardWalletInfo = employeeCardWalletInfo;
	}

}
