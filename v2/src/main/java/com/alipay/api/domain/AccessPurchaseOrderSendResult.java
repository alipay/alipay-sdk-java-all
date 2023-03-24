package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商同步发货信息和物流信息处理完成结果对象
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:42:26
 */
public class AccessPurchaseOrderSendResult extends AlipayObject {

	private static final long serialVersionUID = 4635969221718891637L;

	/**
	 * 申请单明细号
	 */
	@ApiField("asset_item_id")
	private String assetItemId;

	/**
	 * 申请单号
	 */
	@ApiField("asset_order_id")
	private String assetOrderId;

	/**
	 * 采购单ID
	 */
	@ApiField("asset_purchase_id")
	private String assetPurchaseId;

	/**
	 * 错误CODE
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 外部单号（调用方业务主键标识）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 处理是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getAssetItemId() {
		return this.assetItemId;
	}
	public void setAssetItemId(String assetItemId) {
		this.assetItemId = assetItemId;
	}

	public String getAssetOrderId() {
		return this.assetOrderId;
	}
	public void setAssetOrderId(String assetOrderId) {
		this.assetOrderId = assetOrderId;
	}

	public String getAssetPurchaseId() {
		return this.assetPurchaseId;
	}
	public void setAssetPurchaseId(String assetPurchaseId) {
		this.assetPurchaseId = assetPurchaseId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
