package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个数据模型
 *
 * @author auto create
 * @since 1.0, 2017-08-10 16:22:11
 */
public class DataEntry extends AlipayObject {

	private static final long serialVersionUID = 8313935228215931743L;

	/**
	 * 数据的发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 数据名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于指定数据的类型
数值类型：Long（整型）、Double（浮点型）、Average（取平均，浮点型）；
枚举类型（用于分布表格）：Enum；
比率类型（用于比率类平均）：Rate
	 */
	@ApiField("type")
	private String type;

	/**
	 * 数据值。内容和type参数对应。
支持一组数据的json表达，比如：[“E1”,"E2"]，[“2”,"1"]。
枚举类支持下面简写方式：[“E1*99”,"E2*35"]，即E1出现99次，E2出现35次。中间用“*”分隔。
	 */
	@ApiField("value")
	private String value;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
