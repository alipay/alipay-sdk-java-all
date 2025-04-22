package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分佣结果查询
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:12:29
 */
public class AlipayFundAllocTransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2625159557946473645L;

	/**
	 * 场景码，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 分佣单号（与out_biz_no二选一）
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务单号（与order_id二选一）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码，默认值 TRANSFER_ALLOC
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
