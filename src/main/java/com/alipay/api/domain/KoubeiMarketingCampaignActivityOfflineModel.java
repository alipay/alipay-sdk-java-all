package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动下架接口
 *
 * @author auto create
 * @since 1.0, 2017-09-29 18:13:28
 */
public class KoubeiMarketingCampaignActivityOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 1645499429223534825L;

	/**
	 * 活动Id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 下架活动的扩展信息，不需要设置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作人id，与operator_type必须配对存在，当不填的时候默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部批次ID,每次需传入不同的值
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 下架原因
	 */
	@ApiField("reason")
	private String reason;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
