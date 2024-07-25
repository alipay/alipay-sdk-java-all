package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金明细模型
 *
 * @author auto create
 * @since 1.0, 2022-11-07 16:26:58
 */
public class FundItem extends AlipayObject {

	private static final long serialVersionUID = 2674774565392491185L;

	/**
	 * 金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资金明细创建时间
	 */
	@ApiField("fund_create_time")
	private Date fundCreateTime;

	/**
	 * 资金明细完成时间
	 */
	@ApiField("fund_finish_time")
	private Date fundFinishTime;

	/**
	 * 资金流向
	 */
	@ApiField("fund_in_out")
	private String fundInOut;

	/**
	 * 资金明细更新时间
	 */
	@ApiField("fund_modify_time")
	private Date fundModifyTime;

	/**
	 * 资金工具名（中文）
	 */
	@ApiField("fund_tool_type_name")
	private String fundToolTypeName;

	/**
	 * 业务创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	/**
	 * 是否为优惠资金工具
	 */
	@ApiField("promo_fund_tool")
	private Boolean promoFundTool;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getFundCreateTime() {
		return this.fundCreateTime;
	}
	public void setFundCreateTime(Date fundCreateTime) {
		this.fundCreateTime = fundCreateTime;
	}

	public Date getFundFinishTime() {
		return this.fundFinishTime;
	}
	public void setFundFinishTime(Date fundFinishTime) {
		this.fundFinishTime = fundFinishTime;
	}

	public String getFundInOut() {
		return this.fundInOut;
	}
	public void setFundInOut(String fundInOut) {
		this.fundInOut = fundInOut;
	}

	public Date getFundModifyTime() {
		return this.fundModifyTime;
	}
	public void setFundModifyTime(Date fundModifyTime) {
		this.fundModifyTime = fundModifyTime;
	}

	public String getFundToolTypeName() {
		return this.fundToolTypeName;
	}
	public void setFundToolTypeName(String fundToolTypeName) {
		this.fundToolTypeName = fundToolTypeName;
	}

	public Date getGmtBizCreate() {
		return this.gmtBizCreate;
	}
	public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

	public String getOwnerCardNo() {
		return this.ownerCardNo;
	}
	public void setOwnerCardNo(String ownerCardNo) {
		this.ownerCardNo = ownerCardNo;
	}

	public Boolean getPromoFundTool() {
		return this.promoFundTool;
	}
	public void setPromoFundTool(Boolean promoFundTool) {
		this.promoFundTool = promoFundTool;
	}

}
