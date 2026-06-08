package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付交易结果查询-浦发银行交易结果明细复杂对象
 *
 * @author auto create
 * @since 1.0, 2026-02-26 14:16:37
 */
public class FreightFlowSpdbTradeQueryResultDetail extends AlipayObject {

	private static final long serialVersionUID = 8336798944775126985L;

	/**
	 * 摘要
	 */
	@ApiField("abstract_content")
	private String abstractContent;

	/**
	 * 监管账户名
	 */
	@ApiField("acct_name")
	private String acctName;

	/**
	 * 实际的对手方开户行名
	 */
	@ApiField("act_tr_th_dvc_bnk_rpttn")
	private String actTrThDvcBnkRpttn;

	/**
	 * 实际的对手方行号
	 */
	@ApiField("act_tr_th_dvry_wy_bnk_nm")
	private String actTrThDvryWyBnkNm;

	/**
	 * 实际的对手方账户
	 */
	@ApiField("act_tr_th_dvsry_wy_acct")
	private String actTrThDvsryWyAcct;

	/**
	 * 实际的对手方户名
	 */
	@ApiField("act_tr_th_dvy_wy_ccnt_nm")
	private String actTrThDvyWyCcntNm;

	/**
	 * 交易实际发生日期，格式：yyyyMMdd
	 */
	@ApiField("act_tran_date")
	private String actTranDate;

	/**
	 * 标段名称
	 */
	@ApiField("b_dstn_m")
	private String bDstnM;

	/**
	 * 标段号
	 */
	@ApiField("bids_no")
	private String bidsNo;

	/**
	 * 渠道流水号
	 */
	@ApiField("channel_seq_no")
	private String channelSeqNo;

	/**
	 * 子账户名
	 */
	@ApiField("child_acct_nm")
	private String childAcctNm;

	/**
	 * 子账号
	 */
	@ApiField("child_acct_no")
	private String childAcctNo;

	/**
	 * 核心交易日期，格式：yyyyMMdd
	 */
	@ApiField("core_date")
	private String coreDate;

	/**
	 * 借贷标志，格式：0-借/收；1-贷/付
	 */
	@ApiField("debit_flag")
	private String debitFlag;

	/**
	 * 商户名称
	 */
	@ApiField("mrch_name")
	private String mrchName;

	/**
	 * 商户编号
	 */
	@ApiField("mrch_no")
	private String mrchNo;

	/**
	 * 交易实际发生时间，格式：HHmmss
	 */
	@ApiField("occur_time")
	private String occurTime;

	/**
	 * 附言
	 */
	@ApiField("post_script")
	private String postScript;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 备用字段。rfndTransStatus:   交易状态
  当系统交易类型为02或05时，交易状态枚举为00-失败 01-处理中 02-成功 03-已退汇 04-待审核 05-复核拒绝 06-签发拒绝 07-已撤销
  当系统交易类型为06时，交易状态枚举为00-失败 01-处理中 02-成功
	 */
	@ApiField("rsrv_fld")
	private String rsrvFld;

	/**
	 * 监管账号
	 */
	@ApiField("settle_acct_no")
	private String settleAcctNo;

	/**
	 * 系统账务流水号
	 */
	@ApiField("sys_acntg_seq_no")
	private String sysAcntgSeqNo;

	/**
	 * 系统交易流水号
	 */
	@ApiField("sys_tran_seq_no")
	private String sysTranSeqNo;

	/**
	 * 对手方行号
	 */
	@ApiField("th_dvrsry_acct_bnk_nm")
	private String thDvrsryAcctBnkNm;

	/**
	 * 对手方开户行名
	 */
	@ApiField("th_dvrsry_wc_bnk_rpttn")
	private String thDvrsryWcBnkRpttn;

	/**
	 * 对手方账号
	 */
	@ApiField("th_dvrsry_wy_acct_no")
	private String thDvrsryWyAcctNo;

