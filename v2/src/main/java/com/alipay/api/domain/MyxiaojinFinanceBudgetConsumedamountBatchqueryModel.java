package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消金根据bizUkId查询占用金额
 *
 * @author auto create
 * @since 1.0, 2023-01-13 14:37:10
 */
public class MyxiaojinFinanceBudgetConsumedamountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6687218985851888648L;

	/**
	 * 业务活动唯一id集合
	 */
	@ApiListField("biz_uk_ids")
	@ApiField("string")
	private List<String> bizUkIds;

	/**
	 * nameSpace PURCHASE
	 */
	@ApiField("ns")
	private String ns;

	public List<String> getBizUkIds() {
		return this.bizUkIds;
	}
	public void setBizUkIds(List<String> bizUkIds) {
		this.bizUkIds = bizUkIds;
	}

	public String getNs() {
		return this.ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}

}
