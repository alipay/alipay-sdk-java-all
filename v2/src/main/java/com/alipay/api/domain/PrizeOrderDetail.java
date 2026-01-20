package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户发奖详情
 *
 * @author auto create
 * @since 1.0, 2024-09-03 10:49:31
 */
public class PrizeOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 2552531287942778388L;

	/**
	 * 预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动单据id
	 */
	@ApiField("camp_order_id")
	private String campOrderId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部奖品id
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	/**
	 * 父发奖单据id，只有组合奖品类型时才可能出现
	 */
	@ApiField("parent_order_id")
	private String parentOrderId;

	/**
	 * 奖品金额单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品子类型
	 */
	@ApiField("prize_sub_type")
	private String prizeSubType;

	/**
	 * 奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 发奖单据id
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/**
	 * 发奖状态
	 */
	@ApiField("send_status")
	private String sendStatus;

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampOrderId() {
		return this.campOrderId;
	}
	public void setCampOrderId(String campOrderId) {
		this.campOrderId = campOrderId;
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutPrizeId() {
		return this.outPrizeId;
	}
	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}

	public String getParentOrderId() {
		return this.parentOrderId;
	}
	public void setParentOrderId(String parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeSubType() {
		return this.prizeSubType;
	}
	public void setPrizeSubType(String prizeSubType) {
		this.prizeSubType = prizeSubType;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

	public String getSendStatus() {
		return this.sendStatus;
	}
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}

}
