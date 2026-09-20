package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医嘱单信息
 *
 * @author auto create
 * @since 1.0, 2026-09-14 14:13:01
 */
public class CheckNoInfo extends AlipayObject {

	private static final long serialVersionUID = 3139264156814725913L;

	/**
	 * 检查检验项目列表
	 */
	@ApiListField("check_item_list")
	@ApiField("check_item")
	private List<CheckItem> checkItemList;

	/**
	 * 医嘱单单号
	 */
	@ApiField("check_no")
	private String checkNo;

	/**
	 * yyyy-MM-dd HH:mm:ss，待下单状态要提供
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 履约单号，下单以后需要
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * 状态：1-待下单、2-已下单、3-已撤销、4-已失效、5-已到检
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 五种状态：待下单、已下单、已撤销、已失效、已到检
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 订单号，下单以后需要
	 */
	@ApiField("trade_order_id")
	private String tradeOrderId;

	/**
	 * 有效期结束时间戳
	 */
	@ApiField("validity_end_time")
	private Long validityEndTime;

	/**
	 * 有效期描述
	 */
	@ApiField("validity_period_desc")
	private String validityPeriodDesc;

	public List<CheckItem> getCheckItemList() {
		return this.checkItemList;
	}
	public void setCheckItemList(List<CheckItem> checkItemList) {
		this.checkItemList = checkItemList;
	}

	public String getCheckNo() {
		return this.checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getTradeOrderId() {
		return this.tradeOrderId;
	}
	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	public Long getValidityEndTime() {
		return this.validityEndTime;
	}
	public void setValidityEndTime(Long validityEndTime) {
		this.validityEndTime = validityEndTime;
	}

	public String getValidityPeriodDesc() {
		return this.validityPeriodDesc;
	}
	public void setValidityPeriodDesc(String validityPeriodDesc) {
		this.validityPeriodDesc = validityPeriodDesc;
	}

}
