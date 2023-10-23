package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算单创建请求
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:40:50
 */
public class SettlementBillCreateOrder extends AlipayObject {

	private static final long serialVersionUID = 4633967217889825432L;

	/**
	 * 合同编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 合约体系：
IARCORE - ipay合约中心
MYBKARCORE - 网商产品中心
ARCORE - 主站合约 中心
OTHER - 其他合约中心
	 */
	@ApiField("ar_source")
	private String arSource;

	/**
	 * 结算周期
DAILY  -按日
TEN_DAY - 旬结
WEEKLY-周结
MOTHLY-月结
QUARTERLY - 旬结
HALF_YEAR - 半年结
YEARLY - 年结
BIENNIALLY - 两年结
	 */
	@ApiField("business_period")
	private String businessPeriod;

	/**
	 * 结算周期偏移 单位为天
     如某业务月结，但结算周期是从 某月5号到下一月5号，则此时此处填写5 表示5天偏移量
	 */
	@ApiField("business_period_offset")
	private Long businessPeriodOffset;

	/**
	 * 业务扩展类型
当前大量的业务系统采取复用产品码的方案，需要额外的业务识别才能够明确业务
	 */
	@ApiField("business_recognize_ext")
	private MapParameter businessRecognizeExt;

	/**
	 * 扩展信息透传
	 */
	@ApiField("exn_info")
	private MapParameter exnInfo;

	/**
	 * 我方ou缩写
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 结算对象pid。用于标明向谁开票、对账
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 外部业务单据号。此单号会用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 账号的类型

BANK-银行
ALIPAY-支付宝
MYBANK-网商银行
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 付款方账号
	 */
	@ApiField("payer_account")
	private String payerAccount;

	/**
	 * 账号的类型
参考payeeaccounttype
	 */
	@ApiField("payer_account_type")
	private String payerAccountType;

	/**
	 * 产品编码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 产品体系：
IPTCORE -ipay产品中心
MYBKPTCORE - 网商产品中心
PTCORE - 主站产品中心
AFC - 金融云产品中心
	 */
	@ApiField("pd_source")
	private String pdSource;

	/**
	 * 业务开始时间
	 */
	@ApiField("service_begin_date")
	private String serviceBeginDate;

	/**
	 * 业务结束时间
	 */
	@ApiField("service_end_date")
	private String serviceEndDate;

	/**
	 * 结算金额
	 */
	@ApiField("settle_amount")
	private MultiCurrencyMoneyOpenApi settleAmount;

	/**
	 * 结算依据
	 */
	@ApiField("settle_basis")
	private Long settleBasis;

	/**
	 * 收费费率
	 */
	@ApiField("settle_rate")
	private Long settleRate;

	/**
	 * CONTRACT - 合同
TRADING_AMOUNT - 交易金额
TRADING_QUANTITY - 交易笔数
	 */
	@ApiField("settlement_basic_type")
	private String settlementBasicType;

	/**
	 * REAL_TIME-实时
DELAYED -后收
	 */
	@ApiField("settlement_type")
	private String settlementType;

	/**
	 * 签约对象-用于标明谁跟我们签约
	 */
	@ApiField("sign_ip_role_id")
	private String signIpRoleId;

	/**
	 * 调用方系统名称
	 */
	@ApiField("source")
	private String source;

	/**
	 * 时区。
国内业务都是东8区（北京时间）
UTC+08:00
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 用户体系：
ICIF - ipay用户体系
MYBKCIF - 网商银行用户体系
CIF - 主站用户体系
UC - 金融云用户体系
	 */
	@ApiField("user_source")
	private String userSource;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getArSource() {
		return this.arSource;
	}
	public void setArSource(String arSource) {
		this.arSource = arSource;
	}

	public String getBusinessPeriod() {
		return this.businessPeriod;
	}
	public void setBusinessPeriod(String businessPeriod) {
		this.businessPeriod = businessPeriod;
	}

	public Long getBusinessPeriodOffset() {
		return this.businessPeriodOffset;
	}
	public void setBusinessPeriodOffset(Long businessPeriodOffset) {
		this.businessPeriodOffset = businessPeriodOffset;
	}

	public MapParameter getBusinessRecognizeExt() {
		return this.businessRecognizeExt;
	}
	public void setBusinessRecognizeExt(MapParameter businessRecognizeExt) {
		this.businessRecognizeExt = businessRecognizeExt;
	}

	public MapParameter getExnInfo() {
		return this.exnInfo;
	}
	public void setExnInfo(MapParameter exnInfo) {
		this.exnInfo = exnInfo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayerAccount() {
		return this.payerAccount;
	}
	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPayerAccountType() {
		return this.payerAccountType;
	}
	public void setPayerAccountType(String payerAccountType) {
		this.payerAccountType = payerAccountType;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getPdSource() {
		return this.pdSource;
	}
	public void setPdSource(String pdSource) {
		this.pdSource = pdSource;
	}

	public String getServiceBeginDate() {
		return this.serviceBeginDate;
	}
	public void setServiceBeginDate(String serviceBeginDate) {
		this.serviceBeginDate = serviceBeginDate;
	}

	public String getServiceEndDate() {
		return this.serviceEndDate;
	}
	public void setServiceEndDate(String serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}

	public MultiCurrencyMoneyOpenApi getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(MultiCurrencyMoneyOpenApi settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Long getSettleBasis() {
		return this.settleBasis;
	}
	public void setSettleBasis(Long settleBasis) {
		this.settleBasis = settleBasis;
	}

	public Long getSettleRate() {
		return this.settleRate;
	}
	public void setSettleRate(Long settleRate) {
		this.settleRate = settleRate;
	}

	public String getSettlementBasicType() {
		return this.settlementBasicType;
	}
	public void setSettlementBasicType(String settlementBasicType) {
		this.settlementBasicType = settlementBasicType;
	}

	public String getSettlementType() {
		return this.settlementType;
	}
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public String getSignIpRoleId() {
		return this.signIpRoleId;
	}
	public void setSignIpRoleId(String signIpRoleId) {
		this.signIpRoleId = signIpRoleId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getUserSource() {
		return this.userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}

}
