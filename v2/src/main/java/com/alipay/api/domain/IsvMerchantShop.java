package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店信息
 *
 * @author auto create
 * @since 1.0, 2025-09-12 18:52:59
 */
public class IsvMerchantShop extends AlipayObject {

	private static final long serialVersionUID = 3365953181737462414L;

	/**
	 * 商户门店地址
	 */
	@ApiField("address")
	private MerchantShopAddress address;

	/**
	 * 意向设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 门店关联的商户信息
	 */
	@ApiField("merchant_info")
	private AlipayMerchantInfo merchantInfo;

	/**
	 * 商户联系电话
	 */
	@ApiField("merchant_phone")
	private String merchantPhone;

	/**
	 * 渠道侧门店编号
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 商户名称
	 */
	@ApiField("out_shop_name")
	private String outShopName;

	public MerchantShopAddress getAddress() {
		return this.address;
	}
	public void setAddress(MerchantShopAddress address) {
		this.address = address;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public AlipayMerchantInfo getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(AlipayMerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getMerchantPhone() {
		return this.merchantPhone;
	}
	public void setMerchantPhone(String merchantPhone) {
		this.merchantPhone = merchantPhone;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getOutShopName() {
		return this.outShopName;
	}
	public void setOutShopName(String outShopName) {
		this.outShopName = outShopName;
	}

}
