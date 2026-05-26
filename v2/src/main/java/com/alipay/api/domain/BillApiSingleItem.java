package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单列表查询为空时，返回nu l l
 *
 * @author auto create
 * @since 1.0, 2026-03-13 10:42:44
 */
public class BillApiSingleItem extends AlipayObject {

	private static final long serialVersionUID = 1467795235197259724L;

	/**
	 * 账单单号
	 */
	@ApiField("biz_in_no")
	private String bizInNo;

	/**
	 * 账单状态的描述说明
	 */
	@ApiField("biz_state_desc")
	private String bizStateDesc;

	/**
	 * 账单分类，是按照账单内部标准划分的分类信息
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 账单显示金额，单位元，包含“+”“-”符号代表资金实际是正向还是逆向
	 */
	@ApiField("consume_fee")
	private String consumeFee;

	/**
	 * 账单标题
	 */
	@ApiField("consume_title")
	private String consumeTitle;

	/**
	 * 创单时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 对手方展示名
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/**
	 * 表示账单计入统计的金额，单位元
	 */
	@ApiField("stat_fee")
	private String statFee;

	/**
	 * 账单是否计入收支
("0", "计入收支统计"),
("1", "不计入收支统计"),
("2", "部分计入收支统计");
	 */
	@ApiField("stat_type")
	private String statType;

	public String getBizInNo() {
		return this.bizInNo;
	}
	public void setBizInNo(String bizInNo) {
		this.bizInNo = bizInNo;
	}

	public String getBizStateDesc() {
		return this.bizStateDesc;
	}
	public void setBizStateDesc(String bizStateDesc) {
		this.bizStateDesc = bizStateDesc;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getConsumeFee() {
		return this.consumeFee;
	}
	public void setConsumeFee(String consumeFee) {
		this.consumeFee = consumeFee;
	}

	public String getConsumeTitle() {
		return this.consumeTitle;
	}
	public void setConsumeTitle(String consumeTitle) {
		this.consumeTitle = consumeTitle;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getOppositeName() {
		return this.oppositeName;
	}
	public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}

	public String getStatFee() {
		return this.statFee;
	}
	public void setStatFee(String statFee) {
		this.statFee = statFee;
	}

	public String getStatType() {
		return this.statType;
	}
	public void setStatType(String statType) {
		this.statType = statType;
	}

}
