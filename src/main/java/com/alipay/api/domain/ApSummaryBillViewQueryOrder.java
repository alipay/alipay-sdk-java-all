package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * AP融合账单查询请求
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:29:01
 */
public class ApSummaryBillViewQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 5525863967884828661L;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 账单结束月份
	 */
	@ApiField("bill_end_month")
	private String billEndMonth;

	/**
	 * 账单号
	 */
	@ApiListField("bill_nos")
	@ApiField("string")
	private List<String> billNos;

	/**
	 * 账单起始月份
	 */
	@ApiField("bill_start_month")
	private String billStartMonth;

	/**
	 * 账单状态
	 */
	@ApiListField("bill_status_list")
	@ApiField("string")
	private List<String> billStatusList;

	/**
	 * 业务产品码
	 */
	@ApiListField("biz_pd_code_list")
	@ApiField("string")
	private List<String> bizPdCodeList;

	/**
	 * 智科业务是：外部合约号outContractId，前端给到参数“outContractId=XXXX”
	 */
	@ApiField("business_dimension_1")
	private String businessDimension1;

	/**
	 * 见分析维度1描述
	 */
	@ApiField("business_dimension_2")
	private String businessDimension2;

	/**
	 * 见分析维度1描述
	 */
	@ApiField("business_dimension_3")
	private String businessDimension3;

	/**
	 * 见分析维度1描述
	 */
	@ApiField("business_dimension_4")
	private String businessDimension4;

	/**
	 * 见分析维度1描述
	 */
	@ApiField("business_dimension_5")
	private String businessDimension5;

	/**
	 * 见分析维度1描述
	 */
	@ApiField("business_dimension_6")
	private String businessDimension6;

	/**
	 * 见分析维度1描述
	 */
	@ApiField("business_dimension_7")
	private String businessDimension7;

	/**
	 * 币种
	 */
	@ApiField("ccy")
	private String ccy;

	/**
	 * 机构ou
	 */
	@ApiListField("inst_id_list")
	@ApiField("string")
	private List<String> instIdList;

	/**
	 * 负账单查询标识
	 */
	@ApiField("negative")
	private String negative;

	/**
	 * 销售产品码
	 */
	@ApiListField("sales_product_code_list")
	@ApiField("string")
	private List<String> salesProductCodeList;

	/**
	 * 结算对象pid
	 */
	@ApiField("settle_ip_role_id")
	private String settleIpRoleId;

	/**
	 * 结算对象mid
	 */
	@ApiField("settle_merchant_id")
	private String settleMerchantId;

	/**
	 * 结算状态
	 */
	@ApiListField("settle_status_list")
	@ApiField("string")
	private List<String> settleStatusList;

	/**
	 * 结算时点类型
	 */
	@ApiListField("settle_time_type_list")
	@ApiField("string")
	private List<String> settleTimeTypeList;

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getBillEndMonth() {
		return this.billEndMonth;
	}
	public void setBillEndMonth(String billEndMonth) {
		this.billEndMonth = billEndMonth;
	}

	public List<String> getBillNos() {
		return this.billNos;
	}
	public void setBillNos(List<String> billNos) {
		this.billNos = billNos;
	}

	public String getBillStartMonth() {
		return this.billStartMonth;
	}
	public void setBillStartMonth(String billStartMonth) {
		this.billStartMonth = billStartMonth;
	}

	public List<String> getBillStatusList() {
		return this.billStatusList;
	}
	public void setBillStatusList(List<String> billStatusList) {
		this.billStatusList = billStatusList;
	}

	public List<String> getBizPdCodeList() {
		return this.bizPdCodeList;
	}
	public void setBizPdCodeList(List<String> bizPdCodeList) {
		this.bizPdCodeList = bizPdCodeList;
	}

	public String getBusinessDimension1() {
		return this.businessDimension1;
	}
	public void setBusinessDimension1(String businessDimension1) {
		this.businessDimension1 = businessDimension1;
	}

	public String getBusinessDimension2() {
		return this.businessDimension2;
	}
	public void setBusinessDimension2(String businessDimension2) {
		this.businessDimension2 = businessDimension2;
	}

	public String getBusinessDimension3() {
		return this.businessDimension3;
	}
	public void setBusinessDimension3(String businessDimension3) {
		this.businessDimension3 = businessDimension3;
	}

	public String getBusinessDimension4() {
		return this.businessDimension4;
	}
	public void setBusinessDimension4(String businessDimension4) {
		this.businessDimension4 = businessDimension4;
	}

	public String getBusinessDimension5() {
		return this.businessDimension5;
	}
	public void setBusinessDimension5(String businessDimension5) {
		this.businessDimension5 = businessDimension5;
	}

	public String getBusinessDimension6() {
		return this.businessDimension6;
	}
	public void setBusinessDimension6(String businessDimension6) {
		this.businessDimension6 = businessDimension6;
	}

	public String getBusinessDimension7() {
		return this.businessDimension7;
	}
	public void setBusinessDimension7(String businessDimension7) {
		this.businessDimension7 = businessDimension7;
	}

	public String getCcy() {
		return this.ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public List<String> getInstIdList() {
		return this.instIdList;
	}
	public void setInstIdList(List<String> instIdList) {
		this.instIdList = instIdList;
	}

	public String getNegative() {
		return this.negative;
	}
	public void setNegative(String negative) {
		this.negative = negative;
	}

	public List<String> getSalesProductCodeList() {
		return this.salesProductCodeList;
	}
	public void setSalesProductCodeList(List<String> salesProductCodeList) {
		this.salesProductCodeList = salesProductCodeList;
	}

	public String getSettleIpRoleId() {
		return this.settleIpRoleId;
	}
	public void setSettleIpRoleId(String settleIpRoleId) {
		this.settleIpRoleId = settleIpRoleId;
	}

	public String getSettleMerchantId() {
		return this.settleMerchantId;
	}
	public void setSettleMerchantId(String settleMerchantId) {
		this.settleMerchantId = settleMerchantId;
	}

	public List<String> getSettleStatusList() {
		return this.settleStatusList;
	}
	public void setSettleStatusList(List<String> settleStatusList) {
		this.settleStatusList = settleStatusList;
	}

	public List<String> getSettleTimeTypeList() {
		return this.settleTimeTypeList;
	}
	public void setSettleTimeTypeList(List<String> settleTimeTypeList) {
		this.settleTimeTypeList = settleTimeTypeList;
	}

}
