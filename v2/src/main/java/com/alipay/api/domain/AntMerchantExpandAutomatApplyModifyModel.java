package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户自助设备信息修改
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:26:47
 */
public class AntMerchantExpandAutomatApplyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3276623164979813916L;

	/**
	 * 机具发货地址信息
	 */
	@ApiField("delivery_address")
	private SmartAddressInfo deliveryAddress;

	/**
	 * 合作类型 COOPERATION_CONTRACT(新签合约机),COOPERATION_EXCLUSIVE(定制机),COOPERATION_REFORM(改造机),COOPERATION_STOCK(存量智能机),COOPERATION_OTHER(其他)
	 */
	@ApiField("machine_cooperation_type")
	private String machineCooperationType;

	/**
	 * 机具出厂时间
	 */
	@ApiField("machine_delivery_date")
	private Date machineDeliveryDate;

	/**
	 * 机具名称，一般采用厂商名称的简称作为设备名称。8个英文字符或4个中文汉字
	 */
	@ApiField("machine_name")
	private String machineName;

	/**
	 * 机具类型，可取值如下：

AUTOMAT(自助售卖机),
WASHING_MACHINE(洗衣机),
MASSAGE_CHAIR(按摩椅),
AIR_BLOWER(吹风机),
CRANE_MACHINE(娃娃机),
EV_CHARGER(充电桩),
SIMULATION_KTV(模拟KTV),
GAME_MACHINE(游戏机),
JUICER(果汁机),
COFFEE_MACHINE(咖啡机),
WATER_PURIFIER(净水设备),
SMART_CONTAINER(智能货柜),
OPEN_SHELVES(开放式货架),
LOTTERY_MACHINE(彩票机),
SCANFACE_AUTOMAT(扫脸售卖机),
CREDIT_CONTAINER(信用货柜),
SCANFACE_CONTAINER(扫脸货柜),
DRUG_SELLING_MACHINE(售药机),
ROCKING_MACHINE(摇摇车),
TOY_EGG_MACHINE(扭蛋机),
PORTABLE_CHARGER(充电宝),
ICE_CREAM_MACHINE(冰淇淋机),
COCONUT_MILK_MACHINE(椰汁机),
PACKED_LUNCH_MACHINE(盒饭机),
BREAKFAST_MACHINE(早餐机),
TISSUE_MACHINE(纸巾机),
NOODLE_MACHINE(面条机),
PROTOTYPE_MACHINE(派样机),
SCANFACE_PORTABLE_CHARGER_SMALL(扫脸小充电宝),
OTHER(其他)
	 */
	@ApiField("machine_type")
	private String machineType;

	/**
	 * 商户的支付宝账号ID
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 运营商类型 ALIPAY_MERCHANT(支付宝商家),DISTRIBUTOR(渠道商),ISV(ISV服务商),OPERATOR_MERCHANT(运营商)
	 */
	@ApiField("merchant_user_type")
	private String merchantUserType;

	/**
	 * 机具点位地址信息
	 */
	@ApiField("point_position")
	private SmartAddressInfo pointPosition;

	/**
	 * 自助售卖机场景信息
	 */
	@ApiField("scene")
	private SmartAutomatScene scene;

	/**
	 * 机具终端ID，由开发者生成，并需保证在开发者端不重复
	 */
	@ApiField("terminal_id")
	private String terminalId;

	public SmartAddressInfo getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(SmartAddressInfo deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getMachineCooperationType() {
		return this.machineCooperationType;
	}
	public void setMachineCooperationType(String machineCooperationType) {
		this.machineCooperationType = machineCooperationType;
	}

	public Date getMachineDeliveryDate() {
		return this.machineDeliveryDate;
	}
	public void setMachineDeliveryDate(Date machineDeliveryDate) {
		this.machineDeliveryDate = machineDeliveryDate;
	}

	public String getMachineName() {
		return this.machineName;
	}
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getMachineType() {
		return this.machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMerchantUserType() {
		return this.merchantUserType;
	}
	public void setMerchantUserType(String merchantUserType) {
		this.merchantUserType = merchantUserType;
	}

	public SmartAddressInfo getPointPosition() {
		return this.pointPosition;
	}
	public void setPointPosition(SmartAddressInfo pointPosition) {
		this.pointPosition = pointPosition;
	}

	public SmartAutomatScene getScene() {
		return this.scene;
	}
	public void setScene(SmartAutomatScene scene) {
		this.scene = scene;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

}
