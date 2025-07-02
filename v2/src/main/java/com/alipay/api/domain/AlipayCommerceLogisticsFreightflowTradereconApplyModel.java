package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付系统对账单下载申请
 *
 * @author auto create
 * @since 1.0, 2025-05-28 16:56:57
 */
public class AlipayCommerceLogisticsFreightflowTradereconApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1767299728219151758L;

	/**
	 * 物流公司编码，由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。
本期：
ANT_MYBANK(网商银行模式)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 业务幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 账单日期，格式为yyyyMMdd
日期规则如下:
1. query_date < Today (当日生成昨日对账单，所以申请时间需早于当日)
2. 六个月前的当月一日 <= query_date
3. isv入驻时间 <= query_date
	 */
	@ApiField("query_date")
	private String queryDate;

	/**
	 * 下载账单类型
交易对账单：SYSTEM_TRADE_RECON
交易明细对账单：SYSTEM_TRADE_DETAIL_RECON
	 */
	@ApiField("query_type")
	private String queryType;

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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
