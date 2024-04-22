package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客更新leads
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:22:17
 */
public class FxiaokeUpdateLeadsRequest extends AlipayObject {

	private static final long serialVersionUID = 4257894225275231632L;

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

}
