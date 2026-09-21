package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-17 14:22:56
 */
public class ShopProductPriceModifyResult extends AlipayObject {

	private static final long serialVersionUID = 2725977897782547485L;

	/**
	 * 当前门店处理失败时返回的业务错误码。
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 当前门店处理失败的具体原因。
	 */
	@ApiField("error_reason")
	private String errorReason;

	/**
	 * 服务商请求中传入的外部门店 ID。
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 企业码内部的门店 ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorReason() {
		return this.errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public String getExternalShopId() {
		return this.externalShopId;
	}
	public void setExternalShopId(String externalShopId) {
		this.externalShopId = externalShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
