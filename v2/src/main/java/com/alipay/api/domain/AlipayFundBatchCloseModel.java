package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批次关单接口
 *
 * @author auto create
 * @since 1.0, 2023-11-23 21:01:53
 */
public class AlipayFundBatchCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4746785427159643193L;

	/**
	 * 支付宝内部的批次ID： 本参数和商户的批次号两者不能同时为空。 当本参数和商户的批次号两者同时提供时，将优先用商户的批次号进行查询。
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

	/**
	 * 业务场景。不同场景值不同，具体值联系支付宝确认。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务产品码。不同产品值不同，具体值联系支付宝确认。
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBatchTransId() {
		return this.batchTransId;
	}
	public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
