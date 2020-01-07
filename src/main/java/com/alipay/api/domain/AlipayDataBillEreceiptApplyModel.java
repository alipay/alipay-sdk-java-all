package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请电子签章
 *
 * @author auto create
 * @since 1.0, 2019-12-30 13:57:20
 */
public class AlipayDataBillEreceiptApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5288526439342242368L;

	/**
	 * 根据不同业务类型，传入不同参数。当前余额等无需参数的，不需要传入。日汇总传入格式：yyyy-MM-dd，月汇总传入格式：yyyy-MM。订单号直接传入。
支持批量查询：批量查询可将多个key半角逗号分割
	 */
	@ApiField("key")
	private String key;

	/**
	 * 申请的类型。可传入：ACCOUNT_LOG_SUM_DAILY - 日汇总收支证明，ACCOUNT_LOG_SUM_MONTHLY - 月汇总收支证明，BALANCE - 当前余额证明，BALANCE_HIS - 历史余额证明，BAIL - 保证金资产证明，SERVICE_FEE - 服务费回单，SETTLE - 结算单，ACCOUNT_LOG_DETAIL - 余额收支明细回单，TRADE_DETAIL - 卖出交易回单，FUND_DETAIL - 资金业务回单，BAIL_DETAIL - 保证金明细回单
	 */
	@ApiField("type")
	private String type;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
