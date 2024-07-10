package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投研智能问答结果查询
 *
 * @author auto create
 * @since 1.0, 2024-01-18 17:06:14
 */
public class AntfortuneFinresearchCopilotConsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1644614757928775236L;

	/**
	 * 咨询ID
	 */
	@ApiField("consult_id")
	private String consultId;

	public String getConsultId() {
		return this.consultId;
	}
	public void setConsultId(String consultId) {
		this.consultId = consultId;
	}

}
