package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RetailItemDescription;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8189142163588441712L;

	/** 
	 * 封面图url地址
	 */
	@ApiField("cover")
	private String cover;

	/** 
	 * 商品描述
	 */
	@ApiListField("descriptions")
	@ApiField("retail_item_description")
	private List<RetailItemDescription> descriptions;

	/** 
	 * 折扣比例，5折：0.5
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/** 
	 * 商品失效时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/** 
	 * 商品生效时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/** 
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品状态，共有5个状态：INIT（初始状态）EFFECTIVE（生效）PAUSE（暂停）FREEZE(冻结)INVALID（失效）
	 */
	@ApiField("item_status")
	private String itemStatus;

	/** 
	 * 商品原价(减至券)。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/** 
	 * 商品详情图片列表
	 */
	@ApiListField("picture_list")
	@ApiField("string")
	private List<String> pictureList;

	/** 
	 * 优惠价(减至券)。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("reduce_to_amount")
	private String reduceToAmount;

	/** 
	 * 商品适用的门店信息列表
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	/** 
	 * 适用的sku列表,最多支持800个SKU，超过返回为空
	 */
	@ApiListField("sku_list")
	@ApiField("string")
	private List<String> skuList;

	/** 
	 * 券名称
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 券类型：CASH为代金券，DISCOUNT为折扣券;ALL为全场，SINGLE为单品
	 */
	@ApiField("type")
	private String type;

	/** 
	 * 代金券金额：满100减30 => 30。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("value_amount")
	private String valueAmount;

	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getCover( ) {
		return this.cover;
	}

	public void setDescriptions(List<RetailItemDescription> descriptions) {
		this.descriptions = descriptions;
	}
	public List<RetailItemDescription> getDescriptions( ) {
		return this.descriptions;
	}

	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}
	public String getDiscountRate( ) {
		return this.discountRate;
	}

	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	public String getGmtEnd( ) {
		return this.gmtEnd;
	}

	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}
	public String getGmtStart( ) {
		return this.gmtStart;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public String getItemStatus( ) {
		return this.itemStatus;
	}

	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}
	public String getOriginalAmount( ) {
		return this.originalAmount;
	}

	public void setPictureList(List<String> pictureList) {
		this.pictureList = pictureList;
	}
	public List<String> getPictureList( ) {
		return this.pictureList;
	}

	public void setReduceToAmount(String reduceToAmount) {
		this.reduceToAmount = reduceToAmount;
	}
	public String getReduceToAmount( ) {
		return this.reduceToAmount;
	}

	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}
	public List<String> getShopList( ) {
		return this.shopList;
	}

	public void setSkuList(List<String> skuList) {
		this.skuList = skuList;
	}
	public List<String> getSkuList( ) {
		return this.skuList;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

	public void setValueAmount(String valueAmount) {
		this.valueAmount = valueAmount;
	}
	public String getValueAmount( ) {
		return this.valueAmount;
	}

}
