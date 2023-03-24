package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店信息
 *
 * @author auto create
 * @since 1.0, 2022-11-08 11:45:16
 */
public class OrderShopInfo extends AlipayObject {

	private static final long serialVersionUID = 8421827958531351996L;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 蚂蚁门店shop_id
	 */
	@ApiField("alipay_shop_id")
	private String alipayShopId;

	/**
	 * 门店其他业务属性，不同业务场景KEY枚举值不同，使用前请参考产品文档
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 商户门店id
支持英文、数字的组合
	 */
	@ApiField("merchant_shop_id")
	private String merchantShopId;

	/**
	 * 店铺详情链接地址
	 */
	@ApiField("merchant_shop_link_page")
	private String merchantShopLinkPage;

	/**
	 * 店铺名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系电话-支持固话或手机号
仅支持数字、+、-
	 */
	@ApiField("phone_num")
	private String phoneNum;

	/**
	 * 仅当alipay_shop_id字段值为非标准蚂蚁门店时使用，其他场景无需传入
	 */
	@ApiField("type")
	private String type;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayShopId() {
		return this.alipayShopId;
	}
	public void setAlipayShopId(String alipayShopId) {
		this.alipayShopId = alipayShopId;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantShopId() {
		return this.merchantShopId;
	}
	public void setMerchantShopId(String merchantShopId) {
		this.merchantShopId = merchantShopId;
	}

	public String getMerchantShopLinkPage() {
		return this.merchantShopLinkPage;
	}
	public void setMerchantShopLinkPage(String merchantShopLinkPage) {
		this.merchantShopLinkPage = merchantShopLinkPage;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
