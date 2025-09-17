package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡回票事件主动查询
 *
 * @author auto create
 * @since 1.0, 2024-02-01 16:26:50
 */
public class AlipayFundMbpcardInvoiceprocessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6445426278947383988L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 回票处理外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 回票处理流程ID
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
