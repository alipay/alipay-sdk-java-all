package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管资金划拨结果查询
 *
 * @author auto create
 * @since 1.0, 2024-05-30 10:14:19
 */
public class AlipayEbppIndustrySupervisionFundstransferQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 5818938117275918646L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 资金划拨请求接口返回的操作单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/**
	 * 资金划拨请求传来的交易流水号
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
