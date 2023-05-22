package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * trade_voucher商品查询信息
 *
 * @author auto create
 * @since 1.0, 2022-12-01 17:52:36
 */
public class ItemQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 6315935375314335688L;

	/**
	 * 口碑商品所属的后台类目id，后台类目数据来源：开放接口koubei.item.category.children.batchquery（查询后台类目树接口）
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 首图
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 商品描述，列表类型，每一项的key，value的描述见下面两行
	 */
	@ApiListField("descriptions")
	@ApiField("koubei_item_description")
	private List<KoubeiItemDescription> descriptions;

	/**
	 * 售卖结束时间。当到达该时间时，商品暂停售卖，将不在客户端中继续展示，用户无法继续购买。
注意：该时间不能晚于核销绝对有效期的结束时间。
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 商品售卖开始时间，商品状态有效并且到达生效时间后才可在客户端（消费者端）展示出来，如果商品生效时间小于当前时间，则立即生效。
说明： 商品的生效时间不能早于创建当天的0点
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 当前库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 该商品当前的状态，共有5个状态：INIT（初始状态）EFFECTIVE（生效）PAUSE（暂停）FREEZE(冻结)INVALID（失效）；详见状态变更图
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 商品类型，交易凭证类：TRADE_VOUCHER
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 标准商品为原价，必填。非标准商品请勿填写，填写无效。价格单位为元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 图片集，本商品所有图片id和URL的对应关系数组
	 */
	@ApiListField("pic_coll")
	@ApiField("string")
	private List<String> picColl;

	/**
	 * 商品详情图，多张图片以英文逗号分隔
	 */
	@ApiField("picture_details")
	private String pictureDetails;

	/**
	 * 标准商品为现价,选填。非标准商品为最小价格（非标商品为xx元起）必填。价格单位为元。如果标准商品现价不填写，则以原价进行售卖；如果现价与原价相等时，则会以原价售卖，并且客户端只展示一个价格（原价）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 标准商品:FIX；非标准商品:FLOAT ，根据该字段判断商品是标准商品或非标商品。
	 */
	@ApiField("price_mode")
	private String priceMode;

	/**
	 * 适用门店列表
	 */
	@ApiField("shop_ids")
	private String shopIds;

	/**
	 * 商品名称，不超过20汉字，40个字符
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 淘宝首图
	 */
	@ApiField("tb_cover")
	private String tbCover;

	/**
	 * 交易凭证类商品模板信息
	 */
	@ApiField("trade_voucher_item_template")
	private KoubeiTradeVoucherItemTemplete tradeVoucherItemTemplate;

	/**
	 * 商品顺序权重
	 */
	@ApiField("weight")
	private Long weight;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public List<KoubeiItemDescription> getDescriptions() {
		return this.descriptions;
	}
	public void setDescriptions(List<KoubeiItemDescription> descriptions) {
		this.descriptions = descriptions;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public List<String> getPicColl() {
		return this.picColl;
	}
	public void setPicColl(List<String> picColl) {
		this.picColl = picColl;
	}

	public String getPictureDetails() {
		return this.pictureDetails;
	}
	public void setPictureDetails(String pictureDetails) {
		this.pictureDetails = pictureDetails;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceMode() {
		return this.priceMode;
	}
	public void setPriceMode(String priceMode) {
		this.priceMode = priceMode;
	}

	public String getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTbCover() {
		return this.tbCover;
	}
	public void setTbCover(String tbCover) {
		this.tbCover = tbCover;
	}

	public KoubeiTradeVoucherItemTemplete getTradeVoucherItemTemplate() {
		return this.tradeVoucherItemTemplate;
	}
	public void setTradeVoucherItemTemplate(KoubeiTradeVoucherItemTemplete tradeVoucherItemTemplate) {
		this.tradeVoucherItemTemplate = tradeVoucherItemTemplate;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
