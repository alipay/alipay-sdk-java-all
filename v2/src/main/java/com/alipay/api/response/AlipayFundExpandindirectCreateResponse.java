package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.expandindirect.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 16:57:38
 */
public class AlipayFundExpandindirectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5498785195629393777L;

	/** 
	 * 进件单创建时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 进件单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部单号（唯一幂等号）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 进件单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 进件单任务完结时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("task_finish_time")
	private String taskFinishTime;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
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

	public void setTaskFinishTime(String taskFinishTime) {
		this.taskFinishTime = taskFinishTime;
	}
	public String getTaskFinishTime( ) {
		return this.taskFinishTime;
	}

}
