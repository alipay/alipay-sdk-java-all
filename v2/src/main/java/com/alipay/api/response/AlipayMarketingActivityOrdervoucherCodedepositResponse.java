package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FailVoucherCodeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.codedeposit response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:51:00
 */
public class AlipayMarketingActivityOrdervoucherCodedepositResponse extends AlipayResponse {

	private static final long serialVersionUID = 6843973462281499253L;

	/** 
	 * 导入失败的券码数量
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 上传失败券码详情列表，包括上传失败的券码及对应的错误码和错误原因
	 */
	@ApiListField("fail_voucher_code_detail_list")
	@ApiField("fail_voucher_code_detail")
	private List<FailVoucherCodeDetail> failVoucherCodeDetailList;

	/** 
	 * 导入成功的券码数量
	 */
	@ApiField("success_count")
	private Long successCount;

	/** 
	 * 上传成功的券码列表
	 */
	@ApiListField("success_voucher_code_list")
	@ApiField("string")
	private List<String> successVoucherCodeList;

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setFailVoucherCodeDetailList(List<FailVoucherCodeDetail> failVoucherCodeDetailList) {
		this.failVoucherCodeDetailList = failVoucherCodeDetailList;
	}
	public List<FailVoucherCodeDetail> getFailVoucherCodeDetailList( ) {
		return this.failVoucherCodeDetailList;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

	public void setSuccessVoucherCodeList(List<String> successVoucherCodeList) {
		this.successVoucherCodeList = successVoucherCodeList;
	}
	public List<String> getSuccessVoucherCodeList( ) {
		return this.successVoucherCodeList;
	}

}
