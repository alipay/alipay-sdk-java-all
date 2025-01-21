package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Schema模型入参测试接口04
 *
 * @author auto create
 * @since 1.0, 2024-11-16 16:22:16
 */
public class AlipayDataDataserviceSchemaapitesttoRainysQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6613797784518872871L;

	/**
	 * null
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
	 * null
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
	 * null
	 */
	@ApiListField("complex_list_must")
	@ApiField("rainy_the_twice_complex_test_all_list")
	private List<RainyTheTwiceComplexTestAllList> complexListMust;

	/**
	 * 1
	 */
	@ApiField("complex_must")
	private RainyTheTwiceComplexTestAll complexMust;

	/**
	 * null
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
	 * null
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
	 * null
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
	 * null
	 */
	@ApiListField("price_list_must")
	@ApiField("price")
	private List<String> priceListMust;

	/**
	 * null
	 */
	@ApiListField("price_list_optional")
	@ApiField("price")
	private List<String> priceListOptional;

	/**
	 * 1
	 */
	@ApiField("price_must")
	private String priceMust;

	/**
	 * 1
	 */
	@ApiField("price_optional")
	private String priceOptional;

	/**
	 * null
	 */
	@ApiListField("string_list_must")
	@ApiField("string")
	private List<String> stringListMust;

	/**
	 * null
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

	public List<RainyTheTwiceComplexTestAllList> getComplexListMust() {
		return this.complexListMust;
	}
	public void setComplexListMust(List<RainyTheTwiceComplexTestAllList> complexListMust) {
		this.complexListMust = complexListMust;
	}

	public RainyTheTwiceComplexTestAll getComplexMust() {
		return this.complexMust;
	}
	public void setComplexMust(RainyTheTwiceComplexTestAll complexMust) {
		this.complexMust = complexMust;
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

	public List<String> getPriceListOptional() {
		return this.priceListOptional;
	}
	public void setPriceListOptional(List<String> priceListOptional) {
		this.priceListOptional = priceListOptional;
	}

	public String getPriceMust() {
		return this.priceMust;
	}
	public void setPriceMust(String priceMust) {
		this.priceMust = priceMust;
	}

	public String getPriceOptional() {
		return this.priceOptional;
	}
	public void setPriceOptional(String priceOptional) {
		this.priceOptional = priceOptional;
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
