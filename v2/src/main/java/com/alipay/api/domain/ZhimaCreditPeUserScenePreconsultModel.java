package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务预咨询
 *
 * @author auto create
 * @since 1.0, 2022-12-16 22:13:50
 */
public class ZhimaCreditPeUserScenePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 4513786714464292935L;

	/**
	 * 申请免押金额，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 买家的蚂蚁统一会员ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 芝麻信用类目码，由芝麻信用侧分配
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 芝麻信用场景，由芝麻信用侧分配，如：极速退等
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 业务扩展参数，json格式字符串，如果有需要，请提前联系开发人员沟通确定参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 买家的蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 接入商家的订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 风险环境参数信息，json格式字符串，目前已知key如下：umid，设备指纹；imei，设备号；lbs，经纬度；ip，设备网络IP地址；wireless_mac，设备无线wifi mac；mac，设备网卡地址
	 */
	@ApiField("risk_info")
	private String riskInfo;

	/**
	 * 卖家（商家）支付宝id
	 */
	@ApiField("seller_id")
	private String sellerId;

	public String getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

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

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

}
