package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批次关单接口
 *
 * @author auto create
 * @since 1.0, 2022-02-08 11:06:45
 */
public class AlipayFundBatchCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6185916595827839171L;

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
	@ApiListField("product_code")
	@ApiField("string")
	private List<String> productCode;

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

	public List<String> getProductCode() {
		return this.productCode;
	}
	public void setProductCode(List<String> productCode) {
		this.productCode = productCode;
	}

}
