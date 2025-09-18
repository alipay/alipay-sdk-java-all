package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * LinkedMall商品删除同步网商
 *
 * @author auto create
 * @since 1.0, 2023-02-08 10:44:37
 */
public class MybankMarketingCampaignBkpromoguardbaseLmitemdeleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6632925855483635367L;

	/**
	 * biz_id + 非唯一 + LinkedMall商品删除同步场景 + 找接口提供方确认
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * item_id_list + 非唯一 + LinkedMall商品删除同步场景 + 调用方自行传递
	 */
	@ApiField("item_id_list")
	private LmDeleteItemList itemIdList;

	/**
	 * request_id + 唯一 + LinkedMall商品删除同步场景 + 调用方自行传递
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public LmDeleteItemList getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(LmDeleteItemList itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
