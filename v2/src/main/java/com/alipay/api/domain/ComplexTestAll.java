package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一个复杂类型测试所有参数类型
 *
 * @author auto create
 * @since 1.0, 2024-06-13 16:20:35
 */
public class ComplexTestAll extends AlipayObject {

	private static final long serialVersionUID = 1825985125347113137L;

	/**
	 * 1
	 */
	@ApiListField("bool_list_must")
	@ApiField("boolean")
	private List<Boolean> boolListMust;

	/**
	 * 1
	 */
	@ApiField("bool_must")
	private Boolean boolMust;

	/**
	 * 1
	 */
	@ApiListField("boolean_list_optional")
	@ApiField("boolean")
	private List<Boolean> booleanListOptional;

	/**
	 * boolean_optional
	 */
	@ApiField("boolean_optional")
	private Boolean booleanOptional;

	/**
	 * 1
	 */
	@ApiListField("date_list_must")
	@ApiField("date")
	private List<Date> dateListMust;

	/**
	 * 1
	 */
	@ApiField("date_must")
	private Date dateMust;

	/**
	 * 1
	 */
	@ApiListField("num_list_must")
	@ApiField("number")
	private List<Long> numListMust;

	/**
	 * 1
	 */
	@ApiField("num_must")
	private Long numMust;

	/**
	 * number_list_optional
	 */
	@ApiListField("number_list_optional")
	@ApiField("number")
	private List<Long> numberListOptional;

	/**
	 * number_optional
	 */
	@ApiField("number_optional")
	private Long numberOptional;

	/**
	 * 1
	 */
	@ApiListField("price_list_must")
	@ApiField("price")
	private List<String> priceListMust;

	/**
	 * 1
	 */
	@ApiField("price_must")
	private String priceMust;

	/**
	 * 1
	 */
	@ApiListField("string_list_must")
	@ApiField("string")
	private List<String> stringListMust;

	/**
	 * string_optional
	 */
	@ApiListField("string_list_optional")
	@ApiField("string")
	private List<String> stringListOptional;

	/**
	 * 1
	 */
	@ApiField("string_must")
	private String stringMust;

	/**
	 * string_optional
	 */
	@ApiField("string_optional")
	private String stringOptional;

	/**
	 * 1
	 */
	@ApiField("string_regex_ip")
	private String stringRegexIp;

	/**
	 * 1
	 */
	@ApiField("string_regex_num")
	private String stringRegexNum;

	public List<Boolean> getBoolListMust() {
		return this.boolListMust;
	}
	public void setBoolListMust(List<Boolean> boolListMust) {
		this.boolListMust = boolListMust;
	}

	public Boolean getBoolMust() {
		return this.boolMust;
	}
	public void setBoolMust(Boolean boolMust) {
		this.boolMust = boolMust;
	}

	public List<Boolean> getBooleanListOptional() {
		return this.booleanListOptional;
	}
	public void setBooleanListOptional(List<Boolean> booleanListOptional) {
		this.booleanListOptional = booleanListOptional;
	}

	public Boolean getBooleanOptional() {
		return this.booleanOptional;
	}
	public void setBooleanOptional(Boolean booleanOptional) {
		this.booleanOptional = booleanOptional;
	}

	public List<Date> getDateListMust() {
		return this.dateListMust;
	}
	public void setDateListMust(List<Date> dateListMust) {
		this.dateListMust = dateListMust;
	}

	public Date getDateMust() {
		return this.dateMust;
	}
	public void setDateMust(Date dateMust) {
		this.dateMust = dateMust;
	}

	public List<Long> getNumListMust() {
		return this.numListMust;
	}
	public void setNumListMust(List<Long> numListMust) {
		this.numListMust = numListMust;
	}

	public Long getNumMust() {
		return this.numMust;
	}
	public void setNumMust(Long numMust) {
		this.numMust = numMust;
	}

	public List<Long> getNumberListOptional() {
		return this.numberListOptional;
	}
	public void setNumberListOptional(List<Long> numberListOptional) {
		this.numberListOptional = numberListOptional;
	}

	public Long getNumberOptional() {
		return this.numberOptional;
	}
	public void setNumberOptional(Long numberOptional) {
		this.numberOptional = numberOptional;
	}

	public List<String> getPriceListMust() {
		return this.priceListMust;
	}
	public void setPriceListMust(List<String> priceListMust) {
		this.priceListMust = priceListMust;
	}

	public String getPriceMust() {
		return this.priceMust;
	}
	public void setPriceMust(String priceMust) {
		this.priceMust = priceMust;
	}

	public List<String> getStringListMust() {
		return this.stringListMust;
	}
	public void setStringListMust(List<String> stringListMust) {
		this.stringListMust = stringListMust;
	}

	public List<String> getStringListOptional() {
		return this.stringListOptional;
	}
	public void setStringListOptional(List<String> stringListOptional) {
		this.stringListOptional = stringListOptional;
	}

	public String getStringMust() {
		return this.stringMust;
	}
	public void setStringMust(String stringMust) {
		this.stringMust = stringMust;
	}

	public String getStringOptional() {
		return this.stringOptional;
	}
	public void setStringOptional(String stringOptional) {
		this.stringOptional = stringOptional;
	}

	public String getStringRegexIp() {
		return this.stringRegexIp;
	}
	public void setStringRegexIp(String stringRegexIp) {
		this.stringRegexIp = stringRegexIp;
	}

	public String getStringRegexNum() {
		return this.stringRegexNum;
	}
	public void setStringRegexNum(String stringRegexNum) {
		this.stringRegexNum = stringRegexNum;
	}

}
