package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.equity.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-04 10:47:43
 */
public class AnttechMorseMarketingEquityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3169247463573355716L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于问题定位
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 商务项目ID，由摩斯配置并分配给调用方
	 */
	@ApiField("resource_id")
	private String resourceId;

	/** 
	 * 券结果信息列表
	 */
	@ApiListField("voucher_result_info_list")
	@ApiField("voucher_result_info")
	private List<VoucherResultInfo> voucherResultInfoList;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceId( ) {
		return this.resourceId;
	}

	public void setVoucherResultInfoList(List<VoucherResultInfo> voucherResultInfoList) {
		this.voucherResultInfoList = voucherResultInfoList;
	}
	public List<VoucherResultInfo> getVoucherResultInfoList( ) {
		return this.voucherResultInfoList;
	}

}
