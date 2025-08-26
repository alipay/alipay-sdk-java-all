package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商详优惠信息
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:29
 */
public class ItemDiscountDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5449128876739857372L;

	/**
	 * 是否可购买
	 */
	@ApiField("buy_restrict")
	private Boolean buyRestrict;

	/**
	 * sku列表优惠详情
	 */
	@ApiListField("consult_detail_info_list")
	@ApiField("promo_item_consult_detail_info")
	private List<PromoItemConsultDetailInfo> consultDetailInfoList;

	public Boolean getBuyRestrict() {
		return this.buyRestrict;
	}
	public void setBuyRestrict(Boolean buyRestrict) {
		this.buyRestrict = buyRestrict;
	}

	public List<PromoItemConsultDetailInfo> getConsultDetailInfoList() {
		return this.consultDetailInfoList;
	}
	public void setConsultDetailInfoList(List<PromoItemConsultDetailInfo> consultDetailInfoList) {
		this.consultDetailInfoList = consultDetailInfoList;
	}

}
