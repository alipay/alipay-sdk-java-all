package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商回传码值处理结果对象
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:41:52
 */
public class AccessReturnQrcodeResult extends AlipayObject {

	private static final long serialVersionUID = 2498647424823812992L;

	/**
	 * 采购单ID
	 */
	@ApiField("asset_purchase_id")
	private String assetPurchaseId;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

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

	/**
	 * 处理结果（成功或失败）
	 */
	@ApiField("success")
	private Boolean success;

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

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
