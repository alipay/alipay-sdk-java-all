package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医保移动支付创单并支付
 *
 * @author auto create
 * @since 1.0, 2024-10-22 19:08:13
 */
public class AlipayCommerceMedicalTradeCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 1154499466615678461L;

	/**
	 * 医保个账支付金额
	 */
	@ApiField("account_amount")
	private String accountAmount;

	/**
	 * 支付宝用户ID，2088开头的16为数字
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付成功回跳页面地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 渠道标识，由平台分配给商户
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 医院上传处方明细的收费批次号
	 */
	@ApiField("chrg_bch_no")
	private String chrgBchNo;

	/**
	 * 默认值normal
	 */
	@ApiField("display_mode")
	private String displayMode;

	/**
	 * 医保支付扩展参数
	 */
	@ApiField("extend_params")
	private InsurancePayExtendParams extendParams;

	/**
	 * 商户订单创建时间
	 */
	@ApiField("gmt_out_create")
	private Date gmtOutCreate;

	/**
	 * 支付超时时间
	 */
	@ApiField("gmt_time_expire")
	private Date gmtTimeExpire;

	/**
	 * 医保基金支付金额
	 */
	@ApiField("gov_amount")
	private String govAmount;

	/**
	 * 行业标识
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 医保支付场景标识
	 */
	@ApiField("insurance_pay_scene")
	private String insurancePayScene;

	/**
	 * 医院支付订单号
	 */
	@ApiField("med_org_ord")
	private String medOrgOrd;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 新国标定点医药机构编码
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 医保其他支付金额
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/**
	 * 外部交易号，需保证商户维度唯一性
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付授权码
	 */
	@ApiField("pay_auth_no")
	private String payAuthNo;

	/**
	 * 医保订单号
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 用户自费实付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 医保数据透传结构体
	 */
	@ApiField("request_content")
	private String requestContent;

	/**
	 * 支付结果异步通知地址
	 */
	@ApiField("result_notify_url")
	private String resultNotifyUrl;

	/**
	 * 平台分配给商户的门店ID，与store_id二选一
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 外部门店ID，与shop_id二选一；
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 补充计算金额参数列表
	 */
	@ApiListField("subsidy_amount_params")
	@ApiField("subsidy_amount_param")
	private List<SubsidyAmountParam> subsidyAmountParams;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAccountAmount() {
		return this.accountAmount;
	}
	public void setAccountAmount(String accountAmount) {
		this.accountAmount = accountAmount;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getChrgBchNo() {
		return this.chrgBchNo;
	}
	public void setChrgBchNo(String chrgBchNo) {
		this.chrgBchNo = chrgBchNo;
	}

	public String getDisplayMode() {
		return this.displayMode;
	}
	public void setDisplayMode(String displayMode) {
		this.displayMode = displayMode;
	}

	public InsurancePayExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(InsurancePayExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public Date getGmtOutCreate() {
		return this.gmtOutCreate;
	}
	public void setGmtOutCreate(Date gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}

	public Date getGmtTimeExpire() {
		return this.gmtTimeExpire;
	}
	public void setGmtTimeExpire(Date gmtTimeExpire) {
		this.gmtTimeExpire = gmtTimeExpire;
	}

	public String getGovAmount() {
		return this.govAmount;
	}
	public void setGovAmount(String govAmount) {
		this.govAmount = govAmount;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getInsurancePayScene() {
		return this.insurancePayScene;
	}
	public void setInsurancePayScene(String insurancePayScene) {
		this.insurancePayScene = insurancePayScene;
	}

	public String getMedOrgOrd() {
		return this.medOrgOrd;
	}
	public void setMedOrgOrd(String medOrgOrd) {
		this.medOrgOrd = medOrgOrd;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrgNo() {
		return this.orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOtherAmount() {
		return this.otherAmount;
	}
	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayAuthNo() {
		return this.payAuthNo;
	}
	public void setPayAuthNo(String payAuthNo) {
		this.payAuthNo = payAuthNo;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getRequestContent() {
		return this.requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public String getResultNotifyUrl() {
		return this.resultNotifyUrl;
	}
	public void setResultNotifyUrl(String resultNotifyUrl) {
		this.resultNotifyUrl = resultNotifyUrl;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<SubsidyAmountParam> getSubsidyAmountParams() {
		return this.subsidyAmountParams;
	}
	public void setSubsidyAmountParams(List<SubsidyAmountParam> subsidyAmountParams) {
		this.subsidyAmountParams = subsidyAmountParams;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
