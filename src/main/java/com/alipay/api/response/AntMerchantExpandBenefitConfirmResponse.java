package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.benefit.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-12 12:25:01
 */
public class AntMerchantExpandBenefitConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1389355712663527218L;

	/** 
	 * 权益实例ID
	 */
	@ApiField("benefit_instance_id")
	private String benefitInstanceId;

	/** 
	 * 返回错误相关的一些详情
比如：发奖奖品不存在
	 */
	@ApiField("detail_msg")
	private String detailMsg;

	/** 
	 * 权益发放失败时，参考：
发奖失败错误码 格式：端类型|错误码 例如：promocore|xxxxx，会同步到业务子错误码上
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 发奖流水号(一般为外部业务号)
	 */
	@ApiField("grant_sn")
	private String grantSn;

	/** 
	 * 发奖记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	/** 
	 * SUCCESS 发放成功
FAIL 发放失败
GIVING 发放中
	 */
	@ApiField("result")
	private String result;

	public void setBenefitInstanceId(String benefitInstanceId) {
		this.benefitInstanceId = benefitInstanceId;
	}
	public String getBenefitInstanceId( ) {
		return this.benefitInstanceId;
	}

	public void setDetailMsg(String detailMsg) {
		this.detailMsg = detailMsg;
	}
	public String getDetailMsg( ) {
		return this.detailMsg;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setGrantSn(String grantSn) {
		this.grantSn = grantSn;
	}
	public String getGrantSn( ) {
		return this.grantSn;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
