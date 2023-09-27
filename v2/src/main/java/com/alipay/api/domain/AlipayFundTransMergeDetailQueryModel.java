package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合并支付订单查询
 *
 * @author auto create
 * @since 1.0, 2022-08-25 19:49:47
 */
public class AlipayFundTransMergeDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2549956882452916788L;

	/**
	 * 业务的场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝返回的合并单据主单号
	 */
	@ApiField("merge_order_id")
	private String mergeOrderId;

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

	public String getMergeOrderId() {
		return this.mergeOrderId;
	}
	public void setMergeOrderId(String mergeOrderId) {
		this.mergeOrderId = mergeOrderId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
