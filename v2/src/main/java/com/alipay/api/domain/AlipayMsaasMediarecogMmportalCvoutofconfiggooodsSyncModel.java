package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业同步的配置外商品
 *
 * @author auto create
 * @since 1.0, 2024-03-28 09:59:47
 */
public class AlipayMsaasMediarecogMmportalCvoutofconfiggooodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5482572691487848581L;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 配置外商品数组
	 */
	@ApiListField("out_of_config_goods")
	@ApiField("out_of_config_goods_result")
	private List<OutOfConfigGoodsResult> outOfConfigGoods;

	/**
	 * 交易id
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public List<OutOfConfigGoodsResult> getOutOfConfigGoods() {
		return this.outOfConfigGoods;
	}
	public void setOutOfConfigGoods(List<OutOfConfigGoodsResult> outOfConfigGoods) {
		this.outOfConfigGoods = outOfConfigGoods;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
