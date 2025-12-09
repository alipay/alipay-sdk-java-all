package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝转账支付接口
 *
 * @author auto create
 * @since 1.0, 2025-11-17 16:20:12
 */
public class AlipayFundTransUniTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3541448656696864155L;

	/**
	 * 描述特定的业务场景，可传的参数如下：
DIRECT_TRANSFER：单笔无密转账到支付宝，B2C现金红包;
PERSONAL_COLLECTION：C2C现金红包-领红包
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转账业务请求的扩展参数，支持传入的扩展参数如下：
sub_biz_scene 子业务场景，红包业务必传，C2C现金红包、B2C现金红包均需传入，取值REDPACKET
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 多币种信息字段，填充支付金额及币种，转账金额及币种，结算金额及币种
	 */
	@ApiField("mutiple_currency_detail")
	private MutipleCurrencyDetail mutipleCurrencyDetail;

	/**
	 * 转账业务的标题，用于在支付宝用户的账单里显示
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 原支付宝业务单号。
	 */
	@ApiField("original_order_id")
	private String originalOrderId;

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
	private Participant payeeInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private Participant payerInfo;

	/**
	 * 业务产品码，
单笔无密转账到支付宝账户固定为:
TRANS_ACCOUNT_NO_PWD；
收发现金红包固定为:
STD_RED_PACKET；
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * "签名信息。 说明：仅特殊场景使用，现金红包场景无需关注。"
	 */
	@ApiField("sign_data")
	private SignData signData;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，STD_RED_PACKET产品取值范围[0.01,100000000]；
TRANS_ACCOUNT_NO_PWD产品取值范围[0.1,100000000]
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 该笔转账使用的转账场景，商户可前往【<a href="https://b.alipay.com/page/bizfund/transferScene/list">支付宝商家平台-资金管理-转账场景</a>】中查看/申明转账场景。<br>
目前支持以下枚举值：现金营销、企业退款、佣金报酬、业务结算、二手回收、公益补助、行政补贴和退款、保险理赔
	 */
	@ApiField("transfer_scene_name")
	private String transferSceneName;

	/**
	 * 转账场景信息，包含转账场景信息类型和转账场景信息描述。需按该笔转账使用的转账场景准确填写
	 */
	@ApiListField("transfer_scene_report_infos")
	@ApiField("transfer_scene_report_info")
	private List<TransferSceneReportInfo> transferSceneReportInfos;

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

	public MutipleCurrencyDetail getMutipleCurrencyDetail() {
		return this.mutipleCurrencyDetail;
	}
	public void setMutipleCurrencyDetail(MutipleCurrencyDetail mutipleCurrencyDetail) {
		this.mutipleCurrencyDetail = mutipleCurrencyDetail;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOriginalOrderId() {
		return this.originalOrderId;
	}
	public void setOriginalOrderId(String originalOrderId) {
		this.originalOrderId = originalOrderId;
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

	public Participant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(Participant payeeInfo) {
		this.payeeInfo = payeeInfo;
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

	public SignData getSignData() {
		return this.signData;
	}
	public void setSignData(SignData signData) {
		this.signData = signData;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransferSceneName() {
		return this.transferSceneName;
	}
	public void setTransferSceneName(String transferSceneName) {
		this.transferSceneName = transferSceneName;
	}

	public List<TransferSceneReportInfo> getTransferSceneReportInfos() {
		return this.transferSceneReportInfos;
	}
	public void setTransferSceneReportInfos(List<TransferSceneReportInfo> transferSceneReportInfos) {
		this.transferSceneReportInfos = transferSceneReportInfos;
	}

}
