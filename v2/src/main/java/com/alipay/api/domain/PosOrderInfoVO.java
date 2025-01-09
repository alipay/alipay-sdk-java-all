package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv回流pos订单数据
 *
 * @author auto create
 * @since 1.0, 2018-03-08 10:35:41
 */
public class PosOrderInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7389895582569882716L;

	/**
	 * 设备数量
	 */
	@ApiField("device_amount")
	private Long deviceAmount;

	/**
	 * 数据回流ISV名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 数据回流ISV_PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 订单绑定设备信息列表
	 */
	@ApiListField("machine_infos")
	@ApiField("pos_order_device_info_v_o")
	private List<PosOrderDeviceInfoVO> machineInfos;

	/**
	 * 商户手机号
	 */
	@ApiField("merchant_mobile")
	private String merchantMobile;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 购买pos机订单总价格，单位元，精确到小数点后2位
	 */
	@ApiField("order_amt")
	private String orderAmt;

	/**
	 * 购买pos机设备订单来源，分为线下和线上,枚举值为: 线上(ONLINE),线下(OFFLINE)
	 */
	@ApiField("order_channel")
	private String orderChannel;

	/**
	 * 购买pos机设备订单编号：线上来源订单为订单编号，线下来源订单为合同编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 销售人员id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 销售人员名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 淘宝账号
	 */
	@ApiField("taobao_login_id")
	private String taobaoLoginId;

	public Long getDeviceAmount() {
		return this.deviceAmount;
	}
	public void setDeviceAmount(Long deviceAmount) {
		this.deviceAmount = deviceAmount;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public List<PosOrderDeviceInfoVO> getMachineInfos() {
		return this.machineInfos;
	}
	public void setMachineInfos(List<PosOrderDeviceInfoVO> machineInfos) {
		this.machineInfos = machineInfos;
	}

	public String getMerchantMobile() {
		return this.merchantMobile;
	}
	public void setMerchantMobile(String merchantMobile) {
		this.merchantMobile = merchantMobile;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOrderAmt() {
		return this.orderAmt;
	}
	public void setOrderAmt(String orderAmt) {
		this.orderAmt = orderAmt;
	}

	public String getOrderChannel() {
		return this.orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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

	public String getTaobaoLoginId() {
		return this.taobaoLoginId;
	}
	public void setTaobaoLoginId(String taobaoLoginId) {
		this.taobaoLoginId = taobaoLoginId;
	}

}
