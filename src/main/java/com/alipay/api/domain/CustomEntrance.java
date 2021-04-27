package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CustomEntrance
 *
 * @author auto create
 * @since 1.0, 2021-04-24 14:58:08
 */
public class CustomEntrance extends AlipayObject {

	private static final long serialVersionUID = 6492399853859624253L;

	/**
	 * 卡包详情页可跳转的小程序appId。该appId必须是商户的appId。



目前mini_app_id与store_ids必须二选一。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 跳转到小程序的指定页面
	 */
	@ApiField("mini_app_path")
	private String miniAppPath;

	/**
	 * 券可适用的门店列表。填入支付宝门店ID。



STORE_ID列表如果包含重复会自动进行去重操作，并且传入的STORE_ID数量不超过3000个
	 */
	@ApiField("store_ids")
	private String storeIds;

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

	public String getStoreIds() {
		return this.storeIds;
	}
	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
	}

}
