package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公服业务通用办理流水查询
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:14:14
 */
public class AlipayEbppIndustryApplyflowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6361583556617813486L;

	/**
	 * 支付宝办理流水号，支持幂等，和外部办理流水号之间必须传一个
	 */
	@ApiField("apply_flow_no")
	private String applyFlowNo;

	/**
	 * 拓展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 外部申请流水号，支持幂等，和支付宝办理流水号之间必须传一个
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	public String getApplyFlowNo() {
		return this.applyFlowNo;
	}
	public void setApplyFlowNo(String applyFlowNo) {
		this.applyFlowNo = applyFlowNo;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

}
