package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发测试资源化升级
 *
 * @author auto create
 * @since 1.0, 2022-07-29 17:24:33
 */
public class AlipaySecurityShuanqBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4196319821398976526L;

	/**
	 * 区
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * rfdss
	 */
	@ApiField("cert_no")
	private Long certNo;

	/**
	 * 的改动染发膏
	 */
	@ApiField("name")
	private Boolean name;

	/**
	 * 萨芬圣德芬
	 */
	@ApiField("test")
	private Date test;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Long getCertNo() {
		return this.certNo;
	}
	public void setCertNo(Long certNo) {
		this.certNo = certNo;
	}

	public Boolean getName() {
		return this.name;
	}
	public void setName(Boolean name) {
		this.name = name;
	}

	public Date getTest() {
		return this.test;
	}
	public void setTest(Date test) {
		this.test = test;
	}

}
