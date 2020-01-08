package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询贷款合约
 *
 * @author auto create
 * @since 1.0, 2017-09-19 14:04:16
 */
public class MybankCreditLoantradeLoanarrangementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8362727255217918881L;

	/**
	 * 网商银行参与者会员角色ID。客户在网商融资平台页面发起贷款申请或者机构调用代客户申贷接口mybank.credit.loanapply.apply.create后，网商会把申请结果以消息的方式通知机构，该字段包含在返回的消息体中。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 合约编号，客户签署合约时获取。
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLoanArNo() {
		return this.loanArNo;
	}
	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

}
