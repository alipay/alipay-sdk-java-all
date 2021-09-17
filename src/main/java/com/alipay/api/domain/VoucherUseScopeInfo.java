package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销范围信息
 *
 * @author auto create
 * @since 1.0, 2021-04-02 14:11:43
 */
public class VoucherUseScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 7789621715318216523L;

	/**
	 * 小程序appid列表
	 */
	@ApiListField("app_id_list")
	@ApiField("string")
	private List<String> appIdList;

	/**
	 * 商户pid列表
	 */
	@ApiListField("pid_list")
	@ApiField("string")
	private List<String> pidList;

	/**
	 * 支付宝门店id列表
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	public List<String> getAppIdList() {
		return this.appIdList;
	}
	public void setAppIdList(List<String> appIdList) {
		this.appIdList = appIdList;
	}

	public List<String> getPidList() {
		return this.pidList;
	}
	public void setPidList(List<String> pidList) {
		this.pidList = pidList;
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}
	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

}
