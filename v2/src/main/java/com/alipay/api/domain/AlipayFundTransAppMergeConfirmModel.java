package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * app合并转账接口
 *
 * @author auto create
 * @since 1.0, 2020-09-01 11:07:10
 */
public class AlipayFundTransAppMergeConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6734562413112354367L;

	/**
	 * 业务场景。
DINGTALK_PERSONAL_PAY：钉钉个人付款
DINGTALK_MERCHANT_PAY：钉钉企业付款
DINGTALK_MERCHANT_COLLECTION：钉钉企业收款
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 合并转账的预下单id
	 */
	@ApiField("merge_order_id")
	private String mergeOrderId;

	/**
	 * 销售产品码。
STD_APP_TRANSFER：支付宝APP收银台转账
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
