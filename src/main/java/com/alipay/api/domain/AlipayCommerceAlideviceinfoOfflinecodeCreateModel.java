package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具离线码创建
 *
 * @author auto create
 * @since 1.0, 2019-04-26 15:40:19
 */
public class AlipayCommerceAlideviceinfoOfflinecodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2635774321612467984L;

	/**
	 * 绑定标识
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 支付宝统一sdk获取的设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 业务场景，由支付宝定义
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 机具物料id，由支付宝分配
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 绑定商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 离线支付协议版本，与支付sdk协议版本保持一致
	 */
	@ApiField("protocol_version")
	private String protocolVersion;

	/**
	 * 设备sn号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商id，由支付宝分配
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProtocolVersion() {
		return this.protocolVersion;
	}
	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
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
