package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于jsonschema校验的参数
 *
 * @author auto create
 * @since 1.0, 2023-06-08 21:04:50
 */
public class JsonParamDemo extends AlipayObject {

	private static final long serialVersionUID = 1684781436668145182L;

	/**
	 * 列表
	 */
	@ApiListField("array_param")
	@ApiField("string")
	private List<String> arrayParam;

	/**
	 * 布尔类型参数
	 */
	@ApiField("bool_param")
	private Boolean boolParam;

	/**
	 * 日期
	 */
	@ApiField("date_param")
	private Date dateParam;

	/**
	 * 时间戳格式
	 */
	@ApiField("datetime")
	private String datetime;

	/**
	 * 数字类型参数
	 */
	@ApiField("num_param")
	private Long numParam;

	/**
	 * 金额
	 */
	@ApiField("price")
	private String price;

	public List<String> getArrayParam() {
		return this.arrayParam;
	}
	public void setArrayParam(List<String> arrayParam) {
		this.arrayParam = arrayParam;
	}

	public Boolean getBoolParam() {
		return this.boolParam;
	}
	public void setBoolParam(Boolean boolParam) {
		this.boolParam = boolParam;
	}

	public Date getDateParam() {
		return this.dateParam;
	}
	public void setDateParam(Date dateParam) {
		this.dateParam = dateParam;
	}

	public String getDatetime() {
		return this.datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public Long getNumParam() {
		return this.numParam;
	}
	public void setNumParam(Long numParam) {
		this.numParam = numParam;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
