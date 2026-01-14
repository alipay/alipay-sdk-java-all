package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.zftschool.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:12:42
 */
public class AlipayEcoEduKtZftschoolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7691414265115461541L;

	/** 
	 * 商户进件失败原因。有则返回，进件成功则不返回，失败原因可参考直付通接口说明，https://docs.alipay.com/pre-open/api_pre/ant.merchant.expand.indirect.zft.create
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 支付宝中小学教育缴费分配给学校的编码，学校在支付宝的标识，发账单需带此参数
	 */
	@ApiField("school_no")
	private String schoolNo;

	/** 
	 * 直付通二级商户id，商户进件审核通过后会有smid，发账单接口的school_pid填写此字段，如果为空，则审核未通过，无法发账单
	 */
	@ApiField("smid")
	private String smid;

	/** 
	 * 进件流程状态
CREATED 已创建
SUBMITTED 已提交
SUBMIT_FAIL 提交失败
AUDIT_SUCCESS 审核成功
AUDIT_FAIL 审核失败
	 */
	@ApiField("status")
	private String status;

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}
	public String getSchoolNo( ) {
		return this.schoolNo;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
