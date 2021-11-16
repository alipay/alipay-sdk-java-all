package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 明细数据标签
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:29
 */
public class DataTag extends AlipayObject {

	private static final long serialVersionUID = 2385517122295388362L;

	/**
	 * 聚合方式NONE,COUNT,COUNT_DISTINCT,DISTINCT,MIN,MAX,SUM
	 */
	@ApiField("aggregate")
	private String aggregate;

	/**
	 * 列别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 标签CODE
	 */
	@ApiField("code")
	private String code;

	public String getAggregate() {
		return this.aggregate;
	}
	public void setAggregate(String aggregate) {
		this.aggregate = aggregate;
	}

	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
