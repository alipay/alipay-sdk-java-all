package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手动关单接口
 *
 * @author auto create
 * @since 1.0, 2024-06-25 17:59:17
 */
public class AlipayFundWalletOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7256762486679864246L;

	/**
	 * 下单时使用的bizscene
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 关单原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 下单生成的订单号
	 */
	@ApiField("fund_order_id")
	private String fundOrderId;

	/**
	 * 钱包产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getFundOrderId() {
		return this.fundOrderId;
	}
	public void setFundOrderId(String fundOrderId) {
		this.fundOrderId = fundOrderId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
