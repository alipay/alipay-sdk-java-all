package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组修改接口
 *
 * @author auto create
 * @since 1.0, 2018-12-18 10:23:56
 */
public class KoubeiMarketingCampaignCrowdModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5661743133276766826L;

	/**
	 * 圈人的条件。 
op：表示操作符，目前支持 EQ（相等）、GT（大于）、GTEQ（大于等于）、LT（小于）、LTEQ（小于等于）、NEQ（不等）、LIKE（模糊匹配）、IN（在枚举范围内）、NOTIN（不在枚举范围内）、BETWEEN（范围比较）、LEFTDAYS（几天以内）、RIGHTDAYS（几天以外）、LOCATE（地理位置比较）LBS（地图位置数据）；
tagCode：标签code，详细标签 code 参见附件 <a href="https://gw.alipayobjects.com/os/bmw-prod/4b028911-cb1a-40e9-8abe-49cb04c9a379.zip">标签信息</a>。 
value：标签值。
	 */
	@ApiField("conditions")
	private String conditions;

	/**
	 * 人群组的唯一标识ID
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 操作人id，必须和operator_type配对出现，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getConditions() {
		return this.conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
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

}