	/**
	 * 单位为分,币种默认为人民币
	 */
	@ApiField("tran_amt")
	private String tranAmt;

	/**
	 * 对手方户名
	 */
	@ApiField("tran_cnter_nm")
	private String tranCnterNm;

	/**
	 * 系统交易日期，格式：yyyyMMdd
	 */
	@ApiField("tran_date")
	private String tranDate;

	/**
	 * 交易机构号
	 */
	@ApiField("tran_inst_yll")
	private String tranInstYll;

	/**
	 * 第三方交易流水号
	 */
	@ApiField("tran_seq_srl_no")
	private String tranSeqSrlNo;

	/**
	 * 核心交易时间，格式：HHmmss
	 */
	@ApiField("tran_time")
	private String tranTime;

	/**
	 * 系统交易时间，格式：HHmmss
	 */
	@ApiField("tran_time_1")
	private String tranTime1;

	/**
	 * 系统交易类型，格式：“00,01,02,...”
  01-客户入金（购房交存类）
  02-客户出金（退款流水，左联划款申请表）
  03-不明入金
  04-非客户入金
  05-非客户出金
  06-会员调拨
	 */
	@ApiField("tran_tp")
	private String tranTp;

	/**
	 * 核心交易流水号
	 */
	@ApiField("ylk_tran_seq_no")
	private String ylkTranSeqNo;

	/**
	 * 邮政编码
	 */
	@ApiField("zip_code")
	private String zipCode;

	public String getAbstractContent() {
		return this.abstractContent;
	}
	public void setAbstractContent(String abstractContent) {
		this.abstractContent = abstractContent;
	}

