package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发测试-gzk
 *
 * @author auto create
 * @since 1.0, 2022-06-17 13:32:16
 */
public class AlipayDataShuanqQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5682718618817463756L;

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
