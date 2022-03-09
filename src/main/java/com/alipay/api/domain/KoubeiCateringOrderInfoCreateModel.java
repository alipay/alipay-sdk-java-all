package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮pos业务订单创建
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:55
 */
public class KoubeiCateringOrderInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2363233744936685114L;

	/**
	 * 商户业务类型：DINNER-正餐、SNACK-快餐
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 订单渠道：ISV，ElEME
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 就餐类型：FOR_HERE—堂食、TAKE_OUT-外卖、TO_GO-外带
	 */
	@ApiField("dinner_type")
	private String dinnerType;

	/**
	 * 订单菜明细列表
	 */
	@ApiListField("dish_details")
	@ApiField("kb_pos_order_dish_detail")
	private List<KbPosOrderDishDetail> dishDetails;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 开台操作员ID
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 点餐方式：POS-pos点餐、SCAN-扫码点菜、PLATFORM-平台(外卖类的)
	 */
	@ApiField("order_style")
	private String orderStyle;

	/**
	 * 下单时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 原反结订单的设备号
	 */
	@ApiField("org_dv_sn")
	private String orgDvSn;

	/**
	 * 原反结订单的pos本地订单号
	 */
	@ApiField("org_out_biz_no")
	private String orgOutBizNo;

	/**
	 * 其他杂费，以元为单位，精确到分
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/**
	 * 打包费，以元为单位，精确到分
	 */
	@ApiField("packing_amount")
	private String packingAmount;

	/**
	 * 用餐人数
	 */
	@ApiField("people_num")
	private Long peopleNum;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	/**
	 * 服务费，以元为单位，精确到分
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 口碑体系内的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 开台时间，格式yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("table_time")
	private Date tableTime;

	/**
	 * 取餐号码，示例：
桌号：04，令牌：13，取餐号：5100，配送：2018012912312312321（比如饿了么订单号）
	 */
	@ApiField("take_no")
	private String takeNo;

	/**
	 * 取餐类型：TABLE-桌号，TOKEN-令牌，NO-取餐号，DISPATCH-配送（仅针对外卖）
	 */
	@ApiField("take_style")
	private String takeStyle;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDinnerType() {
		return this.dinnerType;
	}
	public void setDinnerType(String dinnerType) {
		this.dinnerType = dinnerType;
	}

	public List<KbPosOrderDishDetail> getDishDetails() {
		return this.dishDetails;
	}
	public void setDishDetails(List<KbPosOrderDishDetail> dishDetails) {
		this.dishDetails = dishDetails;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getOrderStyle() {
		return this.orderStyle;
	}
	public void setOrderStyle(String orderStyle) {
		this.orderStyle = orderStyle;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrgDvSn() {
		return this.orgDvSn;
	}
	public void setOrgDvSn(String orgDvSn) {
		this.orgDvSn = orgDvSn;
	}

	public String getOrgOutBizNo() {
		return this.orgOutBizNo;
	}
	public void setOrgOutBizNo(String orgOutBizNo) {
		this.orgOutBizNo = orgOutBizNo;
	}

	public String getOtherAmount() {
		return this.otherAmount;
	}
	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}

	public String getPackingAmount() {
		return this.packingAmount;
	}
	public void setPackingAmount(String packingAmount) {
		this.packingAmount = packingAmount;
	}

	public Long getPeopleNum() {
		return this.peopleNum;
	}
	public void setPeopleNum(Long peopleNum) {
		this.peopleNum = peopleNum;
	}

	public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}
	public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Date getTableTime() {
		return this.tableTime;
	}
	public void setTableTime(Date tableTime) {
		this.tableTime = tableTime;
	}

	public String getTakeNo() {
		return this.takeNo;
	}
	public void setTakeNo(String takeNo) {
		this.takeNo = takeNo;
	}

	public String getTakeStyle() {
		return this.takeStyle;
	}
	public void setTakeStyle(String takeStyle) {
		this.takeStyle = takeStyle;
	}

}
