package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * LinkedMall商品修改同步网商
 *
 * @author auto create
 * @since 1.0, 2023-02-08 10:44:33
 */
public class MybankMarketingCampaignBkpromoguardbaseLmitemmodifySyncModel extends AlipayObject {

	private static final long serialVersionUID = 8151828876114746571L;

	/**
	 * biz_id + 非唯一 + LinkedMall商品修改同步场景 + 找接口提供方确认
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * [{"canSell":true,"extJson":"{}","gmtModified":1670815972000,"itemId":626115945162,"lmItemId":"10023281-626115945162","skuList":[{"canSell":true,"points":0,"pointsAmount":0,"priceCent":60000,"skuId":4949323750970}]}]
	 */
	@ApiListField("item_list")
	@ApiField("lm_modify_item_list")
	private List<LmModifyItemList> itemList;

	/**
	 * request_id + 唯一 + LinkedMall商品修改同步场景 + 调用方自行传递
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<LmModifyItemList> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<LmModifyItemList> itemList) {
		this.itemList = itemList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
