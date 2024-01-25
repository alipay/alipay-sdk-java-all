package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayOfflinePayMasterKey;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.key.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:25:13
 */
public class AlipayCommerceTransportOfflinepayKeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2538281431244237375L;

	/** 
	 * 支付宝脱机交易公钥列表。列表中每一项为一个有效的支付宝公钥信息, 其中id字段表示支付宝公钥id。
	 */
	@ApiListField("keys")
	@ApiField("alipay_offline_pay_master_key")
	private List<AlipayOfflinePayMasterKey> keys;

	public void setKeys(List<AlipayOfflinePayMasterKey> keys) {
		this.keys = keys;
	}
	public List<AlipayOfflinePayMasterKey> getKeys( ) {
		return this.keys;
	}

}
