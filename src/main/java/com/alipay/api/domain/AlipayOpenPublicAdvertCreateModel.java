package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号广告位添加接口
 *
 * @author auto create
 * @since 1.0, 2021-05-27 16:14:18
 */
public class AlipayOpenPublicAdvertCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7234491558186377628L;

	/**
	 *  广告位轮播内容列表。数量限制：大于1个，小于5个。广告位轮播内容顺序：与接口传入的顺序排列一致。
	 */
	@ApiListField("advert_items")
	@ApiField("advert_item")
	private List<AdvertItem> advertItems;

	public List<AdvertItem> getAdvertItems() {
		return this.advertItems;
	}
	public void setAdvertItems(List<AdvertItem> advertItems) {
		this.advertItems = advertItems;
	}

}
