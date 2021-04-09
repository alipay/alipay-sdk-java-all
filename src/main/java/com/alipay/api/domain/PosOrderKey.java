package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单外部主键信息
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:28:54
 */
public class PosOrderKey extends AlipayObject {

	private static final long serialVersionUID = 3896962382982569524L;

	/**
	 * pos设备序列号
	 */
	@ApiField("dv_sn")
	private String dvSn;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 订单版本号
	 */
	@ApiField("order_version")
	private Long orderVersion;

	/**
	 * pos本地的订单号,同一个商户下唯一标识一笔订单的编号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getDvSn() {
		return this.dvSn;
	}
	public void setDvSn(String dvSn) {
		this.dvSn = dvSn;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Long getOrderVersion() {
		return this.orderVersion;
	}
	public void setOrderVersion(Long orderVersion) {
		this.orderVersion = orderVersion;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
