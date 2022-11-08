package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多维核算并账受理
 *
 * @author auto create
 * @since 1.0, 2022-04-21 20:34:07
 */
public class AlipayBossFncGfaccenterConsolidationAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 2345666877144447165L;

	/**
	 * （必填）会计期间（非调整账期yyyyMM，调整账期yyyy-MM），默认为期望并账会计日期前6位
	 */
	@ApiField("acc_month")
	private String accMonth;

	/**
	 * （必填）是否调整账期(默认非调整账期)
	 */
	@ApiField("adjust_period")
	private Boolean adjustPeriod;

	/**
	 * （必填）业务链路
	 */
	@ApiField("biz_chain")
	private String bizChain;

	/**
	 * （必填）业务发生时间（yyyy-MM-dd HH:mm:ss格式）
	 */
	@ApiField("biz_date_time")
	private String bizDateTime;

	/**
	 * （必填）并账业务事件码
	 */
	@ApiField("biz_event_code")
	private String bizEventCode;

	/**
	 * （必填）业务模块
	 */
	@ApiField("biz_module")
	private String bizModule;

	/**
	 * （必填）并账业务产品码
	 */
	@ApiField("biz_product_code")
	private String bizProductCode;

	/**
	 * COA类型，当前蚂蚁为 ANT_ORACLE_GL_50388 存在财会凭证行时必填
	 */
	@ApiField("coa_type")
	private String coaType;

	/**
	 * 汇率日期（使用用户汇率及本币信息时必填）（yyyyMMdd格式）
	 */
	@ApiField("exchange_date")
	private String exchangeDate;

	/**
	 * 汇率（使用用户汇率及本币信息时必填）
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/**
	 * 汇率类型（使用用户汇率及本币信息时必填）
	 */
	@ApiField("exchange_type")
	private String exchangeType;

	/**
	 * （必填）期望并账会计日期（yyyyMMdd格式）
	 */
	@ApiField("expect_account_date")
	private String expectAccountDate;

	/**
	 * （必填）凭证日记账描述（长度限制：240个字节，汉字3个字节）
	 */
	@ApiField("je_desc")
	private String jeDesc;

	/**
	 * (必填）凭证行信息列表
	 */
	@ApiListField("je_lines")
	@ApiField("gfac_consolidation_entry_line_d_t_o")
	private List<GfacConsolidationEntryLineDTO> jeLines;

	/**
	 * 凭证日记账名称（长度限制：100个字节，汉字3个字节,为空默认用模块链路设置日记账名称）
	 */
	@ApiField("je_name")
	private String jeName;

	/**
	 * （必填）凭证日记账编号（幂等维度2）
	 */
	@ApiField("je_no")
	private String jeNo;

	/**
	 * 并账描述信息，非必填字段，用于描述说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * （必填）原币币种编码（如CNY、USD）
	 */
	@ApiField("orig_currency_code")
	private String origCurrencyCode;

	/**
	 * （必填）核算机构
	 */
	@ApiField("recon_inst")
	private String reconInst;

	/**
	 * 本币币种编码（使用用户汇率及本币信息时必填）
	 */
	@ApiField("sob_currency_code")
	private String sobCurrencyCode;

	/**
	 * （必填）账套类型(默认PRIMARY)
	 */
	@ApiField("sob_type")
	private String sobType;

	/**
	 * （必填）来源系统（幂等维度1）
	 */
	@ApiField("src_app")
	private String srcApp;

	/**
	 * 登账人工号，非必填
	 */
	@ApiField("submitter")
	private String submitter;

	/**
	 * （必填）是否使用用户汇率及本币信息，如果为true需要填本币信息和汇率信息，false则系统自动处理
	 */
	@ApiField("use_user_rate_info")
	private Boolean useUserRateInfo;

	public String getAccMonth() {
		return this.accMonth;
	}
	public void setAccMonth(String accMonth) {
		this.accMonth = accMonth;
	}

	public Boolean getAdjustPeriod() {
		return this.adjustPeriod;
	}
	public void setAdjustPeriod(Boolean adjustPeriod) {
		this.adjustPeriod = adjustPeriod;
	}

	public String getBizChain() {
		return this.bizChain;
	}
	public void setBizChain(String bizChain) {
		this.bizChain = bizChain;
	}

	public String getBizDateTime() {
		return this.bizDateTime;
	}
	public void setBizDateTime(String bizDateTime) {
		this.bizDateTime = bizDateTime;
	}

	public String getBizEventCode() {
		return this.bizEventCode;
	}
	public void setBizEventCode(String bizEventCode) {
		this.bizEventCode = bizEventCode;
	}

	public String getBizModule() {
		return this.bizModule;
	}
	public void setBizModule(String bizModule) {
		this.bizModule = bizModule;
	}

	public String getBizProductCode() {
		return this.bizProductCode;
	}
	public void setBizProductCode(String bizProductCode) {
		this.bizProductCode = bizProductCode;
	}

	public String getCoaType() {
		return this.coaType;
	}
	public void setCoaType(String coaType) {
		this.coaType = coaType;
	}

	public String getExchangeDate() {
		return this.exchangeDate;
	}
	public void setExchangeDate(String exchangeDate) {
		this.exchangeDate = exchangeDate;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getExchangeType() {
		return this.exchangeType;
	}
	public void setExchangeType(String exchangeType) {
		this.exchangeType = exchangeType;
	}

	public String getExpectAccountDate() {
		return this.expectAccountDate;
	}
	public void setExpectAccountDate(String expectAccountDate) {
		this.expectAccountDate = expectAccountDate;
	}

	public String getJeDesc() {
		return this.jeDesc;
	}
	public void setJeDesc(String jeDesc) {
		this.jeDesc = jeDesc;
	}

	public List<GfacConsolidationEntryLineDTO> getJeLines() {
		return this.jeLines;
	}
	public void setJeLines(List<GfacConsolidationEntryLineDTO> jeLines) {
		this.jeLines = jeLines;
	}

	public String getJeName() {
		return this.jeName;
	}
	public void setJeName(String jeName) {
		this.jeName = jeName;
	}

	public String getJeNo() {
		return this.jeNo;
	}
	public void setJeNo(String jeNo) {
		this.jeNo = jeNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrigCurrencyCode() {
		return this.origCurrencyCode;
	}
	public void setOrigCurrencyCode(String origCurrencyCode) {
		this.origCurrencyCode = origCurrencyCode;
	}

	public String getReconInst() {
		return this.reconInst;
	}
	public void setReconInst(String reconInst) {
		this.reconInst = reconInst;
	}

	public String getSobCurrencyCode() {
		return this.sobCurrencyCode;
	}
	public void setSobCurrencyCode(String sobCurrencyCode) {
		this.sobCurrencyCode = sobCurrencyCode;
	}

	public String getSobType() {
		return this.sobType;
	}
	public void setSobType(String sobType) {
		this.sobType = sobType;
	}

	public String getSrcApp() {
		return this.srcApp;
	}
	public void setSrcApp(String srcApp) {
		this.srcApp = srcApp;
	}

	public String getSubmitter() {
		return this.submitter;
	}
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}

	public Boolean getUseUserRateInfo() {
		return this.useUserRateInfo;
	}
	public void setUseUserRateInfo(Boolean useUserRateInfo) {
		this.useUserRateInfo = useUserRateInfo;
	}

}
