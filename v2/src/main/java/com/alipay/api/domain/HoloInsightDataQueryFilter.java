package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据过滤类型
 *
 * @author auto create
 * @since 1.0, 2023-11-02 14:29:54
 */
public class HoloInsightDataQueryFilter extends AlipayObject {

	private static final long serialVersionUID = 8242945973475674848L;

	/**
	 * 主机名字符串
	 */
	@ApiField("name")
	private String name;

	/**
	 * 等于
	 */
	@ApiField("type")
	private String type;

	/**
	 * 主机名为 test-host
	 */
	@ApiField("value")
	private String value;

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
