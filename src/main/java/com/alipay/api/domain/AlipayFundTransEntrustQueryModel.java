package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托代收付查询接口
 *
 * @author auto create
 * @since 1.0, 2020-06-04 21:00:10
 */
public class AlipayFundTransEntrustQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8468653229621757474L;

	/**
	 * 描述特定的业务场景，如果传递了out_biz_no则该字段为必传。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 该笔委托支付在支付宝系统内部的单据ID，本参数和商户委托支付单据号不能同时为空
	 */
	@ApiField("entrust_order_id")
	private String entrustOrderId;

	/**
	 * 商户委托支付唯一订单号：发起委托支付来源方定义的单据ID。 本参数和支付宝委托单号不能同时为空。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEntrustOrderId() {
		return this.entrustOrderId;
	}
	public void setEntrustOrderId(String entrustOrderId) {
		this.entrustOrderId = entrustOrderId;
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
