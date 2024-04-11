package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品列表信息模型
 *
 * @author auto create
 * @since 1.0, 2024-03-11 10:48:49
 */
public class MiniGoodsDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7684122851423753945L;

	/**
	 * 活动信息
	 */
	@ApiField("activity_info")
	private ActivityInfoDTO activityInfo;

	/**
	 * 商品描述信息
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商品类目树 当前字段已废弃(暂时未使用)
	 */
	@ApiField("categories_tree")
	@Deprecated
	private String categoriesTree;

	/**
	 * 价格日历
	 */
	@ApiListField("effective_dates")
	@ApiField("effective_dates_d_t_o")
	private List<EffectiveDatesDTO> effectiveDates;

	/**
	 * 商品类目 当前字段已废弃(暂时未使用)
	 */
	@ApiField("goods_category")
	@Deprecated
	private String goodsCategory;

	/**
	 * 提报支付券优惠时的商品id，用于关联使用支付券，需要和支付券上绑定商品goods_id相同。如果不使用支付券，该字段传入商品最小粒度的商品id（如：若商品有 sku 粒度，则传商品 sku 粒度的id）
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品图片，用于小程序订单中心展示，可通过 <a href="https://opendocs.alipay.com/mini/03l4lq?pathHash=c08922b1&scene=common">alipay.merchant.item.file.upload </a>接口上传素材获取素材id。默认使用已上报的商品库素材信息。
	 */
	@ApiField("image_material_id")
	private String imageMaterialId;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 单位元有优惠信息时需要传入，优惠方式sale_real_price与item_discount二选一sale_real_price使用场景：商品有单价优惠，传入商品实际成交单价item_discount使用场景：同时购买多件商品时存在优惠，传入优惠总额优惠计算参考：<a href="https://opendocs.alipay.com/mini/0ag2e1?pathHash=20b9a409">文档</a> 中资金平衡校验
	 */
	@ApiField("item_discount")
	private String itemDiscount;

	/**
	 * 商品分期信息
	 */
	@ApiField("item_installment_info")
	private ItemInstallmentInfoDTO itemInstallmentInfo;

	/**
	 * 商户侧商品id，用于公域场景结算，会影响主播归因。私域场景无需传入，公域场景未传入会影响后续结算
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户侧商品sku_id，用于公域场景结算，如果商品有多个sku，需要传入准确的sku_id，无sku时不需要传入
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 平台商品版本号，用于查询商品快照
	 */
	@ApiField("platform_item_version_id")
	private String platformItemVersionId;

	/**
	 * 租金信息，租赁商品特有
	 */
	@ApiField("rent_info")
	private RentInfoDTO rentInfo;

	/**
	 * 商品单价，单位：元,精确到小数点后两位
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 商品真实单价，单位：元,精确到小数点后两位,
有优惠信息时需要传入，优惠方式sale_real_price与item_discount二选一
sale_real_price使用场景：商品有单价优惠，传入商品实际成交单价
item_discount使用场景：同时购买多件商品时存在优惠，传入优惠总额
优惠计算参考：<a href="https://opendocs.alipay.com/mini/0ag2e1?pathHash=20b9a409">资金平衡校验</a>
sale_real_price使用场景：商品有单价优惠，传入商品实际成交单价
item_discount使用场景：同时购买多件商品时存在优惠，传入优惠总额
优惠计算参考：<a href="https://opendocs.alipay.com/mini/0ag2e1?pathHash=20b9a409">资金平衡校验</a>
	 */
	@ApiField("sale_real_price")
	private String saleRealPrice;

	/**
	 * 商品的展示地址
	 */
	@ApiField("show_url")
	private String showUrl;

	/**
	 * 演出票务信息
	 */
	@ApiField("ticket_info")
	private TicketInfoDTO ticketInfo;

	public ActivityInfoDTO getActivityInfo() {
		return this.activityInfo;
	}
	public void setActivityInfo(ActivityInfoDTO activityInfo) {
		this.activityInfo = activityInfo;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getCategoriesTree() {
		return this.categoriesTree;
	}
	public void setCategoriesTree(String categoriesTree) {
		this.categoriesTree = categoriesTree;
	}

	public List<EffectiveDatesDTO> getEffectiveDates() {
		return this.effectiveDates;
	}
	public void setEffectiveDates(List<EffectiveDatesDTO> effectiveDates) {
		this.effectiveDates = effectiveDates;
	}

	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getImageMaterialId() {
		return this.imageMaterialId;
	}
	public void setImageMaterialId(String imageMaterialId) {
		this.imageMaterialId = imageMaterialId;
	}

	public String getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getItemDiscount() {
		return this.itemDiscount;
	}
	public void setItemDiscount(String itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	public ItemInstallmentInfoDTO getItemInstallmentInfo() {
		return this.itemInstallmentInfo;
	}
	public void setItemInstallmentInfo(ItemInstallmentInfoDTO itemInstallmentInfo) {
		this.itemInstallmentInfo = itemInstallmentInfo;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getPlatformItemVersionId() {
		return this.platformItemVersionId;
	}
	public void setPlatformItemVersionId(String platformItemVersionId) {
		this.platformItemVersionId = platformItemVersionId;
	}

	public RentInfoDTO getRentInfo() {
		return this.rentInfo;
	}
	public void setRentInfo(RentInfoDTO rentInfo) {
		this.rentInfo = rentInfo;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleRealPrice() {
		return this.saleRealPrice;
	}
	public void setSaleRealPrice(String saleRealPrice) {
		this.saleRealPrice = saleRealPrice;
	}

	public String getShowUrl() {
		return this.showUrl;
	}
	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}

	public TicketInfoDTO getTicketInfo() {
		return this.ticketInfo;
	}
	public void setTicketInfo(TicketInfoDTO ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

}
