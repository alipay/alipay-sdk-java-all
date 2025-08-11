package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管资金划拨结果查询
 *
 * @author auto create
 * @since 1.0, 2024-06-28 09:58:18
 */
public class AlipayEbppIndustrySupervisionFundstransferQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 3837922547573497932L;

	/**
	 * 不同的业务场景下对应不同的业务规则
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 资金划拨请求接口或者退款接口返回的支付宝内部受理生成的流水单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/**
	 * 在商户发起退款、资金划拨操作时请求参数中的「外部流水号 out_trade_no 」
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOperateNo() {
		return this.operateNo;
	}
	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

}
