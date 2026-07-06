package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资金信息全集
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:31:37
 */
public class RecycleOrderFundAllVO extends AlipayObject {

	private static final long serialVersionUID = 4842963485898355239L;

	/**
	 * 支付信息
	 */
	@ApiField("order_pay_info")
	private RecycleOrderPayInfoVO orderPayInfo;

	/**
	 * 品牌膨胀金信息
	 */
	@ApiField("order_subsidy_info")
	private RecycleStdOrderFundSubSidyVO orderSubsidyInfo;

	/**
	 * 分账资金信息
	 */
	@ApiListField("royalty_infos")
	@ApiField("recycle_order_royalty_info_v_o")
	private List<RecycleOrderRoyaltyInfoVO> royaltyInfos;

	public RecycleOrderPayInfoVO getOrderPayInfo() {
		return this.orderPayInfo;
	}
	public void setOrderPayInfo(RecycleOrderPayInfoVO orderPayInfo) {
		this.orderPayInfo = orderPayInfo;
	}

	public RecycleStdOrderFundSubSidyVO getOrderSubsidyInfo() {
		return this.orderSubsidyInfo;
	}
	public void setOrderSubsidyInfo(RecycleStdOrderFundSubSidyVO orderSubsidyInfo) {
		this.orderSubsidyInfo = orderSubsidyInfo;
	}

	public List<RecycleOrderRoyaltyInfoVO> getRoyaltyInfos() {
		return this.royaltyInfos;
	}
	public void setRoyaltyInfos(List<RecycleOrderRoyaltyInfoVO> royaltyInfos) {
		this.royaltyInfos = royaltyInfos;
	}

}
