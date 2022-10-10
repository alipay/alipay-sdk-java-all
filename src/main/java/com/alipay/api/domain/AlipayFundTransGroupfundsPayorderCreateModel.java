package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团体资金预付款(资金单据创建)
 *
 * @author auto create
 * @since 1.0, 2019-05-17 11:53:48
 */
public class AlipayFundTransGroupfundsPayorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5686542779681296522L;

	/**
	 * 付款活动关联的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 付款方关联的资金单据号，团体资金批次创建后获得/资金单据查询接口获得
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 当前发起付款的用户支付宝账户ID
	 */
	@ApiField("current_user_id")
	private String currentUserId;

	/**
	 * 扩展参数，业务扩展使用
	 */
	@ApiField("ext_param")
	private String extParam;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getCurrentUserId() {
		return this.currentUserId;
	}
	public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

}
