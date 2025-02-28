package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广计划停止
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:47:28
 */
public class AlipayCommerceOperationIotnspoperationDeliveryStopModel extends AlipayObject {

	private static final long serialVersionUID = 3171564115885698778L;

	/**
	 * 枚举值：
·SELF_MODE 商户自接入模式
·AGENCY_MODE 服务商代接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 碰一下推广计划id
	 */
	@ApiField("n_delivery_id")
	private String nDeliveryId;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用：请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getnDeliveryId() {
		return this.nDeliveryId;
	}
	public void setnDeliveryId(String nDeliveryId) {
		this.nDeliveryId = nDeliveryId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
