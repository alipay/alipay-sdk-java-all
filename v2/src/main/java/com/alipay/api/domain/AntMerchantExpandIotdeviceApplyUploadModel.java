package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户合作设备入驻
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:25:03
 */
public class AntMerchantExpandIotdeviceApplyUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8169277439116852698L;

	/**
	 * 代申请商家支付宝账号PID(2088开头)
	 */
	@ApiField("agent_alipay_id")
	private String agentAlipayId;

	/**
	 * 申请数量
	 */
	@ApiField("apply_amount")
	private Long applyAmount;

	/**
	 * 申请类型:商家自申请SELF_APPLY、服务商代申请REP_APPLY
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 订单关联设备信息
	 */
	@ApiListField("devices")
	@ApiField("order_device")
	private List<OrderDevice> devices;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 订单修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 设备ITEMID（由蚂蚁提供）
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 设备MI（由蚂蚁提供）
	 */
	@ApiField("mall_item_id")
	private String mallItemId;

	/**
	 * 设备名称（由蚂蚁提供）
	 */
	@ApiField("mall_name")
	private String mallName;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 作业支付宝账号PID(2088开头)，蚂蚁作业小二身份标识（内部工号）、服务商作业小二身份标识（支付宝账号）
	 */
	@ApiField("operated_alipay_id")
	private String operatedAlipayId;

	/**
	 * 订单号：保证业务唯一性，订单号不能重复，重复以后会报错
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态(已安装FINISH_INSTALLED、已取消FINISH_CANCELLED)
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 政策类型：无政策(NO_POLICY),现金返佣(CASH_POLICY),屏幕共享(SHAREING_POLICY)
	 */
	@ApiField("policy_type")
	private String policyType;

	/**
	 * 收件地址详细地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 收件地址市
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * 收件地址区/县
	 */
	@ApiField("receiver_district")
	private String receiverDistrict;

	/**
	 * 收件人电话
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收件人
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件地址省
	 */
	@ApiField("receiver_province")
	private String receiverProvince;

	/**
	 * 结算支付宝账号：结算支付宝账号（商户）、结算支付宝账号（服务商）
	 */
	@ApiField("settled_alipay_id")
	private String settledAlipayId;

	/**
	 * 订单关联店铺信息
	 */
	@ApiField("shop")
	private OrderShop shop;

	/**
	 * 签约支付宝账号PID(2088开头):
商家支付宝账号（用于与蚂蚁签约的支付宝账号）、
外部服务商支付宝账号（用于与蚂蚁签约的支付宝账号）
	 */
	@ApiField("signed_alipay_id")
	private String signedAlipayId;

	public String getAgentAlipayId() {
		return this.agentAlipayId;
	}
	public void setAgentAlipayId(String agentAlipayId) {
		this.agentAlipayId = agentAlipayId;
	}

	public Long getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(Long applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public List<OrderDevice> getDevices() {
		return this.devices;
	}
	public void setDevices(List<OrderDevice> devices) {
		this.devices = devices;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMallItemId() {
		return this.mallItemId;
	}
	public void setMallItemId(String mallItemId) {
		this.mallItemId = mallItemId;
	}

	public String getMallName() {
		return this.mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperatedAlipayId() {
		return this.operatedAlipayId;
	}
	public void setOperatedAlipayId(String operatedAlipayId) {
		this.operatedAlipayId = operatedAlipayId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPolicyType() {
		return this.policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverProvince() {
		return this.receiverProvince;
	}
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public String getSettledAlipayId() {
		return this.settledAlipayId;
	}
	public void setSettledAlipayId(String settledAlipayId) {
		this.settledAlipayId = settledAlipayId;
	}

	public OrderShop getShop() {
		return this.shop;
	}
	public void setShop(OrderShop shop) {
		this.shop = shop;
	}

	public String getSignedAlipayId() {
		return this.signedAlipayId;
	}
	public void setSignedAlipayId(String signedAlipayId) {
		this.signedAlipayId = signedAlipayId;
	}

}
