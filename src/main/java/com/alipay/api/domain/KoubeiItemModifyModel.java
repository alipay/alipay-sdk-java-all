package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品修改
 *
 * @author auto create
 * @since 1.0, 2019-05-09 22:38:25
 */
public class KoubeiItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1272559652235189657L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，有效期24小时；
	 */
	@ApiField("auth_code")
	private String authCode;

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
	private Date gmtStart;

	/**
	 * 商品库存数量，标准商品必填，非标准商品，不需要填写
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 非标准商品详情页url，用户通过此url跳转到非标准商品的商品详情页，非标准商品必填
	 */
	@ApiField("item_detail_url")
	private String itemDetailUrl;

	/**
	 * 口碑体系内部商品的唯一标识，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作上下文。isv角色操作时必填。其他角色不需填写。
	 */
	@ApiField("operation_context")
	private KoubeiOperationContext operationContext;

	/**
	 * 标准商品为原价，必填。非标准商品请勿填写，填写无效。价格单位为元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品详情图。尺寸大小与cover一致，最多5张，以英文逗号分隔
	 */
	@ApiField("picture_details")
	private String pictureDetails;

	/**
	 * 标准商品为现价,必填。非标准商品为最小价格（非标商品为xx元起）必填。价格单位为元。如果标准商品现价不填写，则以原价进行售卖；如果现价与原价相等时，则会以原价售卖，并且客户端只展示一个价格（原价）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 上架门店id列表，即传入一个或多个shop_id。多个ID则以英文分隔
	 */
	@ApiField("shop_ids")
	private String shopIds;

	/**
	 * 商品名称，请勿超过40汉字，80个字符
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商品1:1首图，该封面图将展示在淘抢购、聚划算等商品售卖渠道。支持bmp、png、jpeg、jpg、gif格式，建议宽高比1:1，建议宽高1500*1500px，图片大小≤5M。图片大小超过5M，接口会报错。若图片尺寸不符，口碑服务器自身不会做压缩，但在口碑客户端展现时，会自动做性能优化（等比缩放，以图片中心为基准裁剪）。
	 */
	@ApiField("tb_cover")
	private String tbCover;

	/**
	 * 交易凭证类商品模板信息
	 */
	@ApiField("trade_voucher_item_template")
	private KoubeiTradeVoucherItemTemplete tradeVoucherItemTemplate;

	/**
	 * 商品顺序权重，必须是整数，不传默认为0，权重数值越大排序越靠前
	 */
	@ApiField("weight")
	private String weight;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

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

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public String getItemDetailUrl() {
		return this.itemDetailUrl;
	}
	public void setItemDetailUrl(String itemDetailUrl) {
		this.itemDetailUrl = itemDetailUrl;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public KoubeiOperationContext getOperationContext() {
		return this.operationContext;
	}
	public void setOperationContext(KoubeiOperationContext operationContext) {
		this.operationContext = operationContext;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
