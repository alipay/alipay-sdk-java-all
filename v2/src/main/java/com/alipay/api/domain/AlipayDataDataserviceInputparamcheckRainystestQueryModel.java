package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 老流程全类型入参接口
 *
 * @author auto create
 * @since 1.0, 2025-01-22 13:55:37
 */
public class AlipayDataDataserviceInputparamcheckRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5124723753864533227L;

	/**
	 * 基础参数
	 */
	@ApiListField("boolean_list")
	@ApiField("boolean")
	private List<Boolean> booleanList;

	/**
	 * 基础参数
	 */
	@ApiListField("date_list")
	@ApiField("date")
	private List<Date> dateList;

	/**
	 * 基础描述
	 */
	@ApiField("num_ext_value")
	private Long numExtValue;

	/**
	 * 基础参数
	 */
	@ApiField("num_must")
	private Long numMust;

	/**
	 * 基础参数
	 */
	@ApiListField("num_must_list")
	@ApiField("number")
	private List<Long> numMustList;

	/**
	 * 基础参数num
	 */
	@ApiField("num_optional")
	private Long numOptional;

	/**
	 * 基础参数
	 */
	@ApiListField("num_optional_list")
	@ApiField("number")
	private List<Long> numOptionalList;

	/**
	 * 基础参数，单位元；
	 */
	@ApiField("price_exat_value")
	private String priceExatValue;

	/**
	 * 基础参数，单位元；
	 */
	@ApiField("price_must")
	private String priceMust;

	/**
	 * 基础参数，单位元；
	 */
	@ApiListField("price_must_list")
	@ApiField("price")
	private List<String> priceMustList;

	/**
	 * 基础参数，单位元；
	 */
	@ApiField("price_optional")
	private String priceOptional;

	/**
	 * 基础参数，单位元；
	 */
	@ApiListField("price_optional_list")
	@ApiField("price")
	private List<String> priceOptionalList;

	/**
	 * 基础参数
	 */
	@ApiField("string_enum")
	private String stringEnum;

	/**
	 * 基础参数
	 */
	@ApiField("string_must")
	private String stringMust;

	/**
	 * 基础参数
	 */
	@ApiListField("string_must_list")
	@ApiField("string")
	private List<String> stringMustList;

	/**
	 * 基础参数
	 */
	@ApiField("string_optional")
	private String stringOptional;

	/**
	 * 基础参数
	 */
	@ApiListField("string_optional_list")
	@ApiField("string")
	private List<String> stringOptionalList;

	/**
	 * 基础描述
	 */
	@ApiField("string_pattern")
	private String stringPattern;

	public List<Boolean> getBooleanList() {
		return this.booleanList;
	}
	public void setBooleanList(List<Boolean> booleanList) {
		this.booleanList = booleanList;
	}

	public List<Date> getDateList() {
		return this.dateList;
	}
	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	public Long getNumExtValue() {
		return this.numExtValue;
	}
	public void setNumExtValue(Long numExtValue) {
		this.numExtValue = numExtValue;
	}

	public Long getNumMust() {
		return this.numMust;
	}
	public void setNumMust(Long numMust) {
		this.numMust = numMust;
	}

	public List<Long> getNumMustList() {
		return this.numMustList;
	}
	public void setNumMustList(List<Long> numMustList) {
		this.numMustList = numMustList;
	}

	public Long getNumOptional() {
		return this.numOptional;
	}
	public void setNumOptional(Long numOptional) {
		this.numOptional = numOptional;
	}

	public List<Long> getNumOptionalList() {
		return this.numOptionalList;
	}
	public void setNumOptionalList(List<Long> numOptionalList) {
		this.numOptionalList = numOptionalList;
	}

	public String getPriceExatValue() {
		return this.priceExatValue;
	}
	public void setPriceExatValue(String priceExatValue) {
		this.priceExatValue = priceExatValue;
	}

	public String getPriceMust() {
		return this.priceMust;
	}
	public void setPriceMust(String priceMust) {
		this.priceMust = priceMust;
	}

	public List<String> getPriceMustList() {
		return this.priceMustList;
	}
	public void setPriceMustList(List<String> priceMustList) {
		this.priceMustList = priceMustList;
	}

	public String getPriceOptional() {
		return this.priceOptional;
	}
	public void setPriceOptional(String priceOptional) {
		this.priceOptional = priceOptional;
	}

	public List<String> getPriceOptionalList() {
		return this.priceOptionalList;
	}
	public void setPriceOptionalList(List<String> priceOptionalList) {
		this.priceOptionalList = priceOptionalList;
	}

	public String getStringEnum() {
		return this.stringEnum;
	}
	public void setStringEnum(String stringEnum) {
		this.stringEnum = stringEnum;
	}

	public String getStringMust() {
		return this.stringMust;
	}
	public void setStringMust(String stringMust) {
		this.stringMust = stringMust;
	}

	public List<String> getStringMustList() {
		return this.stringMustList;
	}
	public void setStringMustList(List<String> stringMustList) {
		this.stringMustList = stringMustList;
	}

	public String getStringOptional() {
		return this.stringOptional;
	}
	public void setStringOptional(String stringOptional) {
		this.stringOptional = stringOptional;
	}

	public List<String> getStringOptionalList() {
		return this.stringOptionalList;
	}
	public void setStringOptionalList(List<String> stringOptionalList) {
		this.stringOptionalList = stringOptionalList;
	}

	public String getStringPattern() {
		return this.stringPattern;
	}
	public void setStringPattern(String stringPattern) {
		this.stringPattern = stringPattern;
	}

}
