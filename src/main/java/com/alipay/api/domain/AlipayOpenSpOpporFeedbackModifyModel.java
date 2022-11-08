package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拓展完成
 *
 * @author auto create
 * @since 1.0, 2022-05-16 14:25:32
 */
public class AlipayOpenSpOpporFeedbackModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1833696336315634586L;

	/**
	 * 拓展助手商机拓展结果
	 */
	@ApiField("expand_result")
	private String expandResult;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商机id
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 拓展助手商机商家pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 商机作业id
	 */
	@ApiField("oppor_id")
	private String opporId;

	/**
	 * 拓展设备sn号
	 */
	@ApiField("sn")
	private String sn;

	public String getExpandResult() {
		return this.expandResult;
	}
	public void setExpandResult(String expandResult) {
		this.expandResult = expandResult;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOpporId() {
		return this.opporId;
	}
	public void setOpporId(String opporId) {
		this.opporId = opporId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
