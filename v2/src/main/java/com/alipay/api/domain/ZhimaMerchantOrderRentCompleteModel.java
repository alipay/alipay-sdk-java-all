package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还订单归还
 *
 * @author auto create
 * @since 1.0, 2022-11-15 15:38:48
 */
public class ZhimaMerchantOrderRentCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 3648877845656441125L;

	/**
	 * 扩展信息。商户发起借用服务时的扩展信息字段，格式：json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 信用借还订单号，通过<a href="https://opendocs.alipay.com/apis/api_8/zhima.merchant.order.rent.create">zhima.merchant.order.rent.create</a>(信用借还订单创建(页面))接口创建信用借还订单后获取。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 金额类型：
RENT:租金
DAMAGE:赔偿金
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

	/**
	 * 信用借还的产品码，固定为：w1010100000000002858。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 物品归还门店名称
	 */
	@ApiField("restore_shop_name")
	private String restoreShopName;

	/**
	 * 物品实际归还时间，borrow_time<restore_time<当前时间+24小时，即该时间不能早于借还订单创建时的borrow_time，且最晚不能晚于当前时间后24小时。
时间格式为 yyyy-mm-dd hh:MM:ss。
	 */
	@ApiField("restore_time")
	private String restoreTime;

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayAmountType() {
		return this.payAmountType;
	}
	public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRestoreShopName() {
		return this.restoreShopName;
	}
	public void setRestoreShopName(String restoreShopName) {
		this.restoreShopName = restoreShopName;
	}

	public String getRestoreTime() {
		return this.restoreTime;
	}
	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
	}

}
