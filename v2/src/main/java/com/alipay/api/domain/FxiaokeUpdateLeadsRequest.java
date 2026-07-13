package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客更新leads
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:03:53
 */
public class FxiaokeUpdateLeadsRequest extends AlipayObject {

	private static final long serialVersionUID = 2685566577391872533L;

	/**
	 * 负责BD工号
	 */
	@ApiField("bd_work_no")
	private String bdWorkNo;

	/**
	 * 商机编码
	 */
	@ApiField("leads_code")
	private String leadsCode;

	/**
	 * 商机来源伙伴pid - 报备伙伴
	 */
	@ApiField("leads_source_partner_id")
	private String leadsSourcePartnerId;

	/**
	 * 操作人
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * 商机的来源
	 */
	@ApiField("source")
	private String source;

	public String getBdWorkNo() {
		return this.bdWorkNo;
	}
	public void setBdWorkNo(String bdWorkNo) {
		this.bdWorkNo = bdWorkNo;
	}

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

	public String getLeadsSourcePartnerId() {
		return this.leadsSourcePartnerId;
	}
	public void setLeadsSourcePartnerId(String leadsSourcePartnerId) {
		this.leadsSourcePartnerId = leadsSourcePartnerId;
	}

	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
