package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商账单数据回传
 *
 * @author auto create
 * @since 1.0, 2022-05-23 19:36:11
 */
public class AlipayOpenSpIsvBillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8254161782119713599L;

	/**
	 * 账单结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 出账时间，回传出账信息时，必须传递
	 */
	@ApiField("generate_time")
	private String generateTime;

	/**
	 * 服务优选商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 外部业务号，传isv系统生成的账单号，需要保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 账单支付时间，回传支付数时，必须传递
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 账单金额，这里填写的是整数，单位为分，比如1元，那么输入100
	 */
	@ApiField("price")
	private String price;

	/**
	 * 推广服务商(S2)pid
	 */
	@ApiField("promotor_pid")
	private String promotorPid;

	/**
	 * 账单开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * GENERATE_BILL代表”已出账“，PAID_BILL代表”已支付“，选择这两者之一
	 */
	@ApiField("status")
	private String status;

	/**
	 * S1回传的S2的操作员工子账号，如果是子账号操作，请回传
	 */
	@ApiField("sub_promotor_pid")
	private String subPromotorPid;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getGenerateTime() {
		return this.generateTime;
	}
	public void setGenerateTime(String generateTime) {
		this.generateTime = generateTime;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPromotorPid() {
		return this.promotorPid;
	}
	public void setPromotorPid(String promotorPid) {
		this.promotorPid = promotorPid;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubPromotorPid() {
		return this.subPromotorPid;
	}
	public void setSubPromotorPid(String subPromotorPid) {
		this.subPromotorPid = subPromotorPid;
	}

}
