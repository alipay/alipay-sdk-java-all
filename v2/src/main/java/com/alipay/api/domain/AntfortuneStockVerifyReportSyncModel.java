package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证券财务核对结果同步
 *
 * @author auto create
 * @since 1.0, 2022-11-29 10:21:48
 */
public class AntfortuneStockVerifyReportSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1854692345897281593L;

	/**
	 * 核对记录列表
	 */
	@ApiListField("record_list")
	@ApiField("stock_verify_record")
	private List<StockVerifyRecord> recordList;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	public List<StockVerifyRecord> getRecordList() {
		return this.recordList;
	}
	public void setRecordList(List<StockVerifyRecord> recordList) {
		this.recordList = recordList;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

}
