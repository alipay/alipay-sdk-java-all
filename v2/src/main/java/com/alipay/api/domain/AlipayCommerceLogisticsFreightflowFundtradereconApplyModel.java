package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付收银台资金支付对账单查询
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:17:31
 */
public class AlipayCommerceLogisticsFreightflowFundtradereconApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4258773521586879294L;

	/**
	 * 由商户系统生成,只能包含字母,数字,下划线;商户需保证不重复.
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 与运企付约定的物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 银行分配的合作方机构号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 账单日期，格式为yyyyMMdd
日期规则如下:
1. Date < Today (当日生成昨日对账单，所以申请时间需早于当日)
2. 六个月前的当月一日 <= Date
3. isv入驻时间 <= Date
	 */
	@ApiField("query_date")
	private String queryDate;

	/**
	 * 查询账单类型
	 */
	@ApiField("query_type")
	private String queryType;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

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
