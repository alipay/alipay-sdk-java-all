package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 泛娱乐优惠商品上报
 *
 * @author auto create
 * @since 1.0, 2022-09-01 16:25:50
 */
public class AlipayCommerceEntertainmentItemUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4358367176538218232L;

	/**
	 * 业务场景码，不填默认为娱乐会员业务，可选枚举：
CONSUME_GOLD（消费金积分兑换）
DEFAULT_CAMP（默认-娱乐会员优惠商品）
CAMP_FEEDS （商品内容投放）
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商品是否启用（上架展示），true/false
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 商品描述（作为副标题展示）
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 商品扩展信息，具体传值根据商户及商品类型不同另行约定。
json格式，请将需要传递的key和value字段放入map中，转成json string传入。

通用扩展参数：
merchant_display_priority 商品排序字段，正整数，数字越大优先级越高
	 */
	@ApiField("item_extended_info")
	private String itemExtendedInfo;

	/**
	 * 商户侧商品ID，同商户下需唯一
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 客户点击商品后跳转到商户的地址
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * 商品图片通过 alipay.open.file.upload 接口上传获得的文件ID
	 */
	@ApiField("pic_file_id")
	private String picFileId;

	/**
	 * 商品图片地址
	 */
	@ApiField("pic_source_url")
	private String picSourceUrl;

	/**
	 * 商品计价类型:
其他：OTHER
天卡：DAY
周卡：WEEK
月卡：MONTH
季卡：QUARTER
半年卡：SEMI_YEAR
年卡：YEAR
连续包周：CW
连续包月：CM
连续包季：CQ
连续包半年：CSY
连续包年：CY
	 */
	@ApiField("pricing_type")
	private String pricingType;

	/**
	 * 优惠价，积分部分
	 */
	@ApiField("promote_point")
	private Long promotePoint;

	/**
	 * 优惠价，现金部分（元）
	 */
	@ApiField("promote_price")
	private String promotePrice;

	/**
	 * 优惠定价方式，不填默认为现金，可选枚举CASH（纯现金），CASH_POINT（现金加积分），POINT（纯积分），FREE（免费）
	 */
	@ApiField("promote_price_mode")
	private String promotePriceMode;

	/**
	 * 剩余库存
	 */
	@ApiField("remain_inventory")
	private Long remainInventory;

	/**
	 * 积分商品规则ID，积分商品必填
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 可选类型有：
影视 VIDEO,
游戏 GAME,
音乐 MUSIC,
在线阅读 ONLINE_READING,
社交媒体 SOCIAL_MEDIA,
工具 TOOLS,
其他 OTHER
	 */
	@ApiField("service_category")
	private String serviceCategory;

	/**
	 * 商品标签，用于召回时筛选商品，积分场景必填
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 总库存
	 */
	@ApiField("total_inventory")
	private Long totalInventory;

	/**
	 * 商品原价，单位元（人民币）
	 */
	@ApiField("unit_price")
	private String unitPrice;

	/**
	 * 失效时间，不填默认长期有效
	 */
	@ApiField("valid_time_end")
	private Date validTimeEnd;

	/**
	 * 生效时间，不填默认立即生效
	 */
	@ApiField("valid_time_start")
	private Date validTimeStart;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemExtendedInfo() {
		return this.itemExtendedInfo;
	}
	public void setItemExtendedInfo(String itemExtendedInfo) {
		this.itemExtendedInfo = itemExtendedInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getPicFileId() {
		return this.picFileId;
	}
	public void setPicFileId(String picFileId) {
		this.picFileId = picFileId;
	}

	public String getPicSourceUrl() {
		return this.picSourceUrl;
	}
	public void setPicSourceUrl(String picSourceUrl) {
		this.picSourceUrl = picSourceUrl;
	}

	public String getPricingType() {
		return this.pricingType;
	}
	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

	public Long getPromotePoint() {
		return this.promotePoint;
	}
	public void setPromotePoint(Long promotePoint) {
		this.promotePoint = promotePoint;
	}

	public String getPromotePrice() {
		return this.promotePrice;
	}
	public void setPromotePrice(String promotePrice) {
		this.promotePrice = promotePrice;
	}

	public String getPromotePriceMode() {
		return this.promotePriceMode;
	}
	public void setPromotePriceMode(String promotePriceMode) {
		this.promotePriceMode = promotePriceMode;
	}

	public Long getRemainInventory() {
		return this.remainInventory;
	}
	public void setRemainInventory(Long remainInventory) {
		this.remainInventory = remainInventory;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getServiceCategory() {
		return this.serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Long getTotalInventory() {
		return this.totalInventory;
	}
	public void setTotalInventory(Long totalInventory) {
		this.totalInventory = totalInventory;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getValidTimeEnd() {
		return this.validTimeEnd;
	}
	public void setValidTimeEnd(Date validTimeEnd) {
		this.validTimeEnd = validTimeEnd;
	}

	public Date getValidTimeStart() {
		return this.validTimeStart;
	}
	public void setValidTimeStart(Date validTimeStart) {
		this.validTimeStart = validTimeStart;
	}

}
