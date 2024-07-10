package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.license.ocr.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEcoLicenseOcrIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2758965761244434733L;

	/** 
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 经营范围
	 */
	@ApiField("business")
	private String business;

	/** 
	 * 注册资本
	 */
	@ApiField("captial")
	private String captial;

	/** 
	 * 成立日期
	 */
	@ApiField("establish_date")
	private String establishDate;

	/** 
	 * 公司名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 法定代表人
	 */
	@ApiField("person")
	private String person;

	/** 
	 * 统一社会信用代码
	 */
	@ApiField("reg_num")
	private String regNum;

	/** 
	 * 营业期限
	 */
	@ApiField("valid_period")
	private String validPeriod;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBusiness(String business) {
		this.business = business;
	}
	public String getBusiness( ) {
		return this.business;
	}

	public void setCaptial(String captial) {
		this.captial = captial;
	}
	public String getCaptial( ) {
		return this.captial;
	}

	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}
	public String getEstablishDate( ) {
		return this.establishDate;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPerson(String person) {
		this.person = person;
	}
	public String getPerson( ) {
		return this.person;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public String getRegNum( ) {
		return this.regNum;
	}

	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}
	public String getValidPeriod( ) {
		return this.validPeriod;
	}

}
