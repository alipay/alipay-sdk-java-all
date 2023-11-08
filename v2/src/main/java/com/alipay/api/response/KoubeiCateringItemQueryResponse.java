package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AvailablePeriodInfo;
import com.alipay.api.domain.BuyerNotesInfo;
import com.alipay.api.domain.ItemDishInfo;
import com.alipay.api.domain.ItemPackageInfo;
import com.alipay.api.domain.IntroductionInfo;
import com.alipay.api.domain.UnavailablePeriodInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:20:33
 */
public class KoubeiCateringItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5629647589314166613L;

	/** 
	 * 商品可用时段列表。最多添加三条规则。该内容仅用于展示，不影响实际核销。
	 */
	@ApiListField("available_periods")
	@ApiField("available_period_info")
	private List<AvailablePeriodInfo> availablePeriods;

	/** 
	 * 商品购买须知列表
	 */
	@ApiListField("buyer_notes")
	@ApiField("buyer_notes_info")
	private List<BuyerNotesInfo> buyerNotes;

	/** 
	 * 口碑商品所属的后台类目id，ISV可通过开放接口koubei.item.category.children.batchquery来获得后台类目树，并选择叶子类目，作为该值传入
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 商品首图。支持bmp,png,jpeg,jpg,gif格式的图片，建议宽高比16:9，建议宽高：1242*698px 图片大小≤5M。图片大小超过5M,接口会报错。若图片尺寸不对，口碑服务器自身不会做压缩，但是口碑把这些图片放到客户端上展现时，自己会做性能优化(等比缩放，以图片中心为基准裁剪)。
	 */
	@ApiField("cover")
	private String cover;

	/** 
	 * 外部码库id。仅适用于核销方式为外部核销的商品。当核销方式为外部核销时，该参数必填。当核销方式为券码核销或付款码核销时，接口不会使用该参数。
	 */
	@ApiField("external_code_inventory_id")
	private String externalCodeInventoryId;

	/** 
	 * 外部券模板id。仅适用于核销方式为外部核销的商品。当核销方式为外部核销时，该参数必填。当核销方式为券码核销或付款码核销时，接口不会使用该参数。
	 */
	@ApiField("external_code_template_id")
	private String externalCodeTemplateId;

	/** 
	 * 售卖结束时间。当到达该时间时，商品暂停售卖，将不在客户端中继续展示，用户无法继续购买。
注意：该时间不能晚于核销绝对有效期的结束时间。
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/** 
	 * 商品售卖开始时间，商品状态有效并且到达生效时间后才可在客户端（消费者端）展示出来，如果商品生效时间小于当前时间，则立即生效。
说明：商品售卖开始时间不能早于创建当天的0点。商品售卖时间开始后，则不允许修改商品售卖开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/** 
	 * 发布商品库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	/** 
	 * 商品详情-菜品图片详情
	 */
	@ApiListField("item_dishes")
	@ApiField("item_dish_info")
	private List<ItemDishInfo> itemDishes;

	/** 
	 * 商品展示渠道。ALL表示正常投放，允许在口碑门店详情页、搜索结果、大牌抢购及其他频道中展示。ORIENTATION表示定向投放，仅限报名参加大牌抢购后投放或用户扫商品二维码购买。不填默认为ALL。
	 */
	@ApiField("item_display_channel")
	private String itemDisplayChannel;

	/** 
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品详情-商品套餐内容
	 */
	@ApiListField("item_packages")
	@ApiField("item_package_info")
	private List<ItemPackageInfo> itemPackages;

	/** 
	 * 该商品当前的状态，共有5个状态：INIT（初始状态）EFFECTIVE（生效）PAUSE（暂停）FREEZE(冻结)INVALID（失效）
	 */
	@ApiField("item_status")
	private String itemStatus;

	/** 
	 * 商家公告，最多不超过200个字符
	 */
	@ApiField("latest_notice")
	private String latestNotice;

	/** 
	 * 商品备注信息。用于商户内部管理，用户页面不露出。
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 商品详情-商家介绍图文详情
	 */
	@ApiField("merchant_introduction")
	private IntroductionInfo merchantIntroduction;

	/** 
	 * 商品原价。字符串类型，单位元，2位小数。最高价格49998元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 商品详情-补充说明列表
	 */
	@ApiListField("package_notes")
	@ApiField("string")
	private List<String> packageNotes;

	/** 
	 * 商品详情图片列表。尺寸大小与商品首图一致，最多5张。C端上展现时，自己会做性能优化(等比缩放，以图片中心为基准裁剪)
	 */
	@ApiListField("picture_details")
	@ApiField("string")
	private List<String> pictureDetails;

	/** 
	 * 商品现价。字符串类型，单位元，2位小数。最高价格49998元
	 */
	@ApiField("price")
	private String price;

	/** 
	 * 请求id。支持英文字母和数字，由开发者自行定义（不允许重复）。比如2016102903214476899999999
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 商品关联门店id列表，即传入一个或多个shop_id。
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/** 
	 * 商品编码，由商家自定义，不可重复，用于商品核销。如果ticket_display_mode选择付款码核销方式(USER_PAY_CODE)，则sku_id必填。如果ticket_display_mode选择券码核销方式(TICKET_CODE)，则sku_id必须为空
	 */
	@ApiField("sku_id")
	private String skuId;

	/** 
	 * 商品名称，请勿超过60个字符
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 商品首图(1:1)版本，作为商品在淘宝渠道露出的首图。支持bmp，png，jpeg，jpg，gif格式的图片。如果某个商品的本字段为空，则该商品无法再淘宝渠道露出
	 */
	@ApiField("taobao_cover_image")
	private String taobaoCoverImage;

	/** 
	 * 商品购买凭证核销方式。枚举值为：USER_PAY_CODE代表付款码核销方式，如果选择付款码核销，则sku_id必填。TICKET_CODE代表券码核销方式，如果选择券码核销，则sku_id必须为空。EXTERNAL_TICKET_CODE表示 外部券码核销方式。
	 */
	@ApiField("ticket_display_mode")
	private String ticketDisplayMode;

	/** 
	 * 商品不可用日期区间。该内容仅用于展示，不影响实际核销。
	 */
	@ApiListField("unavailable_periods")
	@ApiField("unavailable_period_info")
	private List<UnavailablePeriodInfo> unavailablePeriods;

	/** 
	 * 购买有效期：商品自购买起多长时间内有效，取值范围 7-360，单位天。举例，如果是7的话，是到第七天晚上23:59:59失效。商品购买后，没有在有效期内核销，则自动退款给用户。举例：买了一个鱼香肉丝杨梅汁套餐的商品，有效期一个月，如果一个月之后，用户没有消费该套餐，则自动退款给用户
	 */
	@ApiField("validity_period")
	private Long validityPeriod;

	/** 
	 * 商品顺序权重，影响商品在c端货架露出顺序。必须是整数，不传默认为0，权重数值越大排序越靠前
	 */
	@ApiField("weight")
	private String weight;

	public void setAvailablePeriods(List<AvailablePeriodInfo> availablePeriods) {
		this.availablePeriods = availablePeriods;
	}
	public List<AvailablePeriodInfo> getAvailablePeriods( ) {
		return this.availablePeriods;
	}

	public void setBuyerNotes(List<BuyerNotesInfo> buyerNotes) {
		this.buyerNotes = buyerNotes;
	}
	public List<BuyerNotesInfo> getBuyerNotes( ) {
		return this.buyerNotes;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getCover( ) {
		return this.cover;
	}

	public void setExternalCodeInventoryId(String externalCodeInventoryId) {
		this.externalCodeInventoryId = externalCodeInventoryId;
	}
	public String getExternalCodeInventoryId( ) {
		return this.externalCodeInventoryId;
	}

	public void setExternalCodeTemplateId(String externalCodeTemplateId) {
		this.externalCodeTemplateId = externalCodeTemplateId;
	}
	public String getExternalCodeTemplateId( ) {
		return this.externalCodeTemplateId;
	}

	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	public Date getGmtEnd( ) {
		return this.gmtEnd;
	}

	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}
	public Date getGmtStart( ) {
		return this.gmtStart;
	}

	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}
	public Long getInventory( ) {
		return this.inventory;
	}

	public void setItemDishes(List<ItemDishInfo> itemDishes) {
		this.itemDishes = itemDishes;
	}
	public List<ItemDishInfo> getItemDishes( ) {
		return this.itemDishes;
	}

	public void setItemDisplayChannel(String itemDisplayChannel) {
		this.itemDisplayChannel = itemDisplayChannel;
	}
	public String getItemDisplayChannel( ) {
		return this.itemDisplayChannel;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemPackages(List<ItemPackageInfo> itemPackages) {
		this.itemPackages = itemPackages;
	}
	public List<ItemPackageInfo> getItemPackages( ) {
		return this.itemPackages;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public String getItemStatus( ) {
		return this.itemStatus;
	}

	public void setLatestNotice(String latestNotice) {
		this.latestNotice = latestNotice;
	}
	public String getLatestNotice( ) {
		return this.latestNotice;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMerchantIntroduction(IntroductionInfo merchantIntroduction) {
		this.merchantIntroduction = merchantIntroduction;
	}
	public IntroductionInfo getMerchantIntroduction( ) {
		return this.merchantIntroduction;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getOriginalPrice( ) {
		return this.originalPrice;
	}

	public void setPackageNotes(List<String> packageNotes) {
		this.packageNotes = packageNotes;
	}
	public List<String> getPackageNotes( ) {
		return this.packageNotes;
	}

	public void setPictureDetails(List<String> pictureDetails) {
		this.pictureDetails = pictureDetails;
	}
	public List<String> getPictureDetails( ) {
		return this.pictureDetails;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice( ) {
		return this.price;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}
	public List<String> getShopIds( ) {
		return this.shopIds;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuId( ) {
		return this.skuId;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setTaobaoCoverImage(String taobaoCoverImage) {
		this.taobaoCoverImage = taobaoCoverImage;
	}
	public String getTaobaoCoverImage( ) {
		return this.taobaoCoverImage;
	}

	public void setTicketDisplayMode(String ticketDisplayMode) {
		this.ticketDisplayMode = ticketDisplayMode;
	}
	public String getTicketDisplayMode( ) {
		return this.ticketDisplayMode;
	}

	public void setUnavailablePeriods(List<UnavailablePeriodInfo> unavailablePeriods) {
		this.unavailablePeriods = unavailablePeriods;
	}
	public List<UnavailablePeriodInfo> getUnavailablePeriods( ) {
		return this.unavailablePeriods;
	}

	public void setValidityPeriod(Long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	public Long getValidityPeriod( ) {
		return this.validityPeriod;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWeight( ) {
		return this.weight;
	}

}
