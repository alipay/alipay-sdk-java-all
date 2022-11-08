package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资金创新场景转账
 *
 * @author auto create
 * @since 1.0, 2022-06-29 13:45:05
 */
public class AlipayFundTransInnovateAppCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 5793469372115644116L;

	/**
	 * 描述特定的业务场景，如果传递了out_biz_no则该字段为必传。
房租：HOUSE_RENT
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转账业务请求的扩展参数，格式为json格式
支持如下属性：
sub_biz_scene 子场景
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 房租的标题，用于在支付宝用户的账单里显示。如果不传会根据不同的场景和pid进行固定文案替换
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户转账唯一订单号，发起转账来源方定义的转账单据ID。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private Participant payeeInfo;

	/**
	 * 付款指定支付渠道类型
	 */
	@ApiListField("payer_enable_channels_info_list")
	@ApiField("payer_payment_d_t_o")
	private List<PayerPaymentDTO> payerEnableChannelsInfoList;

	/**
	 * 付款用户账号信息，房租场景是必填
	 */
	@ApiField("payer_info")
	private Participant payerInfo;

	/**
	 * 销售产品码，商家和支付宝签约的产品码，如果传递了out_biz_no则该字段为必传。可传值如下：
转账到支付宝账号
TRANSFER_TO_ALIPAY_ACCOUNT
转账到银行卡
TRANSFER_TO_BANK_CARD
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 绝对超时时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time_expire")
	private Date timeExpire;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位：
TRANSFER_TO_ALIPAY_ACCOUNT 产品取值范围[0.1,100000000]
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
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

	public Participant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(Participant payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public List<PayerPaymentDTO> getPayerEnableChannelsInfoList() {
		return this.payerEnableChannelsInfoList;
	}
	public void setPayerEnableChannelsInfoList(List<PayerPaymentDTO> payerEnableChannelsInfoList) {
		this.payerEnableChannelsInfoList = payerEnableChannelsInfoList;
	}

	public Participant getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(Participant payerInfo) {
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

	public Date getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
