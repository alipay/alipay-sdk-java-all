package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtendData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.misetorder.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 09:56:38
 */
public class AlipayCommerceMedicalMisetorderInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7796639298534867767L;

	/** 
	 * 人员证书编号，用于唯一标识证书。
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 清算经办机构（清算分中心	医保中心返回）
	 */
	@ApiField("clr_optins")
	private String clrOptins;

	/** 
	 * 清算类别
	 */
	@ApiField("clr_type")
	private String clrType;

	/** 
	 * 人员参保地区划
	 */
	@ApiField("insuplc_admdvs")
	private String insuplcAdmdvs;

	/** 
	 * 险种类型
[
  {"name": "职工基本医疗保险", "value": "310"},
  {"name": "城乡居民基本医疗保险", "value": "390"},
  {"name": "公务员医疗补助", "value": "320"},
  {"name": "城乡居民大病医疗保险", "value": "392"},
  {"name": "大额医疗费用补助", "value": "330"},
  {"name": "生育保险", "value": "510"},
  {"name": "离休人员医疗保障", "value": "340"}
]
	 */
	@ApiField("insutype")
	private String insutype;

	/** 
	 * 门诊/住院流水号(医保门诊挂号/入院办理返回的就诊 id)
	 */
	@ApiField("mdtrt_id")
	private String mdtrtId;

	/** 
	 * 医疗类别
	 */
	@ApiField("med_type")
	private String medType;

	/** 
	 * 医疗总费用
	 */
	@ApiField("medfee_sumamt")
	private String medfeeSumamt;

	/** 
	 * 医保个账金额，个人账户支出
	 */
	@ApiField("mi_personal_amt")
	private String miPersonalAmt;

	/** 
	 * 医保统筹金额，基金支付总额
	 */
	@ApiField("mi_pool_amt")
	private String miPoolAmt;

	/** 
	 * 支付结算信息
	 */
	@ApiField("pay_settle_info")
	private ExtendData paySettleInfo;

	/** 
	 * 个人现金，单位元
	 */
	@ApiField("psn_cash_pay")
	private String psnCashPay;

	/** 
	 * 01-身份证
	 */
	@ApiField("psn_cert_type")
	private String psnCertType;

	/** 
	 * 人员姓名，信息脱敏。
	 */
	@ApiField("psn_name")
	private String psnName;

	/** 
	 * 人员编号
	 */
	@ApiField("psn_no")
	private String psnNo;

	/** 
	 * 退款流程中的结算ID，可能没有
	 */
	@ApiField("refund_set_id")
	private String refundSetId;

	/** 
	 * 退款结算时间，退款才有，格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("refund_set_time")
	private Date refundSetTime;

	/** 
	 * 医保退款信息
	 */
	@ApiField("refund_settle_info")
	private ExtendData refundSettleInfo;

	/** 
	 * 医保结算ID
	 */
	@ApiField("set_id")
	private String setId;

	/** 
	 * 2025-03-24 15:54:02	结算时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("set_time")
	private Date setTime;

	/** 
	 * 医保国际编码，医保机构编码
	 */
	@ApiField("store_mi_code")
	private String storeMiCode;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setClrOptins(String clrOptins) {
		this.clrOptins = clrOptins;
	}
	public String getClrOptins( ) {
		return this.clrOptins;
	}

	public void setClrType(String clrType) {
		this.clrType = clrType;
	}
	public String getClrType( ) {
		return this.clrType;
	}

	public void setInsuplcAdmdvs(String insuplcAdmdvs) {
		this.insuplcAdmdvs = insuplcAdmdvs;
	}
	public String getInsuplcAdmdvs( ) {
		return this.insuplcAdmdvs;
	}

	public void setInsutype(String insutype) {
		this.insutype = insutype;
	}
	public String getInsutype( ) {
		return this.insutype;
	}

	public void setMdtrtId(String mdtrtId) {
		this.mdtrtId = mdtrtId;
	}
	public String getMdtrtId( ) {
		return this.mdtrtId;
	}

	public void setMedType(String medType) {
		this.medType = medType;
	}
	public String getMedType( ) {
		return this.medType;
	}

	public void setMedfeeSumamt(String medfeeSumamt) {
		this.medfeeSumamt = medfeeSumamt;
	}
	public String getMedfeeSumamt( ) {
		return this.medfeeSumamt;
	}

	public void setMiPersonalAmt(String miPersonalAmt) {
		this.miPersonalAmt = miPersonalAmt;
	}
	public String getMiPersonalAmt( ) {
		return this.miPersonalAmt;
	}

	public void setMiPoolAmt(String miPoolAmt) {
		this.miPoolAmt = miPoolAmt;
	}
	public String getMiPoolAmt( ) {
		return this.miPoolAmt;
	}

	public void setPaySettleInfo(ExtendData paySettleInfo) {
		this.paySettleInfo = paySettleInfo;
	}
	public ExtendData getPaySettleInfo( ) {
		return this.paySettleInfo;
	}

	public void setPsnCashPay(String psnCashPay) {
		this.psnCashPay = psnCashPay;
	}
	public String getPsnCashPay( ) {
		return this.psnCashPay;
	}

	public void setPsnCertType(String psnCertType) {
		this.psnCertType = psnCertType;
	}
	public String getPsnCertType( ) {
		return this.psnCertType;
	}

	public void setPsnName(String psnName) {
		this.psnName = psnName;
	}
	public String getPsnName( ) {
		return this.psnName;
	}

	public void setPsnNo(String psnNo) {
		this.psnNo = psnNo;
	}
	public String getPsnNo( ) {
		return this.psnNo;
	}

	public void setRefundSetId(String refundSetId) {
		this.refundSetId = refundSetId;
	}
	public String getRefundSetId( ) {
		return this.refundSetId;
	}

	public void setRefundSetTime(Date refundSetTime) {
		this.refundSetTime = refundSetTime;
	}
	public Date getRefundSetTime( ) {
		return this.refundSetTime;
	}

	public void setRefundSettleInfo(ExtendData refundSettleInfo) {
		this.refundSettleInfo = refundSettleInfo;
	}
	public ExtendData getRefundSettleInfo( ) {
		return this.refundSettleInfo;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}
	public String getSetId( ) {
		return this.setId;
	}

	public void setSetTime(Date setTime) {
		this.setTime = setTime;
	}
	public Date getSetTime( ) {
		return this.setTime;
	}

	public void setStoreMiCode(String storeMiCode) {
		this.storeMiCode = storeMiCode;
	}
	public String getStoreMiCode( ) {
		return this.storeMiCode;
	}

}
