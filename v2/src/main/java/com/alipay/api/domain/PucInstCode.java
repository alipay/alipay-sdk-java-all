package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活缴费机构模型
 *
 * @author auto create
 * @since 1.0, 2023-08-02 10:57:22
 */
public class PucInstCode extends AlipayObject {

	private static final long serialVersionUID = 6859784934982138429L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝量化机构的标识
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 机构的中文名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 生活缴费的子业务类型, 费种
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
