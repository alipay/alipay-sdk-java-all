package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算申请活动记录
 *
 * @author auto create
 * @since 1.0, 2023-01-11 14:55:25
 */
public class CfbudmacBizActionLogDTO extends AlipayObject {

	private static final long serialVersionUID = 5463168177763665554L;

	/**
	 * 预算申请金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * bba编码
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * 业务方案id
	 */
	@ApiField("biz_budget_id")
	private String bizBudgetId;

	/**
	 * 业务活动名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务活动id
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	/**
	 * 币种编码，不填默认156人民币
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 记录id
	 */
	@ApiField("id")
	private String id;

	/**
	 * BIZ_APPLY, 业务活动预算申请 * * BIZ_RETURN, 业务活动预算退回 * * BIZ_EXPIRE_RETURN, 业务活动预算过期退回
	 */
	@ApiField("modify_type")
	private String modifyType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
	}

	public String getBizBudgetId() {
		return this.bizBudgetId;
	}
	public void setBizBudgetId(String bizBudgetId) {
		this.bizBudgetId = bizBudgetId;
	}

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

}
