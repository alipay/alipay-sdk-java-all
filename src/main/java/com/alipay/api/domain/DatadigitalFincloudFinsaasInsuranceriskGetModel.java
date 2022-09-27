package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险SaaS两核风控获取预测数据
 *
 * @author auto create
 * @since 1.0, 2022-09-13 17:37:15
 */
public class DatadigitalFincloudFinsaasInsuranceriskGetModel extends AlipayObject {

	private static final long serialVersionUID = 2682482556548754655L;

	/**
	 * 身份证MD5或者sha1码
	 */
	@ApiField("cert_no_code")
	private String certNoCode;

	/**
	 * 数据类型
1=预测值
2=黑名单
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 请求Id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 电话号码
	 */
	@ApiField("telephone_num")
	private String telephoneNum;

	public String getCertNoCode() {
		return this.certNoCode;
	}
	public void setCertNoCode(String certNoCode) {
		this.certNoCode = certNoCode;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTelephoneNum() {
		return this.telephoneNum;
	}
	public void setTelephoneNum(String telephoneNum) {
		this.telephoneNum = telephoneNum;
	}

}
