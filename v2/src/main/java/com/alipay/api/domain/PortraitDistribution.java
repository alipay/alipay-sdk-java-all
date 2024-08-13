package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分布数据
 *
 * @author auto create
 * @since 1.0, 2019-10-25 18:44:55
 */
public class PortraitDistribution extends AlipayObject {

	private static final long serialVersionUID = 8736692942915683147L;

	/**
	 * 分布段的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 该分布段的数量
	 */
	@ApiField("number")
	private String number;

	/**
	 * 该分布段的比例
	 */
	@ApiField("ratio")
	private String ratio;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

}
