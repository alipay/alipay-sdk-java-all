package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SalaryApplySignData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.salary.transfer.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 10:22:27
 */
public class AlipayCommerceSalaryTransferApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5338356544624833122L;

	/** 
	 * 申请时间，申请成功时提供
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/** 
	 * 转账申请ID，用于后续实际发薪驱动时消费，申请成功时提供
	 */
	@ApiField("salary_order_id")
	private String salaryOrderId;

	/** 
	 * 转账签名，申请成功时提供
	 */
	@ApiField("sign_data")
	private SalaryApplySignData signData;

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getApplyTime( ) {
		return this.applyTime;
	}

	public void setSalaryOrderId(String salaryOrderId) {
		this.salaryOrderId = salaryOrderId;
	}
	public String getSalaryOrderId( ) {
		return this.salaryOrderId;
	}

	public void setSignData(SalaryApplySignData signData) {
		this.signData = signData;
	}
	public SalaryApplySignData getSignData( ) {
		return this.signData;
	}

}
