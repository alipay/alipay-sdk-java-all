package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询消费者领券的活动列表
 *
 * @author auto create
 * @since 1.0, 2021-09-18 15:06:03
 */
public class AlipayMarketingCampaignPromotionactivityConsumerviewBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1156569893588965644L;

	/**
	 * 单品券场景下对应的goods_id,单次最多限制5个
	 */
	@ApiListField("goods_ids")
	@ApiField("string")
	private List<String> goodsIds;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 是否只查询当前ISV报名的活动
	 */
	@ApiField("only_current_isv")
	private Boolean onlyCurrentIsv;

	public List<String> getGoodsIds() {
		return this.goodsIds;
	}
	public void setGoodsIds(List<String> goodsIds) {
		this.goodsIds = goodsIds;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public Boolean getOnlyCurrentIsv() {
		return this.onlyCurrentIsv;
	}
	public void setOnlyCurrentIsv(Boolean onlyCurrentIsv) {
		this.onlyCurrentIsv = onlyCurrentIsv;
	}

}
