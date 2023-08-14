package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量创单接口
 *
 * @author auto create
 * @since 1.0, 2022-11-18 13:39:12
 */
public class AlipayEbppBillchargeOrderBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 8548287335558125863L;

	/**
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("selected_bill_info")
	private List<SelectedBillInfo> billList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1234567890
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 来源渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 总支付金额
	 */
	@ApiField("total_pay_amount")
	private String totalPayAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<SelectedBillInfo> getBillList() {
		return this.billList;
	}
	public void setBillList(List<SelectedBillInfo> billList) {
		this.billList = billList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTotalPayAmount() {
		return this.totalPayAmount;
	}
	public void setTotalPayAmount(String totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
