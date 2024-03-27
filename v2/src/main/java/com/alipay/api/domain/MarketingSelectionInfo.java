package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单指定的营销信息
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:41:32
 */
public class MarketingSelectionInfo extends AlipayObject {

	private static final long serialVersionUID = 4194785432941879771L;

	/**
	 * 指定营销列表
	 */
	@ApiListField("selection_list")
	@ApiField("marketing_item_selection")
	private List<MarketingItemSelection> selectionList;

	/**
	 * 指定营销模式。AUTO:表示由系统决策最大优惠的模式。MANUAL:表示由外部指定的营销模式。模式为MANUAL时，指定营销券ID信息通过items_list传入，如果不传入表示不使用商户营销券（若有平台营销，仍然会返回）。若use_mode为空同时seleciont_list为空则表示不使用所有前置营销（包括商户营销券以及平台营销）
	 */
	@ApiField("use_mode")
	private String useMode;

	public List<MarketingItemSelection> getSelectionList() {
		return this.selectionList;
	}
	public void setSelectionList(List<MarketingItemSelection> selectionList) {
		this.selectionList = selectionList;
	}

	public String getUseMode() {
		return this.useMode;
	}
	public void setUseMode(String useMode) {
		this.useMode = useMode;
	}

}
