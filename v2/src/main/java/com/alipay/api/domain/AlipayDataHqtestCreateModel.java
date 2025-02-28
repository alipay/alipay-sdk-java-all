package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 接口无参数升级验证
 *
 * @author auto create
 * @since 1.0, 2025-02-05 17:08:38
 */
public class AlipayDataHqtestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4491261772335277278L;

	/**
	 * 测试布尔
	 */
	@ApiField("bool")
	private Boolean bool;

	/**
	 * 布尔类型测试
	 */
	@ApiListField("bool_arr")
	@ApiField("boolean")
	private List<Boolean> boolArr;

	/**
	 * 测试日期
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 测试日期数组
	 */
	@ApiListField("date_arr")
	@ApiField("date")
	private List<Date> dateArr;

	/**
	 * 测试
	 */
	@ApiField("test")
	private String test;

	/**
	 * s啊撒撒撒
	 */
	@ApiField("total")
	private String total;

	public Boolean getBool() {
		return this.bool;
	}
	public void setBool(Boolean bool) {
		this.bool = bool;
	}

	public List<Boolean> getBoolArr() {
		return this.boolArr;
	}
	public void setBoolArr(List<Boolean> boolArr) {
		this.boolArr = boolArr;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public List<Date> getDateArr() {
		return this.dateArr;
	}
	public void setDateArr(List<Date> dateArr) {
		this.dateArr = dateArr;
	}

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

	public String getTotal() {
		return this.total;
	}
	public void setTotal(String total) {
		this.total = total;
	}

}
