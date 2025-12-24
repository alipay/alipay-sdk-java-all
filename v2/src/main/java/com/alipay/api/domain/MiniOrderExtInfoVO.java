package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询订单扩展参数
 *
 * @author auto create
 * @since 1.0, 2025-08-11 14:13:43
 */
public class MiniOrderExtInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7623468172569978738L;

	/**
	 * 买家备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 卖家备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 卖家备注旗标颜色
	 */
	@ApiField("remark_color_flag")
	private String remarkColorFlag;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemarkColorFlag() {
		return this.remarkColorFlag;
	}
	public void setRemarkColorFlag(String remarkColorFlag) {
		this.remarkColorFlag = remarkColorFlag;
	}

}
