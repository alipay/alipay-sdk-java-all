package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商业订单营销信息
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:42:43
 */
public class MarketingInfo extends AlipayObject {

	private static final long serialVersionUID = 8373478224833352355L;

	/**
	 * 营销明细
	 */
	@ApiListField("promotion_list")
	@ApiField("promotion_detail")
	private List<PromotionDetail> promotionList;

	/**
	 * 总的营销金额，包括金本位和非金本位。该金额为所有promotion_list的金额总额。单位为元，精确到小数点后两位，取值范围[0.01,100000000]。返回promotion_list时，该字段不为空
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 订单营销的使用模式。该参数的值与商户入参中的制定营销use_mode一致
	 */
	@ApiField("use_mode")
	private String useMode;

	public List<PromotionDetail> getPromotionList() {
		return this.promotionList;
	}
	public void setPromotionList(List<PromotionDetail> promotionList) {
		this.promotionList = promotionList;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUseMode() {
		return this.useMode;
	}
	public void setUseMode(String useMode) {
		this.useMode = useMode;
	}

}
