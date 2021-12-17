package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝订单信息同步接口
 *
 * @author auto create
 * @since 1.0, 2021-09-01 20:04:39
 */
public class AlipayTradeOrderinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1565351345549818735L;

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
适用场景：发起扣款后，芝麻生成待履约记录，如果用户通过其他方式完成订单支付，请反馈该状态，芝麻将完结待履约记录对用户形成一条良好履约记录；

CLOSED： 同步履约已取消
适用场景：发起扣款后，芝麻生成待履约记录，如果发现该笔扣款无效需要取消，请反馈该状态，芝麻将取消用户待履约记录；

VIOLATED： 用户已违约
适用场景：如果用户在约定时间（具体根据行业约定，有一定宽限期）内未完成订单支付，反馈该状态，芝麻将对用户记录一条负面记录，请谨慎使用；
	 */
	@ApiField("order_biz_info")
	private String orderBizInfo;

	/**
	 * 原始业务请求单号。如对某一次退款进行履约时，该字段传退款时的退款请求号
	 */
	@ApiField("orig_request_no")
	private String origRequestNo;

	/**
	 * 外部请求号，商家自定义。标识一笔交易多次请求，同一笔交易多次信息同步时需要保证唯一。
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
