package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活号个性化广告位添加接口
 *
 * @author auto create
 * @since 1.0, 2021-05-27 16:12:18
 */
public class AlipayOpenPublicPersonalizedAdvertCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6195172163764224293L;

	/**
	 * 广告位轮播内容列表。数量限制：大于1个，小于5个。广告位轮播内容顺序：与接口传入的顺序排列一致。
	 */
	@ApiListField("advert_items")
	@ApiField("advert_item")
	private List<AdvertItem> advertItems;

	/**
	 * 人群分组id，修改为 <a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.group.create">alipay.open.public.group.create</a>(用户分组创建接口)创建人群分组获取。
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 手机客户端类型，支持：iphone、android、wp。不填表示不区分机型。
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
