package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标准资金凭证VO模型
 *
 * @author auto create
 * @since 1.0, 2021-12-01 21:21:43
 */
public class StandardVoucherVO extends AlipayObject {

	private static final long serialVersionUID = 4362389491354849254L;

	/**
	 * 业务事件码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 扩展属性 json对象字符串
Map<String, String>
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 资金业务码
	 */
	@ApiField("fund_biz_code")
	private String fundBizCode;

	/**
	 * 资金业务名称
	 */
	@ApiField("fund_biz_name")
	private String fundBizName;

	/**
	 * 主键ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 幂等ID
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 交易方向:CREDIT/DEBIT
	 */
	@ApiField("trans_direction")
	private String transDirection;

	/**
	 * 机构ID，Z50、K53等等，非空
	 */
	@ApiField("trans_inst_id")
	private String transInstId;

	/**
	 * 凭证类型
    BANK("BANK", "银行流水"),

    INNERACCOUNT("INNERACCOUNT", "内部户流水"),

    ALIPAY("ALIPAY", "支付宝流水"),

    LETTEROFCREDIT("LETTEROFCREDIT", "信用证流水");
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFundBizCode() {
		return this.fundBizCode;
	}
	public void setFundBizCode(String fundBizCode) {
		this.fundBizCode = fundBizCode;
	}

	public String getFundBizName() {
		return this.fundBizName;
	}
	public void setFundBizName(String fundBizName) {
		this.fundBizName = fundBizName;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getTransDirection() {
		return this.transDirection;
	}
	public void setTransDirection(String transDirection) {
		this.transDirection = transDirection;
	}

	public String getTransInstId() {
		return this.transInstId;
	}
	public void setTransInstId(String transInstId) {
		this.transInstId = transInstId;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
