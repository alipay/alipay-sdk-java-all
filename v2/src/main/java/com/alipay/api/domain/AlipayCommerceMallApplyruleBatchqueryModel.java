package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈商场付多门店适用业务规则批量查询
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:21:41
 */
public class AlipayCommerceMallApplyruleBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6134975235372263433L;

	/**
	 * 商圈mallid，由支付宝侧业务提供
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 指定值，由支付宝侧业务提供
	 */
	@ApiField("rule_scene")
	private String ruleScene;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRuleScene() {
		return this.ruleScene;
	}
	public void setRuleScene(String ruleScene) {
		this.ruleScene = ruleScene;
	}

}
