package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车金融担保机构信息
 *
 * @author auto create
 * @since 1.0, 2025-11-19 16:28:21
 */
public class CarfinGuaranteeInst extends AlipayObject {

	private static final long serialVersionUID = 8785654598363388311L;

	/**
	 * 担保机构名称
	 */
	@ApiField("guarantee_inst_name")
	private String guaranteeInstName;

	/**
	 * 担保机构简
	 */
	@ApiField("guarantee_inst_short_name")
	private String guaranteeInstShortName;

	/**
	 * 担保机构统一社会信用代码
	 */
	@ApiField("guarantee_inst_uscc")
	private String guaranteeInstUscc;

	public String getGuaranteeInstName() {
		return this.guaranteeInstName;
	}
	public void setGuaranteeInstName(String guaranteeInstName) {
		this.guaranteeInstName = guaranteeInstName;
	}

	public String getGuaranteeInstShortName() {
		return this.guaranteeInstShortName;
	}
	public void setGuaranteeInstShortName(String guaranteeInstShortName) {
		this.guaranteeInstShortName = guaranteeInstShortName;
	}

	public String getGuaranteeInstUscc() {
		return this.guaranteeInstUscc;
	}
	public void setGuaranteeInstUscc(String guaranteeInstUscc) {
		this.guaranteeInstUscc = guaranteeInstUscc;
	}

}
