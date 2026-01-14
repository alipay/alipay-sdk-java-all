package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收推广订单信息
 *
 * @author auto create
 * @since 1.0, 2025-11-06 10:07:44
 */
public class MarketingPromotionOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2829885993718614551L;

	/**
	 * 预估金额（固定值）单位为元
	 */
	@ApiField("assess_amount")
	private String assessAmount;

	/**
	 * 预估最大金额（区间值）单位为元，与assess_amount互斥。当估价类型assess_type=RANGE_UNIT区间重量时，此时有最大金额（如衣物统收预估估价为区间2.5元-5元）。
	 */
	@ApiField("assess_max_amount")
	private String assessMaxAmount;

	/**
	 * 预估最大数量（区间值）单位为个、KG或G。与assess_quantity互斥。当估价类型assess_type=RANGE_UNIT区间重量时，此时有最大数量（如衣物统收预估重量为区间5KG-10KG）。
	 */
	@ApiField("assess_max_quantity")
	private String assessMaxQuantity;

	/**
	 * 预估最小金额（区间值）单位为元，与assess_amount互斥。当估价类型assess_type=RANGE_UNIT区间重量时，此时有最小金额（如衣物统收预估估价为区间2.5元-5元）。
	 */
	@ApiField("assess_min_amount")
	private String assessMinAmount;

	/**
	 * 预估最小数量（区间值）单位为个、KG或G，与assess_quantity互斥。当估价类型assess_type=RANGE_UNIT区间重量时，此时有最小数量（如衣物统收预估重量为区间5KG-10KG）。
	 */
	@ApiField("assess_min_quantity")
	private String assessMinQuantity;

	/**
	 * 预估数量（固定值）单位为个、KG或G，支持两位小数点。
	 */
	@ApiField("assess_quantity")
	private String assessQuantity;

	/**
	 * 回收商品估价类型
	 */
	@ApiField("assess_type")
	private String assessType;

	/**
	 * 一级推广员工ID
	 */
	@ApiField("first_level_emp_id")
	private String firstLevelEmpId;

	/**
	 * 订单质检总金额，单位为元
	 */
	@ApiField("inspect_amount")
	private String inspectAmount;

	/**
	 * 单位为个、KG或G。若服务类目为CLOTHES_RECYCLE则单位为KG
	 */
	@ApiField("inspect_quantity")
	private String inspectQuantity;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_bill_no")
	private String logisticsBillNo;

	/**
	 * 物流平台编码
	 */
	@ApiField("logistics_platform")
	private String logisticsPlatform;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modify_time")
	private String orderModifyTime;

	/**
	 * 支付宝回收订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付宝回收订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商品列表
	 */
	@ApiListField("product_list")
	@ApiField("marketing_product_info")
	private List<MarketingProductInfo> productList;

	/**
	 * 订单推广记录id
	 */
	@ApiField("promo_id")
	private String promoId;

	/**
	 * 推广类型，direct直接推广带来订单，indirect非实时归因带来的订单
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 二级推广员工ID
	 */
	@ApiField("second_level_emp_id")
	private String secondLevelEmpId;

	/**
	 * 回收服务类目code
	 */
	@ApiField("service_category_code")
	private String serviceCategoryCode;

	/**
	 * 推广活动报名id
	 */
	@ApiField("signup_id")
	private String signupId;

	/**
	 * 回收商品单位
	 */
	@ApiField("unit_type")
	private String unitType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAssessAmount() {
		return this.assessAmount;
	}
	public void setAssessAmount(String assessAmount) {
		this.assessAmount = assessAmount;
	}

	public String getAssessMaxAmount() {
		return this.assessMaxAmount;
	}
	public void setAssessMaxAmount(String assessMaxAmount) {
		this.assessMaxAmount = assessMaxAmount;
	}

	public String getAssessMaxQuantity() {
		return this.assessMaxQuantity;
	}
	public void setAssessMaxQuantity(String assessMaxQuantity) {
		this.assessMaxQuantity = assessMaxQuantity;
	}

	public String getAssessMinAmount() {
		return this.assessMinAmount;
	}
	public void setAssessMinAmount(String assessMinAmount) {
		this.assessMinAmount = assessMinAmount;
	}

	public String getAssessMinQuantity() {
		return this.assessMinQuantity;
	}
	public void setAssessMinQuantity(String assessMinQuantity) {
		this.assessMinQuantity = assessMinQuantity;
	}

	public String getAssessQuantity() {
		return this.assessQuantity;
	}
	public void setAssessQuantity(String assessQuantity) {
		this.assessQuantity = assessQuantity;
	}

	public String getAssessType() {
		return this.assessType;
	}
	public void setAssessType(String assessType) {
		this.assessType = assessType;
	}

	public String getFirstLevelEmpId() {
		return this.firstLevelEmpId;
	}
	public void setFirstLevelEmpId(String firstLevelEmpId) {
		this.firstLevelEmpId = firstLevelEmpId;
	}

	public String getInspectAmount() {
		return this.inspectAmount;
	}
	public void setInspectAmount(String inspectAmount) {
		this.inspectAmount = inspectAmount;
	}

	public String getInspectQuantity() {
		return this.inspectQuantity;
	}
	public void setInspectQuantity(String inspectQuantity) {
		this.inspectQuantity = inspectQuantity;
	}

	public String getLogisticsBillNo() {
		return this.logisticsBillNo;
	}
	public void setLogisticsBillNo(String logisticsBillNo) {
		this.logisticsBillNo = logisticsBillNo;
	}

	public String getLogisticsPlatform() {
		return this.logisticsPlatform;
	}
	public void setLogisticsPlatform(String logisticsPlatform) {
		this.logisticsPlatform = logisticsPlatform;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderModifyTime() {
		return this.orderModifyTime;
	}
	public void setOrderModifyTime(String orderModifyTime) {
		this.orderModifyTime = orderModifyTime;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public List<MarketingProductInfo> getProductList() {
		return this.productList;
	}
	public void setProductList(List<MarketingProductInfo> productList) {
		this.productList = productList;
	}

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getSecondLevelEmpId() {
		return this.secondLevelEmpId;
	}
	public void setSecondLevelEmpId(String secondLevelEmpId) {
		this.secondLevelEmpId = secondLevelEmpId;
	}

	public String getServiceCategoryCode() {
		return this.serviceCategoryCode;
	}
	public void setServiceCategoryCode(String serviceCategoryCode) {
		this.serviceCategoryCode = serviceCategoryCode;
	}

	public String getSignupId() {
		return this.signupId;
	}
	public void setSignupId(String signupId) {
		this.signupId = signupId;
	}

	public String getUnitType() {
		return this.unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
