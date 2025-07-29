package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻用户信用资产冻结
 *
 * @author auto create
 * @since 1.0, 2022-11-14 14:17:35
 */
public class ZhimaCreditPeUserCreditFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 5747983944537991132L;

	/**
	 * 买家的支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 商户侧类目码，需要商户在芝麻平台进行配置
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 芝麻信用场景，由芝麻信用侧分配，如：天猫信用购，淘宝租赁等
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 订单基本信息，json格式字符串，可传入订单扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 接入商家的订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 风险环境参数信息，json格式字符串，目前已知key如下：umid，设备指纹；imei，设备号；lbs，经纬度；ip，设备网络IP地址；wireless_mac，设备无线wifi mac；mac，设备网卡地址
	 */
	@ApiField("risk_info")
	private String riskInfo;

	/**
	 * 卖家的支付宝id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 子订单模型，至少包含一个子订单信息
	 */
	@ApiListField("sub_order_info")
	@ApiField("credit_freeze_sub_order")
	private List<CreditFreezeSubOrder> subOrderInfo;

	/**
	 * 信用额度待冻结额度，单位为元，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("total_credit_amount")
	private String totalCreditAmount;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public List<CreditFreezeSubOrder> getSubOrderInfo() {
		return this.subOrderInfo;
	}
	public void setSubOrderInfo(List<CreditFreezeSubOrder> subOrderInfo) {
		this.subOrderInfo = subOrderInfo;
	}

	public String getTotalCreditAmount() {
		return this.totalCreditAmount;
	}
	public void setTotalCreditAmount(String totalCreditAmount) {
		this.totalCreditAmount = totalCreditAmount;
	}

}
