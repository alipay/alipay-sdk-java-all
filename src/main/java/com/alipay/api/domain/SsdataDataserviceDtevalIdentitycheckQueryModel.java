package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上数用户信息核对身份查询接口
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:11:43
 */
public class SsdataDataserviceDtevalIdentitycheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4297389463825569816L;

	/**
	 * 工单流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 采集到的身份证号
	 */
	@ApiField("col_cert_no")
	private String colCertNo;

	/**
	 * 采集到的手机号码
	 */
	@ApiField("col_mobile")
	private String colMobile;

	/**
	 * 采集到的姓名
	 */
	@ApiField("col_user_name")
	private String colUserName;

	/**
	 * 额外参数
	 */
	@ApiField("ext_map")
	private String extMap;

	/**
	 * 实际身份证号
	 */
	@ApiField("real_cert_no")
	private String realCertNo;

	/**
	 * 实际手机号号码
	 */
	@ApiField("real_mobile")
	private String realMobile;

	/**
	 * 实际姓名
	 */
	@ApiField("real_user_name")
	private String realUserName;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getColCertNo() {
		return this.colCertNo;
	}
	public void setColCertNo(String colCertNo) {
		this.colCertNo = colCertNo;
	}

	public String getColMobile() {
		return this.colMobile;
	}
	public void setColMobile(String colMobile) {
		this.colMobile = colMobile;
	}

	public String getColUserName() {
		return this.colUserName;
	}
	public void setColUserName(String colUserName) {
		this.colUserName = colUserName;
	}

	public String getExtMap() {
		return this.extMap;
	}
	public void setExtMap(String extMap) {
		this.extMap = extMap;
	}

	public String getRealCertNo() {
		return this.realCertNo;
	}
	public void setRealCertNo(String realCertNo) {
		this.realCertNo = realCertNo;
	}

	public String getRealMobile() {
		return this.realMobile;
	}
	public void setRealMobile(String realMobile) {
		this.realMobile = realMobile;
	}

	public String getRealUserName() {
		return this.realUserName;
	}
	public void setRealUserName(String realUserName) {
		this.realUserName = realUserName;
	}

}
