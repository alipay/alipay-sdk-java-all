package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值页面创建
 *
 * @author auto create
 * @since 1.0, 2024-11-27 11:57:54
 */
public class AlipayFundDepositorderPageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6396439336179698322L;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]；
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 授权跳转类型
	 */
	@ApiField("apply_link_type")
	private String applyLinkType;

	/**
	 * 回跳链接，结果页点击“完成”后的跳转地址。如果不传，默认跳回支付宝主页
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 描述特定的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 跳转渠道，固定值tinyapp，以业务接入文档为准。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商家侧唯一订单号，由商家自定义。对于不同转账请求，商家需保证该订单号在自身系统唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private DepositPayeeInfoDTO payeeInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private DepositPayerInfoDTO payerInfo;

	/**
	 * 产品码，固定值：STANDARD_DEPOSIT
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 充值备注
	 */
	@ApiField("remark")
	private String remark;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getApplyLinkType() {
		return this.applyLinkType;
	}
	public void setApplyLinkType(String applyLinkType) {
		this.applyLinkType = applyLinkType;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

	public DepositPayeeInfoDTO getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(DepositPayeeInfoDTO payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public DepositPayerInfoDTO getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(DepositPayerInfoDTO payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
