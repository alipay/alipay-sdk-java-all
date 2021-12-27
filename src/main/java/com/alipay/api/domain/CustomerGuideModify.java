package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改用户引导配置
 *
 * @author auto create
 * @since 1.0, 2021-12-23 17:31:49
 */
public class CustomerGuideModify extends AlipayObject {

	private static final long serialVersionUID = 2398199515128837917L;

	/**
	 * 券可使用的商业关系门店列表,列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id 
 限制： 
1、创建活动时传入了该值修改才会生效
2、real_shop_ids中的门店id必须是商业关系门店id。 3、real_shop_ids如果包含重复的门店id会自动进行去重操作。 
4、修改门店列表，只允许增加不允许减少。
5、每次传入必须是全量的门店id即原来的门店+本次新增的门店id
	 */
	@ApiListField("real_shop_ids")
	@ApiField("string")
	private List<String> realShopIds;

	/**
	 * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。
接口参数是列表类型。

限制：
1、创建活动时传入了该值修改才会生效。
2、store_ids中的门店id必须是支付宝门店id。
3、store_ids如果包含重复的门店id会自动进行去重操作。
4、修改门店列表，只允许增加不允许减少。
5、每次传入必须是全量的门店id即原来的门店+本次新增的门店id
	 */
	@ApiListField("store_ids")
	@ApiField("string")
	private List<String> storeIds;

	public List<String> getRealShopIds() {
		return this.realShopIds;
	}
	public void setRealShopIds(List<String> realShopIds) {
		this.realShopIds = realShopIds;
	}

	public List<String> getStoreIds() {
		return this.storeIds;
	}
	public void setStoreIds(List<String> storeIds) {
		this.storeIds = storeIds;
	}

}
