package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RainyTheTwiceComplexTestAllList;
import com.alipay.api.domain.RainyTheTwiceComplexTestAll;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaprodfirst.rainys.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-18 15:07:17
 */
public class AlipayDataDataserviceSchemaprodfirstRainysQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3842192539744138329L;

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

	public void setBoolListMust(List<Boolean> boolListMust) {
		this.boolListMust = boolListMust;
	}
	public List<Boolean> getBoolListMust( ) {
		return this.boolListMust;
	}

	public void setBoolMust(Boolean boolMust) {
		this.boolMust = boolMust;
	}
	public Boolean getBoolMust( ) {
		return this.boolMust;
	}

	public void setBooleanListOptional(List<Boolean> booleanListOptional) {
		this.booleanListOptional = booleanListOptional;
	}
	public List<Boolean> getBooleanListOptional( ) {
		return this.booleanListOptional;
	}

	public void setBooleanOptional(Boolean booleanOptional) {
		this.booleanOptional = booleanOptional;
	}
	public Boolean getBooleanOptional( ) {
		return this.booleanOptional;
	}

	public void setComplexListMust(List<RainyTheTwiceComplexTestAllList> complexListMust) {
		this.complexListMust = complexListMust;
	}
	public List<RainyTheTwiceComplexTestAllList> getComplexListMust( ) {
		return this.complexListMust;
	}

	public void setComplexMust(RainyTheTwiceComplexTestAll complexMust) {
		this.complexMust = complexMust;
	}
	public RainyTheTwiceComplexTestAll getComplexMust( ) {
		return this.complexMust;
	}

	public void setDateListMust(List<Date> dateListMust) {
		this.dateListMust = dateListMust;
	}
	public List<Date> getDateListMust( ) {
		return this.dateListMust;
	}

	public void setDateMust(Date dateMust) {
		this.dateMust = dateMust;
	}
	public Date getDateMust( ) {
		return this.dateMust;
	}

	public void setNumListMust(List<Long> numListMust) {
		this.numListMust = numListMust;
	}
	public List<Long> getNumListMust( ) {
		return this.numListMust;
	}

	public void setNumMust(Long numMust) {
		this.numMust = numMust;
	}
	public Long getNumMust( ) {
		return this.numMust;
	}

	public void setNumberListOptional(List<Long> numberListOptional) {
		this.numberListOptional = numberListOptional;
	}
	public List<Long> getNumberListOptional( ) {
		return this.numberListOptional;
	}

	public void setNumberOptional(Long numberOptional) {
		this.numberOptional = numberOptional;
	}
	public Long getNumberOptional( ) {
		return this.numberOptional;
	}

	public void setPriceListMust(List<String> priceListMust) {
		this.priceListMust = priceListMust;
	}
	public List<String> getPriceListMust( ) {
		return this.priceListMust;
	}

	public void setPriceListOptional(List<String> priceListOptional) {
		this.priceListOptional = priceListOptional;
	}
	public List<String> getPriceListOptional( ) {
		return this.priceListOptional;
	}

	public void setPriceMust(String priceMust) {
		this.priceMust = priceMust;
	}
	public String getPriceMust( ) {
		return this.priceMust;
	}

	public void setPriceOptional(String priceOptional) {
		this.priceOptional = priceOptional;
	}
	public String getPriceOptional( ) {
		return this.priceOptional;
	}

	public void setStringListMust(List<String> stringListMust) {
		this.stringListMust = stringListMust;
	}
	public List<String> getStringListMust( ) {
		return this.stringListMust;
	}

	public void setStringListOptional(List<String> stringListOptional) {
		this.stringListOptional = stringListOptional;
	}
	public List<String> getStringListOptional( ) {
		return this.stringListOptional;
	}

	public void setStringMust(String stringMust) {
		this.stringMust = stringMust;
	}
	public String getStringMust( ) {
		return this.stringMust;
	}

	public void setStringOptional(String stringOptional) {
		this.stringOptional = stringOptional;
	}
	public String getStringOptional( ) {
		return this.stringOptional;
	}

	public void setStringRegexIp(String stringRegexIp) {
		this.stringRegexIp = stringRegexIp;
	}
	public String getStringRegexIp( ) {
		return this.stringRegexIp;
	}

	public void setStringRegexNum(String stringRegexNum) {
		this.stringRegexNum = stringRegexNum;
	}
	public String getStringRegexNum( ) {
		return this.stringRegexNum;
	}

}
