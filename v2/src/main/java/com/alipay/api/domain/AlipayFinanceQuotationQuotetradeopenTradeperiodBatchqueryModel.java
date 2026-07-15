package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询一段时间范围的交易时间段
 *
 * @author auto create
 * @since 1.0, 2026-07-01 11:57:57
 */
public class AlipayFinanceQuotationQuotetradeopenTradeperiodBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3254486963591986175L;

	/**
	 * 市场[_类型[_子类型]]. 如 SH, SH_ES, SH_ES_ASH
	 */
	@ApiField("mkt_type_subtype")
	private String mktTypeSubtype;

	/**
	 * 请求时间范围
	 */
	@ApiField("query_range")
	private TradingQueryRange queryRange;

	/**
	 * 是否包含交易时间段
	 */
	@ApiField("with_stages")
	private Boolean withStages;

	/**
	 * 是否包含非交易日
	 */
	@ApiField("with_untradings")
	private Boolean withUntradings;

	public String getMktTypeSubtype() {
		return this.mktTypeSubtype;
	}
	public void setMktTypeSubtype(String mktTypeSubtype) {
		this.mktTypeSubtype = mktTypeSubtype;
	}

	public TradingQueryRange getQueryRange() {
		return this.queryRange;
	}
	public void setQueryRange(TradingQueryRange queryRange) {
		this.queryRange = queryRange;
	}

	public Boolean getWithStages() {
		return this.withStages;
	}
	public void setWithStages(Boolean withStages) {
		this.withStages = withStages;
	}

	public Boolean getWithUntradings() {
		return this.withUntradings;
	}
	public void setWithUntradings(Boolean withUntradings) {
		this.withUntradings = withUntradings;
	}

}
