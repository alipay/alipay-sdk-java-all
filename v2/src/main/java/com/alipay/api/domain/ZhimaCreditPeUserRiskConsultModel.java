package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个人信用准入评估
 *
 * @author auto create
 * @since 1.0, 2022-11-14 14:18:57
 */
public class ZhimaCreditPeUserRiskConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3258151396683666793L;

	/**
	 * 申请免押额度，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 业务action，由芝麻信用分配，目前只能取值：level_600 或者 level_650，分别对应芝麻分600分和650分的准入门槛。后续可能会有更多种取值选择，届时请联系技术支持
	 */
	@ApiField("biz_action")
	private String bizAction;

	/**
	 * 类目code，由芝麻信用分配，目前只能取值：SHARABLE_BICYCLE。后续可能会有多种取值选择，届时请联系技术支持
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 信用场景码，由芝麻信用分配，目前只能取值：credit_evaluate_mini。后续可能会有多种取值选择，届时请联系技术支持
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 业务相关扩展参数，该参数格式是 Map 序列化之后的json字符串，Map中的key请联系技术支持给定。该参数可根据具体需求选填，没有请不填。
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 商户订单号或者流水号，用以标明商户的一次评估调用，可以用来对账等。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 产品码，固定值: w1010100001000002428
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 准入风险评估需要的环境参数，比如用户的ip地址，mac地址等。该参数格式是 Map序列化之后的json字符串，Map中的key请联系技术支持给定。该参数可根据具体需求选填，没有请不填。
	 */
	@ApiField("risk_info")
	private String riskInfo;

	public String getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getBizAction() {
		return this.bizAction;
	}
	public void setBizAction(String bizAction) {
		this.bizAction = bizAction;
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

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
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

}
