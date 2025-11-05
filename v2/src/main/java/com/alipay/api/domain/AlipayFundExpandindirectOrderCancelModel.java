package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金二级商户KYB代进件单取消接口
 *
 * @author auto create
 * @since 1.0, 2025-07-31 17:25:39
 */
public class AlipayFundExpandindirectOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6544569249616283835L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 进件单id（out_biz_no 和 order_id 其中一个不能为空）
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部单号（out_biz_no 和 order_id 其中一个不能为空）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
