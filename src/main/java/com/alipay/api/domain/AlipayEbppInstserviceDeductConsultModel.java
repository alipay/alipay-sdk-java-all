package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构代扣咨询
 *
 * @author auto create
 * @since 1.0, 2021-03-22 14:35:05
 */
public class AlipayEbppInstserviceDeductConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5583428453281374393L;

	/**
	 * 户号（缴费场景是户号，话费场景是手机号）
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型（例如通信，缴费，还款）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 代扣产品码（由技术同学分配）
	 */
	@ApiField("ededuct_product_code")
	private String edeductProductCode;

	/**
	 * 扩展字段（JSON格式）
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 机构ID（支付宝侧分配）
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 二级业务类型（例如话费，流量，水费，电费）
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEdeductProductCode() {
		return this.edeductProductCode;
	}
	public void setEdeductProductCode(String edeductProductCode) {
		this.edeductProductCode = edeductProductCode;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
