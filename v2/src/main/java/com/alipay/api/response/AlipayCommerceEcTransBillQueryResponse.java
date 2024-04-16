package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-26 16:16:45
 */
public class AlipayCommerceEcTransBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1775588387288385576L;

	/** 
	 * 支付宝转账订单号
	 */
	@ApiField("alipay_trans_order_id")
	private String alipayTransOrderId;

	/** 
	 * 订单金额,精确到两位小数（元）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_trans_type")
	private String bizTransType;

	/** 
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 完结时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 单据状态
	 */
	@ApiField("status")
	private String status;

	public void setAlipayTransOrderId(String alipayTransOrderId) {
		this.alipayTransOrderId = alipayTransOrderId;
	}
	public String getAlipayTransOrderId( ) {
		return this.alipayTransOrderId;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBizTransType(String bizTransType) {
		this.bizTransType = bizTransType;
	}
	public String getBizTransType( ) {
		return this.bizTransType;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Date getFinishTime( ) {
		return this.finishTime;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
