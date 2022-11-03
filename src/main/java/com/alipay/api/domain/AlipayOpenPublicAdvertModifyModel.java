package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号广告位修改接口
 *
 * @author auto create
 * @since 1.0, 2021-05-27 16:14:36
 */
public class AlipayOpenPublicAdvertModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7252266656831351181L;

	/**
	 * 广告位id，通过<a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.advert.create">alipay.open.public.advert.create</a>(生活号广告位添加接口)添加广告位获取。
	 */
	@ApiField("advert_id")
	private String advertId;

	/**
	 * 广告位轮播内容列表。数量限制：大于1个，小于5个。广告位轮播内容顺序：与接口传入的顺序排列一致。
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
