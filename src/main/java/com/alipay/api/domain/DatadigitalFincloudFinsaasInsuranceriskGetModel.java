package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险SaaS两核风控获取预测数据
 *
 * @author auto create
 * @since 1.0, 2022-08-01 16:12:36
 */
public class DatadigitalFincloudFinsaasInsuranceriskGetModel extends AlipayObject {

	private static final long serialVersionUID = 1388137748119231595L;

	/**
	 * 身份证MD5或者hash码
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

	public String getTelephoneNum() {
		return this.telephoneNum;
	}
	public void setTelephoneNum(String telephoneNum) {
		this.telephoneNum = telephoneNum;
	}

}
