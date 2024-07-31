package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑pos订单菜明细
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:04:01
 */
public class KbPosOrderDishDetail extends AlipayObject {

	private static final long serialVersionUID = 1254512315916514373L;

	/**
	 * 改价（单价），以元为单位，精度到分
	 */
	@ApiField("change_price")
	private String changePrice;

	/**
	 * 改价原因
	 */
	@ApiField("change_reason")
	private String changeReason;

	/**
	 * 菜谱ID
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜谱版本号，用时间戳实现（示例：date.getTime()）
	 */
	@ApiField("cook_version")
	private String cookVersion;

	/**
	 * 是否可以享受优惠
	 */
	@ApiField("discountable")
	private Boolean discountable;

	/**
	 * 菜品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品数量，≥1
	 */
	@ApiField("dish_num")
	private Long dishNum;

	/**
	 * 菜品单位
	 */
	@ApiField("dish_unit")
	private String dishUnit;

	/**
	 * 菜品明细版本号
	 */
	@ApiField("dish_version")
	private Long dishVersion;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串。目前包含内容为1、outItemId表示外部菜品id，2、outSkuId外部菜品sku id，3、defaultInCarts开台必点菜。4、cookVersion菜谱版本，5、costInclusive 是否包含在套餐基础价；6、costPrice 原价(以元为单位，精度到分)；7、groupSort：套餐分组排序值；8、isProperty：加料是否为属性字段，值为true／false；
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否改价
	 */
	@ApiField("has_change")
	private Boolean hasChange;

	/**
	 * 是否是主明细，默认都是主明细。除了点套餐的时候，套餐本身这个菜作为主明细设置，套餐下的菜明细作为非主明细设置。
	 */
	@ApiField("main_flag")
	private Boolean mainFlag;

	/**
	 * 主明细id，套餐下的菜品对应的主明细id
	 */
	@ApiField("main_out_detail_no")
	private String mainOutDetailNo;

	/**
	 * 制作状态，取值约定：INIT-未制作，MAKE-已制作，SERVE-已上菜，REFUND-已退菜
	 */
	@ApiField("make_status")
	private String makeStatus;

	/**
	 * 会员价（单价），以元为单位，精度到分
	 */
	@ApiField("member_price")
	private String memberPrice;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 下单操作员ID
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 下单时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * pos本地订单菜明细流水号
	 */
	@ApiField("out_detail_no")
	private String outDetailNo;

	/**
	 * 当前菜为单品菜时,为对应的sku外部ID
当前菜为加料时,为对应的加料的外部ID
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 做法信息，格式按照：做法1,做法2，对于有一般销售属性的菜会拼接一般销售属性信息，格式为：做法1,做法2,销售属性1,销售属性2
	 */
	@ApiField("practice_info")
	private String practiceInfo;

	/**
	 * 做法合计加价（单价），以元为单位，精度到分
	 */
	@ApiField("practice_price")
	private String practicePrice;

	/**
	 * 退菜原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退菜时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 催菜次数
	 */
	@ApiField("remind_time")
	private Long remindTime;

	/**
	 * 销售属性，使用Map<String,List<String>> salesProperties = JSONObject.parseObject(sales_properties,Map.class)转换
	 */
	@ApiField("sales_properties")
	private String salesProperties;

	/**
	 * 销售属性的扩展
	 */
	@ApiListField("sales_properties_ext")
	@ApiField("name_outer_id_pair")
	private List<NameOuterIdPair> salesPropertiesExt;

	/**
	 * 售价（单价），以元为单位，精度到分
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 菜品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 菜品点菜序号
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 规格中文名，没有规格时不需要填写
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 规格名称扩展信息
	 */
	@ApiListField("spec_name_ext")
	@ApiField("name_outer_id_pair")
	private List<NameOuterIdPair> specNameExt;

	/**
	 * 菜明细类型，SINGLE(单品)/SIDE(加料)/COMBO(套餐)/COMBO(套餐内单品)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户身份标识：手机号码、userId等等。如果是支付宝扫码点菜的，就是用户userId
	 */
	@ApiField("user_identity")
	private String userIdentity;

	/**
	 * 叫起状态，取值约定：WAIT-等待叫起，UP-已叫起
	 */
	@ApiField("wake_status")
	private String wakeStatus;

	public String getChangePrice() {
		return this.changePrice;
	}
	public void setChangePrice(String changePrice) {
		this.changePrice = changePrice;
	}

	public String getChangeReason() {
		return this.changeReason;
	}
	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getCookVersion() {
		return this.cookVersion;
	}
	public void setCookVersion(String cookVersion) {
		this.cookVersion = cookVersion;
	}

	public Boolean getDiscountable() {
		return this.discountable;
	}
	public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public Long getDishNum() {
		return this.dishNum;
	}
	public void setDishNum(Long dishNum) {
		this.dishNum = dishNum;
	}

	public String getDishUnit() {
		return this.dishUnit;
	}
	public void setDishUnit(String dishUnit) {
		this.dishUnit = dishUnit;
	}

	public Long getDishVersion() {
		return this.dishVersion;
	}
	public void setDishVersion(Long dishVersion) {
		this.dishVersion = dishVersion;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Boolean getHasChange() {
		return this.hasChange;
	}
	public void setHasChange(Boolean hasChange) {
		this.hasChange = hasChange;
	}

	public Boolean getMainFlag() {
		return this.mainFlag;
	}
	public void setMainFlag(Boolean mainFlag) {
		this.mainFlag = mainFlag;
	}

	public String getMainOutDetailNo() {
		return this.mainOutDetailNo;
	}
	public void setMainOutDetailNo(String mainOutDetailNo) {
		this.mainOutDetailNo = mainOutDetailNo;
	}

	public String getMakeStatus() {
		return this.makeStatus;
	}
	public void setMakeStatus(String makeStatus) {
		this.makeStatus = makeStatus;
	}

	public String getMemberPrice() {
		return this.memberPrice;
	}
	public void setMemberPrice(String memberPrice) {
		this.memberPrice = memberPrice;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutDetailNo() {
		return this.outDetailNo;
	}
	public void setOutDetailNo(String outDetailNo) {
		this.outDetailNo = outDetailNo;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPracticeInfo() {
		return this.practiceInfo;
	}
	public void setPracticeInfo(String practiceInfo) {
		this.practiceInfo = practiceInfo;
	}

	public String getPracticePrice() {
		return this.practicePrice;
	}
	public void setPracticePrice(String practicePrice) {
		this.practicePrice = practicePrice;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public Long getRemindTime() {
		return this.remindTime;
	}
	public void setRemindTime(Long remindTime) {
		this.remindTime = remindTime;
	}

	public String getSalesProperties() {
		return this.salesProperties;
	}
	public void setSalesProperties(String salesProperties) {
		this.salesProperties = salesProperties;
	}

	public List<NameOuterIdPair> getSalesPropertiesExt() {
		return this.salesPropertiesExt;
	}
	public void setSalesPropertiesExt(List<NameOuterIdPair> salesPropertiesExt) {
		this.salesPropertiesExt = salesPropertiesExt;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public List<NameOuterIdPair> getSpecNameExt() {
		return this.specNameExt;
	}
	public void setSpecNameExt(List<NameOuterIdPair> specNameExt) {
		this.specNameExt = specNameExt;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserIdentity() {
		return this.userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

	public String getWakeStatus() {
		return this.wakeStatus;
	}
	public void setWakeStatus(String wakeStatus) {
		this.wakeStatus = wakeStatus;
	}

}
