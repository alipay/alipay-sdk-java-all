package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户向设备提交信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 14:53:35
 */
public class AlipayPayDeviceNlinkMerchantSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1377816565929598884L;

	/**
	 * 业务code
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 商户提交业务数据
	 */
	@ApiField("merchant_content")
	private MerchantContent merchantContent;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 子业务code
	 */
	@ApiField("sub_biz_code")
	private String subBizCode;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public MerchantContent getMerchantContent() {
		return this.merchantContent;
	}
	public void setMerchantContent(MerchantContent merchantContent) {
		this.merchantContent = merchantContent;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSubBizCode() {
		return this.subBizCode;
	}
	public void setSubBizCode(String subBizCode) {
		this.subBizCode = subBizCode;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
