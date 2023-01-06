package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC生态发行订单数据同步
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:15:47
 */
public class AlipayCommerceTransportEtcEcodataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6223519876958329369L;

	/**
	 * 收单方式。支付宝收单：ALIPAY；银行收单：BANK；建行-支付宝轮扣收单：CCB_ZS；
	 */
	@ApiField("acquire_inst")
	private String acquireInst;

	/**
	 * 是否代人办理订单:
代人办理 true;
本人办理 false;
	 */
	@ApiField("agent_flag")
	private String agentFlag;

	/**
	 * 支付宝授权id，在用户前端授权页面同意授权之后生成
	 */
	@ApiField("agree_id")
	private String agreeId;

	/**
	 * 订单申请场景（可空，默认为ONLINE。ONLINE：线上；OFFLINE：线下）
	 */
	@ApiField("apply_scene")
	private String applyScene;

	/**
	 * 订单的业务来源（可空，无默认值）
	 */
	@ApiField("apply_sub_scene")
	private String applySubScene;

	/**
	 * 申请类型,
货车：truck;
客车：bus
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 核定载质量
	 */
	@ApiField("approved_load")
	private String approvedLoad;

	/**
	 * 车轴数
	 */
	@ApiField("axle_count")
	private String axleCount;

	/**
	 * 支付宝收单协议号，支付宝收单时必传；
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 业务发生时间；对应order_status 几个状态的变更时间；
当order_status = CREATEED 时 biz_time 为订单创建时间；order_status = ACTIVATED时 biz_time为设备激活时间，以此类推
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 品牌型号
	 */
	@ApiField("brand_model")
	private String brandModel;

	/**
	 * 用户ETC卡号，同步激活状态必传；
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用户ETC OBU号
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 车辆发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 发行方卡名称；激活时必传
	 */
	@ApiField("etc_name")
	private String etcName;

	/**
	 * 发证日期
	 */
	@ApiField("grant_date")
	private String grantDate;

	/**
	 * 总质量
	 */
	@ApiField("gross_mass")
	private String grossMass;

	/**
	 * 蚂蚁会员统一ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单状态；
0、ORDER_CREATE：创建订单；
1、INFO_SUBMIT：信息已提交；
2、CENSOR_PASS：审核通过；
3、CENSOR_BLOCK：审核驳回；
4、DELIVERYED：已发货；
5、RECEIVED：已收货；
6、ACTIVATED：已激活；
7、UNMOUNTED：已注销；
8、ADD_BLACK：拉黑；
9、REMOVE_BLACK：解黑；
10、CANCEL：取消；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部业务号，对应用户该笔ETC申请单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外廓尺寸
	 */
	@ApiField("outline_size")
	private String outlineSize;

	/**
	 * 车牌颜色,
0：蓝；
1：黄；
2：黑；
3：白；
4：绿；
5：黄绿；
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 办理车牌
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 注册日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 发行方id，一般为ETC卡号前缀：
"3701", "山东省"；
"6201", "甘肃省"；
"3201", "江苏省"；
"1101", "北京"；
"5301", "云南省"；
"4601", "海南省"；
"3301", "浙江省"；
"3101", "上海"；
"6101", "陕西省"；
"1201", "天津"；
"6501", "新疆维吾尔自治区"；
"5201", "贵州省"；
"3401", "安徽省"；
"8201", "澳门特别行政区"；
"4301", "湖南省"；
"1301", "河北省"；
"8101", "香港特别行政区"；
"2101", "辽宁省"；
"5101", "四川省"；
"6401", "宁夏回族自治区"；
"2201", "吉林省"；
"3501", "福建省"；
"4201", "湖北省"；
"4401", "广东省"；
"5001", "重庆"；
"1401", "山西省"；
"3601", "江西省"；
"2301", "黑龙江省"；
"6301", "青海省"；
"4101", "河南省"；
"7101", "台湾省"；
"1501", "内蒙古自治区"；
"5401", "西藏自治区"；
"4501", "广西壮族自治区"；
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 发行方名称；激活时必传
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 准牵引总质量
	 */
	@ApiField("traction_mass")
	private String tractionMass;

	/**
	 * 整备质量
	 */
	@ApiField("unladen_mass")
	private String unladenMass;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户办理ETC预留手机号，激活状态时必传；
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * 核定载人数
	 */
	@ApiField("vehicle_ac")
	private String vehicleAc;

	/**
	 * 车主姓名
	 */
	@ApiField("vehicle_owner_name")
	private String vehicleOwnerName;

	/**
	 * 车辆类型，行驶证上的值，小型轿车；
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 车辆使用性质
	 */
	@ApiField("vehicle_use_type")
	private String vehicleUseType;

	/**
	 * 车辆识别号，请勿乱传，会校验格式；激活状态时必传；
	 */
	@ApiField("vin")
	private String vin;

	public String getAcquireInst() {
		return this.acquireInst;
	}
	public void setAcquireInst(String acquireInst) {
		this.acquireInst = acquireInst;
	}

	public String getAgentFlag() {
		return this.agentFlag;
	}
	public void setAgentFlag(String agentFlag) {
		this.agentFlag = agentFlag;
	}

	public String getAgreeId() {
		return this.agreeId;
	}
	public void setAgreeId(String agreeId) {
		this.agreeId = agreeId;
	}

	public String getApplyScene() {
		return this.applyScene;
	}
	public void setApplyScene(String applyScene) {
		this.applyScene = applyScene;
	}

	public String getApplySubScene() {
		return this.applySubScene;
	}
	public void setApplySubScene(String applySubScene) {
		this.applySubScene = applySubScene;
	}

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getApprovedLoad() {
		return this.approvedLoad;
	}
	public void setApprovedLoad(String approvedLoad) {
		this.approvedLoad = approvedLoad;
	}

	public String getAxleCount() {
		return this.axleCount;
	}
	public void setAxleCount(String axleCount) {
		this.axleCount = axleCount;
	}

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getBrandModel() {
		return this.brandModel;
	}
	public void setBrandModel(String brandModel) {
		this.brandModel = brandModel;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getEtcName() {
		return this.etcName;
	}
	public void setEtcName(String etcName) {
		this.etcName = etcName;
	}

	public String getGrantDate() {
		return this.grantDate;
	}
	public void setGrantDate(String grantDate) {
		this.grantDate = grantDate;
	}

	public String getGrossMass() {
		return this.grossMass;
	}
	public void setGrossMass(String grossMass) {
		this.grossMass = grossMass;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutlineSize() {
		return this.outlineSize;
	}
	public void setOutlineSize(String outlineSize) {
		this.outlineSize = outlineSize;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getTractionMass() {
		return this.tractionMass;
	}
	public void setTractionMass(String tractionMass) {
		this.tractionMass = tractionMass;
	}

	public String getUnladenMass() {
		return this.unladenMass;
	}
	public void setUnladenMass(String unladenMass) {
		this.unladenMass = unladenMass;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getVehicleAc() {
		return this.vehicleAc;
	}
	public void setVehicleAc(String vehicleAc) {
		this.vehicleAc = vehicleAc;
	}

	public String getVehicleOwnerName() {
		return this.vehicleOwnerName;
	}
	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleUseType() {
		return this.vehicleUseType;
	}
	public void setVehicleUseType(String vehicleUseType) {
		this.vehicleUseType = vehicleUseType;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
