package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询EAP用户
 *
 * @author auto create
 * @since 1.0, 2024-04-12 14:26:16
 */
public class AlipayDigitalmgmtHrhealthEapAuthorityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4689876688917851468L;

	/**
	 * 该参数用来标识进入供应商系统的用户标志，是登录供应商应用后解析来的，蚂蚁EAP会将此参数作为用户标志
	 */
	@ApiField("biz_emp_id")
	private String bizEmpId;

	/**
	 * 该参数用来标识用户，是根据用户登录简心后由供应商传入，蚂蚁EAP会根据此作为用户标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 该参数用来标识供应商，是由蚂蚁EAP提供给供应商，蚂蚁EAP侧会根据此参数识别供应商
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * 该参数用来标识用户来源，是供应商不同的场景传入对应的来源，蚂蚁EAP会根据此来判断员工是否在权益范围内
	 */
	@ApiField("source")
	private Long source;

	public String getBizEmpId() {
		return this.bizEmpId;
	}
	public void setBizEmpId(String bizEmpId) {
		this.bizEmpId = bizEmpId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public Long getSource() {
		return this.source;
	}
	public void setSource(Long source) {
		this.source = source;
	}

}
