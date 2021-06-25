package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户引导配置
 *
 * @author auto create
 * @since 1.0, 2021-06-25 14:08:30
 */
public class CustomerGuide extends AlipayObject {

	private static final long serialVersionUID = 8433122173227563192L;

	/**
	 * 卡包详情页可跳转的小程序appId。 限制： 该appId归属的pid必须和当前商户保持一致。 目前mini_app_id、store_ids、real_shop_ids必须三选一。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 指定跳转到mini_app_id时的具体页面路径。 限制： 该小程序路径是相对路径。
	 */
	@ApiField("mini_app_path")
	private String miniAppPath;

	/**
	 * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id


接口参数是列表类型。

限制：
real_shop_ids中的门店id必须是代运营商业关系门店id。

real_shop_ids如果包含重复的门店id会自动进行去重操作。

修改门店列表，只允许增加不允许减少。
	 */
	@ApiListField("real_shop_ids")
	@ApiField("string")
	private List<String> realShopIds;

	/**
	 * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 
 接口参数是列表类型。

 限制： store_ids中的门店id必须是支付宝门店id。 store_ids如果包含重复的门店id会自动进行去重操作。 

修改门店列表，只允许增加不允许减少。
	 */
	@ApiListField("store_ids")
	@ApiField("string")
	private List<String> storeIds;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppPath() {
		return this.miniAppPath;
	}
	public void setMiniAppPath(String miniAppPath) {
		this.miniAppPath = miniAppPath;
	}

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
