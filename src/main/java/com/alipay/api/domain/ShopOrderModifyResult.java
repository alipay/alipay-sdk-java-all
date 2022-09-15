package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺点餐信息修改的结果
 *
 * @author auto create
 * @since 1.0, 2019-01-17 11:55:36
 */
public class ShopOrderModifyResult extends AlipayObject {

	private static final long serialVersionUID = 4683749535442281855L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * SUCCESS: 设置成功
INVALID_PARAMETER: 参数错误
SHOP_NOT_EXIST:店铺不存在
NO_PRIVILEGE:没有权限修改此门店
NO_ORDER_INFO:没有开通过点餐
MODIFY_FAILED:修改失败
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部门店编号；最长32位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性。
	 */
	@ApiField("store_id")
	private String storeId;

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
