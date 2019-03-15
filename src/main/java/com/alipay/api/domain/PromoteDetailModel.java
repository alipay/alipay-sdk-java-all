package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客商品推广汇总数据
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:27
 */
public class PromoteDetailModel extends AlipayObject {

	private static final long serialVersionUID = 1492797469667623287L;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 标的业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型（目前只支持ITEM）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 推广标的商品信息
	 */
	@ApiField("item_info")
	private PromoteItemModel itemInfo;

	/**
	 * 推广数据
	 */
	@ApiField("promote_data")
	private PromoteDataModel promoteData;

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public PromoteItemModel getItemInfo() {
		return this.itemInfo;
	}
	public void setItemInfo(PromoteItemModel itemInfo) {
		this.itemInfo = itemInfo;
	}

	public PromoteDataModel getPromoteData() {
		return this.promoteData;
	}
	public void setPromoteData(PromoteDataModel promoteData) {
		this.promoteData = promoteData;
	}

}
