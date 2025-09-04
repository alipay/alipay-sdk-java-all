package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻go商户数据回传金额类型数据模型
 *
 * @author auto create
 * @since 1.0, 2020-09-03 14:58:57
 */
public class AmountTypeData extends AlipayObject {

	private static final long serialVersionUID = 7582826794742365266L;

	/**
	 * 累计类型为金额类型的累计名称。为必传入参。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 优惠信息。为List类型，支持传入多笔优惠，大部分场景传入一笔。包含：优惠名称，优惠类型，优惠金额（单位元）。
字段必传场景：
1.当累计模式为【交易绑定模式】时，为必传入参。
2.当累计模式为【交易解耦模式】，同时需要累计优惠信息时，为必传入参。
	 */
	@ApiListField("out_discount_infos")
	@ApiField("z_m_go_out_discount_info")
	private List<ZMGoOutDiscountInfo> outDiscountInfos;

	/**
	 * 交易信息。包含：交易号，交易金额。
字段必传场景：
1.当累计模式为【交易绑定模式】时，为必传入参。
2.当累计模式为【交易解耦模式】，同时需要累计交易信息时，为必传入参。
	 */
	@ApiField("trade_info")
	private ZMGoTradeInfo tradeInfo;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<ZMGoOutDiscountInfo> getOutDiscountInfos() {
		return this.outDiscountInfos;
	}
	public void setOutDiscountInfos(List<ZMGoOutDiscountInfo> outDiscountInfos) {
		this.outDiscountInfos = outDiscountInfos;
	}

	public ZMGoTradeInfo getTradeInfo() {
		return this.tradeInfo;
	}
	public void setTradeInfo(ZMGoTradeInfo tradeInfo) {
		this.tradeInfo = tradeInfo;
	}

}
