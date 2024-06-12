package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 原始交易信息
 *
 * @author auto create
 * @since 1.0, 2018-05-02 15:06:25
 */
public class OriTxnInfo extends AlipayObject {

	private static final long serialVersionUID = 3745464368693186542L;

	/**
	 * 原始交易描述分类。

biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("category_type")
	private String categoryType;

	/**
	 * 原始交易描述分类值。

biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("category_value")
	private String categoryValue;

	/**
	 * 原始交易信息明细。格式：交易日期YYYYMMDD|商户交易订单号|交易币种|交易金额。

biz_scene=LOCAL时忽略该参数。
暂时无用参数, 请忽略.使用需要与支付宝沟通.
	 */
	@ApiField("txn_info")
	private String txnInfo;

	public String getCategoryType() {
		return this.categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getCategoryValue() {
		return this.categoryValue;
	}
	public void setCategoryValue(String categoryValue) {
		this.categoryValue = categoryValue;
	}

	public String getTxnInfo() {
		return this.txnInfo;
	}
	public void setTxnInfo(String txnInfo) {
		this.txnInfo = txnInfo;
	}

}
