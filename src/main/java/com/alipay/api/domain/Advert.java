package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号广告位
 *
 * @author auto create
 * @since 1.0, 2020-09-28 10:41:55
 */
public class Advert extends AlipayObject {

	private static final long serialVersionUID = 4162463234889494918L;

	/**
	 * 广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	/**
	 * 广告位轮播内容列表
	 */
	@ApiListField("advert_items")
	@ApiField("advert_item")
	private List<AdvertItem> advertItems;

	public String getAdvertId() {
		return this.advertId;
	}
	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

	public List<AdvertItem> getAdvertItems() {
		return this.advertItems;
	}
	public void setAdvertItems(List<AdvertItem> advertItems) {
		this.advertItems = advertItems;
	}

}
