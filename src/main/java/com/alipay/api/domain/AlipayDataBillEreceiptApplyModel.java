package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请电子签章
 *
 * @author auto create
 * @since 1.0, 2021-10-27 20:07:34
 */
public class AlipayDataBillEreceiptApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5319159111115728978L;

	/**
	 * 根据不同业务类型，传入不同参数。格式如下：
  * FUND_DETAIL - 资金业务回单。传入资金单号(fundOrderId，可通过充值、转账、提现接口获取)
	 */
	@ApiField("key")
	private String key;

	/**
	 * 申请的类型。可传入：
    * FUND_DETAIL - 资金业务回单。
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
