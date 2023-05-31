package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用详情
 *
 * @author auto create
 * @since 1.0, 2019-07-22 14:50:54
 */
public class SceneDrawdownDetail extends AlipayObject {

	private static final long serialVersionUID = 8555374511395964417L;

	/**
	 * 网商支用号
	 */
	@ApiField("drawdown_no")
	private String drawdownNo;

	/**
	 * 资方借据号
	 */
	@ApiField("fin_drawdown_no")
	private String finDrawdownNo;

	public String getDrawdownNo() {
		return this.drawdownNo;
	}
	public void setDrawdownNo(String drawdownNo) {
		this.drawdownNo = drawdownNo;
	}

	public String getFinDrawdownNo() {
		return this.finDrawdownNo;
	}
	public void setFinDrawdownNo(String finDrawdownNo) {
		this.finDrawdownNo = finDrawdownNo;
	}

}
