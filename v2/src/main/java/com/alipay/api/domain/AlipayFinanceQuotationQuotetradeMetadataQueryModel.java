package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝行情元数据查询
 *
 * @author auto create
 * @since 1.0, 2024-07-18 14:48:28
 */
public class AlipayFinanceQuotationQuotetradeMetadataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2292726182211776726L;

	/**
	 * 业务查询条件（JSON格式），与业务类型对应。当biz_type为STOCK_SYMBOL_BATCH时，入参为symbol（格式code.market）列表，如
{"symbols":"600519.SH,002001.SZ"}。
当为STOCK_SYMBOL_COND时，入参为条件列表，如沪深股票{"market":"SH,SZ","type":"ES"}。
市场类型取值参考：https://yuque.antfin-inc.com/finquot/wvtttz/ta6dpn
	 */
	@ApiField("biz_query")
	private String bizQuery;

	/**
	 * 业务查询类型，STOCK_SYMBOL_BATCH：证券码表批查；STOCK_SYMBOL_COND：证券码表条件查询
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBizQuery() {
		return this.bizQuery;
	}
	public void setBizQuery(String bizQuery) {
		this.bizQuery = bizQuery;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
