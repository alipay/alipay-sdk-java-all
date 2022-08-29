package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JfExportChargeInstModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.chargeinst.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-23 09:29:43
 */
public class AlipayEbppJfexportChargeinstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7723692481627111683L;

	/** 
	 * 输出的机构列表
	 */
	@ApiListField("charge_insts")
	@ApiField("jf_export_charge_inst_model")
	private List<JfExportChargeInstModel> chargeInsts;

	/** 
	 * 开通的出账机构总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setChargeInsts(List<JfExportChargeInstModel> chargeInsts) {
		this.chargeInsts = chargeInsts;
	}
	public List<JfExportChargeInstModel> getChargeInsts( ) {
		return this.chargeInsts;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
