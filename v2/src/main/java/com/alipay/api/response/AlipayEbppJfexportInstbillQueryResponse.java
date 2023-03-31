package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JfExportInstBillModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.instbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:05:50
 */
public class AlipayEbppJfexportInstbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7122664746241558943L;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 业务类型英文名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * "utility_" + uniqId，缓存的账单的key，每次查询均保证唯一性，但是不保证幂等性，在创建时需要透传回支付宝这边。
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/** 
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 缴费模式:2-账单模式;4-缴清欠费模式;5-欠费自由缴模式。
	 */
	@ApiField("charge_mode")
	private String chargeMode;

	/** 
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 机构账单列表，如果有多条，只允许选择其中的一条进行支付。
	 */
	@ApiListField("inst_bills")
	@ApiField("jf_export_inst_bill_model")
	private List<JfExportInstBillModel> instBills;

	/** 
	 * 账单拥有者姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 子业务类型英文简称
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}
	public String getCacheKey( ) {
		return this.cacheKey;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}
	public String getChargeMode( ) {
		return this.chargeMode;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setInstBills(List<JfExportInstBillModel> instBills) {
		this.instBills = instBills;
	}
	public List<JfExportInstBillModel> getInstBills( ) {
		return this.instBills;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName( ) {
		return this.ownerName;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType( ) {
		return this.subBizType;
	}

}
