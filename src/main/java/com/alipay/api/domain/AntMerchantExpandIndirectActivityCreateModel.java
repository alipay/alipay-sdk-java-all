package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户运营活动报名接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 16:28:04
 */
public class AntMerchantExpandIndirectActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8125729959125387559L;

	/**
	 * 活动类型，间联商户报名的支付宝活动类型。
蓝海行动：BLUE_SEA
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 商户简称，门头照的名称或者大众点评、美团、饿了么、口碑、百度外卖入驻平台名称。需和进件时别名保持一致。
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 营业执照，要求营业执照文本信息清晰可见。
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 收银台照片，必须包含：①主扫：扫码支付场景需要展示具有支付宝logo和“推荐使用支付宝 或 支付就用支付宝”露出的二维码物料或立牌；②被扫：展示具有支付宝logo和“推荐使用支付宝 或 支付就用支付宝”的扫码机具（盒子）
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("checkstand_pic")
	private String checkstandPic;

	/**
	 * 店内环境照，要求照片清晰可见。
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("indoor_pic")
	private String indoorPic;

	/**
	 * 商户名称，营业执照上的名称，需和进件名称保持一致。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 主流餐饮平台入驻证明（任选一个即可）：大众点评、美团、饿了么、口碑、百度外卖餐饮平台商户展示页面。
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("settled_pic")
	private String settledPic;

	/**
	 * 门头照。
其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("shop_entrance_pic")
	private String shopEntrancePic;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	public String getCheckstandPic() {
		return this.checkstandPic;
	}
	public void setCheckstandPic(String checkstandPic) {
		this.checkstandPic = checkstandPic;
	}

	public String getIndoorPic() {
		return this.indoorPic;
	}
	public void setIndoorPic(String indoorPic) {
		this.indoorPic = indoorPic;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSettledPic() {
		return this.settledPic;
	}
	public void setSettledPic(String settledPic) {
		this.settledPic = settledPic;
	}

	public String getShopEntrancePic() {
		return this.shopEntrancePic;
	}
	public void setShopEntrancePic(String shopEntrancePic) {
		this.shopEntrancePic = shopEntrancePic;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
