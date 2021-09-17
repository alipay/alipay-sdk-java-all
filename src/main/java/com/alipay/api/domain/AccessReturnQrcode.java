package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商回传码物料对应的码值记录对象
 *
 * @author auto create
 * @since 1.0, 2018-09-25 11:42:39
 */
public class AccessReturnQrcode extends AlipayObject {

	private static final long serialVersionUID = 6381859991899262527L;

	/**
	 * 采购单ID
	 */
	@ApiField("asset_purchase_id")
	private String assetPurchaseId;

	/**
	 * 物流单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 外部单号（调用方业务主键）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 二维码token值
	 */
	@ApiField("qrcode")
	private String qrcode;

	public String getAssetPurchaseId() {
		return this.assetPurchaseId;
	}
	public void setAssetPurchaseId(String assetPurchaseId) {
		this.assetPurchaseId = assetPurchaseId;
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

	public String getQrcode() {
		return this.qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

}
