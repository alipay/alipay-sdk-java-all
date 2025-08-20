package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝订单信息同步接口
 *
 * @author auto create
 * @since 1.0, 2024-01-15 17:12:32
 */
public class AlipayTradeOrderinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4526119824399412426L;

	/**
	 * 交易信息同步对应的业务类型，具体值与支付宝约定；
信用授权场景下传CREDIT_AUTH
信用代扣场景下传CREDIT_DEDUCT
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户传入同步信息，具体值要和支付宝约定；用于芝麻信用租车、单次授权等信息同步场景，格式为json格式。
状态枚举如下：

COMPLETE：同步用户已履约
适用场景：发起扣款后，芝麻生成待履约记录，如果用户通过其他方式完成订单支付，请反馈该状态，芝麻将完结待履约记录对用户形成一条良好履约记录；同步该状态时需要同步调用 取消扣款 接口关闭交易订单。

CLOSED： 同步履约已取消
适用场景：发起扣款后，芝麻生成待履约记录，如果发现该笔扣款无效需要取消，请反馈该状态，芝麻将取消用户待履约记录；同步该状态时需要同步调用 取消扣款 接口关闭交易订单。
	 */
	@ApiField("order_biz_info")
	private String orderBizInfo;

	/**
	 * 原始业务请求单号。如对某一次退款进行履约时，该字段传退款时的退款请求号
	 */
	@ApiField("orig_request_no")
	private String origRequestNo;

	/**
	 * 外部请求号，商家自定义且保证商家系统中唯一。需要注意的是，支付宝会对外部请求号做幂等控制，如果一笔交易再次使用相同的外部请求号发起请求，订单信息不会更新。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOrderBizInfo() {
		return this.orderBizInfo;
	}
	public void setOrderBizInfo(String orderBizInfo) {
		this.orderBizInfo = orderBizInfo;
	}

	public String getOrigRequestNo() {
		return this.origRequestNo;
	}
	public void setOrigRequestNo(String origRequestNo) {
		this.origRequestNo = origRequestNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
