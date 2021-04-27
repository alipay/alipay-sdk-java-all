package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 吃呗额度查询 返回数据类型
 *
 * @author auto create
 * @since 1.0, 2020-03-27 16:16:14
 */
public class TbapiQueryAmountResponse extends AlipayObject {

	private static final long serialVersionUID = 1536357246192648669L;

	/**
	 * 指定产品码额度
	 */
	@ApiField("amt_map")
	private String amtMap;

	/**
	 * 可用产品组额度
	 */
	@ApiField("available_group_amt")
	private String availableGroupAmt;

	public String getAmtMap() {
		return this.amtMap;
	}
	public void setAmtMap(String amtMap) {
		this.amtMap = amtMap;
	}

	public String getAvailableGroupAmt() {
		return this.availableGroupAmt;
	}
	public void setAvailableGroupAmt(String availableGroupAmt) {
		this.availableGroupAmt = availableGroupAmt;
	}

}
