package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询代商户报名的活动列表
 *
 * @author auto create
 * @since 1.0, 2021-09-18 15:05:03
 */
public class AlipayMarketingCampaignPromotionactivityMerchantviewBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1126331615917875356L;

	/**
	 * 查询过滤条件, 单品券goods_id. 
由于是列表, 单次限制最多5
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
	 * 是否只查询当前ISV代报名的活动
	 */
	@ApiField("only_current_isv")
	private Boolean onlyCurrentIsv;

	/**
	 * 分页器
	 */
	@ApiField("paginator")
	private Paginator paginator;

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

	public Paginator getPaginator() {
		return this.paginator;
	}
	public void setPaginator(Paginator paginator) {
		this.paginator = paginator;
	}

}
