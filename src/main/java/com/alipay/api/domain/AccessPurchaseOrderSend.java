package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商同步的发货信息和物流信息对象
 *
 * @author auto create
 * @since 1.0, 2018-09-25 11:42:57
 */
public class AccessPurchaseOrderSend extends AlipayObject {

	private static final long serialVersionUID = 3128881891187112693L;

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
	 * 物流公司code
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("express_name")
	private String expressName;

	/**
	 * 物流单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 外部单号（供应商主键标识）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * PO单号
	 */
	@ApiField("po_no")
	private String poNo;

	/**
	 * 回传码值数量1000(不是码物料时为0)
	 */
	@ApiField("return_qrcode_count")
	private String returnQrcodeCount;

	/**
	 * 本次发货数量
	 */
	@ApiField("ship_count")
	private String shipCount;

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

	public String getExpressCode() {
		return this.expressCode;
	}
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

	public String getExpressName() {
		return this.expressName;
	}
	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPoNo() {
		return this.poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public String getReturnQrcodeCount() {
		return this.returnQrcodeCount;
	}
	public void setReturnQrcodeCount(String returnQrcodeCount) {
		this.returnQrcodeCount = returnQrcodeCount;
	}

	public String getShipCount() {
		return this.shipCount;
	}
	public void setShipCount(String shipCount) {
		this.shipCount = shipCount;
	}

}
