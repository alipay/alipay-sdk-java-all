package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付系统对账单下载申请
 *
 * @author auto create
 * @since 1.0, 2026-02-26 14:16:32
 */
public class AlipayCommerceLogisticsFreightflowTradereconApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6393123947637765434L;

	/**
	 * 物流公司编码，由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。
ANT_MYBANK(网商银行模式)
SPDB(浦发银行模式)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 业务幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 母户卡号
	 */
	@ApiField("parent_card_no")
	private String parentCardNo;

	/**
	 * 如果mode为网商银行，则为网商银行分配；
如果mode为浦发银行，则为为商户接入浦发时生成的应用标识；
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 账单日期，格式为yyyyMMdd
mode为网商银行时必填：  
日期规则如下:
1. query_date < Today (当日生成昨日对账单，所以申请时间需早于当日)
2. 六个月前的当月一日 <= query_date
3. isv入驻时间 <= query_date

mode为浦发银行时必填：  
当交易流水号、均为空时，账单日期(交易开始日期)、交易结束日期必填,yyyyMMdd,
	 */
	@ApiField("query_date")
	private String queryDate;

	/**
	 * 最大为20,最小为1
	 */
	@ApiField("query_num")
	private String queryNum;

	/**
	 * mode为网商银行时：
下载账单类型
交易对账单：SYSTEM_TRADE_RECON
交易明细对账单：SYSTEM_TRADE_DETAIL_RECON

mode为浦发银行时：
01-客户入金
02-客户出金
06-子户互转(同一监管账户下的账户互转)
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 浦发银行特定场景参数,当mode=SPDB时必选
	 */
	@ApiField("spdb_spec_params")
	private FreightFlowSpdbSpecParams spdbSpecParams;

	/**
	 * 最小为1
	 */
	@ApiField("start_num")
	private String startNum;

	/**
	 * 子户号
	 */
	@ApiField("sub_card_no")
	private String subCardNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMybankAppId() {
		return this.mybankAppId;
	}
	public void setMybankAppId(String mybankAppId) {
		this.mybankAppId = mybankAppId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getParentCardNo() {
		return this.parentCardNo;
	}
	public void setParentCardNo(String parentCardNo) {
		this.parentCardNo = parentCardNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getQueryDate() {
		return this.queryDate;
	}
	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

	public String getQueryNum() {
		return this.queryNum;
	}
	public void setQueryNum(String queryNum) {
		this.queryNum = queryNum;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public FreightFlowSpdbSpecParams getSpdbSpecParams() {
		return this.spdbSpecParams;
	}
	public void setSpdbSpecParams(FreightFlowSpdbSpecParams spdbSpecParams) {
		this.spdbSpecParams = spdbSpecParams;
	}

	public String getStartNum() {
		return this.startNum;
	}
	public void setStartNum(String startNum) {
		this.startNum = startNum;
	}

	public String getSubCardNo() {
		return this.subCardNo;
	}
	public void setSubCardNo(String subCardNo) {
		this.subCardNo = subCardNo;
	}

}
