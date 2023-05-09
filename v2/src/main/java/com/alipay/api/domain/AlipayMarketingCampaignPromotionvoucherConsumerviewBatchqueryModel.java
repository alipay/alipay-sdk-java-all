package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询消费者领取的券列表
 *
 * @author auto create
 * @since 1.0, 2021-09-18 15:11:28
 */
public class AlipayMarketingCampaignPromotionvoucherConsumerviewBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5276653726386192632L;

	/**
	 * 单品id列表, 单品券场景返回货品信息. 最大支持5个条形码
	 */
	@ApiListField("goods_ids")
	@ApiField("string")
	private List<String> goodsIds;

	/**
	 * 忽略不可用的券(已过期、已使用)
	 */
	@ApiField("ignore_disabled_voucher")
	private String ignoreDisabledVoucher;

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

	public String getIgnoreDisabledVoucher() {
		return this.ignoreDisabledVoucher;
	}
	public void setIgnoreDisabledVoucher(String ignoreDisabledVoucher) {
		this.ignoreDisabledVoucher = ignoreDisabledVoucher;
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
