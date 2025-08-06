package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型接口测试22_N选一与openid映射
 *
 * @author auto create
 * @since 1.0, 2025-04-02 17:57:30
 */
public class AlipayDataDataserviceSchematwentysecondRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8714193376519744145L;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("demo_boolean")
	private Boolean demoBoolean;

	/**
	 * 测试数据
	 */
	@ApiField("demo_case")
	private String demoCase;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("demo_date")
	private Date demoDate;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("demo_num")
	private Long demoNum;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("demo_price")
	private String demoPrice;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("demo_string")
	private String demoString;

	/**
	 * TEST DATA
	 */
	@ApiField("first_wink_ref")
	private RainyComplexTypesRefWeakFourth firstWinkRef;

	/**
	 * 强引用
	 */
	@ApiField("firstlevel_ref")
	private RainyComplexTypesTheFourth firstlevelRef;

	/**
	 * 第一层的N选一
	 */
	@ApiField("firstlevel_string_1")
	private String firstlevelString1;

	/**
	 * 第一层的openID数据
	 */
	@ApiField("firstlevel_string_1_open_id")
	private String firstlevelString1OpenId;

	/**
	 * 第一层的N选一
	 */
	@ApiField("firstlevel_string_2")
	private String firstlevelString2;

	/**
	 * 第一层的N选一
	 */
	@ApiField("firstlevel_string_2_open_id")
	private String firstlevelString2OpenId;

	public Boolean getDemoBoolean() {
		return this.demoBoolean;
	}
	public void setDemoBoolean(Boolean demoBoolean) {
		this.demoBoolean = demoBoolean;
	}

	public String getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}

	public Date getDemoDate() {
		return this.demoDate;
	}
	public void setDemoDate(Date demoDate) {
		this.demoDate = demoDate;
	}

	public Long getDemoNum() {
		return this.demoNum;
	}
	public void setDemoNum(Long demoNum) {
		this.demoNum = demoNum;
	}

	public String getDemoPrice() {
		return this.demoPrice;
	}
	public void setDemoPrice(String demoPrice) {
		this.demoPrice = demoPrice;
	}

	public String getDemoString() {
		return this.demoString;
	}
	public void setDemoString(String demoString) {
		this.demoString = demoString;
	}

	public RainyComplexTypesRefWeakFourth getFirstWinkRef() {
		return this.firstWinkRef;
	}
	public void setFirstWinkRef(RainyComplexTypesRefWeakFourth firstWinkRef) {
		this.firstWinkRef = firstWinkRef;
	}

	public RainyComplexTypesTheFourth getFirstlevelRef() {
		return this.firstlevelRef;
	}
	public void setFirstlevelRef(RainyComplexTypesTheFourth firstlevelRef) {
		this.firstlevelRef = firstlevelRef;
	}

	public String getFirstlevelString1() {
		return this.firstlevelString1;
	}
	public void setFirstlevelString1(String firstlevelString1) {
		this.firstlevelString1 = firstlevelString1;
	}

	public String getFirstlevelString1OpenId() {
		return this.firstlevelString1OpenId;
	}
	public void setFirstlevelString1OpenId(String firstlevelString1OpenId) {
		this.firstlevelString1OpenId = firstlevelString1OpenId;
	}

	public String getFirstlevelString2() {
		return this.firstlevelString2;
	}
	public void setFirstlevelString2(String firstlevelString2) {
		this.firstlevelString2 = firstlevelString2;
	}

	public String getFirstlevelString2OpenId() {
		return this.firstlevelString2OpenId;
	}
	public void setFirstlevelString2OpenId(String firstlevelString2OpenId) {
		this.firstlevelString2OpenId = firstlevelString2OpenId;
	}

}
