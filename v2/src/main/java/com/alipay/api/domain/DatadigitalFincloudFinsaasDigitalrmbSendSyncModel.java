package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交通银行数字人民币发放状态同步
 *
 * @author auto create
 * @since 1.0, 2023-04-17 11:31:20
 */
public class DatadigitalFincloudFinsaasDigitalrmbSendSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8876412822818491481L;

	/**
	 * cred_id+用户凭证ID+唯一
	 */
	@ApiField("cred_id")
	private String credId;

	/**
	 * person_id+用户唯一标识+唯一
	 */
	@ApiField("person_id")
	private String personId;

	/**
	 * phone_no+用户手机号+唯一
	 */
	@ApiField("phone_no")
	private String phoneNo;

	public String getCredId() {
		return this.credId;
	}
	public void setCredId(String credId) {
		this.credId = credId;
	}

	public String getPersonId() {
		return this.personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
