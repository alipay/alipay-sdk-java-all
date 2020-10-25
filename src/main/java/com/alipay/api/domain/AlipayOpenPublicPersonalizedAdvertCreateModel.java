package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号个性化广告位添加接口
 *
 * @author auto create
 * @since 1.0, 2020-10-21 13:46:36
 */
public class AlipayOpenPublicPersonalizedAdvertCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4278712394464367985L;

	/**
	 * 广告位轮播内容列表，数量限制：大于1个，小于5个，广告位轮播内容顺序，根据接口传入的顺序排列
	 */
	@ApiListField("advert_items")
	@ApiField("advert_item")
	private List<AdvertItem> advertItems;

	/**
	 * 人群分组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 手机客户端类型，iphone、android、wp,不填为不区分机型
	 */
	@ApiField("mobile_client_type")
	private String mobileClientType;

	public List<AdvertItem> getAdvertItems() {
		return this.advertItems;
	}
	public void setAdvertItems(List<AdvertItem> advertItems) {
		this.advertItems = advertItems;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getMobileClientType() {
		return this.mobileClientType;
	}
	public void setMobileClientType(String mobileClientType) {
		this.mobileClientType = mobileClientType;
	}

}
