package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppleVoucherQueryItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.apple.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 16:42:49
 */
public class AlipayPcreditHuabeiAppleVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5797139226236529412L;

	/** 
	 * 券额度，单位分
	 */
	@ApiField("credit_amount")
	private Long creditAmount;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/** 
	 * 额度券实例号
	 */
	@ApiField("instance_no")
	private String instanceNo;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/** 
	 * valid表示生效
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 已领苹果专享额度券列表
	 */
	@ApiListField("vouchers")
	@ApiField("apple_voucher_query_item")
	private List<AppleVoucherQueryItem> vouchers;

	public void setCreditAmount(Long creditAmount) {
		this.creditAmount = creditAmount;
	}
	public Long getCreditAmount( ) {
		return this.creditAmount;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate( ) {
		return this.endDate;
	}

	public void setInstanceNo(String instanceNo) {
		this.instanceNo = instanceNo;
	}
	public String getInstanceNo( ) {
		return this.instanceNo;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate( ) {
		return this.startDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVouchers(List<AppleVoucherQueryItem> vouchers) {
		this.vouchers = vouchers;
	}
	public List<AppleVoucherQueryItem> getVouchers( ) {
		return this.vouchers;
	}

}
