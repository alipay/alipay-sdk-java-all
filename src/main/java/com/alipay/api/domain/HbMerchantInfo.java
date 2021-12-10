package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期贴息商户信息模型
 *
 * @author auto create
 * @since 1.0, 2020-07-22 13:50:28
 */
public class HbMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 7291597981642767468L;

	/**
	 * 描述收单模式，目前取值有 直联/间联/境外
	 */
	@ApiField("acquire_mode")
	private String acquireMode;

	/**
	 * 用于区分店铺的粒度，取值 有 PID/SMID/PID_MID/PID_MID_SID/PID_ORGID 等
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 原始ID拼接串，根据粒度的不同，最多4个ID的拼接
	 */
	@ApiField("origin_config_info")
	private String originConfigInfo;

	public String getAcquireMode() {
		return this.acquireMode;
	}
	public void setAcquireMode(String acquireMode) {
		this.acquireMode = acquireMode;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getOriginConfigInfo() {
		return this.originConfigInfo;
	}
	public void setOriginConfigInfo(String originConfigInfo) {
		this.originConfigInfo = originConfigInfo;
	}

}
