package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打标请求
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:51:44
 */
public class AddTagRequest extends AlipayObject {

	private static final long serialVersionUID = 6371371216119357731L;

	/**
	 * biz_id，唯一，业务id，用于业务请求的幂等标志
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 饿了么schainId
	 */
	@ApiField("schain_id")
	private String schainId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getSchainId() {
		return this.schainId;
	}
	public void setSchainId(String schainId) {
		this.schainId = schainId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
