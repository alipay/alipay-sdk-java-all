package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建店铺
 *
 * @author auto create
 * @since 1.0, 2021-03-11 10:08:08
 */
public class AlipayCommerceEducateTrainShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1687119383269683248L;

	/**
	 * 经营地址信息
	 */
	@ApiField("address_info")
	private ShopAddressInfo addressInfo;

	/**
	 * 小程序appId
	 */
	@ApiField("applet_appid")
	private String appletAppid;

	/**
	 * 业务类型(教培课程)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 店铺简介
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 收款账户
	 */
	@ApiField("income_account")
	private String incomeAccount;

	/**
	 * 店铺所属商家信息
	 */
	@ApiField("merchant_info")
	private ShopMerchantInfo merchantInfo;

	/**
	 * 店铺名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部店铺id
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 图片地址
	 */
	@ApiField("pic")
	private String pic;

	/**
	 * 客服电话列表
	 */
	@ApiListField("service_phone")
	@ApiField("string")
	private List<String> servicePhone;

	/**
	 * 来源类型(XIAOBAO：校宝)
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 店铺url
	 */
	@ApiField("url")
	private String url;

	public ShopAddressInfo getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(ShopAddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getAppletAppid() {
		return this.appletAppid;
	}
	public void setAppletAppid(String appletAppid) {
		this.appletAppid = appletAppid;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIncomeAccount() {
		return this.incomeAccount;
	}
	public void setIncomeAccount(String incomeAccount) {
		this.incomeAccount = incomeAccount;
	}

	public ShopMerchantInfo getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(ShopMerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getPic() {
		return this.pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}

	public List<String> getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(List<String> servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
