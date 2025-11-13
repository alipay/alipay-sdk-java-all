package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销活动订单查询
 *
 * @author auto create
 * @since 1.0, 2023-02-28 17:26:58
 */
public class AnttechMorseMarketingRtaTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8794712716454779462L;

	/**
	 * 资源位信息确定商户投放场景，由摩斯同学配置并分配给调用方
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 支付宝交易号，用于摩斯与广告主对账，内容可以是银行流水交易号或者商户交易的唯一标识
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易类型，标识回调的类型，取值为英文，枚举值VERIFY[核销]和REFUND[退货]
如果交易类型为空，返回该订单的最近一条记录
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
