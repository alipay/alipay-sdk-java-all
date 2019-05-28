package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账业务单据查询接口
 *
 * @author auto create
 * @since 1.0, 2019-01-18 16:04:34
 */
public class AlipayFundTransCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1124138358334146562L;

	/**
	 * 描述特定的业务场景，比如对党费缴纳场景需走党费专户
如果传递了out_biz_no则该字段为必传
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝转账单据号：和商户转账唯一订单号不能同时为空。当和商户转账唯一订单号同时提供时，将用本参数进行查询，忽略商户转账唯一订单号。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户转账唯一订单号：发起转账来源方定义的转账单据ID。
和支付宝转账单据号不能同时为空。当和支付宝转账单据号同时提供时，将用支付宝转账单据号进行查询，忽略本参数。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码，商家和支付宝签约的产品码
如果传递了out_biz_no则该字段为必传
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
