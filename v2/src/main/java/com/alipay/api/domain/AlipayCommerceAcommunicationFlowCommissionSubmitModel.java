package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量商品分佣信息提交接口
 *
 * @author auto create
 * @since 1.0, 2024-02-06 11:08:22
 */
public class AlipayCommerceAcommunicationFlowCommissionSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6887842916662595489L;

	/**
	 * 分佣单价，商品理论佣金单价，单位：元
	 */
	@ApiField("commission_price")
	private String commissionPrice;

	/**
	 * 支付宝分佣比例，枚举:
0:不分佣
0.3
0.4
1
当商品是商业化商品时该值只能为1
	 */
	@ApiField("commission_ratio")
	private String commissionRatio;

	/**
	 * 支付宝与机构之间的商品id映射码，需要包含关键信息：省份-运营商-面额
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 结算率，结算比例，0.5即50%比例
	 */
	@ApiField("settlement_ratio")
	private String settlementRatio;

	public String getCommissionPrice() {
		return this.commissionPrice;
	}
	public void setCommissionPrice(String commissionPrice) {
		this.commissionPrice = commissionPrice;
	}

	public String getCommissionRatio() {
		return this.commissionRatio;
	}
	public void setCommissionRatio(String commissionRatio) {
		this.commissionRatio = commissionRatio;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getSettlementRatio() {
		return this.settlementRatio;
	}
	public void setSettlementRatio(String settlementRatio) {
		this.settlementRatio = settlementRatio;
	}

}