	public String getAcctName() {
		return this.acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getActTrThDvcBnkRpttn() {
		return this.actTrThDvcBnkRpttn;
	}
	public void setActTrThDvcBnkRpttn(String actTrThDvcBnkRpttn) {
		this.actTrThDvcBnkRpttn = actTrThDvcBnkRpttn;
	}

	public String getActTrThDvryWyBnkNm() {
		return this.actTrThDvryWyBnkNm;
	}
	public void setActTrThDvryWyBnkNm(String actTrThDvryWyBnkNm) {
		this.actTrThDvryWyBnkNm = actTrThDvryWyBnkNm;
	}

	public String getActTrThDvsryWyAcct() {
		return this.actTrThDvsryWyAcct;
	}
	public void setActTrThDvsryWyAcct(String actTrThDvsryWyAcct) {
		this.actTrThDvsryWyAcct = actTrThDvsryWyAcct;
	}

	public String getActTrThDvyWyCcntNm() {
		return this.actTrThDvyWyCcntNm;
	}
	public void setActTrThDvyWyCcntNm(String actTrThDvyWyCcntNm) {
		this.actTrThDvyWyCcntNm = actTrThDvyWyCcntNm;
	}

	public String getActTranDate() {
		return this.actTranDate;
	}
	public void setActTranDate(String actTranDate) {
		this.actTranDate = actTranDate;
	}

	public String getbDstnM() {
		return this.bDstnM;
	}
	public void setbDstnM(String bDstnM) {
		this.bDstnM = bDstnM;
	}

	public String getBidsNo() {
		return this.bidsNo;
	}
	public void setBidsNo(String bidsNo) {
		this.bidsNo = bidsNo;
	}

	public String getChannelSeqNo() {
		return this.channelSeqNo;
	}
	public void setChannelSeqNo(String channelSeqNo) {
		this.channelSeqNo = channelSeqNo;
	}

	public String getChildAcctNm() {
		return this.childAcctNm;
	}
	public void setChildAcctNm(String childAcctNm) {
		this.childAcctNm = childAcctNm;
	}

	public String getChildAcctNo() {
		return this.childAcctNo;
	}
	public void setChildAcctNo(String childAcctNo) {
		this.childAcctNo = childAcctNo;
	}

	public String getCoreDate() {
		return this.coreDate;
	}
	public void setCoreDate(String coreDate) {
		this.coreDate = coreDate;
	}

	public String getDebitFlag() {
		return this.debitFlag;
	}
	public void setDebitFlag(String debitFlag) {
		this.debitFlag = debitFlag;
	}

	public String getMrchName() {
		return this.mrchName;
	}
	public void setMrchName(String mrchName) {
		this.mrchName = mrchName;
	}

	public String getMrchNo() {
		return this.mrchNo;
	}
	public void setMrchNo(String mrchNo) {
		this.mrchNo = mrchNo;
	}

	public String getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(String occurTime) {
		this.occurTime = occurTime;
	}

	public String getPostScript() {
		return this.postScript;
	}
	public void setPostScript(String postScript) {
		this.postScript = postScript;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRsrvFld() {
		return this.rsrvFld;
	}
	public void setRsrvFld(String rsrvFld) {
		this.rsrvFld = rsrvFld;
	}

	public String getSettleAcctNo() {
		return this.settleAcctNo;
	}
	public void setSettleAcctNo(String settleAcctNo) {
		this.settleAcctNo = settleAcctNo;
	}

	public String getSysAcntgSeqNo() {
		return this.sysAcntgSeqNo;
	}
	public void setSysAcntgSeqNo(String sysAcntgSeqNo) {
		this.sysAcntgSeqNo = sysAcntgSeqNo;
	}

	public String getSysTranSeqNo() {
		return this.sysTranSeqNo;
	}
	public void setSysTranSeqNo(String sysTranSeqNo) {
		this.sysTranSeqNo = sysTranSeqNo;
	}

	public String getThDvrsryAcctBnkNm() {
		return this.thDvrsryAcctBnkNm;
	}
	public void setThDvrsryAcctBnkNm(String thDvrsryAcctBnkNm) {
		this.thDvrsryAcctBnkNm = thDvrsryAcctBnkNm;
	}

	public String getThDvrsryWcBnkRpttn() {
		return this.thDvrsryWcBnkRpttn;
	}
	public void setThDvrsryWcBnkRpttn(String thDvrsryWcBnkRpttn) {
		this.thDvrsryWcBnkRpttn = thDvrsryWcBnkRpttn;
	}

	public String getThDvrsryWyAcctNo() {
		return this.thDvrsryWyAcctNo;
	}
	public void setThDvrsryWyAcctNo(String thDvrsryWyAcctNo) {
		this.thDvrsryWyAcctNo = thDvrsryWyAcctNo;
	}

	public String getTranAmt() {
		return this.tranAmt;
	}
	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}

	public String getTranCnterNm() {
		return this.tranCnterNm;
	}
	public void setTranCnterNm(String tranCnterNm) {
		this.tranCnterNm = tranCnterNm;
	}

	public String getTranDate() {
		return this.tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranInstYll() {
		return this.tranInstYll;
	}
	public void setTranInstYll(String tranInstYll) {
		this.tranInstYll = tranInstYll;
	}

	public String getTranSeqSrlNo() {
		return this.tranSeqSrlNo;
	}
	public void setTranSeqSrlNo(String tranSeqSrlNo) {
		this.tranSeqSrlNo = tranSeqSrlNo;
	}

	public String getTranTime() {
		return this.tranTime;
	}
	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public String getTranTime1() {
		return this.tranTime1;
	}
	public void setTranTime1(String tranTime1) {
		this.tranTime1 = tranTime1;
	}

	public String getTranTp() {
		return this.tranTp;
	}
	public void setTranTp(String tranTp) {
		this.tranTp = tranTp;
	}

	public String getYlkTranSeqNo() {
		return this.ylkTranSeqNo;
	}
	public void setYlkTranSeqNo(String ylkTranSeqNo) {
		this.ylkTranSeqNo = ylkTranSeqNo;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
