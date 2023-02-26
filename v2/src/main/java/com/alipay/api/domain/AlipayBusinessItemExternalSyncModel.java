package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商品信息同步接口
 *
 * @author auto create
 * @since 1.0, 2018-11-28 22:09:08
 */
public class AlipayBusinessItemExternalSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5235188613295592793L;

	/**
	 * 商品失效时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 商品扩展金额
	 */
	@ApiListField("ext_price_info")
	@ApiField("price_info")
	private List<PriceInfo> extPriceInfo;

	/**
	 * 商品扩展属性
	 */
	@ApiField("ext_prop")
	private String extProp;

	/**
	 * 商品外部类目信息
	 */
	@ApiField("external_category_info")
	private ItemCategoryInfo externalCategoryInfo;

	/**
	 * 外部商品id
	 */
	@ApiField("external_item_id")
	private String externalItemId;

	/**
	 * 商品库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品类型：
COMMON_ITEM 普通商品
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商品金额，单位为元，精确到小数点后两位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品图片信息
	 */
	@ApiField("picture_info")
	private String pictureInfo;

	/**
	 * 商品活动类型
GROUP_BUYING 拼团
FLASH_SALE 秒杀
DISCOUNT_SEVEN 七折抢新
NINE_BY_NINE 九块九
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/**
	 * 请求ID，支持英文字母和数字，由调用者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 商品生效时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 商品状态
EFFECTIVE 上架
INVALID 下架
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品标题
	 */
	@ApiField("subject")
	private String subject;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<PriceInfo> getExtPriceInfo() {
		return this.extPriceInfo;
	}
	public void setExtPriceInfo(List<PriceInfo> extPriceInfo) {
		this.extPriceInfo = extPriceInfo;
	}

	public String getExtProp() {
		return this.extProp;
	}
	public void setExtProp(String extProp) {
		this.extProp = extProp;
	}

	public ItemCategoryInfo getExternalCategoryInfo() {
		return this.externalCategoryInfo;
	}
	public void setExternalCategoryInfo(ItemCategoryInfo externalCategoryInfo) {
		this.externalCategoryInfo = externalCategoryInfo;
	}

	public String getExternalItemId() {
		return this.externalItemId;
	}
	public void setExternalItemId(String externalItemId) {
		this.externalItemId = externalItemId;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPictureInfo() {
		return this.pictureInfo;
	}
	public void setPictureInfo(String pictureInfo) {
		this.pictureInfo = pictureInfo;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
