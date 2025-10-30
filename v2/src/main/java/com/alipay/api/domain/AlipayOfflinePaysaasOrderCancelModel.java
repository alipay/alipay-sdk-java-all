package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单取消
 *
 * @author auto create
 * @since 1.0, 2025-07-16 19:33:50
 */
public class AlipayOfflinePaysaasOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6465581439894677182L;

	/**
	 * 收款订单投送N手持设备ID
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 服务商外部单号,外部实际使用单号
	 */
	@ApiField("isv_out_order_no")
	private String isvOutOrderNo;

	/**
	 * 商家的直间连类型，按照商家类型，选择正确的枚举值。
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商 ID：supplierId，如意生态版AMX设备请填写“201901111100635561”
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getIsvOutOrderNo() {
		return this.isvOutOrderNo;
	}
	public void setIsvOutOrderNo(String isvOutOrderNo) {
		this.isvOutOrderNo = isvOutOrderNo;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
