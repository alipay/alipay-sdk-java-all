package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * AR对账单查询
 *
 * @author auto create
 * @since 1.0, 2023-07-18 14:43:32
 */
public class AlipayBossFncArbillMonthstatementbillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3317168436617977236L;

	/**
	 * 分析维度1
	 */
	@ApiListField("anl_dmsn_1_list")
	@ApiField("string")
	private List<String> anlDmsn1List;

	/**
	 * 分析维度2
	 */
	@ApiListField("anl_dmsn_2_list")
	@ApiField("string")
	private List<String> anlDmsn2List;

	/**
	 * 分析维度3
	 */
	@ApiListField("anl_dmsn_3_list")
	@ApiField("string")
	private List<String> anlDmsn3List;

	/**
	 * 分析维度4
	 */
	@ApiListField("anl_dmsn_4_list")
	@ApiField("string")
	private List<String> anlDmsn4List;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 账单月查询开始月份(包含, 必选)
	 */
	@ApiField("bill_month_begin")
	private String billMonthBegin;

	/**
	 * 账单月查询截止月份(包含, 必选)
	 */
	@ApiField("bill_month_end")
	private String billMonthEnd;

	/**
	 * 收费项编码
	 */
	@ApiField("charge_itme_code")
	private String chargeItmeCode;

	/**
	 * 01:账单生成
02:待确认出账
03:已出账
04:客户已对账
05:对账差异
06:部分出账
07:账单出账中
	 */
	@ApiListField("check_state")
	@ApiField("string")
	private List<String> checkState;

	/**
	 * 业务扩展查询维度值,json格式
	 */
	@ApiListField("dmsn_query_list")
	@ApiField("pair")
	private List<Pair> dmsnQueryList;

	/**
	 * 数据来源,租户ID
	 */
	@ApiField("env_source")
	private String envSource;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 开票状态 01:未开票 02:部分开票 03:完全开票
	 */
	@ApiListField("invoice_status")
	@ApiField("string")
	private List<String> invoiceStatus;

	/**
	 * 结算对象（MID） 和ipRoleId 二选一
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 结算对象（PID） 和ipId 二选一
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 是否不包含结算2.0的可开票单据（也就是07）
	 */
	@ApiField("no_include_unify_settle")
	private String noIncludeUnifySettle;

	/**
	 * 起始页，分页时必须提供
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页显示数，分页时必须提供
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 对账状态 01:待结算 02:部分结算 03:结算完成
	 */
	@ApiListField("pay_status_list")
	@ApiField("string")
	private List<String> payStatusList;

	/**
	 * 付款方式  1资金  5走量
	 */
	@ApiListField("pay_way_list")
	@ApiField("string")
	private List<String> payWayList;

	/**
	 * 产品码,对于金融云为商品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 结算周期 01:年结 02:季结 03:月结
	 */
	@ApiListField("settle_period")
	@ApiField("string")
	private List<String> settlePeriod;

	/**
	 * 结算方式
01:实时
02:预收,
03:后收
04:周期结算,
05:按日汇总结算,
06:周期结算,
09:延期结算,
10:无需结算,
11:业务自主结算,
12:自动周期结算
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 账单的类型 1应收，2返点，4递延
	 */
	@ApiListField("type_list")
	@ApiField("string")
	private List<String> typeList;

	public List<String> getAnlDmsn1List() {
		return this.anlDmsn1List;
	}
	public void setAnlDmsn1List(List<String> anlDmsn1List) {
		this.anlDmsn1List = anlDmsn1List;
	}

	public List<String> getAnlDmsn2List() {
		return this.anlDmsn2List;
	}
	public void setAnlDmsn2List(List<String> anlDmsn2List) {
		this.anlDmsn2List = anlDmsn2List;
	}

	public List<String> getAnlDmsn3List() {
		return this.anlDmsn3List;
	}
	public void setAnlDmsn3List(List<String> anlDmsn3List) {
		this.anlDmsn3List = anlDmsn3List;
	}

	public List<String> getAnlDmsn4List() {
		return this.anlDmsn4List;
	}
	public void setAnlDmsn4List(List<String> anlDmsn4List) {
		this.anlDmsn4List = anlDmsn4List;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getBillMonthBegin() {
		return this.billMonthBegin;
	}
	public void setBillMonthBegin(String billMonthBegin) {
		this.billMonthBegin = billMonthBegin;
	}

	public String getBillMonthEnd() {
		return this.billMonthEnd;
	}
	public void setBillMonthEnd(String billMonthEnd) {
		this.billMonthEnd = billMonthEnd;
	}

	public String getChargeItmeCode() {
		return this.chargeItmeCode;
	}
	public void setChargeItmeCode(String chargeItmeCode) {
		this.chargeItmeCode = chargeItmeCode;
	}

	public List<String> getCheckState() {
		return this.checkState;
	}
	public void setCheckState(List<String> checkState) {
		this.checkState = checkState;
	}

	public List<Pair> getDmsnQueryList() {
		return this.dmsnQueryList;
	}
	public void setDmsnQueryList(List<Pair> dmsnQueryList) {
		this.dmsnQueryList = dmsnQueryList;
	}

	public String getEnvSource() {
		return this.envSource;
	}
	public void setEnvSource(String envSource) {
		this.envSource = envSource;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public List<String> getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(List<String> invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getNoIncludeUnifySettle() {
		return this.noIncludeUnifySettle;
	}
	public void setNoIncludeUnifySettle(String noIncludeUnifySettle) {
		this.noIncludeUnifySettle = noIncludeUnifySettle;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getPayStatusList() {
		return this.payStatusList;
	}
	public void setPayStatusList(List<String> payStatusList) {
		this.payStatusList = payStatusList;
	}

	public List<String> getPayWayList() {
		return this.payWayList;
	}
	public void setPayWayList(List<String> payWayList) {
		this.payWayList = payWayList;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public List<String> getSettlePeriod() {
		return this.settlePeriod;
	}
	public void setSettlePeriod(List<String> settlePeriod) {
		this.settlePeriod = settlePeriod;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public List<String> getTypeList() {
		return this.typeList;
	}
	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}

}
