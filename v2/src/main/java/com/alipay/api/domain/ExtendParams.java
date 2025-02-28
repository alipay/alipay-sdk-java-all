package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2024-10-28 16:11:53
 */
public class ExtendParams extends AlipayObject {

	private static final long serialVersionUID = 8871628787565165783L;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 信用参数，可选，如有需要请与芝麻约定后传入，信用服务说明见
	 */
	@ApiField("credit_ext_info")
	private String creditExtInfo;

	/**
	 * 使用花呗分期要进行的分期数
	 */
	@ApiField("hb_fq_num")
	private String hbFqNum;

	/**
	 * 使用花呗分期需要卖家承担的手续费比例的百分值，传入100代表100%
	 */
	@ApiField("hb_fq_seller_percent")
	private String hbFqSellerPercent;

	/**
	 * 行业数据回流信息, 详见：地铁支付接口参数补充说明
	 */
	@ApiField("industry_reflux_info")
	private String industryRefluxInfo;

	/**
	 * 是否进行资金冻结，用于后续分账，true表示资金冻结，false或不传表示资金不冻结
	 */
	@ApiField("royalty_freeze")
	private String royaltyFreeze;

	/**
	 * 特殊场景下，允许商户指定交易展示的卖家名称
	 */
	@ApiField("specified_seller_name")
	private String specifiedSellerName;

	/**
	 * 系统商编号
该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	/**
	 * 公域商品交易分期单ID，小程序交易组件订单特殊场景使用，请传入 订单分期接口(alipay.open.mini.order.installment.create)中返回的installment_order_id
	 */
	@ApiField("tc_installment_order_id")
	private String tcInstallmentOrderId;

	/**
	 * 公域商品交易业务订单ID
	 */
	@ApiField("trade_component_order_id")
	private String tradeComponentOrderId;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCreditExtInfo() {
		return this.creditExtInfo;
	}
	public void setCreditExtInfo(String creditExtInfo) {
		this.creditExtInfo = creditExtInfo;
	}

	public String getHbFqNum() {
		return this.hbFqNum;
	}
	public void setHbFqNum(String hbFqNum) {
		this.hbFqNum = hbFqNum;
	}

	public String getHbFqSellerPercent() {
		return this.hbFqSellerPercent;
	}
	public void setHbFqSellerPercent(String hbFqSellerPercent) {
		this.hbFqSellerPercent = hbFqSellerPercent;
	}

	public String getIndustryRefluxInfo() {
		return this.industryRefluxInfo;
	}
	public void setIndustryRefluxInfo(String industryRefluxInfo) {
		this.industryRefluxInfo = industryRefluxInfo;
	}

	public String getRoyaltyFreeze() {
		return this.royaltyFreeze;
	}
	public void setRoyaltyFreeze(String royaltyFreeze) {
		this.royaltyFreeze = royaltyFreeze;
	}

	public String getSpecifiedSellerName() {
		return this.specifiedSellerName;
	}
	public void setSpecifiedSellerName(String specifiedSellerName) {
		this.specifiedSellerName = specifiedSellerName;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

	public String getTcInstallmentOrderId() {
		return this.tcInstallmentOrderId;
	}
	public void setTcInstallmentOrderId(String tcInstallmentOrderId) {
		this.tcInstallmentOrderId = tcInstallmentOrderId;
	}

	public String getTradeComponentOrderId() {
		return this.tradeComponentOrderId;
	}
	public void setTradeComponentOrderId(String tradeComponentOrderId) {
		this.tradeComponentOrderId = tradeComponentOrderId;
	}

}
