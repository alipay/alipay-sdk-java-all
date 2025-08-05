package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国开行助学贷款还款计划查询接口
 *
 * @author auto create
 * @since 1.0, 2023-08-02 10:41:46
 */
public class AlipayFundStudentloanRepayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4575298878632872443L;

	/**
	 * 还款学生的身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 还款学生的支付宝账号
	 */
	@ApiField("logon_id")
	private String logonId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
