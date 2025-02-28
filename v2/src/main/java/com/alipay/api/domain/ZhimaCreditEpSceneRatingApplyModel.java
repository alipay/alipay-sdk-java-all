package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用客户信用评估申请
 *
 * @author auto create
 * @since 1.0, 2019-04-19 13:53:57
 */
public class ZhimaCreditEpSceneRatingApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6853417867339282426L;

	/**
	 * 发起申请的环境，支持以下值：
PC：PC端浏览器,
ALIPAY_H5，支付宝移动端H5,
XIAOCHENGXU:支付宝小程序, 
MINIAPP:小程序JSAPI调用方式
默认ALIPAY_H5
	 */
	@ApiField("apply_environment")
	private String applyEnvironment;

	/**
	 * 芝麻企业信用评估订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getApplyEnvironment() {
		return this.applyEnvironment;
	}
	public void setApplyEnvironment(String applyEnvironment) {
		this.applyEnvironment = applyEnvironment;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
