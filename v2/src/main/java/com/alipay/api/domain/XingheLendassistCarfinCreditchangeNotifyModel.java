package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 授信变更通知来报
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:57:44
 */
public class XingheLendassistCarfinCreditchangeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2162626598338252774L;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * null
	 */
	@ApiListField("credit_list")
	@ApiField("credit")
	private List<Credit> creditList;

	/**
	 * 是	机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public List<Credit> getCreditList() {
		return this.creditList;
	}
	public void setCreditList(List<Credit> creditList) {
		this.creditList = creditList;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

}
