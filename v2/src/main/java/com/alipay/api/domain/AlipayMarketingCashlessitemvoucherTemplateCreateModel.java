package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 无资金单品券创建
 *
 * @author auto create
 * @since 1.0, 2023-09-26 11:34:43
 */
public class AlipayMarketingCashlessitemvoucherTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2124628498643199755L;

	/**
	 * 代金券面额。
当voucher_type为无资金单品代金券（ITEM_CASHLESS_FIX_VOUCHER）时必选。币种为人民币，单位为元。该数值不能小于0.1，且不能大于999元，代表订单金额达到使用门槛后，本券可抵扣相应面额资金。
代金券面额以门槛消费金额为基准，换算成折扣，不能低于9.95折。
当voucher_type为无资金单品折扣券（ITEM_CASHLESS_DISCOUNT_VOUCHER）和无资金单品特价券（ITEM_CASHLESS_SPE_VOUCHER）时此值必须为空。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商家品牌名称。最多12个字符
商户自定义，在通用模板中展示在券LOGO下方。根据券使用场景的不同，该信息的展示位置可能会有不同。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 单品价格可以享受的折扣力度（如填写0.9就表示9折）。
该值必须大于等于0.1且小于1，小数点以后最多保留两位，voucher_type为无资金单品折扣券（ITEM_CASHLESS_DISCOUNT_VOUCHER）时必选，其他券类型场景此值必须为0。
	 */
	@ApiField("discount")
	private Long discount;

	/**
	 * 消费门槛金额。
达到消费门槛金额以后用户可以享受优惠，消费门槛金额不能小于0.1元，不能超过9999元。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 所有商品最多可享折扣数量。 当用户购买多件时，最多可以对几件特价支付。假设券类型为无资金单品特价券(ITEM_CASHLESS_SPE_VOUCHER)，商品编码填写A、B，此参数传入2，则订单中不管是A或者B，一共只能优惠2件，第3件以上原价。必须是整数，最低数量为1，最高99。券类型为无资金单品折扣券(ITEM_CASHLESS_DISCOUNT_VOUCHER)和无资金单品特价券(ITEM_CASHLESS_SPE_VOUCHER)时必填，无资金单品代金券下此值必须为0。
特别注意：此字段折扣数量的计算方式，相对老版本发生了变化。老版本的计算方式如下： 同样假设券类型为无资金单品特价券（ITEM_CASHLESS_SPE_VOUCHER），商品编码填写A、B，此参数传入3，则订单中A、B两个单品分别最多3件特价X元，第4件以上原价。必须是整数，最低数量为1，最高99。 voucher_type为无资金单品折扣券（ITEM_CASHLESS_DISCOUNT_VOUCHER）和无资金单品特价券（ITEM_CASHLESS_SPE_VOUCHER）时必填，无资金单品代金券下此值必须为0。可以直接通过产品文档说明中的API的版本信息或者创建券模板返回结果中的的最大优惠字段（voucher_discount_limit）来确认具体使用的哪种折扣方式。
	 */
	@ApiField("goods_ceiling_quantity")
	private String goodsCeilingQuantity;

	/**
	 * 单品券封面图片。
请先通过 <a href="https://opendocs.alipay.com/pre-apis/00a8ae">alipay.marketing.material.image.upload</a>(营销图片资源上传接口)上传图片。通过图片上传接口获得图片资源ID以后，将该图片资源ID传入，单张大小不超过2MB，格式支持png、gif、jpg、jpeg、bmp，尺寸为800X600。
	 */
	@ApiField("goods_cover_image_id")
	private String goodsCoverImageId;

	/**
	 * 单品券详情图片。
请先通过 <a href="https://opendocs.alipay.com/pre-apis/00a8ae">alipay.marketing.material.image.upload</a>(营销图片资源上传接口)上传图片。通过图片上传接口获得图片资源ID以后，将该图片资源ID传入，单张大小不超过2MB，格式支持png、gif、jpg、jpeg、bmp，尺寸为800X600。
最多支持3张单品详情图片，图片资源ID用英文逗号分隔，不可含有重复资源ID。
	 */
	@ApiField("goods_detail_image_ids")
	private String goodsDetailImageIds;

	/**
	 * 可优惠商品编码，商家自定义。多个编码用 ',' 隔开，不能含有重复ID，最多3000个单品数量。当用户支付时，交易中的商品编码和单品券配置的商品编码有任一匹配时，可以使用单品优惠券。
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品描述信息。
用于券面展示，向用户介绍商品，最多120字。
	 */
	@ApiField("goods_info")
	private String goodsInfo;

	/**
	 * 商品名称。最多12个字
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品原价。
当voucher_type为无资金单品折扣券（ITEM_CASHLESS_DISCOUNT_VOUCHER）和无资金单品特价券（ITEM_CASHLESS_SPE_VOUCHER）时必选，无资金单品代金券（ITEM_CASHLESS_FIX_VOUCHER）类型下此值必须为空。用于计算最大优惠价格（最大优惠价格的计算方式请参考产品说明文档）。
	 */
	@ApiField("goods_origin_price")
	private String goodsOriginPrice;

	/**
	 * 券变动异步通知地址
	 */
	@ApiField("notify_uri")
	private String notifyUri;

	/**
	 * 外部业务单号。用作幂等控制。同一个pid下相同的外部业务单号作唯一键。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发券。券的发放结束时间和发放开始时间跨度不能大于90天。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 发放开始时间，早于该时间不能发券。发放开始时间不能大于当前时间15天。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 规则配置，JSON字符串，{"PID": "2088512417841101,2088512417841102", "STORE": "123456,678901"}，其中PID表示可以核销该券的PID列表，多个值用英文逗号隔开，PID为必传且需与接口调用PID或授权PID同属一个商家，必须签约当面付，STORE表示可以核销该券的内部门店ID，多个值用英文逗号隔开 。仅支持PID和STOREID核销规则，PID列表和门店ID列表均不能含有重复ID，并且门店ID数量最多支持3000个。
	 */
	@ApiField("rule_conf")
	private String ruleConf;

	/**
	 * 特价面额。使用特定价格购买单品，币种为人民币，最高特价面额不能超过999元。voucher_type为无资金单品特价券（ITEM_CASHLESS_SPE_VOUCHER）时必选，其他券类型场景此值必须为空。
	 */
	@ApiField("special_price")
	private String specialPrice;

	/**
	 * 券可用时段，JSON数组字符串，空数组即[]，表示不限制，指定每周时间段示例：[{"day_rule": "1,2,3,4,5", "time_begin": "09:00:00", "time_end": "22:00:00"}, {"day_rule": "6,7", "time_begin": "08:00:00", "time_end": "23:00:00"}]，数组中每个元素都包含三个key：day_rule, time_begin, time_end，其中day_rule表示周几，取值范围[1, 2, 3, 4, 5, 6, 7]（周7表示星期日），多个值使用英文逗号隔开；time_begin和time_end分别表示生效起始时间和结束时间，格式为HH:mm:ss。另外，数组中各个时间规则是或关系。例如，[{"day_rule": "1,2,3,4,5", "time_begin": "09:00:00", "time_end": "22:00:00"}, {"day_rule": "6,7", "time_begin": "08:00:00", "time_end": "23:00:00"}]表示在每周的一，二，三，四，五的早上9点到晚上10点券可用或者每周的星期六和星期日的早上8点到晚上11点券可用。
	 */
	@ApiField("voucher_available_time")
	private String voucherAvailableTime;

	/**
	 * 券使用说明。JSON数组字符串，最多可以有10条，每条最多50字。必须写明券的使用条件、领取条件、退款规则，请参考示例。
	 */
	@ApiListField("voucher_description")
	@ApiField("string")
	private List<String> voucherDescription;

	/**
	 * 券发放数量
	 */
	@ApiField("voucher_quantity")
	private String voucherQuantity;

	/**
	 * 无资金单品券券类型。目前仅支持：
ITEM_CASHLESS_FIX_VOUCHER：无资金单品代金券；
ITEM_CASHLESS_DISCOUNT_VOUCHER：无资金单品折扣券；
ITEM_CASHLESS_SPE_VOUCHER：无资金单品特价券。
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券有效期，不能超过90天。type：红包有效期类型。支持 ABSOLUTE（绝对时间）、RELATIVE（相对时间）。ABSOLUTE（绝对时间）需传入 start （开始时间），end（结束时间）格式为yyyy-MM-dd HH:mm:ss。RELATIVE（相对时间）需传入 duration（有效时间）表示红包在发放后的duration个单位时间内有效，unit（有效时间单位）支持：MINUTE, HOUR, DAY，如"duration":1,"unit":"DAY"表示红包在发放开始的1天内有效。
	 */
	@ApiField("voucher_valid_period")
	private String voucherValidPeriod;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getDiscount() {
		return this.discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getGoodsCeilingQuantity() {
		return this.goodsCeilingQuantity;
	}
	public void setGoodsCeilingQuantity(String goodsCeilingQuantity) {
		this.goodsCeilingQuantity = goodsCeilingQuantity;
	}

	public String getGoodsCoverImageId() {
		return this.goodsCoverImageId;
	}
	public void setGoodsCoverImageId(String goodsCoverImageId) {
		this.goodsCoverImageId = goodsCoverImageId;
	}

	public String getGoodsDetailImageIds() {
		return this.goodsDetailImageIds;
	}
	public void setGoodsDetailImageIds(String goodsDetailImageIds) {
		this.goodsDetailImageIds = goodsDetailImageIds;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(String goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsOriginPrice() {
		return this.goodsOriginPrice;
	}
	public void setGoodsOriginPrice(String goodsOriginPrice) {
		this.goodsOriginPrice = goodsOriginPrice;
	}

	public String getNotifyUri() {
		return this.notifyUri;
	}
	public void setNotifyUri(String notifyUri) {
		this.notifyUri = notifyUri;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public String getRuleConf() {
		return this.ruleConf;
	}
	public void setRuleConf(String ruleConf) {
		this.ruleConf = ruleConf;
	}

	public String getSpecialPrice() {
		return this.specialPrice;
	}
	public void setSpecialPrice(String specialPrice) {
		this.specialPrice = specialPrice;
	}

	public String getVoucherAvailableTime() {
		return this.voucherAvailableTime;
	}
	public void setVoucherAvailableTime(String voucherAvailableTime) {
		this.voucherAvailableTime = voucherAvailableTime;
	}

	public List<String> getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(List<String> voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherQuantity() {
		return this.voucherQuantity;
	}
	public void setVoucherQuantity(String voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(String voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
