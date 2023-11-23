package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借呗房抵贷签约事件-合同签署人
 *
 * @author auto create
 * @since 1.0, 2021-02-01 13:49:44
 */
public class ContractSignatory extends AlipayObject {

	private static final long serialVersionUID = 5227884975494177462L;

	/**
	 * 签署人证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 签署人证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户身份证姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
