package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预创单单个项目
 *
 * @author auto create
 * @since 1.0, 2018-12-20 19:37:39
 */
public class EbppOrderItem extends AlipayObject {

	private static final long serialVersionUID = 7777385462449572478L;

	/**
	 * 支付宝对该子项所代表的这笔业务的唯一标识。
	 */
	@ApiField("alipay_item_id")
	private String alipayItemId;

	/**
	 * 业务金额
	 */
	@ApiField("biz_amount")
	private String bizAmount;

	/**
	 * 业务产品id，由支付宝分配。
	 */
	@ApiField("biz_prod_id")
	private String bizProdId;

	/**
	 * 用于传递扩展参数
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 机构端对该子项所代表的这笔业务的唯一标识。
	 */
	@ApiField("inst_item_id")
	private String instItemId;

	/**
	 * 支付宝流水号
	 */
	@ApiField("linked_bill_no")
	private String linkedBillNo;

	/**
	 * 业务状态
I - 初始状态，未支付
C - 已关单，不能继续支付
P - 已支付
S - 业务成功
F - 业务失败，退款给用户
	 */
	@ApiField("status")
	private String status;

	public String getAlipayItemId() {
		return this.alipayItemId;
	}
	public void setAlipayItemId(String alipayItemId) {
		this.alipayItemId = alipayItemId;
	}

	public String getBizAmount() {
		return this.bizAmount;
	}
	public void setBizAmount(String bizAmount) {
		this.bizAmount = bizAmount;
	}

	public String getBizProdId() {
		return this.bizProdId;
	}
	public void setBizProdId(String bizProdId) {
		this.bizProdId = bizProdId;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getInstItemId() {
		return this.instItemId;
	}
	public void setInstItemId(String instItemId) {
		this.instItemId = instItemId;
	}

	public String getLinkedBillNo() {
		return this.linkedBillNo;
	}
	public void setLinkedBillNo(String linkedBillNo) {
		this.linkedBillNo = linkedBillNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
