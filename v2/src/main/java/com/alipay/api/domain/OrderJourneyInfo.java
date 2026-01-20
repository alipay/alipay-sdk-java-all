package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单行程信息
 *
 * @author auto create
 * @since 1.0, 2022-11-17 20:03:46
 */
public class OrderJourneyInfo extends AlipayObject {

	private static final long serialVersionUID = 4261791357859187325L;

	/**
	 * 操作动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 行程创建时间
	 */
	@ApiField("journey_create_time")
	private Date journeyCreateTime;

	/**
	 * 行程描述
	 */
	@ApiField("journey_desc")
	private String journeyDesc;

	/**
	 * 行程元素列表
	 */
	@ApiListField("journey_elements")
	@ApiField("order_journey_element")
	private List<OrderJourneyElement> journeyElements;

	/**
	 * 描述本行程为整个行程中的第几程
	 */
	@ApiField("journey_index")
	private String journeyIndex;

	/**
	 * 行程修改时间
	 */
	@ApiField("journey_modify_time")
	private Date journeyModifyTime;

	/**
	 * 商户行程单号
	 */
	@ApiField("merchant_journey_no")
	private String merchantJourneyNo;

	/**
	 * 行程状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 行程状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 行程子类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 行程标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 行程类型
	 */
	@ApiField("type")
	private String type;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public Date getJourneyCreateTime() {
		return this.journeyCreateTime;
	}
	public void setJourneyCreateTime(Date journeyCreateTime) {
		this.journeyCreateTime = journeyCreateTime;
	}

	public String getJourneyDesc() {
		return this.journeyDesc;
	}
	public void setJourneyDesc(String journeyDesc) {
		this.journeyDesc = journeyDesc;
	}

	public List<OrderJourneyElement> getJourneyElements() {
		return this.journeyElements;
	}
	public void setJourneyElements(List<OrderJourneyElement> journeyElements) {
		this.journeyElements = journeyElements;
	}

	public String getJourneyIndex() {
		return this.journeyIndex;
	}
	public void setJourneyIndex(String journeyIndex) {
		this.journeyIndex = journeyIndex;
	}

	public Date getJourneyModifyTime() {
		return this.journeyModifyTime;
	}
	public void setJourneyModifyTime(Date journeyModifyTime) {
		this.journeyModifyTime = journeyModifyTime;
	}

	public String getMerchantJourneyNo() {
		return this.merchantJourneyNo;
	}
	public void setMerchantJourneyNo(String merchantJourneyNo) {
		this.merchantJourneyNo = merchantJourneyNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
