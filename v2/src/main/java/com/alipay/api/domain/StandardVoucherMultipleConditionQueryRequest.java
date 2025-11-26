package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标准流水查询请求
 *
 * @author auto create
 * @since 1.0, 2021-10-13 10:32:13
 */
public class StandardVoucherMultipleConditionQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 1565254572185197244L;

	/**
	 * 本方账户别名:支付宝为email或手机号，企业账户基本无手机号注册情况
	 */
	@ApiField("account_alias_name")
	private String accountAliasName;

	/**
	 * 本方账号
	 */
	@ApiListField("account_no_list")
	@ApiField("string")
	private List<String> accountNoList;

	/**
	 * 是否有算法打标推荐值
	 */
	@ApiField("algorithm_tag")
	private String algorithmTag;

	/**
	 * 黑名单账号，在gffund中添加
	 */
	@ApiListField("black_trans_account_no_list")
	@ApiField("string")
	private List<String> blackTransAccountNoList;

	/**
	 * 黑名单机构ID，Z50、K53等等，在gffund中添加
	 */
	@ApiListField("black_trans_inst_id_list")
	@ApiField("string")
	private List<String> blackTransInstIdList;

	/**
	 * 当前页码，非空，从1开始
	 */
	@ApiField("cur_page")
	private String curPage;

	/**
	 * 环境标识，包括PROD，PRE
	 */
	@ApiField("env")
	private String env;

	/**
	 * 资金业务码list
	 */
	@ApiListField("fund_biz_code_list")
	@ApiField("string")
	private List<String> fundBizCodeList;

	/**
	 * 处理结果状态，10-系统处理中，20-未明，30-线下平台已入账，40-其他平台已入账，50-业务平台入账成功
	 */
	@ApiListField("handle_status_list")
	@ApiField("string")
	private List<String> handleStatusList;

	/**
	 * 原始流水号：机构流水号
	 */
	@ApiField("inst_serial_no")
	private String instSerialNo;

	/**
	 * 人工识别备注
	 */
	@ApiField("manual_dist_memo")
	private String manualDistMemo;

	/**
	 * 人工识别类型
	 */
	@ApiListField("manual_dist_type_list")
	@ApiField("string")
	private List<String> manualDistTypeList;

	/**
	 * 备注: 模糊查询匹配
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 原始流水号：银行为银行流水号，支付宝为主账务logId
	 */
	@ApiField("org_trans_no")
	private String orgTransNo;

	/**
	 * 对方账户别名：支付宝为email或手机号
	 */
	@ApiField("other_account_alias_name")
	private String otherAccountAliasName;

	/**
	 * 对方账号名称，前缀模糊查询匹配
	 */
	@ApiField("other_account_name")
	private String otherAccountName;

	/**
	 * 对方账号
	 */
	@ApiField("other_account_no")
	private String otherAccountNo;

	/**
	 * 页大小，非空，最大100，下载分页大小50000
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询系统来源, QuerySourceEnum：GFCENTER,GFTMS,ZMGFCENTER,GFBRMP
	 */
	@ApiField("query_source")
	private String querySource;

	/**
	 * 排序方式：ASC，DESC。默认升序
	 */
	@ApiField("sort_type")
	private String sortType;

	/**
	 * 凭证状态，01-初始，02-已识别，03-业务平台处理中，04-已处理，05-冲销中，06-已冲销，07-人工待处理，08-人工处理中，09-已作废，10-未明到通用登账中
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	/**
	 * 租户
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 交易金额：注意只会查询金额大小不会去查询对应的币种
	 */
	@ApiField("trans_amount")
	private MultiCurrencyMoney transAmount;

	/**
	 * 交易币种
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/**
	 * 借贷方向；借：DEBIT;贷：CREDIT
	 */
	@ApiListField("trans_direction_list")
	@ApiField("string")
	private List<String> transDirectionList;

	/**
	 * 交易结束日期，非空，交易开始时间和结束时间不能跨月，格式：yyyyMMdd
	 */
	@ApiField("trans_end")
	private String transEnd;

	/**
	 * 机构ID，Z50、K53等等
	 */
	@ApiListField("trans_inst_id_list")
	@ApiField("string")
	private List<String> transInstIdList;

	/**
	 * 交易开始日期，非空，交易开始时间和结束时间不能跨月，格式：yyyyMMdd
	 */
	@ApiField("trans_start")
	private String transStart;

	/**
	 * 凭证类型，非空， 参考：VoucherTypeEnum， BANK银行流水，INNERACCOUNT内部户流水，ALIPAY支付宝流水，LETTEROFCREDIT信用证流水
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getAccountAliasName() {
		return this.accountAliasName;
	}
	public void setAccountAliasName(String accountAliasName) {
		this.accountAliasName = accountAliasName;
	}

	public List<String> getAccountNoList() {
		return this.accountNoList;
	}
	public void setAccountNoList(List<String> accountNoList) {
		this.accountNoList = accountNoList;
	}

	public String getAlgorithmTag() {
		return this.algorithmTag;
	}
	public void setAlgorithmTag(String algorithmTag) {
		this.algorithmTag = algorithmTag;
	}

	public List<String> getBlackTransAccountNoList() {
		return this.blackTransAccountNoList;
	}
	public void setBlackTransAccountNoList(List<String> blackTransAccountNoList) {
		this.blackTransAccountNoList = blackTransAccountNoList;
	}

	public List<String> getBlackTransInstIdList() {
		return this.blackTransInstIdList;
	}
	public void setBlackTransInstIdList(List<String> blackTransInstIdList) {
		this.blackTransInstIdList = blackTransInstIdList;
	}

	public String getCurPage() {
		return this.curPage;
	}
	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public List<String> getFundBizCodeList() {
		return this.fundBizCodeList;
	}
	public void setFundBizCodeList(List<String> fundBizCodeList) {
		this.fundBizCodeList = fundBizCodeList;
	}

	public List<String> getHandleStatusList() {
		return this.handleStatusList;
	}
	public void setHandleStatusList(List<String> handleStatusList) {
		this.handleStatusList = handleStatusList;
	}

	public String getInstSerialNo() {
		return this.instSerialNo;
	}
	public void setInstSerialNo(String instSerialNo) {
		this.instSerialNo = instSerialNo;
	}

	public String getManualDistMemo() {
		return this.manualDistMemo;
	}
	public void setManualDistMemo(String manualDistMemo) {
		this.manualDistMemo = manualDistMemo;
	}

	public List<String> getManualDistTypeList() {
		return this.manualDistTypeList;
	}
	public void setManualDistTypeList(List<String> manualDistTypeList) {
		this.manualDistTypeList = manualDistTypeList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrgTransNo() {
		return this.orgTransNo;
	}
	public void setOrgTransNo(String orgTransNo) {
		this.orgTransNo = orgTransNo;
	}

	public String getOtherAccountAliasName() {
		return this.otherAccountAliasName;
	}
	public void setOtherAccountAliasName(String otherAccountAliasName) {
		this.otherAccountAliasName = otherAccountAliasName;
	}

	public String getOtherAccountName() {
		return this.otherAccountName;
	}
	public void setOtherAccountName(String otherAccountName) {
		this.otherAccountName = otherAccountName;
	}

	public String getOtherAccountNo() {
		return this.otherAccountNo;
	}
	public void setOtherAccountNo(String otherAccountNo) {
		this.otherAccountNo = otherAccountNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getQuerySource() {
		return this.querySource;
	}
	public void setQuerySource(String querySource) {
		this.querySource = querySource;
	}

	public String getSortType() {
		return this.sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public MultiCurrencyMoney getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(MultiCurrencyMoney transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

	public List<String> getTransDirectionList() {
		return this.transDirectionList;
	}
	public void setTransDirectionList(List<String> transDirectionList) {
		this.transDirectionList = transDirectionList;
	}

	public String getTransEnd() {
		return this.transEnd;
	}
	public void setTransEnd(String transEnd) {
		this.transEnd = transEnd;
	}

	public List<String> getTransInstIdList() {
		return this.transInstIdList;
	}
	public void setTransInstIdList(List<String> transInstIdList) {
		this.transInstIdList = transInstIdList;
	}

	public String getTransStart() {
		return this.transStart;
	}
	public void setTransStart(String transStart) {
		this.transStart = transStart;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
