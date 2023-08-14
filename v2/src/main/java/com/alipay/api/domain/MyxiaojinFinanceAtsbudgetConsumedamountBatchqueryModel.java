package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ats消金根据bizUkId查询占用金额
 *
 * @author auto create
 * @since 1.0, 2023-04-11 09:42:33
 */
public class MyxiaojinFinanceAtsbudgetConsumedamountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2751954471258421112L;

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
