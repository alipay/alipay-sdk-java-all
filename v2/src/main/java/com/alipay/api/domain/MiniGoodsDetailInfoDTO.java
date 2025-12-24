package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品列表信息模型
 *
 * @author auto create
 * @since 1.0, 2025-08-26 10:51:43
 */
public class MiniGoodsDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7725156241581483263L;

	/**
	 * 活动信息
	 */
	@ApiField("activity_info")
	private ActivityInfoDTO activityInfo;

	/**
	 * 商品属性信息列表
	 */
	@ApiListField("attr_ext_info_list")
	@ApiField("attr_ext_info_d_t_o")
	private List<AttrExtInfoDTO> attrExtInfoList;

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
	 * 商品类目
	 */
	@ApiField("goods_category")
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
	 * 商品类型
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 商品图片，用于小程序订单中心展示，可通过 <a href="https://opendocs.alipay.com/mini/03l4lq?pathHash=c08922b1&scene=common">alipay.merchant.item.file.upload </a>接口上传素材获取素材id。默认使用已上报的商品库素材信息。
	 */
	@ApiField("image_material_id")
	private String imageMaterialId;

	/**
	 * 品牌编号；商品品牌信息参<a href="https://xfpzl.yuque.com/dgw58m/apg2ie/qlqvdv0dhsbldyhv#kIy4">https://xfpzl.yuque.com/dgw58m/apg2ie/qlqvdv0dhsbldyhv#kIy4 </a>考此文档传入品牌编号
	 */
	@ApiField("item_brand")
	private String itemBrand;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 商品成色 当前字段已废弃(商品成色有成色和等级两个信息。该字段定义模糊。)
	 */
	@ApiField("item_condition")
	@Deprecated
	private String itemCondition;

	/**
	 * 单位元有优惠信息时需要传入，优惠方式sale_real_price与item_discount二选一sale_real_price使用场景：商品有单价优惠，传入商品实际成交单价item_discount使用场景：同时购买多件商品时存在优惠，传入优惠总额优惠计算参考：<a href="https://opendocs.alipay.com/mini/0ag2e1?pathHash=20b9a409">文档</a> 中资金平衡校验
	 */
	@ApiField("item_discount")
	private String itemDiscount;

	/**
	 * 商品成色
	 */
	@ApiField("item_fineness")
	private String itemFineness;

	/**
	 * 成色等级，成色为二手时需传入此字段
	 */
	@ApiField("item_fineness_grade")
	private String itemFinenessGrade;

	/**
	 * 商品分期信息
	 */
	@ApiField("item_installment_info")
	private ItemInstallmentInfoDTO itemInstallmentInfo;

	/**
	 * 最大售价，单位：元，保留两位小数
	 */
	@ApiField("max_sale_price")
	private String maxSalePrice;

	/**
	 * 最低售价，单位：元，保留两位小数
	 */
	@ApiField("min_sale_price")
	private String minSalePrice;

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
	 * 默认值：FIXED
	 */
	@ApiField("price_mode")
	private String priceMode;

	/**
	 * 租赁商品扩展信息
	 */
	@ApiField("rent_goods_info")
	private RentGoodsInfoDTO rentGoodsInfo;

	/**
	 * 租金信息，租赁商品特有
	 */
	@ApiField("rent_info")
	private RentInfoDTO rentInfo;

	/**
	 * 商品单价，单位：元，精确到小数点后两位，注：租赁商品请传入日租金，如10元/天
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 商品真实单价，单位：元，精确到小数点后两位，有优惠信息时需要传入，优惠方式sale_real_price与item_discount二选一
sale_real_price使用场景：商品有单价优惠，传入商品实际成交单价
item_discount使用场景：同时购买多件商品时存在优惠，传入优惠总额
优惠计算参考：<a href="https://opendocs.alipay.com/mini/0ag2e1?pathHash=20b9a409">资金平衡校验</a>
sale_real_price使用场景：商品有单价优惠，传入商品实际成交单价
item_discount使用场景：同时购买多件商品时存在优惠，传入优惠总额
优惠计算参考：<a href="https://opendocs.alipay.com/mini/0ag2e1?pathHash=20b9a409">资金平衡校验</a>
注：租赁商品请传入日租金，如10元/天
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

	public List<AttrExtInfoDTO> getAttrExtInfoList() {
		return this.attrExtInfoList;
	}
	public void setAttrExtInfoList(List<AttrExtInfoDTO> attrExtInfoList) {
		this.attrExtInfoList = attrExtInfoList;
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

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getImageMaterialId() {
		return this.imageMaterialId;
	}
	public void setImageMaterialId(String imageMaterialId) {
		this.imageMaterialId = imageMaterialId;
	}

	public String getItemBrand() {
		return this.itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public String getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getItemCondition() {
		return this.itemCondition;
	}
	public void setItemCondition(String itemCondition) {
		this.itemCondition = itemCondition;
	}

	public String getItemDiscount() {
		return this.itemDiscount;
	}
	public void setItemDiscount(String itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	public String getItemFineness() {
		return this.itemFineness;
	}
	public void setItemFineness(String itemFineness) {
		this.itemFineness = itemFineness;
	}

	public String getItemFinenessGrade() {
		return this.itemFinenessGrade;
	}
	public void setItemFinenessGrade(String itemFinenessGrade) {
		this.itemFinenessGrade = itemFinenessGrade;
	}

	public ItemInstallmentInfoDTO getItemInstallmentInfo() {
		return this.itemInstallmentInfo;
	}
	public void setItemInstallmentInfo(ItemInstallmentInfoDTO itemInstallmentInfo) {
		this.itemInstallmentInfo = itemInstallmentInfo;
	}

	public String getMaxSalePrice() {
		return this.maxSalePrice;
	}
	public void setMaxSalePrice(String maxSalePrice) {
		this.maxSalePrice = maxSalePrice;
	}

	public String getMinSalePrice() {
		return this.minSalePrice;
	}
	public void setMinSalePrice(String minSalePrice) {
		this.minSalePrice = minSalePrice;
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

	public String getPriceMode() {
		return this.priceMode;
	}
	public void setPriceMode(String priceMode) {
		this.priceMode = priceMode;
	}

	public RentGoodsInfoDTO getRentGoodsInfo() {
		return this.rentGoodsInfo;
	}
	public void setRentGoodsInfo(RentGoodsInfoDTO rentGoodsInfo) {
		this.rentGoodsInfo = rentGoodsInfo;
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
