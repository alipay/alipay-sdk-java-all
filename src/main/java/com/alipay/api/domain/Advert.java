package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号广告位
 *
 * @author auto create
 * @since 1.0, 2021-01-05 18:01:48
 */
public class Advert extends AlipayObject {

	private static final long serialVersionUID = 4711433371318777197L;

	/**
	 * 广告组标识
	 */
	@ApiField("advert_group")
	private String advertGroup;

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

	/**
	 * 投放人群分组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 手机客户端类型，iphone、android、wp,空为不区分机型
	 */
	@ApiField("mobile_client_type")
	private String mobileClientType;

	public String getAdvertGroup() {
		return this.advertGroup;
	}
	public void setAdvertGroup(String advertGroup) {
		this.advertGroup = advertGroup;
	}

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
